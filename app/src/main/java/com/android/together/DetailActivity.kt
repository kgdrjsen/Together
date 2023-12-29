package com.android.together

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Data = intent.getIntExtra(Contants.USER_IMAGE,0)
        val profileImage = findViewById<ImageView>(R.id.iv_profileImage)
        val img1 = findViewById<ImageView>(R.id.iv_image1)
        val img2 = findViewById<ImageView>(R.id.iv_image2)
        val img3 = findViewById<ImageView>(R.id.iv_image3)
        val img4 = findViewById<ImageView>(R.id.iv_image4)

        val textId = findViewById<TextView>(R.id.tv_userId)
        val userInterest = findViewById<TextView>(R.id.tv_userInterest)
        val userHobby = findViewById<TextView>(R.id.tv_userHobby)

        val date = findViewById<TextView>(R.id.tv_date)
        val detail = findViewById<TextView>(R.id.tv_detail)


        when(Data){

            1 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.black)
                img1.setOnClickListener { showDialogImage(R.color.black) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.black)
                img4.setOnClickListener { showDialogImage(R.color.black) }
                textId.setText("${User.id}")
                userInterest.setText("야구 좋아해요")
                userHobby.setText("야구경기 관람 좋아해요 ")
                date.setText("2023년12월 27일")
                detail.setText("야구동아리야구좋아 입니다\n 날짜는 내일입니다 \n" +
                        "시간은 조금이따가 입니다 \n 장소는 우리집앞입니다 \n 어떤어떤한 사람들 모십니다\n 연락주세요")
            }

            2 ->{
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("가나다입니")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }

            3 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }

          4 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }
//----------------------------
            5 ->{
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }

            6 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }

            7 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }

            8 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.color.white)
                img1.setOnClickListener { showDialogImage(R.color.white) }
                img2.setImageResource(R.color.mainColor)
                img2.setOnClickListener { showDialogImage(R.color.mainColor) }
                img3.setImageResource(R.color.black)
                img3.setOnClickListener { showDialogImage(R.color.black) }
                img4.setImageResource(R.color.white)
                img4.setOnClickListener { showDialogImage(R.color.white) }
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                detail.setText("123456")
            }


        }//when inputData

        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener {
            finish()
        }


    }



//        img1.setOnClickListener {
//            val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog , null)
//            val diaBuilder = AlertDialog.Builder(this) .setView(dialogView)
//
//            val dialog = diaBuilder.create()
//            dialog.show()
//
//            val diaImg = dialog.findViewById<ImageView>(R.id.iv_dialog)
//            diaImg?.setImageResource(R.color.black)
//        }
//
//        img2.setOnClickListener {
//            val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog , null)
//            val diaBuilder = AlertDialog.Builder(this) .setView(dialogView)
//
//            val dialog = diaBuilder.create()
//            dialog.show()
//
//            val diaImg = dialog.findViewById<ImageView>(R.id.iv_dialog)
//            diaImg?.setImageResource(R.drawable.ic_launcher_foreground)
//        }
//
//        img3.setOnClickListener {
//            val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog , null)
//            val diaBuilder = AlertDialog.Builder(this) .setView(dialogView)
//
//            val dialog = diaBuilder.create()
//            dialog.show()
//
//            val diaImg = dialog.findViewById<ImageView>(R.id.iv_dialog)
//            diaImg?.setImageResource(R.drawable.ic_launcher_background)
//        }
//
//        img4.setOnClickListener {
//            val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog , null)
//            val diaBuilder = AlertDialog.Builder(this) .setView(dialogView)
//
//            val dialog = diaBuilder.create()
//            dialog.show()
//
//            val img4Img = findViewById<ImageView>(R.id.iv_image4)
//
//            val diaImg = dialog.findViewById<ImageView>(R.id.iv_dialog)
//            diaImg?.setImageResource(R.color.mainColor)
//
//        }


    fun showDialogImage (resId : Int){
        val dialogView = LayoutInflater.from(this).inflate(R.layout.custom_dialog , null)
        val diaBuilder = AlertDialog.Builder(this).setView(dialogView)
        val dialog = diaBuilder.create()
            dialog.show()

        val diaImg = dialog.findViewById<ImageView>(R.id.iv_dialog)
        diaImg?.setImageResource(resId)

        diaImg?.setOnClickListener {
            dialog.dismiss()
        }


    }



}//class