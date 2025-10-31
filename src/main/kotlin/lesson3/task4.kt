package org.example.lesson3

fun main() {
    var from = "E2"
    var to = "E4"
    var stepNumber = 1

    println("$from-$to;$stepNumber")

    from = "D2"
    to = "D${2+1}"
    stepNumber = 2

    println("$from-$to;$stepNumber")
}