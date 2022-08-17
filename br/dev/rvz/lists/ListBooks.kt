package br.dev.rvz.lists

fun main() {
    val bookOne = Book(
        title = "Grande Sertao: Veradas",
        author = "Joao Guimaraes Rosa",
        yearPublish = 1956
    )
    val bookTwo = Book(
        title = "Minha vida de menina",
        author = "Helena Morley",
        yearPublish = 1942,
        publishingCompany = "Editora A"
    )
    val bookThree = Book(
        title = "Memorias postumas de Bras Cubas",
        author = "Machados de Assis",
        yearPublish = 1881
    )
    val bookFour =
        Book(
            title = "Tracema",
            author = "Jose de Alencar",
            yearPublish = 1865,
            publishingCompany = "Editora B"
        )

    val books: MutableList<Book> = mutableListOf(bookOne, bookTwo, bookThree, bookFour)
    books.add(
        Book(title = "Sagarana", author = "Joao Guimaraes Rosa", yearPublish = 1946)
    )

    println(books)
    books.printWithMarker()
    val bookSortedYearPublish = books.sorted()

    bookSortedYearPublish.printWithMarker()

    val booksSortedByTitle = books.sortedBy { it.title }
    booksSortedByTitle.printWithMarker()

    val titlesBooks: List<String> = books.filter { it.author.startsWith("Joao") }
        .sorted()
        .map { it.title }
    println(titlesBooks)
}

fun List<Book>.printWithMarker() {
    val joinToString = this.joinToString(separator = "\n") {
        "- ${it.title} de ${it.author}"
    }
    println("\n##### LISTA DE LIVROS #######\n")
    println(joinToString)
}