package com.br.leandro.desafio_mobile.presenter.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MovieListViewModel::class)
    abstract fun bindMovieListFragmentViewModel(movieListViewModel: MovieListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MovieDetailViewModel::class)
    abstract fun bindMovieDetailViewModel(movieDetailViewModel: MovieDetailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TvDetailViewModel::class)
    abstract fun bindTvDetailViewModel(tvDetailViewModel: TvDetailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CelebritiesListViewModel::class)
    abstract fun bindCelebritiesListViewModel(celebritiesListViewModel: CelebritiesListViewModel): ViewModel


    @Binds
    @IntoMap
    @ViewModelKey(TvListViewModel::class)
    abstract fun bindTvListViewModel(tvListViewModel: TvListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PersonDetailViewModel::class)
    abstract fun bindPersonDetailViewModel(personDetailViewModel: PersonDetailViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MovieSearchViewModel::class)
    abstract fun bindMovieSearchViewModel(movieSearchViewModel: MovieSearchViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TvSearchViewModel::class)
    abstract fun bindTvSearchViewModel(tvSearchViewModel: TvSearchViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MovieSearchFilterViewModel::class)
    abstract fun bindMovieSearchFilterViewModel(movieSearchFilterViewModel: MovieSearchFilterViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TvSearchFilterViewModel::class)
    abstract fun bindTvSearchFilterViewModel(tvSearchFilterViewModel: TvSearchFilterViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SearchCelebritiesResultViewModel::class)
    abstract fun bindSearchCelebritiesResultViewModel(searchCelebritiesResultViewModel: SearchCelebritiesResultViewModel): ViewModel


    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}
