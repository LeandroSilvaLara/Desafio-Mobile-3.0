package com.br.leandro.desafio_mobile.data.network.model.charcacter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val thumbnail: Thumbnail
) : Parcelable
