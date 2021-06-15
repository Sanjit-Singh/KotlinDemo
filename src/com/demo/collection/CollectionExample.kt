package com.demo.collection

fun main() {

//    val numbers = listOf(0, 3, 8, 4, 0, 5, 5, 8, 9, 2)
//    println("Numbers: $numbers")
//    println("Numbers: ${numbers.sorted()}")
//    println("Numbers: ${numbers.reversed()}")
//    println("Numbers: ${numbers.toSet()}")

    // Set
//    val set1 = setOf(1,2,3)
//    val set2 = mutableSetOf(5,6,9)

//    println(set1 == set2)
//    println(set1.contains(5))
//    println(set1.contains(3))

//    println(set1.union(set2))

//    val peopleAges = mutableMapOf<String, Int>("Sanjit" to 33, "Harshit" to 34, "Gopal" to 43)
//    peopleAges.put("Hari", 44)
//    peopleAges["Gui"] = 90
//    peopleAges["Sanjit"] = 100

//    println(peopleAges)
//    peopleAges.forEach {
//        println("Key: ${it.key}, Value: ${it.value}")
//    }

//    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", "))

//    println(peopleAges.filter { it.key.length < 5 })

    // Lambda
//    val triple: (Int) -> Int = {  it * 3 }
//    println(triple(5))
//
//    val names = listOf<String>("Hari", "Sanjit", "Om", "Gopal", "Aman")
//    println(names.sorted())
//    println(names.sortedWith{ str1: String, str2: String -> str1.length - str2.length})

    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    println(words.filter { it.startsWith("a", ignoreCase = true) })
}
