package com.example.saramnexttosaram.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.util.SingleLiveEvent

class MainViewModel(private val mainRepository: MainRepository): ViewModel(){

    private val _getInfoFailEvent = SingleLiveEvent<Any>()

    val getInfoFailEvent : LiveData<Any> get() = _getInfoFailEvent
    val status = false

    fun onStarted(){
        //TODO get main info here
        mainRepository.get()
        if (status){
            _getInfoFailEvent.call()
        }
    }
}