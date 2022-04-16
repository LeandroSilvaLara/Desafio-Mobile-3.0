package com.br.leandro.desafio_mobile.mappers

class VideoPagingChecker : NetworkPagingChecker<VideoListResponse> {
    override fun hasNextPage(response: VideoListResponse): Boolean {
        return false
    }
}
