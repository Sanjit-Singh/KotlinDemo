package com.demo.lambda

class LambdaExample {

    //    var greet: () -> Unit = { print("Lambda without parameter")}
//    var greet = { println("Lambda without parameter") }
    var greet = fun() { println("Anonymous function") }
    var greetMessageDigest = { message: String ->
        println("Line-1")
        println(message)

    }

    fun show() {

        var num1 = 10;
        var num2 = 2;

//        var action = ::sum
        greet()

//        var summation = action(num1, num2)
//        println("$num1 + $num2 = $summation")

                greetMessageDigest("Welcome Lambda!")
//        var action2 = greet
//        action2()

//        var result = doMath(num1, num2, ::sum)
//        println("Sum: $result")
//
//        result = doMath(num1, num2, ::subtract)
//        println("Subtract: $result")
//
//        result = doMath(num1, num2, ::multiply)
//        println("Multiply: $result")
//
//        result = doMath(num1, num2, ::divide)
//        println("Divide: $result")
//
//        var strCat: (String, String) -> String = { firstName, lastName -> "$firstName $lastName" }
//        println(doMath("Sanjit", "Singh", { firstName: String, lastName: String -> firstName + " " + lastName }))
//        println(doMath("Sanjit", "Singh", strCat))
//        println(doMath("Sanjit", "Singh") { firstName: String, lastName: String -> firstName + " " + lastName })

    }

    //    var sum = fun (num1: Int, num2: Int) = num1 + num2
    fun sum(num1: Int, num2: Int) = num1 + num2

    fun subtract(num1: Int, num2: Int) = num1 - num2
    fun multiply(num1: Int, num2: Int) = num1 * num2
    fun divide(num1: Int, num2: Int) = num1 / num2

//    fun doMath(num1: Int, num2: Int, action: (Int, Int)->Int): Int {
//        println("Specific method called.")
//        return action(num1, num2)
//    }


    fun <T> doMath(arg1: T, arg2: T, action: (T, T) -> T): T {
        println("Generic method called.")
        return action(arg1, arg2)
    }
}

