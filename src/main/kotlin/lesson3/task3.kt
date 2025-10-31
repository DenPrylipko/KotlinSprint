package org.example.lesson3

fun main() {

    val digit = 5

    val multiplicationTable = """
        $digit * 1 = ${digit * 1}
        $digit * 2 = ${digit * 2}
        $digit * 3 = ${digit * 3}
        $digit * 4 = ${digit * 4}
        $digit * 5 = ${digit * 5}
        $digit * 6 = ${digit * 6}
        $digit * 7 = ${digit * 7}
        $digit * 8 = ${digit * 8}
        $digit * 9 = ${digit * 9}
    """.trimIndent()

    println(multiplicationTable)

}