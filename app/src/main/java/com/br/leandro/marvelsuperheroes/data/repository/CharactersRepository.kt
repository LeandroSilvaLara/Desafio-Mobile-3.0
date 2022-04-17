package com.br.leandro.marvelsuperheroes.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.br.leandro.marvelsuperheroes.data.api.MarvelService
import com.br.leandro.marvelsuperheroes.data.network.model.character.Character
import com.br.leandro.marvelsuperheroes.data.repository.paging.CharacterPagingSource
import kotlinx.coroutines.flow.Flow

class CharactersRepository(private val apiService: MarvelService) {

     fun getResultStream(): Flow<PagingData<Character>> {
          return Pager(config = PagingConfig(pageSize = pageSize, maxSize = pageMax),
          pagingSourceFactory = { CharacterPagingSource(apiService) }
               ).flow
     }

     companion object {
          const val pageSize: Int = 20
          const val pageMax: Int = 200
     }
}