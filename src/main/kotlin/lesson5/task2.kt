package org.example.lesson5

import java.time.LocalDate

fun main() {

    println("Enter your birthday year")
    val userBirthdayYear = readln().toInt()
    val thisYear = LocalDate.now().year
    val userAge = thisYear - userBirthdayYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (userAge == 16 || userAge == 17) {
        "Show limited content"
    } else {
        "Back to main screen"
    }

    println(resultText)

}
const val AGE_OF_MAJORITY = 18