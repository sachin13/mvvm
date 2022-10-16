package com.example.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val data = mutableListOf<MainData>()

    private var _mainData = MutableLiveData<MutableList<MainData>>()
    var mainData: LiveData<MutableList<MainData>> = _mainData

    fun setupData() {
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        data.add(MainData("Faisal Amir", 24))
        _mainData.postValue(data)
    }

}