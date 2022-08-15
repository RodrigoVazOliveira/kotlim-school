package br.dev.rvz.arrays

fun main() {
    val ranges: IntRange = 1.rangeTo(100)
    for (s in ranges) {
        print("$s ")
    }

    println()
    val numberPairs = 0..100 step 2
    numberPairs.forEach({number -> print("$number ")})

    println()
    val numberPairsReverses = 100 downTo 0 step 2
    numberPairsReverses.forEach { number -> print("$number ") }

    val salariesFaixa = 1500.00..5000.00
    val salary = 1400.0

    println()

    if (salary in salariesFaixa) {
        println("esta dentro do intervado")
    } else {
        println(" nao esta no intervalo")
    }
}