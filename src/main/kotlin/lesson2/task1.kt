package org.example.lesson2

fun main() {

    val student1Score = 3
    val student2Score = 4
    val student3Score = 3
    val student4Score = 5

    val studentsQuantity = 4

    val averageStudentsScore = (student1Score + student2Score + student3Score + student4Score).toFloat() / studentsQuantity

    println(averageStudentsScore)

}