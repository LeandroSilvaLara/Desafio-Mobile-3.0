package com.br.leandro.desafio_mobile.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {

    @GET("characters")
    suspend fun getCharacters(@Query("offset") offset: Int): MarvelResponse
}