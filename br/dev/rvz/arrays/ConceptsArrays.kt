package br.dev.rvz.arrays

fun main() {
    val ages = intArrayOf(15, 19, 33, 59, 35)

    var ageGreat = Int.MIN_VALUE
    for (age in ages) {
        if (ageGreat < age) {
            ageGreat = age
        }
    }

    var ageMinor = Int.MAX_VALUE
    ages.forEach { age ->
        if (ageMinor > age) {
            ageMinor = age
        }
    }

    println("A maior idade e $ageGreat e a menor idade e $ageMinor")
}
