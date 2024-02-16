package br.com.evandersondev.structures

import kotlin.random.Random
import kotlin.time.measureTime

fun main() {
    // Imutavel
    val map1 = mapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Bom",
        4 to "Muito Bom",
        5 to "Otimo"
    )

    println(map1[3])

    // Mutavel
    val map2 = mutableMapOf(
        1 to "Muito Ruim",
        2 to "Ruim",
        3 to "Bom",
        4 to "Muito Bom",
    )

    map2[5] = "Otimo"
    println(map2)

    // ----------------------------------------------------------------------------------------------------
    val listCodigos = Array(100000) { Random.nextInt(1, 6) }
    val listMap = listOf(
        Pair(1, "Muito Ruim"),
        Pair(2, "Ruim"),
        Pair(3, "Bom"),
        Pair(4, "Muito Bom"),
        Pair(5, "Otimo")
    )

    val time1 = measureTime {
        for (codigo in listCodigos) {
            val categories = listMap.find { it.first == codigo }
        }
    }

    val time2 = measureTime {
        for (codigo in listCodigos) {
            val categories = map1[codigo]
        }
    }

    println(time1)
    println(time2)
}