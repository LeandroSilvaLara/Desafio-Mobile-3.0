package com.br.leandro.desafio_mobile.presenter.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FilteredTvResult(
    val ids: List<Int>,
    @PrimaryKey
    val page: Int
)