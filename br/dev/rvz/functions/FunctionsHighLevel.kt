package br.dev.rvz.functions

fun main() {

}

fun testeDEScopeFunctions() {

//    Address(road = "bu").let { it }
//    "".let { it }
//    1.let { it }
//
//    val address = Address(road = "Plutao")
//    val addressUpperCase = "${address.road.uppercase()}"

    Address(road = "Plutao", city = "Uberlandia")
        .let { address -> "${address.road.uppercase()}" }
        .let(::println)


    listOf<Address>(
        Address(road = "Plutao", city = "Uberlandia"),
        Address(road = "", city = ""),
        Address("Zenity", city = "Monte Carmelo")
    )
        .filter { address -> address.road.isNotEmpty() }
        .let(::println)

    println(testHigherFunction({ 12 * 2 }, 20))

    sumCustom(1, 2) {
        println(it)
    }

    authenticator("123", "123", authentica = ::println)


    // teste de scope funciton with this

    "Ola mundo".run { println("o tamanho da palavra e $length") }

    Address(road = "Rua Mercurio", city = "Patos de minas").run { "rua $road".uppercase() }
        .let { addressUpperCase: String -> println(addressUpperCase) }


    run {
        println("execucao do run")
    }

    val addressThree = Address(road = "Global", city = "Sao Paulo").also { println("criando um objeto") }

    with(addressThree) {
        "a rua desse endereco e $road".uppercase()
    }.let { addressUpperCase: String ->
        println(addressUpperCase)
    }

    listOf(
        Address(road = "casa", city = "Belo Horizonte"),
        Address(road = "", city = ""),
        Address(road = "apartamento", city = "Araguari")
    )
        .filter(predicate = { endereco -> endereco.road.isNotEmpty() })
        .let(block = (::println))


}

fun testHigherFunction(valueOne: () -> Int, valueTwo: Int): Int {
    return valueTwo.plus(valueOne())
}


fun sumCustom(valueOne: Int, valueTwo: Int, result: (Int) -> Unit) {
    result(valueOne + valueTwo)
}

fun authenticator(password: String, passwordActual: String, authentica: (String) -> Unit) {
    if (password == passwordActual) {
        authentica(password)
    }
}