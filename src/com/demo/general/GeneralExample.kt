package com.demo.general

import com.demo.util.MathUtil

class GeneralExample {
    fun show() {
        //    println("Hello World!")

        var mathUtil = MathUtil()
        var a = 5
        val b = 7
        val lExpr: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 };

        var str1: String? = "Some value "

//    println("==== Using sum method ====")
//    println("$a + $b = ${mathUtil.sum(a, b)}")
//
//    println("\n ==== Using lambda expression ====")
//    println("$a + $b = ${mathUtil.doMath(a, b, lExpr)}")
//
//    println("$a + $b = ${mathUtil.doMath(a, b) {num1 : Int, num2 :Int -> num1 + num2} }")
//    println("$a - $b = ${mathUtil.doMath(a, b) {num1 : Int, num2 :Int -> num1 - num2} }")
//
//    println("$a + $b = ${mathUtil.doMath(str1 ?: "Default String value ", b.toString()) {num1 : String, num2 :String -> num1 + num2} }")


        // let example
//    str1?.let {
//        println("$it + $b = ${mathUtil.doMath(it , b.toString()) {num1 : String, num2 :String -> num1 + num2} }")
//    }

//    a.let {
//        println("$it + $b = ${mathUtil.doMath(it , b, mathUtil::sum) }")
//    }

//
//    for(x in 0..10){
//        print(" $x")
//    }
//
//    println()
//    for(x in 0 until 11){
//        print(" $x")
//    }
//
//    println()
//    for(x in 0 until 11 step 1){
//        print(" $x")
//    }
//
//    println()
//    for(x in 10 downTo  0){
//        print(" $x")
//    }
//
//    println()
//    for(x in 10.downTo(0) step 1){
//        print(" $x")
//    }

//    println()
//    Logger.log("Static message logging.")
//    Logger.log2("Static message logging Using log2")

//    for (index in "Hello") {
//        println("Value of index is $index")
//    }

//    val result = if(a == b) "Equal" else  "Unequal"
//
//    println("$a and $b are $result")
//
//    println("$a > 4 = ${a.greaterThan(4)}")
        var x = 3
//    when (a) {
//        isValid(x) -> {
//            print("Valid number!")
//        }
//        in 1 .. 5 -> {
//            println("$a is in 1 .. 5")
//        }
//        5 -> {
//            println("$a is 5")
//        }
//        6 -> {
//            println("$a is 6")
//        }
//        else -> {
//            print("Not valid number!")
//        }
//    }

        val result = when {
            a.greaterThan(5) -> {
                println("$a is 5")
            }
            x.greaterThan(2) -> {
                println("$x > 2")
            }
            else -> {
                print("Default condition!")
            }
        }

        repeat(2) {
            println(it)
        }

    }
}

fun isValid(num: Int) = -1

/* Extension function */
fun Int.greaterThan(num: Int) = this > num


fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}