package com.example.saramnexttosaram.login

import android.view.View
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.util.SingleLiveEvent

class LoginViewModel : ViewModel() {

    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _loginSuccessEvent = SingleLiveEvent<Any>()
    private val _loginFailEvent = SingleLiveEvent<Any>()
    private val _startJoinEvent = SingleLiveEvent<Any>()

    val loginSuccessEvent : LiveData<Any> get() = _loginSuccessEvent
    val loginFailEvent : LiveData<Any> get() = _loginFailEvent
    val startJoinEvent : LiveData<Any> get() = _startJoinEvent

    fun login(){
        if(id.value == "sample" && password.value == "sample"){
            _loginSuccessEvent.call()
        } else{
            _loginFailEvent.call()
        }
    }

    fun startJoinActivity(){
        _startJoinEvent.call()
    }
}