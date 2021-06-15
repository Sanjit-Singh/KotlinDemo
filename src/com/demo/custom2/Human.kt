package com.demo.custom2

import com.demo.custom.Animal
import com.demo.log3
import com.demo.util.Logger

//class Human : Animal(name = "Human");
 class Human: Animal {

    fun String.stringLen(): Int = this.length

    constructor(name: String) : super(name)

    override fun getFullName(): String {
//        Logger.log3("Name: ${super.getFullName()}")
        return "My name is ${super.getFullName()}"
    }

    fun getNameLength() = super.getFullName().stringLen()

    interface Details {
        public var name: String
    }

}