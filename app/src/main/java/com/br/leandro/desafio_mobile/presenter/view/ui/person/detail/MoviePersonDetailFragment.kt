package com.br.leandro.desafio_mobile.presenter.view.ui.person.detail

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

class MoviePersonDetailFragment : Fragment(R.layout.fragment_movie_celebrity_detail), Injectable {

    private var binding by autoCleared<FragmentMovieCelebrityDetailBinding>()

    var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = DataBindingUtil.bind(view, dataBindingComponent)!!

        with(binding) {
            movie = getMovieFromIntent()
            detailHeader.movie = getMovieFromIntent()
        }
    }

    private fun getMovieFromIntent(): MoviePerson {
        return MoviePersonDetailFragmentArgs.fromBundle(
            requireArguments()
        ).movie
    }
}