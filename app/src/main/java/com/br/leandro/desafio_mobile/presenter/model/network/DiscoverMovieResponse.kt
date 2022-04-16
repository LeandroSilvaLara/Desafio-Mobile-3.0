package com.br.leandro.desafio_mobile.presenter.model.network

data class DiscoverMovieResponse(
    val page: Int,
    val results: List<Movie>,
    val total_results: Int,
    val total_pages: Int
) : NetworkResponseModel