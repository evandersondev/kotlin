package br.com.evandersondev.structures

fun main() {
    var array = arrayOf(1, 2, 3, 4, 5, 6)
    array[1] = 10

    println(array[1])

    array += arrayOf(29, 34)
    println(array)

    var list = listOf(1, 2, 3, 4, 5, 6)
    list += listOf(7)
    println(list[6])

    val arrayList = arrayListOf(1, 2, 3, 4, 5, 6)
    arrayList.add(23)
    println(arrayList)


}
