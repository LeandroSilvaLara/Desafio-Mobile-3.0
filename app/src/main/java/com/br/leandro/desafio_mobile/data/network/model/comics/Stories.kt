package com.br.leandro.desafio_mobile.data.network.model.comics

data class Stories (
    val available: Int,
    val collectionURI: String,
    val items: List<ItemStories>,
    val returned: Int
)