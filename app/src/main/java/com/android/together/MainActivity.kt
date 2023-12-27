package com.android.together

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val login = findViewById<Button>(R.id.btn_login)
        val mypage = findViewById<Button>(R.id.btn_my_page)
        val logout = findViewById<Button>(R.id.btn_log_out)
        val signup = findViewById<Button>(R.id.btn_sign_up)

        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode == RESULT_OK) {

//                  SignIn을 통해 로그인 했으므로 로그인 버튼과 회원가입 버튼을 숨기고 로그아웃 버튼과 마이페이지 버튼을 나오게
                    login.visibility = View.INVISIBLE
                    signup.visibility = View.INVISIBLE
                    logout.visibility = View.VISIBLE
                    mypage.visibility = View.VISIBLE

//                  로그아웃 버튼을 누르면 초기화면으로
                    logout.setOnClickListener {
                        val intent4 = Intent(this,MainActivity::class.java)
                        startActivity(intent4)
                    }
//                  마이페이지로 화면 전환후 돌아올 때 초기화면으로 가지 않게(로그인을 다시 하지 않게) 여기도 setResult
                    mypage.setOnClickListener {
                        val intent3 = Intent(this,MyPageActivity::class.java)
                        activityResultLauncher.launch(intent3)
                    }
                }
            }

//      로그아웃 버튼과 마이페이지 버튼은 초기 화면에서 안 보이게
        logout.visibility = View.INVISIBLE
        mypage.visibility = View.INVISIBLE

        login.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            activityResultLauncher.launch(intent)

//            메인으로 넘길 때 setResult 써서 넘겨줘야 작동합니다.
//            val login = findViewById<Button>(R.id.btn_login)
//            login.setOnClickListener {
//                val intent = Intent(this,MainActivity::class.java)
//                setResult(RESULT_OK,intent)
//                finish()
        }
        signup.setOnClickListener {
            val intent2 = Intent(this,SignUpActivity::class.java)
            startActivity(intent2)
        }

    }
}
