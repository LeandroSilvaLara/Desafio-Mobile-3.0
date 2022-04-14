package com.br.leandro.desafio_mobile.presenter.model

import com.br.leandro.desafio_mobile.data.network.model.video.ItemId
import com.br.leandro.desafio_mobile.data.network.model.video.Snippet
import com.br.leandro.desafio_mobile.domain.model.Video

data class VideoUiModel(
    val id: ItemId,
    val snippet: Snippet
)

fun Video.toVideoUiModel() = VideoUiModel(
    id = this.id,
    snippet = this.snippet
)
