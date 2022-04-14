package com.br.leandro.desafio_mobile.domain

import android.provider.MediaStore
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
    suspend operator fun invoke(): List<MediaStore.Video>
}