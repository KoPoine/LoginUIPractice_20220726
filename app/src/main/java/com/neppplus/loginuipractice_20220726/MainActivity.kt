package com.neppplus.loginuipractice_20220726

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        MainActivity의 xml파일과 kt파일을 서로 연결해주는 함수(setContentView)
        setContentView(R.layout.activity_main)

//        기초 이벤트 처리 (setOnClickListener -> 클릭 이벤트 처리)
        signUpBtn.setOnClickListener {
//            버튼이 눌리때마다 실행시켜줄 코드 작성
//            Toast.makeText(this, "회원가입 버튼 클릭", Toast.LENGTH_SHORT).show()
//            emailTxt.text = "아이디"

            emailEdt.setText("아이디")
        }

        loginBtn.setOnClickListener {
            Log.d("로그인버튼", "클릭")
//            email텍스트뷰의  text속성을 비밀번호 텍스트뷰의 text속성으로 변경
//            emailTxt.text = passwordTxt.text
            val email = emailEdt.text
            val password = passwordEdt.text

            Toast.makeText(this, email, Toast.LENGTH_SHORT).show()

//            서버에 eamil과 비밀번호 담아둔 변수를 던져서
        }

    }
}