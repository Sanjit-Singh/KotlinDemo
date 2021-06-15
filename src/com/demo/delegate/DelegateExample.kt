package com.demo.delegate

class DelegateExample {
    fun show() {
        dynamicDelegate(BaseType.INHERITED)
        dynamicDelegate(BaseType.DERIVED)
    }

    fun dynamicDelegate(type: BaseType){
//        val base = BaseImpl()
//        val base2: Base = BaseImpl()
//        val base3: Base = Derived(base)

//        val derived = Derived(base)
//        derived.display()
//        base3.display()

        var base: Base = when(type) {
            BaseType.INHERITED -> BaseImpl()
            BaseType.DERIVED-> Derived(BaseImpl())
        }
        base.display()
    }
}

enum class BaseType {
    INHERITED, DERIVED
}