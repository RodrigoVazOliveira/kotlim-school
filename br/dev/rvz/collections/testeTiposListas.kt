package br.dev.rvz.collections

fun main() {
    /**
     * iterable -> collections sao interfaces de list e set.
     *
     *
     */

    val names: Collection<String> = setOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    println(names)
    for(name in names.iterator()) {
        println(name)
    }

    println("Contem o nome ana? ${names.contains("Ana")}")
    println("O tamanho da lista e ${names.size}")
}