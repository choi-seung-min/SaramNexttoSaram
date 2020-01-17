package com.example.saramnexttosaram.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel = MainViewModel()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
