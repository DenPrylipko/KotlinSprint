package org.example.lesson5

fun main() {

    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()

    val oneNumberGuessedText = "You won consolation prize :|"
    val twoNumbersGuessedText = "Congratulation! You won a Legendary Prize"
    val noneGuessed = "Fail!"
    val afterText = "Win numbers were $firstNumber and $secondNumber\nThank you for playing>"

    println(
        """
        This is a lottery.
        There are 2 numbers between 0 and 42, guess them both to win a Legendary Prize.
        If you guess one number - you will get a consolation prize.
        
        Enter your numbers...
    """.trimIndent()
    )

    val firstUserNumber = readln().toInt()

    println("Enter your second number...")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == firstNumber && secondUserNumber == secondNumber) ||
        (firstUserNumber == secondNumber && secondUserNumber == firstNumber)
    ) {
        println(twoNumbersGuessedText)
    } else if ((firstUserNumber == firstNumber || secondUserNumber == firstNumber) ||
        (firstUserNumber == secondNumber || secondUserNumber == secondNumber)
    ) {
        println(oneNumberGuessedText)
    } else {
        println(noneGuessed)
    }

    println(afterText)
}