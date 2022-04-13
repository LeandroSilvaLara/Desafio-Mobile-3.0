package com.br.leandro.desafio_mobile.data.api

import com.br.leandro.desafio_mobile.data.network.model.charcacter.MarvelResponse
import com.br.leandro.desafio_mobile.data.network.model.comics.ComicsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MarvelService {

    @GET("characters")
    suspend fun getCharacters(@Query("offset") offset: Int): MarvelResponse

    @GET("characters/{characterId}/comics")
    suspend fun getComicsByCharacterId(
        @Path("characterId") characterId: Int,
    ): Response<ComicsResponse>
}