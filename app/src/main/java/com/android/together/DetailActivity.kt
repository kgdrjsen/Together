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

        val Data = intent.getIntExtra(Contants.POST_NUMBER,1)

        val profileImage = findViewById<ImageView>(R.id.iv_profileImage)
        val img1 = findViewById<ImageView>(R.id.iv_image1)
        val img2 = findViewById<ImageView>(R.id.iv_image2)
        val img3 = findViewById<ImageView>(R.id.iv_image3)
        val img4 = findViewById<ImageView>(R.id.iv_image4)

        val textId = findViewById<TextView>(R.id.tv_userId)
        val userNickName = findViewById<TextView>(R.id.tv_userNickName)

        val title = findViewById<TextView>(R.id.tv_title)
        val postdate = findViewById<TextView>(R.id.tv_date)
        val detail = findViewById<TextView>(R.id.tv_detail)
        val detailTime = findViewById<TextView>(R.id.tv_detailTime)
        val detailPlace = findViewById<TextView>(R.id.tv_detailPlace)


        when(Data){

            1 -> {

                profileImage.setImageResource(R.drawable.basketball1)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.futsal1)
                img1.setOnClickListener { showDialogImage(R.drawable.futsal1) }
                img2.setImageResource(R.drawable.futsal2)
                img2.setOnClickListener { showDialogImage(R.drawable.futsal2) }
                img3.setImageResource(R.drawable.futsal3)
                img3.setOnClickListener { showDialogImage(R.drawable.futsal3) }
                img4.setImageResource(R.drawable.futsal2)
                img4.setOnClickListener { showDialogImage(R.drawable.futsal2) }
                title.setText("${getString(R.string.mypage_post1_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년12월 27일")
                detail.setText("${getString(R.string.main_post1_contents)} ")
                detailTime.setText("${getString(R.string.main_post1_date)}")
                detailPlace.setText("${getString(R.string.main_post1_location)}")

            }

            2 -> {
                profileImage.setImageResource(R.drawable.basketball1)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.basketball2)
                img1.setOnClickListener { showDialogImage(R.drawable.basketball2) }
                img2.setImageResource(R.drawable.basketball3)
                img2.setOnClickListener { showDialogImage(R.drawable.futsal1) }
                img3.setImageResource(R.drawable.futsal1)
                img3.setOnClickListener { showDialogImage(R.drawable.futsal2) }
                img4.setImageResource(R.drawable.futsal2)
                img4.setOnClickListener { showDialogImage(R.drawable.coal3) }
                title.setText("농구할사람 구함")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년12월 27일")
                detail.setText("${getString(R.string.pw_check)}\n ${getString(R.string.id_condition)}" +
                        " \n  ${getString(R.string.pw_check)} \n ${getString(R.string.pw_check)} \n ${getString(R.string.id_condition)} ")
                detailTime.setText("12.23 4시")
                detailPlace.setText("농구장에서")
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
                userNickName.setText("123")
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
                userNickName.setText("123")
                detail.setText("123456")
            }

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
                userNickName.setText("123")
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
                userNickName.setText("123")
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
                userNickName.setText("123")
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
                userNickName.setText("123")
                detail.setText("123456")
            }


        }//when inputData

        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.none , R.anim.horizon_exit)
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