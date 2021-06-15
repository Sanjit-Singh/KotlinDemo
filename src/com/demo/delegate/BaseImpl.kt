package com.demo.delegate

class BaseImpl : Base {
    override var message: String = "BaseImpl message"
        get() = field
        set(value) {
            field = value
        }

    override fun display() {
        println(message)
    }
}