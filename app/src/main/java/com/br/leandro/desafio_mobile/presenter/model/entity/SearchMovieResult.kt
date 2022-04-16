package com.br.leandro.desafio_mobile.presenter.model.entity

import androidx.room.Entity

@Entity(primaryKeys = ["query", "pageNumber"])
data class SearchMovieResult(
    val query: String,
    val movieIds: List<Int>,
    val pageNumber: Int
)