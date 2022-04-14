package com.br.leandro.desafio_mobile.data.network.model.comics

data class Characters (
    val available: Int,
    val collectionURI: String,
    val itemCharacters: List<ItemCharacter>,
    val returned: Int
)