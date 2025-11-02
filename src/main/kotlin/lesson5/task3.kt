package org.example.lesson5

fun main() {

    val firstNumber = 12
    val secondNumber = 9

    val oneNumberGuessedText = "You won consolation prize :|"
    val twoNumbersGuessedText = "Congratulation! You won a Legendary Prize"
    val noneGuessed = "Fail!"
    val afterText = "Win numbers were $firstNumber and $secondNumber\nThank you for playing>"

    println(
        "This is a lottery." +
                "\nThere are 2 numbers between 0 and 42, guess them both to win a Legendary Prize." +
                "\nIf you guess one number - you will get a consolation prize." +
                "\n\n Enter your numbers..."
    )

    val firstUserNumber = readln().toInt()
    println("Enter your second number...")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == firstNumber || firstUserNumber == secondNumber) &&
            (secondUserNumber == firstNumber || secondUserNumber == secondNumber)
    ) {
        println(twoNumbersGuessedText)
        println(afterText)
    } else if ((firstUserNumber == firstNumber || firstUserNumber == secondNumber) &&
        (secondUserNumber != firstNumber || secondUserNumber != secondNumber)
    ) {
        println(oneNumberGuessedText)
        println(afterText)
    } else if ((firstUserNumber != firstNumber || firstUserNumber != secondNumber) &&
        (secondUserNumber == firstNumber || secondUserNumber == secondNumber)
    ) {
        println(oneNumberGuessedText)
        println(afterText)
    } else {
        println(noneGuessed)
        println(afterText)
    }

}