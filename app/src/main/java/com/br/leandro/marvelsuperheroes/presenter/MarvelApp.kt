package com.br.leandro.marvelsuperheroes.presenter

import android.app.Application
import com.br.leandro.marvelsuperheroes.presenter.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MarvelApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MarvelApp)
            modules(
                listOf(
                    marvelModule,
                    youtubeModule
                )
            )
        }
    }
}