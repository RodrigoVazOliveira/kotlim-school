package br.dev.rvz.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salaries = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salaries.contentToString())
    val mostSalary = BigDecimal("1.1")
    val salariesWithMost: Array<BigDecimal> =
        salaries.map { salary ->
            val salaryBAse = BigDecimal("5000")
            if (salary < salaryBAse) {
                salary.plus(BigDecimal("500"))
            } else {
                (salary * mostSalary).setScale(2, RoundingMode.UP)
            }
        }.toTypedArray()

    println("Salarios com aumento: ${salariesWithMost.contentToString()}")
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    val size = values.size

    return Array(size) { index -> BigDecimal(values[index]) }
}