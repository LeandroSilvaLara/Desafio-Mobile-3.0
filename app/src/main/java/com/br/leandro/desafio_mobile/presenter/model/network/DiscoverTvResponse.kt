package com.br.leandro.desafio_mobile.presenter.model.network

data class DiscoverTvResponse(
    val page: Int,
    val results: List<Tv>,
    val total_results: Int,
    val total_pages: Int
) : NetworkResponseModel
