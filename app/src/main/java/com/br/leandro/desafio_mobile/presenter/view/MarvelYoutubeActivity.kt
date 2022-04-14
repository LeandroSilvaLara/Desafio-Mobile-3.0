package com.br.leandro.desafio_mobile.presenter.view

import androidx.appcompat.app.AppCompatActivity
import com.br.leandro.desafio_mobile.databinding.ActivityMarvelYoutubeBinding
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.reward.RewardedVideoAd

class MarvelYoutubeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMarvelYoutubeBinding
    private lateinit var interstitialAd: InterstitialAd
    private lateinit var rewardedVideoAd: RewardedVideoAd
    private val viewModelYoutube: MarvelYoutubeViewModel by viewModel()

}