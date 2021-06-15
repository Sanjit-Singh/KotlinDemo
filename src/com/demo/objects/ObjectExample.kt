package com.demo.objects

class ObjectExample {

    fun show() {

        println(ObjClass.a)
        println(ObjClass.b)

        ObjClass.updateA(11)
        ObjClass.updateB("UpdatedString")

        println(ObjClass.a)
        println(ObjClass.b)

        var objInterface = object : ObjInterface {
            override fun display(message: String) {
                println(message)
            }
        }

        var objAbstract = object : ObjAbstractClass() {
            override fun display(message: String) {
                println(message)
            }
        }

//    objInterface.display("Object Interface")
//    objAbstract.display("Object Abstract")

        var funType = FunctionTypeClass();
        funType() // funType.invoke()

    }

}