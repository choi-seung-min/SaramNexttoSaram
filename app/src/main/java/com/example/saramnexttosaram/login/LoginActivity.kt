package com.example.saramnexttosaram.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityLoginBinding
import com.example.saramnexttosaram.main.MainActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this,
            R.layout.activity_login
        )
        val viewModel = LoginViewModel()
        viewModel.loginSuccessEvent.observe(this, Observer { startActivity(Intent(this, MainActivity::class.java)) })
        viewModel.loginFailEvent.observe(this, Observer { Toast.makeText(this, "wrong id or password", Toast.LENGTH_LONG).show() })
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}