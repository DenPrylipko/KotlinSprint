package org.example.lesson2

fun main() {

    val buffPercentage = 20
    val buffMultiplierOre = 1 + buffPercentage * 0.01

    val crystalOreMined = 7
    val ironOreMined = 11

    val additionalCrystalOre = (crystalOreMined * buffMultiplierOre - crystalOreMined).toInt()
    val additionalIronOre = (ironOreMined * buffMultiplierOre - ironOreMined).toInt()

    println(additionalCrystalOre)
    println(additionalIronOre)
}