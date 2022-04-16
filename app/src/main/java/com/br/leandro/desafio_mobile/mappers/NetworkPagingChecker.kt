package com.br.leandro.desafio_mobile.mappers

interface NetworkPagingChecker<in FROM : NetworkResponseModel> {
    fun hasNextPage(response: FROM): Boolean
}
