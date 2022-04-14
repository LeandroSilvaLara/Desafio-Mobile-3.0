package com.br.leandro.desafio_mobile.data.repository

import java.lang.Exception

class YoutubeVideoRepositoryImpl(
    private val service: YoutubeService
): YoutubeVideoRepository {

    override suspend fun getVideos(): List<Video> {

        return when (val result = service.getVideos().parseResponse()) {

            is Output.Success -> { result.value.items.map { videoResponse ->
                videoResponse.toVideo()
            } }
            is Output.Failure -> throw GetVideosException()
        }
    }
}

interface YoutubeVideoRepository {
    suspend fun getVideos(): List<Video>
}

class GetVideosException: Exception()