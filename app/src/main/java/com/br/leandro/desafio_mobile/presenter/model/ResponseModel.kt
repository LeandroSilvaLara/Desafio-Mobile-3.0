package com.br.leandro.desafio_mobile.presenter.model

@Suppress("unused")
data class ResponseModel(
    val page: Int,
    val results: Any,
    val total_results: Int,
    val total_pages: Int
)
