package com.br.leandro.desafio_mobile.mappers

class ReviewPagingChecker : NetworkPagingChecker<ReviewListResponse> {
    override fun hasNextPage(response: ReviewListResponse): Boolean {
        return false
    }
}
