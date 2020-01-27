package com.example.saramnexttosaram.join

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityJoinBinding

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityJoinBinding>(this,
            R.layout.activity_join
        )
        val viewModel = JoinViewModel(JoinRepository())
        viewModel.joinSuccessEvent.observe(this, Observer {
            Toast.makeText(this, "join success", Toast.LENGTH_LONG).show()
            finish()
        })
        viewModel.joinFailEvent.observe(this, Observer { Toast.makeText(this, "password check is not correct", Toast.LENGTH_LONG).show() })
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}