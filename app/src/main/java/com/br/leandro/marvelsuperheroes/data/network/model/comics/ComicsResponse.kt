package com.br.leandro.marvelsuperheroes.data.network.model.comics

data class ComicsResponse(
    val code: Int,
    val data: Data,
    val status: String
)