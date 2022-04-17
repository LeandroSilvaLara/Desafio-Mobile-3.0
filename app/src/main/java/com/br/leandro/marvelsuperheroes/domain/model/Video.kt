package com.br.leandro.marvelsuperheroes.domain.model

import com.br.leandro.marvelsuperheroes.data.network.model.video.ItemId
import com.br.leandro.marvelsuperheroes.data.network.model.video.Snippet

data class Video(
    val id: ItemId,
    val snippet: Snippet
)
