package com.phantomlabs.mvvmlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val quoteLiveData = MutableLiveData("Do what you want!!")
    fun updateQuote() {
        quoteLiveData.value = "Do good things!!"
//         quoteLiveData.value = "Do bad things!!"
//         quoteLiveData.value = "Do angry things!!"
//         quoteLiveData.value = "Do depressed things!!"
//         quoteLiveData.value = "Do cool things!!"
//         quoteLiveData.value = "Do mental things!!"
    }
}