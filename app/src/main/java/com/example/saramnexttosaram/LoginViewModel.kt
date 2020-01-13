package com.example.saramnexttosaram

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val ID = ObservableField<String>()
    val password = ObservableField<String>()

    fun login(){
        //TODO call api for login with id, password
    }
}