package com.br.leandro.desafio_mobile.presenter.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil


class TvSearchListAdapter(
    appExecutors: AppExecutors,
    private val dataBindingComponent: DataBindingComponent,
    private val tvOnClickCallback: ((Tv) -> Unit)?
) : DataBoundListAdapter<Tv, ItemTvSearchBinding>(
    appExecutors = appExecutors,
    diffCallback = object : DiffUtil.ItemCallback<Tv>() {
        override fun areItemsTheSame(oldItem: Tv, newItem: Tv): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Tv, newItem: Tv): Boolean {
            return oldItem == (newItem)
        }
    }
) {

    override fun createBinding(parent: ViewGroup): ItemTvSearchBinding {
        val binding = DataBindingUtil.inflate<ItemTvSearchBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_tv_search,
            parent,
            false,
            dataBindingComponent
        )
        binding.root.setOnClickListener {
            binding.tv?.let {
                tvOnClickCallback?.invoke(it)
            }
        }
        return binding
    }

    override fun bind(binding: ItemTvSearchBinding, item: Tv) {
        binding.tv = item
    }
}