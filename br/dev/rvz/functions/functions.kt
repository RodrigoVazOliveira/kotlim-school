package br.dev.rvz.functions

fun main() {

    with(Address(road = "Rua Vermelhor", city = "New York")) {
        "$city and $road"
    }.let { s -> println(s) }
}
