package com.br.leandro.desafio_mobile.mappers

class MoviePagingChecker : NetworkPagingChecker<DiscoverMovieResponse> {
    override fun hasNextPage(response: DiscoverMovieResponse): Boolean {
        return response.page < response.total_pages
    }
}
