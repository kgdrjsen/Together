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

        val Data = intent.getIntExtra(Contants.POST_NUMBER,4)

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
                img4.setImageResource(R.drawable.post_image1)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                title.setText("${getString(R.string.main_post1_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.main_post1_contents)} ")
                detailTime.setText("${getString(R.string.main_post1_date)}")
                detailPlace.setText("${getString(R.string.main_post1_location)}")
            }

            2 -> {
                profileImage.setImageResource(R.drawable.basketball1)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.post_image1)
                img1.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                img2.setImageResource(R.drawable.post_image1_sub1)
                img2.setOnClickListener { showDialogImage(R.drawable.post_image1_sub1) }
                img3.setImageResource(R.drawable.post_image1_sub2)
                img3.setOnClickListener { showDialogImage(R.drawable.post_image1_sub2) }
                img4.setImageResource(R.drawable.post_image1)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                title.setText("${getString(R.string.mypage_post1_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.mypage_post1_contents)} ")
                detailTime.setText("${getString(R.string.mypage_post1_location)}")
                detailPlace.setText("${getString(R.string.mypage_post1_date)}")

            }



            3 -> {
                profileImage.setImageResource(R.drawable.basketball1)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.jukseoru1)
                img1.setOnClickListener { showDialogImage(R.drawable.jukseoru1) }
                img2.setImageResource(R.drawable.jukseoru2)
                img2.setOnClickListener { showDialogImage(R.drawable.jukseoru2) }
                img3.setImageResource(R.drawable.jukseoru3)
                img3.setOnClickListener { showDialogImage(R.drawable.jukseoru3) }
                img4.setImageResource(R.drawable.post_image1)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                title.setText("${getString(R.string.main_post2_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.main_post2_contents)} ")
                detailTime.setText("${getString(R.string.main_post2_date)}")
                detailPlace.setText("${getString(R.string.main_post2_location)}")
            }

          4 -> {
            profileImage.setImageResource(R.drawable.basketball1)
            profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
            img1.setImageResource(R.drawable.post_image2)
            img1.setOnClickListener { showDialogImage(R.drawable.post_image2) }
            img2.setImageResource(R.drawable.post_image2_sub1)
            img2.setOnClickListener { showDialogImage(R.drawable.post_image2_sub1) }
            img3.setImageResource(R.drawable.post_image2_sub2)
            img3.setOnClickListener { showDialogImage(R.drawable.post_image2_sub2) }
            img4.setImageResource(R.drawable.post_image2_sub2)
            img4.setOnClickListener { showDialogImage(R.drawable.post_image2_sub2) }
            title.setText("${getString(R.string.mypage_post2_title)}")
            textId.setText("아이디 : ${Contants.USER_ID}")
            userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
            postdate.setText("2023년 12월 28일")
            detail.setText("${getString(R.string.mypage_post2_contents)} ")
            detailTime.setText("${getString(R.string.mypage_post2_date)}")
            detailPlace.setText("${getString(R.string.mypage_post2_location)}")

        }

            5 -> {
                profileImage.setImageResource(R.drawable.basketball1)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.basketball1)
                img1.setOnClickListener { showDialogImage(R.drawable.basketball1) }
                img2.setImageResource(R.drawable.basketball2)
                img2.setOnClickListener { showDialogImage(R.drawable.basketball2) }
                img3.setImageResource(R.drawable.basketball3)
                img3.setOnClickListener { showDialogImage(R.drawable.basketball3) }
                img4.setImageResource(R.drawable.post_image1)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                title.setText("${getString(R.string.main_post3_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.main_post3_contents)} ")
                detailTime.setText("${getString(R.string.main_post3_date)}")
                detailPlace.setText("${getString(R.string.main_post3_location)}")
            }

            6 -> {
                profileImage.setImageResource(R.drawable.post_image3)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.post_image3)
                img1.setOnClickListener { showDialogImage(R.drawable.post_image3) }
                img2.setImageResource(R.drawable.post_image3)
                img2.setOnClickListener { showDialogImage(R.drawable.post_image3) }
                img3.setImageResource(R.drawable.post_image3)
                img3.setOnClickListener { showDialogImage(R.drawable.post_image3) }
                img4.setImageResource(R.drawable.post_image3)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image3) }
                title.setText("${getString(R.string.mypage_post3_title)}")
                title.textSize = 16f
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년12월 27일")
                detail.setText("${getString(R.string.mypage_post3_contents)} ")
                detailTime.setText("${getString(R.string.mypage_post3_date)}")
                detailPlace.setText("${getString(R.string.mypage_post3_location)}")

            }

            7 -> {
                profileImage.setImageResource(R.drawable.basketball1)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketball1)}
                img1.setImageResource(R.drawable.coal2)
                img1.setOnClickListener { showDialogImage(R.drawable.coal2) }
                img2.setImageResource(R.drawable.coal3)
                img2.setOnClickListener { showDialogImage(R.drawable.coal3) }
                img3.setImageResource(R.drawable.coal4)
                img3.setOnClickListener { showDialogImage(R.drawable.coal4) }
                img4.setImageResource(R.drawable.post_image1)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                title.setText("${getString(R.string.main_post4_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.main_post4_contents)} ")
                detailTime.setText("${getString(R.string.main_post4_date)}")
                detailPlace.setText("${getString(R.string.main_post4_location)}")
            }

            8 ->{
                profileImage.setImageResource(R.drawable.post_image4)
                profileImage.setOnClickListener{showDialogImage(R.drawable.post_image4)}
                img1.setImageResource(R.drawable.post_image4)
                img1.setOnClickListener { showDialogImage(R.drawable.post_image4) }
                img2.setImageResource(R.drawable.post_image4)
                img2.setOnClickListener { showDialogImage(R.drawable.post_image4) }
                img3.setImageResource(R.drawable.post_image4)
                img3.setOnClickListener { showDialogImage(R.drawable.post_image4) }
                img4.setImageResource(R.drawable.post_image4)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image4) }
                title.setText("${getString(R.string.mypage_post4_title)}")
                textId.setText("아이디 : ${Contants.USER_ID}")
                userNickName.setText("닉네임 : ${Contants.USER_NICKNAME} ")
                postdate.setText("2023년12월 27일")
                detail.setText("${getString(R.string.mypage_post4_contents)} ")
                detailTime.setText("${getString(R.string.mypage_post4_date)}")
                detailPlace.setText("${getString(R.string.mypage_post4_location)}")
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