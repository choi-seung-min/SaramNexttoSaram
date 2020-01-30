package com.example.saramnexttosaram.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.base.BaseViewModel
import com.example.saramnexttosaram.util.SingleLiveEvent

class LoginViewModel(private val loginRepository: LoginRepository) : BaseViewModel() {

    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    private val _loginSuccessEvent = SingleLiveEvent<Any>()
    private val _loginFailEvent = SingleLiveEvent<Any>()
    private val _startJoinEvent = SingleLiveEvent<Any>()

    val loginSuccessEvent : LiveData<Any> get() = _loginSuccessEvent
    val loginFailEvent : LiveData<Any> get() = _loginFailEvent
    val startJoinEvent : LiveData<Any> get() = _startJoinEvent

    fun login(){
        when(loginRepository.login(id.value, password.value)){
            200 -> {
                //TODO save user data through this
                loginRepository.get()
                _loginSuccessEvent.call()
            }
            404 -> _loginFailEvent.call()
        }
        //TODO divide repository and useCase and use addDisposable
    }

    fun startJoinActivity(){
        _startJoinEvent.call()
    }
}