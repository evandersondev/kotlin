package br.com.evandersondev

fun main() {
    val routeType = "ONIBUS" // CARRO, ONIBUS, TREM
    when (routeType) {
        "A_PE" -> {
            println("Rota a pe")
        }
        "CARRO" -> {
            println("Rota de carro")
        }
        "ONIBUS" -> {
            println("Rota de onibus")
        }
    }
}