package com.br.leandro.desafio_mobile.domain.model

import com.br.leandro.desafio_mobile.data.network.model.video.ItemId

data class Video(
    val id: ItemId,
    val snippet: Snippet
)