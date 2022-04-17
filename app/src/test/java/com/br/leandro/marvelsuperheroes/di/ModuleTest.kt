package com.br.leandro.marvelsuperheroes.di

import com.br.leandro.marvelsuperheroes.presenter.di.*
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.test.KoinTest
import org.koin.test.check.checkModules

class ModuleTest : KoinTest {

    @Test
    fun `Test Koin Modules`() {
        startKoin {
            modules(listOf(marvelModule, youtubeModule))
        }.checkModules()
        stopKoin()
    }
}