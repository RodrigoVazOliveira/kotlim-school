package br.dev.rvz.lists

data class Book(
    val title: String,
    val author: String,
    val yearPublish: Long,
    val publishingCompany: String? = null
)