package com.br.leandro.desafio_mobile.data.network.model.character

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Thumbnail (
    val path: String,
    val extension: String
) : Parcelable
