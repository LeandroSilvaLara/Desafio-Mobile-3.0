package com.br.leandro.desafio_mobile.presenter.model.entity

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class TvRecentQueries(
    val query: String?
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}