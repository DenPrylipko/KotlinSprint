package org.example.lesson4

fun main() {

    val isSunnyWeather = true
    val isTentOpen = true
    val airHumidity = 20
    val yearSeason = "winter"

    val result = (isSunnyWeather == SUNNY_WEATHER) && (isTentOpen == TENT_IS_OPENED)
            && (airHumidity == FAVORABLE_AIR_HUMIDITY) && (yearSeason != NOT_FAVORABLE_YEAR_SEASON)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

const val SUNNY_WEATHER = true
const val TENT_IS_OPENED = true
const val FAVORABLE_AIR_HUMIDITY = 20
const val NOT_FAVORABLE_YEAR_SEASON = "winter"
