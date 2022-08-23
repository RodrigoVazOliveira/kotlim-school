package br.dev.rvz.functions

import java.math.BigInteger

fun main() {

    Address(road = "bu").let { it }
    "".let { it }
    1.let { it }


    println(testHigherFunction({12 * 2}, 20))
}


fun testHigherFunction(valueOne: () -> Int, valueTwo: Int) : Int {
    return valueTwo.plus(valueOne())
}
