package com.br.leandro.desafio_mobile.data.network.model.charcacter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Thumbnail (
    val path: String,
    val extension: String
) : Parcelable
