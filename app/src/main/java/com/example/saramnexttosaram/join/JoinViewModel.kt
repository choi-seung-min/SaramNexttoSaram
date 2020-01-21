package com.example.saramnexttosaram.join

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.util.SingleLiveEvent

class JoinViewModel : ViewModel() {
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
            _joinSuccessEvent.call()
        } else {
            _joinFailEvent.call()
        }
    }
}