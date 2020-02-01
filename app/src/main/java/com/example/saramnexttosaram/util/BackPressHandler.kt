package com.example.saramnexttosaram.util

import android.app.Activity
import android.widget.Toast

class BackPressHandler(private val activity: Activity) {
    private var backPressedTime: Long = 0

    fun onBackPressed(){
        if(System.currentTimeMillis() > backPressedTime + 2000){
            backPressedTime = System.currentTimeMillis()
            Toast.makeText(activity, "뒤로가기 버튼을 한 번 더 누르면 종료합니다", Toast.LENGTH_LONG).show()
            return
        }
        if (System.currentTimeMillis() <= backPressedTime + 2000){
            activity.finish()
        }
    }
}
