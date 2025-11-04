package org.example.lesson5

fun main() {

    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()
    val thirdNumber = (0..42).random()

    val winNumbers = listOf(firstNumber, secondNumber, thirdNumber)

    val oneNumberGuessedText = "You won consolation prize :|"
    val twoNumberGuessedText ="You won Big Prize"
    val threeNumbersGuessedText = "Congratulation! You won the Legendary Prize"
    val noneGuessed = "Fail!"
    val afterText = "Win numbers were $firstNumber, $secondNumber and $thirdNumber\nThank you for playing>"

    println(
        """
        This is a lottery.
        There are 3 numbers between 0 and 42, guess them all to win a Legendary Prize.
        If you guess two of them - you will get a Big Prize
        If you guess one number - you will get a consolation prize.
        
        Enter your numbers...
    """.trimIndent()
    )
    val firstUserNumber = readln().toInt()
    val secondUserNumber = readln().toInt()
    val thirdUserNumber = readln().toInt()

    val userNumbers = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)

    val coincidences = winNumbers.intersect(userNumbers).size

    if (coincidences == 3) {
        println(threeNumbersGuessedText)
    } else if (coincidences == 2) {
        println(twoNumberGuessedText)
    } else if (coincidences == 1) {
        println(oneNumberGuessedText)
    } else {
        println(noneGuessed)
    }
    println(afterText)
}