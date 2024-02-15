package br.com.evandersondev

fun main() {
    // Set nao deixa nenhum elemente se repetir.
    // HashSet      -> Mais rapido, porem nao garante a ordenacao
    // TreeSet      -> Mais lento e ordem os valores basiados nos tipos
    // LinkedSet    -> Garante a ordenacao, porem nao tem comparator

    val hashSet = hashSetOf<Int>(1, 2, 3, 4)        // HashSet
    val sortedSet = sortedSetOf<Int>(1, 2, 3, 4)    // TreeSet
    val linkedSet = linkedSetOf<Int>(1, 2, 3, 4)    // LinkedSet

    hashSet.add(5)
    hashSet.add(3)
    printAllElements(hashSet)
    sortedSet.add(5)
    printAllElements(sortedSet)
    linkedSet.add(5)
    printAllElements(linkedSet)

    // =============================================================
    val hashSet2 = hashSetOf<String>("Evanderson", "Lucky", "Asafe")
    val sortedSet2 = sortedSetOf<String>("Evanderson", "Lucky", "Asafe")
    val linkedSet2 = linkedSetOf<String>("Evanderson", "Lucky", "Asafe")

    hashSet2.add("Teste")
    println(hashSet2.elementAt(3))
    sortedSet2.add("Teste")
    println(sortedSet2.elementAt(3))
    linkedSet2.add("Teste")
    println(linkedSet2.elementAt(0))
}

fun printAllElements(set: Set<Int>) {
    println(set.joinToString(", "))
}