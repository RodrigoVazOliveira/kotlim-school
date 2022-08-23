package br.dev.rvz.functions

fun main() {
    val myFunctionLambda: () -> Unit = {
        println("Executa funcao lambda")
    }

    println(myFunctionLambda())

    val myFunctionAnonymous: () -> Unit = fun () {
        println("Executando a funcao anonima")
    }

    println(myFunctionAnonymous())

    val sumTwoValues: (Int, Int) -> Int = ::sum
    println("A soma de 2 + 1 e igual a ${sumTwoValues(2, 1)}")

    val sumWithClass: (Int, Int) -> Int = SumByClass()
    println("Soma de 4 mais 4 e igual ${sumWithClass(4, 4)}")
}

fun sum(valueOne: Int, valueTwo: Int) : Int {
    return valueOne + valueTwo;
}

fun testeFunctions() {
    val myFunction: () -> Unit = ::test
    println(myFunction())
    val myFunctionWithClass = Teste()
    println(myFunctionWithClass())

    println(myFunctionWithClass(3))

    // lambda e function anonymous
}

fun test() {
    println("executa testes")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executando a classe teste")
    }

    operator fun invoke(value: Int) {
        println(value)
    }
}

class SumByClass: (Int, Int) -> Int {
    override fun invoke(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo

}