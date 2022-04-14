package com.br.leandro.desafio_mobile.data.repository

import com.br.leandro.desafio_mobile.data.api.MarvelService

class ComicsRepositoryImpl(
    private val service: MarvelService
): ComicsRepository {
    override suspend fun getComicsByCharacterId(characterId: Int): List<Comic> {
        return when (val result = service.getComicsByCharacterId(characterId).parseResponse()) {
            is Output.Success -> {
                result.value.data.results
            }
            is Output.Failure -> throw GetComicsException()
        }
    }
}

interface ComicsRepository {
    suspend fun getComicsByCharacterId(characterId: Int): List<Comic>
}

class Ge