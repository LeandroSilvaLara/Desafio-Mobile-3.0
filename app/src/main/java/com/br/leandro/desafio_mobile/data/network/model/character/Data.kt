package com.br.leandro.desafio_mobile.data.network.model.character

data class Data (
    var offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<Character>
)