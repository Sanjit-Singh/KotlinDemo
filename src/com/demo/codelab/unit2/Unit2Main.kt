package com.demo.codelab.unit2

import kotlin.math.PI
import kotlin.math.sqrt

fun main() {

    val squareCabin = SquareCabin(8, 20.0)
    with(squareCabin) {
        println("\nSquare Cabin\n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("FloorArea: ${floorArea()}")
    }

    val roundHut = RoundHut(3, 5.0)
    with(roundHut) {
        println("\nRound Hut \n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("FloorArea: %.2f".format(floorArea()))
        println("MaxCarpetSize: %.2f".format(calculateMaxCarpetSize()))
    }

    val roundTower = RoundTower(10,  5.0)
    with(roundTower) {
        println("\nRound Tower \n============")
        println("Capacity: ${capacity}")
        println("Material: ${buildingMaterial}")
        println("Has room? ${hasRoom()}")
        println("FloorArea: %.2f".format(floorArea()))
        println("MaxCarpetSize: %.2f".format(calculateMaxCarpetSize()))
    }

//    val roundTower = RoundTower(10)
//    with(roundTower) {
//        println("\nRound Tower \n============")
//        println("Capacity: ${capacity}")
//        println("Material: ${buildingMaterial}")
//        println("Has room? ${hasRoom()}")
//    }

}

abstract class Dwelling(private var resident: Int) {

    abstract val buildingMaterial: String
    abstract val capacity: Int

    abstract fun floorArea(): Double

    fun hasRoom() = capacity > resident

    fun getRoom(): Boolean {
        if(capacity > resident) {
            resident++
            println("Congrats, you got a room!")
            return true
        } else {
            println("Sorry, there is no room available!")
            return false
        }
    }
}

class SquareCabin constructor(resident: Int, private val length: Double): Dwelling(resident) {
    override val buildingMaterial: String = "Wood"
    override val capacity: Int = 6

    override fun floorArea(): Double {
       return length * length
    }
}

open class RoundHut constructor(resident: Int, private val radius: Double): Dwelling(resident) {
    override val buildingMaterial: String = "Straw"
    override val capacity: Int = 4

    override fun floorArea(): Double {
        return PI * radius * radius
    }

    fun calculateMaxCarpetSize(): Double {
        val diameter = 2 * radius
        return sqrt(diameter * diameter / 2)
    }

}

class RoundTower(residents: Int,
                 radius: Double,
                 private val floors: Int = 5) : RoundHut(residents, radius) {

    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors

    override fun floorArea(): Double {
        return floors * super.floorArea()
    }
}
