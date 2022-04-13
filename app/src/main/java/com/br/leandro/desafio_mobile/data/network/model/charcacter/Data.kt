package com.br.leandro.desafio_mobile.data.network.model.charcacter

data class Data (
    var offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<Character>
)