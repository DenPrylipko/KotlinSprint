package org.example.lesson2

fun main() {

    val hourWhenTrainLeft = 9
    val minuteWhenTrainLeft = 39

    val trainLeftTime = hourWhenTrainLeft * MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE + minuteWhenTrainLeft
    val minutesTillArrive = 457

    val hoursComingTime = (trainLeftTime + minutesTillArrive) / MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE
    val minutesComingTime = (trainLeftTime + minutesTillArrive) % MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE

    val comingTime = "%02d:%02d".format(hoursComingTime, minutesComingTime)

    println(comingTime)
}

const val MINUTES_IN_AN_HOUR_OR_SECONDS_IN_A_MINUTE = 60