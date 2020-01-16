package com.example.saramnexttosaram.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.saramnexttosaram.CallJoinActivity
import com.example.saramnexttosaram.join.JoinActivity
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(),
    CallJoinActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,
            R.layout.activity_login
        )
        val viewModel = LoginViewModel(this)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun startActivity() {
        startActivity(Intent(this, JoinActivity::class.java))
    }
}