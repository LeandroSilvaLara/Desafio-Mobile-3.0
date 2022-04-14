package com.br.leandro.desafio_mobile.data.network.model.comics

data class Creators(
    val available: Int,
    val collectionURI: String,
    val items: List<ItemCreator>,
    val returned: Int
)