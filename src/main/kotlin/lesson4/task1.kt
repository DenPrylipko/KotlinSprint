package org.example.lesson4

fun main() {
    val reservedTablesForToday = 13
    val reservedTablesForTomorrow = 9

    val freeTablesForToday = reservedTablesForToday < TABLES_IN_RESTAURANT
    val freeTablesForTomorrow = reservedTablesForTomorrow < TABLES_IN_RESTAURANT

    println("Free tables for today: $freeTablesForToday \nFree tables for tomorrow: $freeTablesForTomorrow")
}

const val TABLES_IN_RESTAURANT = 13