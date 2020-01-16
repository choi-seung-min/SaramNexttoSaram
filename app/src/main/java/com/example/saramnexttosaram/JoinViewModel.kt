package com.example.saramnexttosaram

import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JoinViewModel : ViewModel(){
    val name = MutableLiveData<String>()
    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    fun join(view: View){
        Toast.makeText(view.context, "Name: ${name.value}\nID: ${id.value}\n Password: ${password.value}", Toast.LENGTH_LONG).show()
    }
}