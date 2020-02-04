package com.example.saramnexttosaram.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.saramnexttosaram.R
import com.example.saramnexttosaram.databinding.ActivityMainBinding
import com.example.saramnexttosaram.util.BackPressHandler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val backPressHandler = BackPressHandler(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel = MainViewModel(MainRepository())
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.getInfoFailEvent.observe(this, Observer { Toast.makeText(this, "get list failed", Toast.LENGTH_LONG).show() })

        viewModel.onStarted()

        val list = ArrayList<String>()
        list.add("sample1")
        list.add("sample2")
        list.add("sample3")
        list.add("sample4")

        main_rv_view.adapter = MainRVAdapter(list)
        main_rv_view.layoutManager = LinearLayoutManager(this)
    }

    override fun onBackPressed() {
        backPressHandler.onBackPressed()
    }
}