package org.example.lesson2

import org.example.lesson1.MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE

fun main() {

    val trainLeftTime = 9 * MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE + 39
    val minutesTillArrive = 457

    val hoursComingTime = (trainLeftTime + minutesTillArrive) / MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE
    val minutesComingTime = (trainLeftTime + minutesTillArrive) % MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE

    val comingTime = "%02d:%02d".format(hoursComingTime, minutesComingTime)

    println(comingTime)



}