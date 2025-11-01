package org.example.lesson4

fun main() {
    val minAverageWeight = 35
    val maxAverageWeight = 100
    val maxAverageVolume = 100

    val objectWeight1 = 20
    val objectVolume1 = 80

    val objectWeight2 = 50
    val objectVolume2 = 100

    println("""
        Груз с весом $objectWeight1 кг и объемом $objectVolume1 л соответствует категории 'Average': ${(objectWeight1 > minAverageWeight) && !(objectWeight1 >= maxAverageWeight) && (objectVolume1 < maxAverageVolume)}
        Груз с весом $objectWeight2 кг и объемом $objectVolume2 л соответствует категории 'Average': ${(objectWeight2 > minAverageWeight) && !(objectWeight2 >= maxAverageWeight) && (objectVolume2 < maxAverageVolume)}       
    """.trimIndent())
}