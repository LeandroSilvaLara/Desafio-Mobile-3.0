package com.br.leandro.desafio_mobile.presenter.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil


class ReviewListAdapter(
    private val dataBindingComponent: DataBindingComponent
) : RecyclerViewBase<Review, ItemReviewBinding>() {

    override fun createBinding(parent: ViewGroup): ItemReviewBinding {
        return DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_review,
            parent,
            false,
            dataBindingComponent
        )

    }

    override fun bind(binding: ItemReviewBinding, item: Review) {
        binding.review = item
    }
}