package com.br.leandro.desafio_mobile.mappers

class TvPersonPagingChecker : NetworkPagingChecker<TvPersonResponse> {
    override fun hasNextPage(response: TvPersonResponse): Boolean {
        return false
    }
}
