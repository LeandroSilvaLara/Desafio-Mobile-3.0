package com.br.leandro.desafio_mobile.presenter.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TvPersonResult(
    val tvsIds: List<Int>,
    @PrimaryKey
    val personId: Int
)