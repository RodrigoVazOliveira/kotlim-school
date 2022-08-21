package br.dev.rvz.collections

fun main() {
    val orders: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.1),
        Pair(2, 34.0),
        3 to 59.0
    )
    println(orders)
    val orderTwo = orders[1]
    orderTwo?.let { println("Pedido $it") }

    for (order: Map.Entry<Int, Double> in orders) {
        println("a chave da ordem e ${order.key}\nO valor da order e ${order.value}")
    }

    orders[4] = 2500.00
    orders[5] = 28000.00

    println("Novo map inserido: $orders")

    orders.remove(4)
    println("removido o numero 4: $orders")

    println("Obter valor do cinco ${orders[5]}")


    // adicionar se nao existir, se exitir manter o valor atual
    orders.putIfAbsent(1, 8000.00)

    println("validar se ouve modificacao no 1 ${orders[1]}")


    // remover se o valor tambem e igual

    orders.remove(1, 100.00)

    // nao deve ser removido pelo fato do valor nao ser igual
    println(orders)

}