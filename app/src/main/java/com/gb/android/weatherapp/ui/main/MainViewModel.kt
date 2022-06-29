package com.gb.android.weatherapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel(private val liveDataObserve: MutableLiveData<Any> = MutableLiveData()) : ViewModel() {
    // TODO: Implement the ViewModel
    fun getData(): LiveData<Any> {
        return  liveDataObserve
    }
}