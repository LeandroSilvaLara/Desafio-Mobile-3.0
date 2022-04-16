package com.br.leandro.desafio_mobile.mappers

class TvPagingChecker : NetworkPagingChecker<DiscoverTvResponse> {
    override fun hasNextPage(response: DiscoverTvResponse): Boolean {
        return response.page < response.total_pages
    }
}
