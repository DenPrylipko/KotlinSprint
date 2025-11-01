package org.example.lesson4

fun main() {

    val sunnyWeather = true
    val tentIsOpened = true
    val airHumidity = 20
    val yearSeason = "winter"

    val result = (sunnyWeather == true) && (tentIsOpened == true) && (airHumidity == 20) && (yearSeason != "winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}