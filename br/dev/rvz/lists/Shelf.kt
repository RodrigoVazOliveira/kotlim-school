package br.dev.rvz.lists

data class Shelf(
    val gender: String,
    val books: MutableList<Book>
) {
    fun sortByAuthor() : List<Book> {
        return books.sortedBy { it.author }
    }

    fun sortByYearPublishing() : List<Book> {
        return books.sortedBy { it.yearPublish }
    }
}