package com.br.leandro.desafio_mobile.presenter.model.network

data class PeopleResponse(
    val page: Int,
    val results: List<Person>,
    val total_results: Int,
    val total_pages: Int
) : NetworkResponseModel