package org.example.lesson4

fun main() {
    println("""
        Enter all details
        1. Is the ship damaged?
        2. current crew
        3. current provisions
        4. is the weather favorable?
    """.trimIndent())
    val isDamaged: Boolean = readln().toBoolean()
    val currentCrew: Int = readln().toInt()
    val currentProvisions: Int = readln().toInt()
    val isFavorableWeather: Boolean = readln().toBoolean()

    val shipIsReadyForALongVoyage =
        !isDamaged && currentCrew in MIN_CREW..RECOMMENDED_CREW &&
                currentProvisions > MIN_NUMBER_OF_PROVISIONS ||
                isDamaged && currentCrew == RECOMMENDED_CREW &&
                currentProvisions >= MIN_NUMBER_OF_PROVISIONS && isFavorableWeather

    println("Ship is ready for a long voyage: $shipIsReadyForALongVoyage")
}

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_NUMBER_OF_PROVISIONS = 50

