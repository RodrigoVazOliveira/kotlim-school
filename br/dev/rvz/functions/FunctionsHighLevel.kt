package br.dev.rvz.functions

import java.math.BigInteger

fun main() {

//    Address(road = "bu").let { it }
//    "".let { it }
//    1.let { it }
//
//    val address = Address(road = "Plutao")
//    val addressUpperCase = "${address.road.uppercase()}"

    Address(road = "Plutao")
        .let { address -> "${address.road.uppercase()}" }
        .let(::println)


    listOf<Address>(Address(road = "Plutao"), Address(road = ""), Address("Zenity"))
        .filter { address -> address.road.isNotEmpty() }
        .let(::println)

    println(testHigherFunction({12 * 2}, 20))

    sumCustom(1, 2) {
        println(it)
    }

    authenticator("123", "123", authentica = ::println)


    // teste de scope funciton with this

    "Ola mundo".run { println("o tamanho da palavra e $length") }

    Address(road = "Rua Mercurio").run { "rua $road".uppercase() }.let(::println)

}


fun testHigherFunction(valueOne: () -> Int, valueTwo: Int) : Int {
    return valueTwo.plus(valueOne())
}


fun sumCustom(valueOne: Int, valueTwo: Int, result: (Int) -> Unit)  {
    result(valueOne + valueTwo)
}

fun authenticator(password: String, passwordActual: String, authentica: (String) -> Unit)  {
    if (password == passwordActual) {
        authentica(password)
    }
}