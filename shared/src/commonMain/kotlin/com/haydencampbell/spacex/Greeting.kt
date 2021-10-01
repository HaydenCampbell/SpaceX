package com.haydencampbell.spacex

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}