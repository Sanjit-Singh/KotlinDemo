package com.demo.coroutine

//import kotlinx.coroutines.*

class CoroutineExample {

    fun show() {
        kotlin.run {
//            delay(2000)
            println("Run kotlin.run")
        }

        println("After kotlin.run")
    }
}