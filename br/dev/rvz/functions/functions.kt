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

