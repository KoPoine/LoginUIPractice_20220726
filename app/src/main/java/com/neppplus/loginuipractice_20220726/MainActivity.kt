package com.neppplus.loginuipractice_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        MainActivity의 xml파일과 kt파일을 서로 연결해주는 함수(setContentView)
        setContentView(R.layout.activity_main)
    }
}