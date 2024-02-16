package br.com.evandersondev.structures

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    // String
    val name = "Evanderson"
    val lengthName = name.count()
    println(lengthName)

    val splitName = name.split("")
    println(splitName)

    val dropLastName = name.dropLast(4) // remove as ultimas latras
    println(dropLastName)

    val dropName = name.drop(4) // remove as primeiras letras
    println(dropName)

    val hasName = name.contains("van")
    println(hasName)

    // Array
    val arr = arrayOf(31, 22, 31, 1, 5, 6, 84, 8, 3, 10)
    val sumOfArray = arr.sumOf { it }
    println(sumOfArray)

    val reverseArray = arr.reversed()
    println(reverseArray)

    val sortArray = arr.sorted()
    println(sortArray)

    // BigDecimal
    val bigDeciaml = BigDecimal("2")
    val powBigDecimal = bigDeciaml.pow(3) // potencia
    println(powBigDecimal)

    // divide, seta o numero de casas decimais, e arredonda o ultimo numero
    val divideBigDecimal = bigDeciaml.divide(BigDecimal("3"), 4, RoundingMode.HALF_UP)
    println(divideBigDecimal)
}