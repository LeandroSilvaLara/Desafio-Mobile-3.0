package com.br.leandro.marvelsuperheroes.data.network.model.video

data class YoutubeResponse(
    val regionCode: String,
    val pageInfo: PageInfo,
    val items: List<VideoResponse>
)
