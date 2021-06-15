package com.demo.oops

import com.demo.custom.Animal
import com.demo.custom2.Human

class OopsExample {
    fun show() {

        var animal = Animal("Dog");
        println("Animal name: ${animal.getFullName()}");

//    animal.name = "Cat";
//    println("Animal name: ${animal.getFulName()}");

        var human : Animal = Human("Sanjit");
        println("Human name: ${human.getFullName()}");
//    println("Human name: ${ human.name }");

        // Example of 'let'
        var a1 = animal.let {
            it.age = 17
            it.age
        }

        println("Age:: ${a1}");
        println("Age:: ${animal.age}");

        // Example of 'also'
        var a2 = animal.also {
            it.age = 15
        }

        println("Age:: ${a2.age}");
        println("Age:: ${animal.age}");

        // Example of 'apply'
        var a3 = animal.apply {
            age = 20
        }

        println("Age:: ${a3.age}");
        println("Age:: ${animal.age}");


        // Example of 'run'
        var a4 = animal.run {
            age = 50
            age
        }

        println("Age:: ${a4}");
        println("Age:: ${animal.age}");

        // Example of 'runCatching'
        var a5 = animal.runCatching {
            age = 60
            age
        }

        println("Age:: ${a5}");
        println("Age:: ${animal.age}");

        // Example of 'with'
        var animal2: Animal? = null
        var a6 = with (animal2){
            this?.age = 30
            this?.age
        }

        println("Age:: ${a6}");
        println("Age:: ${animal2?.age}");

//    var human = Human("Sanjit");
//    println("Name length:: ${human.getNameLength()}")
//    println("Name length:: ${"name".stringLen()}")

    }

}