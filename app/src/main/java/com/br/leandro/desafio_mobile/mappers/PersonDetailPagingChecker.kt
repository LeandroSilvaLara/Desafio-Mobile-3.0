package com.br.leandro.desafio_mobile.mappers

class PersonDetailPagingChecker : NetworkPagingChecker<PersonDetail> {
    override fun hasNextPage(response: PersonDetail): Boolean {
        return false
    }
}
