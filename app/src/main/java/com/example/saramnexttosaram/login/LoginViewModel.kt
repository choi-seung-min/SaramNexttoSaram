package com.example.saramnexttosaram.login

import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.CallJoinActivity

class LoginViewModel(private val callJoinActivity: CallJoinActivity) : ViewModel() {

    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun login(view: View){
        Toast.makeText(view.context, "ID: ${id.value}\nPassword: ${password.value}", Toast.LENGTH_LONG).show()
    }

    fun joinActivity(){
        callJoinActivity.startActivity()
    }
}