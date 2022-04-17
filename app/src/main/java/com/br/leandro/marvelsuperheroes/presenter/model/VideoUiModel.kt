package com.br.leandro.marvelsuperheroes.presenter.model

import com.br.leandro.marvelsuperheroes.data.network.model.video.ItemId
import com.br.leandro.marvelsuperheroes.data.network.model.video.Snippet
import com.br.leandro.marvelsuperheroes.domain.model.Video

data class VideoUiModel(
    val id: ItemId,
    val snippet: Snippet
)

fun Video.toVideoUiModel() = VideoUiModel(
    id = this.id,
    snippet = this.snippet
)
