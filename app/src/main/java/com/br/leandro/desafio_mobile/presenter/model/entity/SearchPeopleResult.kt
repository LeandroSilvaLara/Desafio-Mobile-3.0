package com.br.leandro.desafio_mobile.presenter.model.entity

import androidx.room.Entity

@Entity(primaryKeys = ["query", "page"])
data class SearchPeopleResult(
    val query: String,
    val ids: List<Int>,
    val page: Int
)