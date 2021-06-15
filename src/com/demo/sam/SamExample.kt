package com.demo.sam

import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

class SamExample {
    val runnable = Runnable {
            println("Run in different thread.")
    }

    val executor = ThreadPoolExecutor(1, 1, 500, TimeUnit.MICROSECONDS, ArrayBlockingQueue(2))

    fun show() {
        executor.execute(runnable)
        executor.remove(runnable)

        val thread = Thread(Runnable {
            println("Thread: Runnable executing.")
        })
        thread.start()
    }
}