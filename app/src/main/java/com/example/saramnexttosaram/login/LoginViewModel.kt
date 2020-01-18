package com.example.saramnexttosaram.login

import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.saramnexttosaram.CallJoinActivity
import com.example.saramnexttosaram.CallMainActivity

class LoginViewModel(private val callJoinActivity: CallJoinActivity,
                     private val callMainActivity: CallMainActivity) : ViewModel() {

    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun login(view: View){
        if(id.value == "sample" || password.value == "sample"){
            startMainActivity()
        } else{
            Toast.makeText(view.context, "Wrong id or password", Toast.LENGTH_LONG).show()
        }
    }

    fun startJoinActivity(){
        callJoinActivity.startJoinActivity()
    }

    fun startMainActivity(){
        callMainActivity.startMainActivity()
    }
}