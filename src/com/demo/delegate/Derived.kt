package com.demo.delegate

class Derived(base: Base) : Base by base {
    override var message: String = "Derived message"
        get() = field
        set(value) {
            field = value
        }

    override fun display() {
        println(message)
    }
}