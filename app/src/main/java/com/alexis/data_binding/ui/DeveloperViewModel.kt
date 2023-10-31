package com.alexis.data_binding.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alexis.data_binding.domain.Developer

class DeveloperViewModel : ViewModel() {

    private var _developer = MutableLiveData(Developer("Alexis"))
    val developer: LiveData<Developer> = _developer

    fun onExperience() {
        _developer.value = _developer.value!!.apply {
            yearsExperience++
        }
    }

}