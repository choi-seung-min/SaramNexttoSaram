package com.example.saramnexttosaram.join

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.util.SingleLiveEvent

class JoinViewModel(private val joinRepository: JoinRepository): ViewModel() {
    val name = MutableLiveData<String>()
    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val passwordCheck = MutableLiveData<String>()

    private val _joinSuccessEvent = SingleLiveEvent<Any>()
    private val _joinFailEvent = SingleLiveEvent<Any>()

    val joinSuccessEvent : LiveData<Any> get() = _joinSuccessEvent
    val joinFailEvent : LiveData<Any> get() = _joinFailEvent

    fun join() {
        if (password.value == passwordCheck.value) {
            when(joinRepository.join(name.value, id.value, password.value)){
                200 -> _joinSuccessEvent.call()
                404 -> _joinFailEvent.call()
                //TODO check addDisposable in dohoon's repository
            }
            //TODO finish activity after call success event
        } else {
            _joinFailEvent.call()
            //TODO divide event to jin fail and check password fail
        }
    }
}