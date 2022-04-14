package com.br.leandro.desafio_mobile.presenter.di

import com.br.leandro.desafio_mobile.data.network.remote.YoutubeRetrofit
import com.br.leandro.desafio_mobile.data.repository.YoutubeVideoRepository
import com.br.leandro.desafio_mobile.data.repository.YoutubeVideoRepositoryImpl
import com.br.leandro.desafio_mobile.domain.GetVideos
import com.br.leandro.desafio_mobile.domain.GetVideosUseCase
import com.br.leandro.desafio_mobile.presenter.viewmodel.MarvelYoutubeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val youtubeModule = module {

    single { YoutubeRetrofit.createService(YoutubeService::class.java) }

    factory<YoutubeVideoRepository> { YoutubeVideoRepositoryImpl(get()) }

    factory<GetVideosUseCase> { GetVideos(get()) }

    viewModel { MarvelYoutubeViewModel(get()) }
}