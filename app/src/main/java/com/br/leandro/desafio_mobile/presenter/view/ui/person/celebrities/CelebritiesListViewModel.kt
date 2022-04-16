package com.br.leandro.desafio_mobile.presenter.view.ui.person.celebrities

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import javax.inject.Inject


@OpenForTesting
class CelebritiesListViewModel @Inject
constructor(private val peopleRepository: PeopleRepository) : ViewModel() {

    private var pageNumber = 1
    private var peoplePageLiveData: MutableLiveData<Int> = MutableLiveData()

    val peopleLiveData: LiveData<Resource<List<Person>>> = Transformations
        .switchMap(peoplePageLiveData) {
            if (it == null) {
                AbsentLiveData.create()
            } else {
                peopleRepository.loadPeople(it)
            }
        }

    init {
        peoplePageLiveData.value = 1
    }

    fun loadMore() {
        pageNumber++
        peoplePageLiveData.value = pageNumber
    }

    fun refresh() {
        peoplePageLiveData.value?.let {
            peoplePageLiveData.value = it
        }
    }

}