package com.br.leandro.desafio_mobile.presenter.view

import android.net.ConnectivityManager
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.br.leandro.desafio_mobile.presenter.viewmodel.AllCharactersViewModel

class AllCharactersFragment : Fragment() {

    private val viewModel: AllCharactersViewModel by viewModel()
    private val networkChecker by lazy {
        NetworkChecker(ContextCompat.getSystemService(requireContext(), ConnectivityManager::class.java))
    }

}