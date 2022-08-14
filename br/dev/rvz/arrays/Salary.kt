package br.dev.rvz.arrays

fun main() {
    val salaries: DoubleArray = doubleArrayOf(500.50, 2300.00, 5000.0, 8000.00, 10000.0)

    val increase = 1.1
    for (i in salaries.indices) {
        salaries[i] = salaries[i] * increase
    }

    println(salaries.contentToString())

    salaries.forEachIndexed { index, salary ->
        salaries[index] = salary * increase
    }

    println(salaries.contentToString())
}