package com.br.leandro.desafio_mobile.data.network.model.video

import com.br.leandro.desafio_mobile.domain.model.Video


data class VideoResponse(
    val id: ItemId,
    val snippet: Snippet
)

fun VideoResponse.toVideo() = Video(
    id = this.id,
    snippet = this.snippet
)
