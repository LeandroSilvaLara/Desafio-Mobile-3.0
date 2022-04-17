package com.br.leandro.marvelsuperheroes.data.api

import com.br.leandro.marvelsuperheroes.data.network.model.video.YoutubeResponse
import retrofit2.Response
import retrofit2.http.GET

interface YoutubeService {

    @GET("search")
    suspend fun getVideos(): Response<YoutubeResponse>
}