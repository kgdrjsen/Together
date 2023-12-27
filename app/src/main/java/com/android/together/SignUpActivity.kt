package com.android.together

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.android.together.User.id
import com.android.together.User.name
import com.android.together.User.nickName
import com.android.together.User.password

class SignUpActivity : AppCompatActivity() {

    var imageUri = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val ig_add : ImageView = findViewById(R.id.ig_add)
        val tv_pass_check : TextView = findViewById(R.id.tv_pass_check)
        val signup_et1 : EditText = findViewById(R.id.signup_et1)
        val signup_et2 : EditText = findViewById(R.id.signup_et2)
        val signup_et3 : EditText = findViewById(R.id.signup_et3)
        val signup_et4 : EditText= findViewById(R.id.signup_et4)
        val signup_et5 : EditText = findViewById(R.id.signup_et5)
        val btn_signup_check1 : Button = findViewById(R.id.btn_signup_check1)
        val btn_signup_check2 : Button = findViewById(R.id.btn_signup_check2)
        val btn_signup_back : Button = findViewById(R.id.btn_signup_back)
        val btn_signup2 : Button = findViewById(R.id.btn_signup2)


        // 뒤로가기 버튼
        btn_signup_back.setOnClickListener {
            if(!isFinishing) finish()
            overridePendingTransition(R.anim.none, R.anim.horizon_exit)
        }


        // 닉네임 길이확인
        btn_signup_check1.setOnClickListener {
            if(signup_et2.text.length<3 || signup_et2.text.length>8 ){
                Toast.makeText(this,"닉네임은 3자리 이상 8자리 이하로 입력해주세요",Toast.LENGTH_SHORT).show()
                btn_signup2.isEnabled=false
            } else {
                Toast.makeText(this,"사용가능합니다.",Toast.LENGTH_SHORT).show()
                btn_signup2.isEnabled=true
            }
        }


        // 아이디 길이확인
        btn_signup_check2.setOnClickListener {
            if(signup_et3.text.length<3 || signup_et3.text.length>8 ){
                Toast.makeText(this,"id는 3자리 이상 8자리 이하로 입력해주세요",Toast.LENGTH_SHORT).show()
                btn_signup2.isEnabled=false
            } else {
                Toast.makeText(this,"사용가능합니다.",Toast.LENGTH_SHORT).show()
                btn_signup2.isEnabled=true
            }
        }

        // 비밀번호 유효성 검사
        signup_et5.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(signup_et4.text.toString().equals(signup_et5.text.toString())){
                    tv_pass_check.setText("비밀번호가 일치합니다.")
                    btn_signup2.isEnabled=true
                } else {
                    tv_pass_check.setTextColor(R.color.red)
                    tv_pass_check.setText("비밀번호가 일치하지 않습니다.")
                    btn_signup2.isEnabled=false
                }
            }

            override fun afterTextChanged(s: Editable?) {
                if(signup_et4.text.toString().equals(signup_et5.text.toString())){
                    tv_pass_check.setText("비밀번호가 일치합니다.")
                    btn_signup2.isEnabled=true
                } else {
                    tv_pass_check.setTextColor(R.color.red)
                    tv_pass_check.setText("비밀번호가 일치하지 않습니다.")
                    btn_signup2.isEnabled=false
                }
            }

        })


        // 회원가입 버튼
        btn_signup2.setOnClickListener{
            if(signup_et1.text.isEmpty() || signup_et2.text.isEmpty() || signup_et3.text.isEmpty()
                || signup_et4.text.isEmpty() || signup_et5.text.isEmpty()) {
                Toast.makeText(this, getString(R.string.edit_hint), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 액티비티 죽을때, SignInActivity에 아이디 비번 값 전달
            val intent = Intent(this, SignInActivity::class.java).apply {
                putExtra(Contants.USER_ID, signup_et3.text.toString())
                putExtra(Contants.USER_PASS, signup_et4.text.toString())
            }

            // 모든 액티비티에 접근 가능하도록
            User.addUser("${signup_et1.text}","${signup_et2.text}","${signup_et3.text}","${signup_et4.text}",
                imageUri
            )

            setResult(RESULT_OK,intent)
            finish()
            overridePendingTransition(R.anim.none, R.anim.horizon_exit)
        }


        //이미지 불러오기
        ig_add.setOnClickListener {
            openGalleryForImage()
        }
    }


    //이미지 불러오기
    private val pickImageLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            if(it.resultCode == RESULT_OK) {
                val signup_ig : ImageView = findViewById(R.id.signup_ig)
                signup_ig.setImageURI(it.data?.data)
                imageUri = it.data?.data.toString()
            }
        }


    //이미지 불러오기
    private fun openGalleryForImage() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        pickImageLauncher.launch(intent)
    }

}