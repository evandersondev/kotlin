package br.com.evandersondev.poo.encapsulation

import java.math.BigDecimal
import java.math.RoundingMode

class Calculator {
    /*
    public
    private
    protected
    internal
     */
    private var result = BigDecimal.ZERO

    fun sun(a: BigDecimal) {
        result += a
        showResult()
    }

    fun sub(a: BigDecimal) {
        result -= a
        showResult()
    }

    fun multiply(a: BigDecimal) {
        result *= a
        showResult()
    }

    fun divider(a: BigDecimal) {
        result = result.divide(a, 2, RoundingMode.HALF_UP)
        showResult()
    }

    private fun showResult() {
        println("O resultado: $result")
    }
}