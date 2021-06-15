package com.demo.codelab.randomdice

fun main() {
//    val firstDice = Dice(6)
//    println("Your ${firstDice.numSide} sided dice rolled ${firstDice.roll()}")
//
//    val secondDice = Dice(20)
//    println("Your ${secondDice.numSide} sided dice rolled ${secondDice.roll()}")
//
    val luckyNumber = 5
    val dice = Dice(6)
    val diceRoll = dice.roll()

    when(diceRoll) {
        luckyNumber -> println("You Win!")
        else -> println("Dice rolled ${diceRoll}. Try again!")
    }
}


class Dice(val numSide: Int) {
    fun roll() =  (1..numSide).random()
}

