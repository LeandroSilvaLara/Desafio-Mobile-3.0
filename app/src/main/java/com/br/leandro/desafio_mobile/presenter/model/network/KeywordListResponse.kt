package com.br.leandro.desafio_mobile.presenter.model.network

data class KeywordListResponse(
    val id: Int,
    val keywords: List<Keyword>
) : NetworkResponseModel