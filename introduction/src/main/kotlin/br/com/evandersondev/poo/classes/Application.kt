package br.com.evandersondev.poo.classes

import java.time.LocalDate

class Application {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val asafe = Person("12312312345", "Asafe Dias", LocalDate.of(2018, 6, 4))
            asafe.speak("Hello World from Kotlin.")
        }
    }
}