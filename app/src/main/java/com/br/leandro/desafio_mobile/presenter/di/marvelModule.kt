package com.br.leandro.desafio_mobile.presenter.di

import com.br.leandro.desafio_mobile.data.api.MarvelService
import com.br.leandro.desafio_mobile.data.network.remote.MarvelRetrofit
import com.br.leandro.desafio_mobile.data.repository.CharactersRepository
import com.br.leandro.desafio_mobile.data.repository.ComicsRepository
import com.br.leandro.desafio_mobile.data.repository.ComicsRepositoryImpl
import com.br.leandro.desafio_mobile.domain.GetComicsByCharacterId
import com.br.leandro.desafio_mobile.domain.GetComicsByCharacterIdUseCase
import com.br.leandro.desafio_mobile.presenter.viewmodel.AllCharactersViewModel
import com.br.leandro.desafio_mobile.presenter.viewmodel.CharacterDetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val marvelModule = module {

    single { MarvelRetrofit.createService(MarvelService::class.java) }

    single { CharactersRepository(get()) }

    viewModel { AllCharactersViewModel(get()) }

    single<ComicsRepository> { ComicsRepositoryImpl(get()) }

    single<GetComicsByCharacterIdUseCase> { GetComicsByCharacterId(get()) }

    viewModel { CharacterDetailsViewModel(get()) }
}