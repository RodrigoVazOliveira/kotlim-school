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

    orders.put(4, 2500.00)

    println("Novo map inserido: $orders")

    orders.remove(4)
    println("removido o numero 4: $orders")
}