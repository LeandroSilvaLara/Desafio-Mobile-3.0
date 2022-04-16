package com.br.leandro.desafio_mobile.presenter.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil


class TvListAdapter(
    private val dataBindingComponent: DataBindingComponent,
    appExecutors: AppExecutors,
    private val tvOnClickCallback: ((Tv) -> Unit)?
) : DataBoundListAdapter<Tv, ItemTvBinding>(
    appExecutors = appExecutors,
    diffCallback = object : DiffUtil.ItemCallback<Tv>() {
        override fun areItemsTheSame(oldItem: Tv, newItem: Tv): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Tv, newItem: Tv): Boolean {
            return oldItem.id == newItem.id
        }
    }
) {
    override fun createBinding(parent: ViewGroup): ItemTvBinding {
        val binding = DataBindingUtil.inflate<ItemTvBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_tv,
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

    override fun bind(binding: ItemTvBinding, item: Tv) {
        binding.tv = item
    }

}

