package com.br.leandro.marvelsuperheroes

import com.br.leandro.marvelsuperheroes.domain.GetVideosTest
import com.br.leandro.marvelsuperheroes.presenter.viewmodel.MarvelYoutubeViewModelTest
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses(
    GetVideosTest::class,
    MarvelYoutubeViewModelTest::class
)
class UnitTestSuite