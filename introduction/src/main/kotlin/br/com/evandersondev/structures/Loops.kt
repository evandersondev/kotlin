package br.com.evandersondev.structures

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

    // for
    var totalPrice = BigDecimal.ZERO
    for (price in priceOfProducts) {
        totalPrice += price
    }

    println("Total (for): $totalPrice")

    // white
    totalPrice = BigDecimal.ZERO
    var counter = 0

    while (counter < priceOfProducts.size) {
        totalPrice += priceOfProducts[counter]
        counter++
    }

    println("Total (while): $totalPrice")

    // do while
    totalPrice = BigDecimal.ZERO
    counter = 0

    do {
        totalPrice += priceOfProducts[counter]
        counter++
    } while (counter < priceOfProducts.size)
    println("Total (do while): $totalPrice")

}