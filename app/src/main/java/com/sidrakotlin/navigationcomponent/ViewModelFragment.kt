package com.sidrakotlin.navigationcomponent

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelFragment:ViewModel() {

    private val msgLiveData = MutableLiveData<String>("Hello")
    val msgObj: LiveData<String>
        get() = msgLiveData;

}