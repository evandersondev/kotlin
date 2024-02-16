package br.com.evandersondev.poo.encapsulationII

import java.time.LocalDate

class Person(
    private val cpf: String,
    private val name: String,
    private val birthDate: LocalDate,
) {
    val age = LocalDate.now().year - birthDate.year

    fun speak(message: String) {
        println("$name falou: $message")
    }
}