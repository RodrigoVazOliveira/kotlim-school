package br.dev.rvz.functions

fun main() {
    val myFunction: () -> Unit = ::test
    myFunction()
    val myFunctionWithClass: () -> Unit = Teste()
    myFunctionWithClass()
}

fun test() {
    println("executa testes")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executando a classe teste")
    }
}

