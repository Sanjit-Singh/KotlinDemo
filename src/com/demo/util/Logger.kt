package com.demo.util

class Logger {

    companion object {
        fun <T> log(message: T) {
            println(message)
        }

        fun <T> log2(message: T) {
            println(message)
        }
    }

}