package br.dev.rvz.collections

fun main() {
    val orders: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.1),
        Pair(2, 34.0),
        3 to 59.0
    )

    println("order one: ${orders[4]}")

    // se nao encontrar o map
    println(orders.getOrElse(0) {
        0.0
    })

    println(orders.getOrDefault(21, 1.1))

    // access all keys e values
    println("todos os keys ${orders.keys} e todos os valores ${orders.values}")

    orders.values.forEach { value -> println(value) }


    // fazendo filters

    val ordersMinor = orders.filter {(number, value) ->
        number % 2 == 0 && value > 20.00
    }

    println("pedidos maior que cinguenta $ordersMinor")

    val ordersPairs = orders.filterKeys { key -> key % 2 == 0 }

    println("apenas pedidos pares: $ordersPairs")

    // using maps with plus end minus
    println(orders + Pair(7, 12312.3))
    println(orders + mapOf(8 to 3131.1))

    println(orders - Pair(7, 12312.3))

    orders.putAll(setOf<Pair<Int, Double>>(1 to 3412312.1, 9 to 32343.4, 10 to 123123.1, 12  to 123123.1))


    orders.remove(1)
    orders.values.remove(123123.1)

    println(orders)

    orders.keys.remove(12)

    println(orders)
}

fun manipularMap(orders: MutableMap<Int, Double>) {
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