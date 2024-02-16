package br.com.evandersondev.poo.encapsulation

import java.math.BigDecimal

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val calculator = Calculator()
            calculator.sun(BigDecimal.ONE)
            calculator.divider(BigDecimal("50"))
        }
    }
}