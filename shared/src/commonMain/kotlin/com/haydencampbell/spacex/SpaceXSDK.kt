package com.haydencampbell.spacex

import com.haydencampbell.spacex.cache.Database
import com.haydencampbell.spacex.cache.DatabaseDriverFactory
import com.haydencampbell.spacex.entity.RocketLaunch
import com.haydencampbell.spacex.network.SpaceXApi

class SpaceXSDK (databaseDriverFactory: DatabaseDriverFactory) {
    private val database = Database(databaseDriverFactory)
    private val api = SpaceXApi()

    @Throws(Exception::class) suspend fun getLaunches(forceReload: Boolean): List<RocketLaunch> {
        val cachedLaunches = database.getAllLaunches()
        return if (cachedLaunches.isNotEmpty() && !forceReload) {
            cachedLaunches
        } else {
            api.getAllLaunches().also {
                database.clearDatabase()
                database.createLaunches(it)
            }
        }
    }
}