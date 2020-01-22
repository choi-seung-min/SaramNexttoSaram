package com.example.saramnexttosaram.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.util.SingleLiveEvent

class LoginViewModel(private val loginRepository: LoginRepository) : ViewModel() {

    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _loginSuccessEvent = SingleLiveEvent<Any>()
    private val _loginFailEvent = SingleLiveEvent<Any>()
    private val _startJoinEvent = SingleLiveEvent<Any>()

    val loginSuccessEvent : LiveData<Any> get() = _loginSuccessEvent
    val loginFailEvent : LiveData<Any> get() = _loginFailEvent
    val startJoinEvent : LiveData<Any> get() = _startJoinEvent

    fun login(){
        if (loginRepository.login(id.value, password.value) == 200){
            _loginSuccessEvent.call()
        } else{
            _loginFailEvent.call()
        }
    }

    fun startJoinActivity(){
        _startJoinEvent.call()
    }
}