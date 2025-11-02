package org.example.lesson5

fun main() {
    val mathEquation = "5+3"
    val correctAnswer = 8
    println("Please prove that you're not a robot.\n$mathEquation=?")
    val userAnswer = readln().toInt()

    when (userAnswer) {
        correctAnswer -> println("Welcome!")
        else -> println("Access denied")
    }
}