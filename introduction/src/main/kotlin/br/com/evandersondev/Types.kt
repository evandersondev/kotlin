package br.com.evandersondev

import java.math.BigDecimal

fun main() {
    // Byte, Short, Int, Long
    val byte: Byte = 127
    val short: Short = 32767
    val int: Int = 2147483647
    val long: Long = 9223372036854775807

    // Float, Double, BigDecimal
    val float: Float = 1.38423F
    val double: Double = 1.38423
    val bigDecimal: BigDecimal = BigDecimal("1.38423")

    // Boolean
    val boolean1: Boolean = false
    val boolean2: Boolean = true

    // Char
    val char: Char = 'F'

    // String
    val string: String = "Word"

    // Array
    val array: Array<Int> = arrayOf(0, 2, 4, 6, 8, 10, 12)
}