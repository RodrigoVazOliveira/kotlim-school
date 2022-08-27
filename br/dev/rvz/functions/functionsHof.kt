package br.dev.rvz.functions

private fun functionsAndLambdasWithParameters() {
    val functionLambdaWithParameters: (Int, Int) -> Int = { valueOne, valueTwo ->
        valueOne * valueTwo
    }

//    val functionLambdaWithParameters = { valueOne: Int, valueTwo: Int ->
//        valueOne * valueTwo
//    }

//    val functionLambdaWithParameters: (Int, Int) -> Int = { _, valueTwo ->
//        2 * valueTwo
//    }

    println("dois vezes 3 e igual a ${functionLambdaWithParameters(2, 3)}")

    val functionAnonymousWithParameters: (Int, Int) -> Int = fun(valueOne, valueTwo): Int {
        return valueOne - valueTwo
    }
    println("O 9 menos 3 e igual a ${functionAnonymousWithParameters(9, 3)}")

    val calcBonus: (salary: Double) -> Double = lambda@{ salary ->
        if (salary > 1000.00) {
            return@lambda salary.plus(50.00)
        }

        return@lambda salary.plus(100.0)
    }

    println("Adicionar bonus ao salario de 200 reais, ${calcBonus(200.00)}")
    println("Salario maior que mil, ${calcBonus(1001.00)}")

    val calcBonusAnonymous: (salary: Double) -> Double = fun(salary: Double): Double {
        if (salary > 1000.00) {
            return salary.plus(50.00)
        }

        return salary.plus(100.0)
    }

    println("Calcula salario com funcao anonimas ${calcBonusAnonymous(508.00)}")
}

fun testeFunctionsWithParametersAndAnonymous() {
    val myFunctionLambda: () -> Unit = {
        println("Executa funcao lambda")
    }

    println(myFunctionLambda())

    val myFunctionAnonymous: () -> Unit = fun() {
        println("Executando a funcao anonima")
    }

    println(myFunctionAnonymous())

    val sumTwoValues: (Int, Int) -> Int = ::sum
    println("A soma de 2 + 1 e igual a ${sumTwoValues(2, 1)}")

    val sumWithClass: (Int, Int) -> Int = SumByClass()
    println("Soma de 4 mais 4 e igual ${sumWithClass(4, 4)}")
}

fun sum(valueOne: Int, valueTwo: Int): Int {
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

class SumByClass : (Int, Int) -> Int {
    override fun invoke(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo

}