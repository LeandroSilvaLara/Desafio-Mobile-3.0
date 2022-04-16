package com.br.leandro.desafio_mobile.presenter.model.network

class ReviewListResponse(
    val id: Int,
    val page: Int,
    val results: List<Review>,
    val total_pages: Int,
    val total_results: Int
) : NetworkResponseModel