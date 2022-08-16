package br.dev.rvz.arrays

fun main() {
    val agesStudants: IntArray = intArrayOf(10, 18, 33, 40, 67)
    val maxAge = agesStudants.maxOrNull()
    val minAge = agesStudants.minOrNull()
    val averageAge = agesStudants.average()
    val ofAge = agesStudants.all { age ->  age >= 18 }
    val existOfAgeStudant = agesStudants.any { age -> age >= 18 }
    val onlyStudantsOfAge = agesStudants.filter { age -> age >= 18 }
    val studantWithEigthtteen = agesStudants.find { age -> age == 18 }

    println("A maior idade e $maxAge e a menor idade e $minAge e a media das idades e $averageAge")
    println("todoas sao maiores de idade? $ofAge. Existe algum aluno maior de idade? $existOfAgeStudant")
    println("Somente alunos maiores de 18 anos: $onlyStudantsOfAge")
    println("Aluno e maior que 18. $studantWithEigthtteen")
}