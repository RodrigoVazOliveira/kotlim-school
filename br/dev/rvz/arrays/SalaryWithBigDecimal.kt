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

    val months = BigDecimal("6")
    val totalInSixMonth = salariesWithMost.fold(sumSalaries) { accumulator, salary ->
        accumulator.plus(salary * months).setScale(2, RoundingMode.UP)
    }

    println("total de gastos em 6 meses $totalInSixMonth")

    val avarageToThreelastSalaries = salariesWithMost.sorted()
        .takeLast(3).toTypedArray()
        .avarage()

    val avarageToThreeMinorsSalaries = salariesWithMost.sorted()
        .take(3).toTypedArray()
        .avarage()

    println("A media dos 3 ultimos amiores salarios $avarageToThreelastSalaries e a medias dos primeiros salarios e $avarageToThreeMinorsSalaries")

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