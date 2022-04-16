package com.br.leandro.desafio_mobile.presenter.model

data class FilterData (
    val rating: Int? = null,
    var sort: String? = null,
    val year: Int? = null,
    val keywords: String? = null,
    val genres: String? = null,
    val language: String? = null,
    val runtime: Int? = null,
    val region: String? = null
)