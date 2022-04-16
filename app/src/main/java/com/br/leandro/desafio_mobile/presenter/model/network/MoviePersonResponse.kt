package com.br.leandro.desafio_mobile.presenter.model.network

class MoviePersonResponse(
    val cast: List<MoviePerson>,
    val id : Int
) : NetworkResponseModel