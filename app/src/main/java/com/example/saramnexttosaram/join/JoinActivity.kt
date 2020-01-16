package com.example.saramnexttosaram.join

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityJoinBinding

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityJoinBinding>(this,
            R.layout.activity_join
        )
        val viewModel = JoinViewModel()
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}