package org.example.lesson4

fun main() {
    val objectWeight1 = 20
    val objectVolume1 = 80

    val objectWeight2 = 50
    val objectVolume2 = 100

    println("Груз с весом $objectWeight1 кг и объемом $objectVolume1 л соответствует категории 'Average':" +
            "${(objectWeight1 > MIN_AVERAGE_WEIGHT) && (objectWeight1 <= MAX_AVERAGE_WEIGHT) && (objectVolume1 < MAX_AVERAGE_VOLUME)}")
    println("Груз с весом $objectWeight2 кг и объемом $objectVolume2 л соответствует категории 'Average': " +
            "${(objectWeight2 > MIN_AVERAGE_WEIGHT) && (objectWeight2 <= MAX_AVERAGE_WEIGHT) && (objectVolume2 < MAX_AVERAGE_VOLUME)}")
}

const val MIN_AVERAGE_WEIGHT = 35
const val MAX_AVERAGE_WEIGHT = 100
const val MAX_AVERAGE_VOLUME = 100