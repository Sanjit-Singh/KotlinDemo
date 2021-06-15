package com.demo.objects

class FunctionTypeClass: () -> Unit {
    override fun invoke() {
        println("Function type extending () -> Unit")
    }

}