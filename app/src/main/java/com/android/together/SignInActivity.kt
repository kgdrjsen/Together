package com.android.together

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class SignInActivity : AppCompatActivity() {

    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signin_ig : ImageView = findViewById(R.id.signin_ig)
        val tv_id_check : TextView = findViewById(R.id.tv_id_check)
        val signin_et1 : EditText = findViewById(R.id.signin_et1)
        val signin_et2 : EditText =  findViewById(R.id.signin_et2)
        val btn_signin : Button = findViewById(R.id.btn_signin)
        val btn_signup : Button = findViewById(R.id.btn_signup)
        val btn_signin_back : Button = findViewById(R.id.btn_signin_back)


        // 뒤로가기 버튼
        btn_signin_back.setOnClickListener {
            if(!isFinishing) finish()
            overridePendingTransition(R.anim.none, R.anim.horizon_exit)
        }


        // 회원가입 입력한 아이디 비번 로그인 창 이동시 자동입력
        activityResultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ it ->
            if(it.resultCode == RESULT_OK) {
                val idreturn = it.data?.getStringExtra(Contants.USER_ID)
                val passreturn = it.data?.getStringExtra(Contants.USER_PASS)
                signin_et1.setText(idreturn)
                signin_et2.setText(passreturn)

            }
        }

        //로그인 유효성검사(3자리 이상 8자리 이하)
        signin_et1.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if(signin_et1.text.length<3 || signin_et1.text.length>8) {
                    tv_id_check.setText(getString(R.string.id_condition))
                    tv_id_check.setTextColor(Color.RED)
                    btn_signin.isEnabled=false
                } else {
                    tv_id_check.setText(getString(R.string.ok))
                    tv_id_check.setTextColor(Color.GRAY)
                    btn_signin.isEnabled=true
                }
            }

        })


        // 회원가입 버튼
        btn_signup.setOnClickListener {
            var intent = Intent(this, SignUpActivity::class.java)
            activityResultLauncher.launch(intent)
            overridePendingTransition(R.anim.horizon_right_enter, R.anim.none)
        }


        // 로그인 버튼
        btn_signin.setOnClickListener {
            if(signin_et1.text.isEmpty() || signin_et2.text.isEmpty()){
                Toast.makeText(this, getString(R.string.edit_hint),Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra(Contants.USER_ID, signin_et1.text.toString())
            }
            startActivity(intent)
            overridePendingTransition(R.anim.vertical_enter, R.anim.none)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d("SignInActivity","user name : ${User.name}")
    }
}