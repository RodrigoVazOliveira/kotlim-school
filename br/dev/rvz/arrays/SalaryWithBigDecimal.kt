package br.dev.rvz.arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salaries = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")

    println(salaries.contentToString())
    val mostSalary = BigDecimal("1.1")
    val salariesWithMost: Array<BigDecimal> =
        salaries.map { salary -> calculateMostRelative(salary, mostSalary) }.toTypedArray()

    println("Salarios com aumento: ${salariesWithMost.contentToString()}")
    val sumSalaries = salariesWithMost.sum()
    println("A soma do salario com aumento e de $sumSalaries")
}

private fun calculateMostRelative(
    salary: BigDecimal,
    mostSalary: BigDecimal
): BigDecimal {
    val salaryBAse = BigDecimal("5000")
    return if (salary < salaryBAse) {
        salary.plus(BigDecimal("500"))
    } else {
        (salary * mostSalary).setScale(2, RoundingMode.UP)
    }
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    val size = values.size

    return Array(size) { index -> BigDecimal(values[index]) }
}

fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acumulator, value -> acumulator.plus(value) }
}