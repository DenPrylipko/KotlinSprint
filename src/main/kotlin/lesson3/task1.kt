package org.example.lesson3

fun main() {
    val userName = "Denys Prylipko"

    val greetingDayText = "It's nice to see you again !"
    val greetingEveningText = "Good evening there"

    var greetingUser = greetingDayText
    println("$userName, $greetingUser")
    greetingUser = greetingEveningText
    println("$userName, $greetingUser")
}