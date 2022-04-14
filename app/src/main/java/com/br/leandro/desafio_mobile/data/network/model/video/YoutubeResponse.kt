package com.br.leandro.desafio_mobile.data.network.model.video

import android.graphics.pdf.PdfDocument

data class YoutubeResponse(
    val regionCode: String,
    val pageInfo: PdfDocument.PageInfo,
    val items: List<VideoResponse>
)
