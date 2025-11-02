package org.example.lesson4

fun main() {
    val dayOfTraining = 5
    val isEven = dayOfTraining % 2 == 0

    val handsAndPress = !isEven
    val legsAndBack = isEven

    println("""
        Упражнения для рук: $handsAndPress
        Упражнения для ног: $legsAndBack
        Упражнения для спины: $legsAndBack
        Упражнения для пресса: $handsAndPress
    """.trimIndent())
}