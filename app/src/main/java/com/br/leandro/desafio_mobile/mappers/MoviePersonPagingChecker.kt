package com.br.leandro.desafio_mobile.mappers

class MoviePersonPagingChecker : NetworkPagingChecker<MoviePersonResponse> {
    override fun hasNextPage(response: MoviePersonResponse): Boolean {
        return false
    }
}
