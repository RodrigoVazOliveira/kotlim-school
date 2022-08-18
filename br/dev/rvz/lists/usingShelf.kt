package br.dev.rvz.lists

fun main() {
    val shelf = Shelf("Literatura", books = createListBook())
    val booksSortedByAuthor = shelf.sortByAuthor()
    val booksSortByYearPublishing = shelf.sortByYearPublishing()
    booksSortedByAuthor.printWithMarker()
    booksSortByYearPublishing.printWithMarker()
}