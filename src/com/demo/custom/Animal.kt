package com.demo.custom
//class Animal constructor(var name: String);

//class Animal {
//    var name: String = ""
//    get() = field
//    set(value) {field = value}
//}

//open class Animal constructor(val name: String) {
//    private var fulName: String = ""
//
//    init {
//        fulName = name;
//    }
//
//    fun getFulName() = fulName
//    fun getName(): Int = 6;
//}

open class Animal {
    private var fullName: String = ""
    var age: Int = 10

    constructor(name: String) {
        fullName = name
    }

    open fun getFullName() = fullName
//    fun getName(): Int = 6;
}