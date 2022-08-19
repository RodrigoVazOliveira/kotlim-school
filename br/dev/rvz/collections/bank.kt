package br.dev.rvz.collections

fun main() {
    val watchingCourseAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val watchingCourseKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
    //val watchingBoth: Set<String> = watchingCourseAndroid + watchingCourseKotlin
    val watchingAll = mutableSetOf<String>()
    watchingAll.addAll(watchingCourseAndroid)
    watchingAll.addAll(watchingCourseKotlin)
    println(watchingAll)


    // teste union
    val unionWatchingCourses = mutableSetOf<String>()
    val union = unionWatchingCourses.union(watchingCourseAndroid)
    val intersection = union.intersect(watchingCourseKotlin)
    val subtract = union.subtract(watchingCourseKotlin)

    println("Usando uniao $union")
    println("Intersecao da uniao $intersection")
    println("subtracao $subtract")

    // transformar em lista

    val watchingList = watchingAll.toMutableList()
    watchingList.add("Valmir")
    println(watchingList)
    println(watchingList.toSet())
}
