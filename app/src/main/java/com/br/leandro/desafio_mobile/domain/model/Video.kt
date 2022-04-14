package com.br.leandro.desafio_mobile.domain.model

import com.br.leandro.desafio_mobile.data.network.model.video.ItemId
import com.br.leandro.desafio_mobile.data.network.model.video.Snippet

data class Video(
    val id: ItemId,
    val snippet: Snippet
)