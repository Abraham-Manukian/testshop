package com.example.testshop

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    val liveDataCurrent = MutableLiveData<apimain>()
    val liveDataList = MutableLiveData<List<apimain>>()
}