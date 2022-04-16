package com.br.leandro.desafio_mobile.presenter.model.network

data class VideoListResponse(
    val id: Int,
    val results: List<Video>
) : NetworkResponseModel
