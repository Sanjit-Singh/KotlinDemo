package com.demo.util

class MathUtil {
    var classVariable: String;

    init {
        classVariable = "Class Variable"
    }

    fun sum(num1: Int, num2: Int) = num1 + num2

    fun sum(vararg numbers: Int): Int {
        var summation = 0;
        for (num in numbers) {
            summation += num
        }
        return summation
    }

    fun <T> doMath(num1: T, num2: T, action: (T, T) -> T): T {
        println(classVariable)
        return action(num1, num2);
    }

}