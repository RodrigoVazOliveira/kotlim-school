package br.dev.rvz.lists

fun main() {
    val books = createListBook()
    books.groupBy { it.publishingCompany ?: "editora desconhecida" }
        .forEach { (publishingCompany: String, books: List<Book>)  ->
            println("$publishingCompany: ${books.joinToString { it.title }} ")
        }
}