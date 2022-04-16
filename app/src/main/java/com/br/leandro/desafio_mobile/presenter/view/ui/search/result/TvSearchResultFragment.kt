package com.br.leandro.desafio_mobile.presenter.view.ui.search.result

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import javax.inject.Inject


class TvSearchResultFragment : Fragment(R.layout.fragment_tv_search_result), Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var appExecutors: AppExecutors

    private val viewModel by viewModels<TvSearchViewModel> { viewModelFactory }
    var dataBindingComponent: DataBindingComponent = FragmentDataBindingComponent(this)
    private var binding by autoCleared<FragmentTvSearchResultBinding>()
    private var tvsadapter by autoCleared<TvSearchListAdapter>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentTvSearchResultBinding.bind(view)

        initializeUI()

        subscribers()

        viewModel.setSearchTvQueryAndPage(getQuerySafeArgs(), 1)

        with(binding) {
            lifecycleOwner = this@TvSearchResultFragment.viewLifecycleOwner
            searchResult = viewModel.searchTvListLiveData
            query = viewModel.queryTvLiveData
            callback = object : RetryCallback {
                override fun retry() {
                    viewModel.refresh()
                }
            }
        }
    }

    private fun subscribers() {
        viewModel.searchTvListLiveData.observe(viewLifecycleOwner) {
            if (!it.data.isNullOrEmpty()) {
                tvsadapter.submitList(it.data)
            }
        }
    }


    private fun getQuerySafeArgs(): String {
        val params =
            TvSearchResultFragmentArgs.fromBundle(
                requireArguments()
            )
        return params.query
    }

    private fun initializeUI() {
        tvsadapter = TvSearchListAdapter(
            appExecutors,
            dataBindingComponent
        ) {
            findNavController().navigate(
                TvSearchResultFragmentDirections.actionTvSearchFragmentResultToTvDetail(it)
            )
        }

        binding.recyclerViewSearchResultTvs.apply {
            adapter = tvsadapter
            layoutManager = LinearLayoutManager(context)

            addOnScrollListener(object : InfinitePager(tvsadapter) {
                override fun loadMoreCondition(): Boolean {
                    viewModel.searchTvListLiveData.value?.let { resource ->
                        return resource.hasNextPage && resource.status != Status.LOADING
                    }
                    return false
                }

                override fun loadMore() {
                    viewModel.loadMore()
                }
            })
        }


        binding.toolbarSearchResult.searchView.setOnSearchClickListener {
            findNavController().navigate(TvSearchResultFragmentDirections.actionTvSearchFragmentResultToTvSearchFragment())
        }

        binding.toolbarSearchResult.arrowBack.setOnClickListener {
            findNavController().navigate(TvSearchResultFragmentDirections.actionTvSearchFragmentResultToTvSearchFragment())
        }
    }
}