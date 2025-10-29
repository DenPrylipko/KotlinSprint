package org.example.lesson2

fun main() {

    val buff = 1.2f

    val crystalOreMined = 7
    val ironOreMined = 11

    val additionalCrystalOre = (crystalOreMined * buff - crystalOreMined).toInt()
    val additionalIronOre = (ironOreMined * buff - ironOreMined).toInt()

    println(additionalCrystalOre)
    println(additionalIronOre)
}