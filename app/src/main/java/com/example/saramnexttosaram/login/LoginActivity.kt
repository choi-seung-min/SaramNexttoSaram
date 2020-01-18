package com.example.saramnexttosaram.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.saramnexttosaram.CallJoinActivity
import com.example.saramnexttosaram.CallMainActivity
import com.example.saramnexttosaram.join.JoinActivity
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityLoginBinding
import com.example.saramnexttosaram.main.MainActivity

class LoginActivity : AppCompatActivity(), CallJoinActivity, CallMainActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,
            R.layout.activity_login
        )
        val viewModel = LoginViewModel(this, this)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    override fun startJoinActivity() {
        startActivity(Intent(this, JoinActivity::class.java))
    }

    override fun startMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }
}