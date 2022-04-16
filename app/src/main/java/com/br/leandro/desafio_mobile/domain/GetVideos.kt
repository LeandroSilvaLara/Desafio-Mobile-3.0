package com.br.leandro.desafio_mobile.domain

import com.br.leandro.desafio_mobile.data.service.YoutubeVideoRepository
import com.br.leandro.desafio_mobile.domain.model.Video
import java.lang.Exception


class GetVideos(
    private val videoRepository: YoutubeVideoRepository
) : GetVideosUseCase {
    override suspend fun invoke(): List<Video> = try {
        videoRepository.getVideos()
    } catch (ex: Exception) {
        listOf()
    }
}

interface GetVideosUseCase {
    suspend operator fun invoke(): List<Video>
}