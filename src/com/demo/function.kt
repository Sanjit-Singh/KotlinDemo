package com.demo

fun main() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

//    val filterdList = decorations.filter {
//        println("Filter: $it")
//        it[0] == 'p'
//    }
//            .map {
//                println("Map: $it")
//                it
//            }

    val seq = decorations.asSequence().filter {
        println("Filter: $it")
        it[0] == 'p'
    }

    println(seq)
    println(seq.first())
}