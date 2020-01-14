package com.example.saramnexttosaram

import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    val ID = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun login(view: View){
        Toast.makeText(view.context, "ID: ${ID.value}\nPassword: ${password.value}", Toast.LENGTH_LONG).show()
    }
}