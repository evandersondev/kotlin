package br.com.evandersondev

import java.math.BigDecimal

fun main() {

    val priceOfProducts = arrayOf(
        BigDecimal("1.99"),
        BigDecimal("1.99"),
        BigDecimal("31.99"),
        BigDecimal("21.99"),
        BigDecimal("10.99"),
        BigDecimal("5.99"),
        BigDecimal("3.99"),
    )



    println("Total (Fun): ${sumTotalPrice(priceOfProducts)}")
}

fun sumTotalPrice(arr: Array<BigDecimal>): BigDecimal {
    var totalPrice = BigDecimal.ZERO

    for (price in arr) {
        totalPrice += price
    }

    return totalPrice
}