package org.example.lesson4

fun main() {
    val tablesInRestaurant = 13

    val reservedTablesForToday = tablesInRestaurant
    val reservedTablesForTomorrow = 9

    val freeTablesForToday = reservedTablesForToday < tablesInRestaurant
    val freeTablesForTomorrow = reservedTablesForTomorrow < tablesInRestaurant

    println("Free tables for today: $freeTablesForToday \nFree tables for tomorrow: $freeTablesForTomorrow")
}