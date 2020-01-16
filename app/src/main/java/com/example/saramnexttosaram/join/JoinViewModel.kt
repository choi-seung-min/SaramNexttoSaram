package com.example.saramnexttosaram.join

import android.view.View
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class JoinViewModel : ViewModel() {
    val name = MutableLiveData<String>()
    val id = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val passwordCheck = MutableLiveData<String>()

    fun join(view: View) {
        if (password.value == passwordCheck.value) {
            Toast.makeText(
                view.context,
                "Name: ${name.value}\nID: ${id.value}\n Password: ${password.value}\nPassword Check: ${passwordCheck.value}",
                Toast.LENGTH_LONG
            ).show()
        } else {
            Toast.makeText(view.context, "password check is not correct", Toast.LENGTH_LONG).show()
        }
    }
}