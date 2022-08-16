package br.dev.rvz.arrays

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    val size = values.size

    return Array(size) { index -> BigDecimal(values[index]) }
}

fun Array<BigDecimal>.sum(): BigDecimal {
    return this.reduce { acumulator, value -> acumulator.plus(value) }
}

fun Array<BigDecimal>.avarage(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.sum() / this.size.toBigDecimal()
    }
}