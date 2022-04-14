package com.br.leandro.desafio_mobile.domain

import com.br.leandro.desafio_mobile.data.network.model.comics.Comic
import com.br.leandro.desafio_mobile.data.repository.ComicsRepository
import java.lang.Exception

class GetComicsByCharacterId(
    private val repository: ComicsRepository
): GetComicsByCharacterIdUseCase {
    override suspend fun invoke(characterId: Int): List<Comic> = try {
        repository.getComicsByCharacterId(characterId)
    } catch (ex: Exception) {
        listOf()
    }
}

interface GetComicsByCharacterIdUseCase {
    suspend operator fun invoke(characterId: Int): List<Comic>
}