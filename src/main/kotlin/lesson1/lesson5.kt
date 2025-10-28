package org.example.lesson1

import kotlin.text.format

fun main() {

    val secondsInSpace = 6480

    val minutesInSpace = secondsInSpace / MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE
    val restOfMinute = secondsInSpace % MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE
    val hoursInSpace = minutesInSpace / MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE
    val restOfHour = minutesInSpace % MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE

    val timeInSpace = "%02d:%02d:%02d".format(hoursInSpace, restOfHour, restOfMinute)

    println(timeInSpace)

}

const val MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE = 60