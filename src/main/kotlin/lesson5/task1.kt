package org.example.lesson5

fun main() {
    val numberOne = (0..20).random()
    val numberTwo = (0..20).random()
    val correctAnswer = numberOne + numberTwo

    println("Please prove that you're not a robot.\n$numberOne+$numberTwo=?")
    val userAnswer = readln().toInt()

    if (userAnswer == correctAnswer) println("Welcome!")
    else println("Access denied")
}