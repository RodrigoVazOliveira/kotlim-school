package br.dev.rvz.collections

fun main() {
    val bank = BankName()
    bank.save("Rodrigo")
    println(bank.names)
    println(BankName().names)
}

class BankName {
    val names: Collection<String> get() = datas

    fun save(name: String) {
        datas.add(name)
    }

    companion object {
        private val datas = mutableListOf<String>()
    }
}

fun testBankNames() {
    val names: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )

    for (name in names) {
        println(name)
    }

    println(names)
}