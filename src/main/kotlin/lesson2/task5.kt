package org.example.lesson2

import kotlin.math.pow

fun main() {

    val initialPrincipalBalance = 70_000
    val interestRate = 0.167
    val numberOfTimePeriodElapsed = 20
    val numbersOfTimesInterestPerTimePeriod = 1

    val finalDepositAmount: Double = initialPrincipalBalance * (1 + interestRate / numbersOfTimesInterestPerTimePeriod).pow(numberOfTimePeriodElapsed * numbersOfTimesInterestPerTimePeriod)
    val roundedFinalDepositAmount = String.format("%.3f", finalDepositAmount)

    println(roundedFinalDepositAmount)
}