package com.br.leandro.marvelsuperheroes.presenter.di

import com.br.leandro.marvelsuperheroes.data.api.YoutubeService
import com.br.leandro.marvelsuperheroes.data.network.remote.YoutubeRetrofit
import com.br.leandro.marvelsuperheroes.data.repository.YoutubeVideoRepository
import com.br.leandro.marvelsuperheroes.data.repository.YoutubeVideoRepositoryImpl
import com.br.leandro.marvelsuperheroes.domain.GetVideos
import com.br.leandro.marvelsuperheroes.domain.GetVideosUseCase
import com.br.leandro.marvelsuperheroes.presenter.viewmodel.MarvelYoutubeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val youtubeModule = module {

    single { YoutubeRetrofit.createService(YoutubeService::class.java) }

    factory<YoutubeVideoRepository> { YoutubeVideoRepositoryImpl(get()) }

    factory<GetVideosUseCase> { GetVideos(get()) }

    viewModel { MarvelYoutubeViewModel(get()) }
}