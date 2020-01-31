package com.example.saramnexttosaram.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel = MainViewModel(MainRepository())
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.getInfoFailEvent.observe(this, Observer { Toast.makeText(this, "get list failed", Toast.LENGTH_LONG).show() })

        viewModel.onStarted()
    }
}