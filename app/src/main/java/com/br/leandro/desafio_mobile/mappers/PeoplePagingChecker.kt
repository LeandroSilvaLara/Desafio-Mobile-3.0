package com.br.leandro.desafio_mobile.mappers

class PeoplePagingChecker : NetworkPagingChecker<PeopleResponse> {
    override fun hasNextPage(response: PeopleResponse): Boolean {
        return response.page < response.total_pages
    }
}
