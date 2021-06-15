package com.demo

import com.demo.codelab.CodeLabExample
import com.demo.coroutine.CoroutineExample
import com.demo.delegate.DelegateExample
import com.demo.general.GeneralExample
import com.demo.lambda.LambdaExample
import com.demo.objects.ObjectExample
import com.demo.oops.OopsExample
import com.demo.sam.SamExample

import com.demo.util.Logger

fun <T> Logger.Companion.log3(message: T) {
    println(message);
}

fun main() {

//    GeneralExample().show()

//    Logger.log3("Log message!");

//    OopsExample().show()

//    ObjectExample().show()

//    LambdaExample().show()

//    DelegateExample().show()

//    CoroutineExample().show()

//    SamExample().show()

    CodeLabExample().show()
}



//val b: Byte = 2 + 3            //1
//val s: Short = 2 + b           //2
//val n: Int = s.toByte() + 2    //3
//val l: Long = n + 4            //4
//val f: Float = l.toFloat() + 1 //5
//val d: Double = f / 1          //6
