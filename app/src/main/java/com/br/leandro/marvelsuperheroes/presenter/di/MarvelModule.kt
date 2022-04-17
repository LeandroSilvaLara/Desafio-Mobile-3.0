package com.br.leandro.marvelsuperheroes.presenter.di

import com.br.leandro.marvelsuperheroes.data.api.MarvelService
import com.br.leandro.marvelsuperheroes.data.network.remote.MarvelRetrofit
import com.br.leandro.marvelsuperheroes.data.repository.CharactersRepository
import com.br.leandro.marvelsuperheroes.data.repository.ComicsRepository
import com.br.leandro.marvelsuperheroes.data.repository.ComicsRepositoryImpl
import com.br.leandro.marvelsuperheroes.domain.GetComicsByCharacterId
import com.br.leandro.marvelsuperheroes.domain.GetComicsByCharacterIdUseCase
import com.br.leandro.marvelsuperheroes.presenter.viewmodel.AllCharactersViewModel
import com.br.leandro.marvelsuperheroes.presenter.viewmodel.CharacterDetailsViewModel
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