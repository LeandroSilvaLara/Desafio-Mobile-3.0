package com.br.leandro.desafio_mobile.binding

import androidx.fragment.app.Fragment

class FragmentDataBindingComponent(fragment: Fragment) : DataBindingComponent {
    private val adapter = FragmentBindingAdapters(fragment)
    override fun getFragmentBindingAdapters(): FragmentBindingAdapters = adapter
}