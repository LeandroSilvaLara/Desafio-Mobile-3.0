package com.br.leandro.marvelsuperheroes.data.network.model.video

import com.br.leandro.marvelsuperheroes.domain.model.Video

data class VideoResponse(
    val id: ItemId,
    val snippet: Snippet
)

fun VideoResponse.toVideo() = Video(
    id = this.id,
    snippet = this.snippet
)
