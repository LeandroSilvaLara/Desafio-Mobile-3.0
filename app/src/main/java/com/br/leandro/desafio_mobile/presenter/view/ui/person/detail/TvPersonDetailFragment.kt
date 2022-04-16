package com.br.leandro.desafio_mobile.presenter.view.ui.person.detail

import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment

class TvPersonDetailFragment : Fragment(R.layout.fragment_tv_celebrity_detail), Injectable {

    private var binding by autoCleared<FragmentTvCelebrityDetailBinding>()

    var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = DataBindingUtil.bind(view, dataBindingComponent)!!

        with(binding) {
            tv = getTvFromIntent()
            detailHeader.tv = getTvFromIntent()
        }
    }

    private fun getTvFromIntent(): TvPerson {
        return TvPersonDetailFragmentArgs.fromBundle(
            requireArguments()
        ).tv
    }
}