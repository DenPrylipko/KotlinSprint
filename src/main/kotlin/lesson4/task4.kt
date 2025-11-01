package org.example.lesson4

fun main() {
    var handsAndPress: Boolean
    var legsAndBack: Boolean

    val dayOfTraining = 6

    handsAndPress = dayOfTraining % 2 == 1
    legsAndBack = !handsAndPress

    println("""
        Упражнения для рук: $handsAndPress
        Упражнения для ног: $legsAndBack
        Упражнения для спины: $legsAndBack
        Упражнения для пресса: $handsAndPress
    """.trimIndent())
}