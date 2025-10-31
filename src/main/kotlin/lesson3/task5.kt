package org.example.lesson3

fun main() {

    val string = "D2-D4;0"

    val from = string.take(2)
    val to = string.drop(3).take(2)
    val step = string[6]

    println(from)
    println(to)
    println(step)

}