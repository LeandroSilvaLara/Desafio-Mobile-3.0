package com.br.leandro.desafio_mobile.mappers

class KeywordPagingChecker : NetworkPagingChecker<KeywordListResponse> {
    override fun hasNextPage(response: KeywordListResponse): Boolean {
        return false
    }
}