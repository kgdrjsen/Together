package com.android.together

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var activityResultLauncher: ActivityResultLauncher<Intent>

    private fun setViewMoreAndLess(contetnTextView: TextView, viewMoreTextView: TextView,viewLessTextView: TextView) {
        contetnTextView.post {
            val lineCount = contetnTextView.layout.lineCount
            if (lineCount > 0) {
                //레이아웃에서 ellipsize 된 것을 카운트 하기 (줄어든 줄 수가 0보다 큰 경우)
                if (contetnTextView.layout.getEllipsisCount(lineCount - 1) > 0) {
                    viewMoreTextView.visibility = View.VISIBLE

                    viewMoreTextView.setOnClickListener {
                        //maxLines을 최대값으로
                        contetnTextView.maxLines = Int.MAX_VALUE
                        //더보기 버튼 날리기, 접기버튼 살리기
                        viewMoreTextView.visibility = View.GONE
                        viewLessTextView.visibility = View.VISIBLE
                    }
                } else {
                    viewLessTextView.setOnClickListener {
                        //내용이 maxLines만큼, 생략되기. 초기상태로
                        contetnTextView.maxLines = contetnTextView.ellipsize.ordinal
                        //접기버튼 날리기, 더보기 버튼 살리기
                        viewLessTextView.visibility = View.GONE
                        viewMoreTextView.visibility = View.VISIBLE
                    }
                }
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val login = findViewById<Button>(R.id.btn_login)
        val mypage = findViewById<Button>(R.id.btn_my_page)
        val logout = findViewById<Button>(R.id.btn_log_out)
        val signup = findViewById<Button>(R.id.btn_sign_up)

        val content1 = findViewById<ConstraintLayout>(R.id.btn_content1)
        val content2 = findViewById<ConstraintLayout>(R.id.btn_content2)
        val content3 = findViewById<ConstraintLayout>(R.id.btn_content3)
        val content4 = findViewById<ConstraintLayout>(R.id.btn_content4)
        val content5 = findViewById<ConstraintLayout>(R.id.btn_content5)
        val content6 = findViewById<ConstraintLayout>(R.id.btn_content6)
        val content7 = findViewById<ConstraintLayout>(R.id.btn_content7)
        val content8 = findViewById<ConstraintLayout>(R.id.btn_content8)
        //그냥 넘기기로 결정
//        val conImg1 = findViewById<ImageView>(R.id.iv_img1)
//        val conImg2 = findViewById<ImageView>(R.id.iv_img2)
//        val conImg3 = findViewById<ImageView>(R.id.iv_img3)
//        val conImg4 = findViewById<ImageView>(R.id.iv_img4)
//        val conImg5 = findViewById<ImageView>(R.id.iv_img5)

        val contxt1 = findViewById<TextView>(R.id.txt_content1)
        val contxt2 = findViewById<TextView>(R.id.txt_content2)
        val contxt3 = findViewById<TextView>(R.id.txt_content3)
        val contxt4 = findViewById<TextView>(R.id.txt_content4)
        val contxt5 = findViewById<TextView>(R.id.txt_content5)

        activityResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                if (it.resultCode == RESULT_OK) {

//                  SignIn을 통해 로그인 했으므로 로그인 버튼과 회원가입 버튼을 숨기고 로그아웃 버튼과 마이페이지 버튼을 나오게
                    login.visibility = View.INVISIBLE
                    signup.visibility = View.INVISIBLE
                    logout.visibility = View.VISIBLE
                    mypage.visibility = View.VISIBLE

                    val userid = findViewById<TextView>(R.id.textView2)
                    val userdata = it.data?.getStringExtra(Contants.USER_ID)
                    userid.setText("$userdata 님")

//                  로그아웃 버튼을 누르면 초기화면으로
                    logout.setOnClickListener {
                        val intent4 = Intent(this, MainActivity::class.java)
                        startActivity(intent4)
                        overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
                    }
//                  마이페이지로 화면 전환후 돌아올 때 초기화면으로 가지 않게(로그인을 다시 하지 않게) 여기도 setResult
                    mypage.setOnClickListener {
                        val intent3 = Intent(this, MyPageActivity::class.java)
                        activityResultLauncher.launch(intent3)
                        overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
                    }
                }
            }


//      로그아웃 버튼과 마이페이지 버튼은 초기 화면에서 안 보이게
        logout.visibility = View.INVISIBLE
        mypage.visibility = View.INVISIBLE

        login.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            activityResultLauncher.launch(intent)
            overridePendingTransition(R.anim.slide_left_enter, R.anim.none)

//            signin에서 메인으로 넘길 때  setResult 써서 넘겨줘야 함
//            val login = findViewById<Button>(R.id.btn_login)
//            login.setOnClickListener {
//                val intent = Intent(this,MainActivity::class.java)
//                setResult(RESULT_OK,intent)
//                finish()
        }

        val txt_contents1 = findViewById<TextView>(R.id.txt_content1)
        val txt_contents2 = findViewById<TextView>(R.id.txt_content2)
        val txt_contents3 = findViewById<TextView>(R.id.txt_content3)
        val txt_contents4 = findViewById<TextView>(R.id.txt_content4)
        val txt_contents5 = findViewById<TextView>(R.id.txt_content5)
        val txt_contents6 = findViewById<TextView>(R.id.txt_content6)
        val txt_contents7 = findViewById<TextView>(R.id.txt_content7)
        val txt_contents8 = findViewById<TextView>(R.id.txt_content8)

        val more1 = findViewById<TextView>(R.id.txt_more1)
        val more2 = findViewById<TextView>(R.id.txt_more2)
        val more3 = findViewById<TextView>(R.id.txt_more3)
        val more4 = findViewById<TextView>(R.id.txt_more4)
        val more5 = findViewById<TextView>(R.id.txt_more5)
        val more6 = findViewById<TextView>(R.id.txt_more6)
        val more7 = findViewById<TextView>(R.id.txt_more7)
        val more8 = findViewById<TextView>(R.id.txt_more8)

        val less1 = findViewById<TextView>(R.id.txt_less1)
        val less2 = findViewById<TextView>(R.id.txt_less2)
        val less3 = findViewById<TextView>(R.id.txt_less3)
        val less4 = findViewById<TextView>(R.id.txt_less4)
        val less5 = findViewById<TextView>(R.id.txt_less5)
        val less6 = findViewById<TextView>(R.id.txt_less6)
        val less7 = findViewById<TextView>(R.id.txt_less7)
        val less8 = findViewById<TextView>(R.id.txt_less8)

        more1.setOnClickListener {
            setViewMoreAndLess(txt_contents1,more1,less1)
        }
        less1.setOnClickListener {
            setViewMoreAndLess(txt_contents1,more1,less1)
        }
        more2.setOnClickListener {
            setViewMoreAndLess(txt_contents2,more2,less2)
        }
        less2.setOnClickListener {
            setViewMoreAndLess(txt_contents2,more2,less2)
        }
        more3.setOnClickListener {
            setViewMoreAndLess(txt_contents3,more3,less3)
        }
        less3.setOnClickListener {
            setViewMoreAndLess(txt_contents3,more3,less3)
        }
        more4.setOnClickListener {
            setViewMoreAndLess(txt_contents4,more4,less4)
        }
        less4.setOnClickListener {
            setViewMoreAndLess(txt_contents4,more4,less4)
        }
        more5.setOnClickListener {
            setViewMoreAndLess(txt_contents5,more5,less5)
        }
        less5.setOnClickListener {
            setViewMoreAndLess(txt_contents5,more5,less5)
        }
        more6.setOnClickListener {
            setViewMoreAndLess(txt_contents6,more6,less6)
        }
        less6.setOnClickListener {
            setViewMoreAndLess(txt_contents6,more6,less6)
        }
        more7.setOnClickListener {
            setViewMoreAndLess(txt_contents7,more7,less7)
        }
        less7.setOnClickListener {
            setViewMoreAndLess(txt_contents7,more7,less7)
        }
        more8.setOnClickListener {
            setViewMoreAndLess(txt_contents8,more8,less8)
        }
        less8.setOnClickListener {
            setViewMoreAndLess(txt_contents8,more8,less8)
        }



//        content1.setOnClickListener {
//            val intent = Intent(applicationContext,DetailActivity::class.java)
//            intent.putExtra("id",0)
//            //이미지를 비트맵으로 전환
//            //바인딩을 쓰면
//            //val bitmap = (binding...?)
//            //바인딩을 쓰지 말아야 해서 일단 리소스로 넘기기
//            val sedBitmap = BitmapFactory.decodeResource(resources,R.drawable.ic_lotto)
//            //비트맵을 bytearray로 직렬화
//            val stream = ByteArrayOutputStream()
//            sedBitmap.compress(Bitmap.CompressFormat.JPEG,100,stream)
//            val byteArray = stream.toByteArray()
//            //intent로 보내기
//
//            intent.putExtra("img",byteArray)
//            intent.putExtra("con",contxt1.text.toString())
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
//
////            디테일에서 받을 때
//            //intent로 bytearray를 받아오고
////            val arr = intent?.getByteArrayExtra("img")
//            //null이 아닐 때 bytearry를 비트맵으로 전환
////            if (arr != null) {
////                val imge = BitmapFactory.decodeByteArray(arr,0,arr.size)
////                val bigimage = findViewById<ImageView>(R.id.iv_immm)
//            //넣을 곳에 이미지 설정
////                bigimage.setImageBitmap(imge)
////            }
//
//        }
//        content2.setOnClickListener {
//            val intent = Intent(applicationContext,DetailActivity::class.java)
//            intent.putExtra("id",1)
//            val sedBitmap = BitmapFactory.decodeResource(resources,R.drawable.logo)
//            val stream = ByteArrayOutputStream()
//            sedBitmap.compress(Bitmap.CompressFormat.JPEG,100,stream)
//            val byteArray = stream.toByteArray()
//            intent.putExtra("img",byteArray)
//            intent.putExtra("con",contxt2.text.toString())
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
//        }
//        content3.setOnClickListener {
//            val intent = Intent(applicationContext,DetailActivity::class.java)
//            intent.putExtra("id",2)
//            val sedBitmap = BitmapFactory.decodeResource(resources,R.drawable.ic_lotto)
//            val stream = ByteArrayOutputStream()
//            sedBitmap.compress(Bitmap.CompressFormat.JPEG,100,stream)
//            val byteArray = stream.toByteArray()
//            intent.putExtra("img",byteArray)
//            intent.putExtra("con",contxt3.text.toString())
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
//        }
//        content4.setOnClickListener {
//            val intent = Intent(applicationContext,DetailActivity::class.java)
//            intent.putExtra("id",3)
//            val sedBitmap = BitmapFactory.decodeResource(resources,R.drawable.ic_lotto)
//            val stream = ByteArrayOutputStream()
//            sedBitmap.compress(Bitmap.CompressFormat.JPEG,100,stream)
//            val byteArray = stream.toByteArray()
//            intent.putExtra("img",byteArray)
//            intent.putExtra("con",contxt4.text.toString())
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
//        }
//        content5.setOnClickListener {
//            val intent = Intent(applicationContext,DetailActivity::class.java)
//            intent.putExtra("id",4)
//            val sedBitmap = BitmapFactory.decodeResource(resources,R.drawable.ic_lotto)
//            val stream = ByteArrayOutputStream()
//            sedBitmap.compress(Bitmap.CompressFormat.JPEG,100,stream)
//            val byteArray = stream.toByteArray()
//            intent.putExtra("img",byteArray)
//            intent.putExtra("con",contxt5.text.toString())
//            startActivity(intent)
//            overridePendingTransition(R.anim.slide_left_enter, R.anim.none)
//        }

        content1.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,1)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content2.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,2)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content3.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,3)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content4.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,4)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content5.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,5)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content6.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,6)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content7.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,7)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }
        content8.setOnClickListener {
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra(Contants.POST_NUMBER,8)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_left_enter,R.anim.none)
        }

        signup.setOnClickListener {
            val intent2 = Intent(this, SignUpActivity::class.java)
            startActivity(intent2)
            overridePendingTransition(R.anim.slide_right_enter, R.anim.none)
        }
    }

}



