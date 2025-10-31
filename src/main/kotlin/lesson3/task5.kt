package org.example.lesson3

fun main() {

    val string = "D2-D4;0"

    val parts = string.split("-", ";")

    val from = parts[0]
    val to = parts[1]
    val step = parts[2]

    println(from)
    println(to)
    println(step)

}