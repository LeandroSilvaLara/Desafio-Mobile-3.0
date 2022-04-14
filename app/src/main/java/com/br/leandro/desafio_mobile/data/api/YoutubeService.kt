package com.br.leandro.desafio_mobile.data.api

import com.br.leandro.desafio_mobile.data.network.model.video.YoutubeResponse
import retrofit2.Response
import retrofit2.http.GET


interface YoutubeService {

    @GET("search")
    suspend fun getVideos(): Response<YoutubeResponse>
}