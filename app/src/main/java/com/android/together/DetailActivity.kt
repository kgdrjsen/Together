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
                profileImage.setImageResource(R.drawable.futsalprofile)
                profileImage.setOnClickListener{showDialogImage(R.drawable.futsalprofile    )}
                img1.setImageResource(R.drawable.futsal4)
                img1.setOnClickListener { showDialogImage(R.drawable.futsal4) }
                img2.setImageResource(R.drawable.futsal5)
                img2.setOnClickListener { showDialogImage(R.drawable.futsal5) }
                img3.setImageResource(R.drawable.futsal6)
                img3.setOnClickListener { showDialogImage(R.drawable.futsal6) }
                img4.setImageResource(R.drawable.futsal7)
                img4.setOnClickListener { showDialogImage(R.drawable.futsal7) }
                title.setText("${getString(R.string.main_post1_title)}")
                textId.setText("아이디 : FootballLove12")
                userNickName.setText("닉네임 : 풋볼조아 ")
                postdate.setText("2023년 12월 29일")
                detail.setText("${getString(R.string.main_post1_contents)} ")
                detailTime.setText("${getString(R.string.main_post1_date)}")
                detailPlace.setText("${getString(R.string.main_post1_location)}")
            }

            2 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.drawable.post_image1)
                img1.setOnClickListener { showDialogImage(R.drawable.post_image1) }
                img2.setImageResource(R.drawable.post_image1_sub1)
                img2.setOnClickListener { showDialogImage(R.drawable.post_image1_sub1) }
                img3.setImageResource(R.drawable.post_image1_sub2)
                img3.setOnClickListener { showDialogImage(R.drawable.post_image1_sub2) }
                img4.setImageResource(R.drawable.post_image_sub3)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image_sub3) }
                title.setText("${getString(R.string.mypage_post1_title)}")
                textId.setText("아이디 : ${User.id}")
                userNickName.setText("닉네임 : ${User.nickName} ")
                postdate.setText("2023년 12월 29일")
                detail.setText("${getString(R.string.mypage_post1_contents)} ")
                detailTime.setText("${getString(R.string.mypage_post1_location)}")
                detailPlace.setText("${getString(R.string.mypage_post1_date)}")

            }



            3 -> {
                profileImage.setImageResource(R.drawable.gukboprofile)
                profileImage.setOnClickListener{showDialogImage(R.drawable.gukboprofile)}
                img1.setImageResource(R.drawable.jukseoru1)
                img1.setOnClickListener { showDialogImage(R.drawable.jukseoru1) }
                img2.setImageResource(R.drawable.jukseoru2)
                img2.setOnClickListener { showDialogImage(R.drawable.jukseoru2) }
                img3.setImageResource(R.drawable.jukseoru3)
                img3.setOnClickListener { showDialogImage(R.drawable.jukseoru3) }
                img4.setImageResource(R.drawable.jukseoru4)
                img4.setOnClickListener { showDialogImage(R.drawable.jukseoru4) }
                title.setText("${getString(R.string.main_post2_title)}")
                textId.setText("아이디 : GuckboGood")
                userNickName.setText("닉네임 : 국보사랑 ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.main_post2_contents)} ")
                detailTime.setText("${getString(R.string.main_post2_date)}")
                detailPlace.setText("${getString(R.string.main_post2_location)}")
            }

          4 -> {
            profileImage.setImageResource(R.color.mainColor)
            profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
            img1.setImageResource(R.drawable.post_image2)
            img1.setOnClickListener { showDialogImage(R.drawable.post_image2) }
            img2.setImageResource(R.drawable.post_image2_sub1)
            img2.setOnClickListener { showDialogImage(R.drawable.post_image2_sub1) }
            img3.setImageResource(R.drawable.post_image2_sub2)
            img3.setOnClickListener { showDialogImage(R.drawable.post_image2_sub2) }
            img4.setImageResource(R.drawable.post_image2_sub3)
            img4.setOnClickListener { showDialogImage(R.drawable.post_image2_sub3) }
            title.setText("${getString(R.string.mypage_post2_title)}")
            textId.setText("아이디 : ${User.id}")
            userNickName.setText("닉네임 : ${User.nickName} ")
            postdate.setText("2023년 12월 28일")
            detail.setText("${getString(R.string.mypage_post2_contents)} ")
            detailTime.setText("${getString(R.string.mypage_post2_date)}")
            detailPlace.setText("${getString(R.string.mypage_post2_location)}")

        }

            5 -> {
                profileImage.setImageResource(R.drawable.basketballprofile)
                profileImage.setOnClickListener{showDialogImage(R.drawable.basketballprofile)}
                img1.setImageResource(R.drawable.basketball1)
                img1.setOnClickListener { showDialogImage(R.drawable.basketball1) }
                img2.setImageResource(R.drawable.basketball2)
                img2.setOnClickListener { showDialogImage(R.drawable.basketball2) }
                img3.setImageResource(R.drawable.basketball3)
                img3.setOnClickListener { showDialogImage(R.drawable.basketball3) }
                img4.setImageResource(R.drawable.basketball4)
                img4.setOnClickListener { showDialogImage(R.drawable.basketball4) }
                title.setText("${getString(R.string.main_post3_title)}")
                textId.setText("아이디 : Coby_Bryant")
                userNickName.setText("닉네임 : 코피나와브런트 ")
                postdate.setText("2023년 12월 28일")
                detail.setText("${getString(R.string.main_post3_contents)} ")
                detailTime.setText("${getString(R.string.main_post3_date)}")
                detailPlace.setText("${getString(R.string.main_post3_location)}")
            }

            6 -> {
                profileImage.setImageResource(R.color.mainColor)
                profileImage.setOnClickListener{showDialogImage(R.color.mainColor)}
                img1.setImageResource(R.drawable.post_image3)
                img1.setOnClickListener { showDialogImage(R.drawable.post_image3) }
                img2.setImageResource(R.drawable.post_image3_sub1)
                img2.setOnClickListener { showDialogImage(R.drawable.post_image3_sub1) }
                img3.setImageResource(R.drawable.post_image3_sub2)
                img3.setOnClickListener { showDialogImage(R.drawable.post_image3_sub2) }
                img4.setImageResource(R.drawable.post_image3_sub3)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image3_sub3) }
                title.setText("${getString(R.string.mypage_post3_title)}")
                title.textSize = 16f
                textId.setText("아이디 : ${User.id}")
                userNickName.setText("닉네임 : ${User.nickName} ")
                postdate.setText("2023년12월 27일")
                detail.setText("${getString(R.string.mypage_post3_contents)} ")
                detailTime.setText("${getString(R.string.mypage_post3_date)}")
                detailPlace.setText("${getString(R.string.mypage_post3_location)}")

            }

            7 -> {
                profileImage.setImageResource(R.drawable.coalprofile)
                profileImage.setOnClickListener{showDialogImage(R.drawable.coalprofile)}
                img1.setImageResource(R.drawable.coal2)
                img1.setOnClickListener { showDialogImage(R.drawable.coal2) }
                img2.setImageResource(R.drawable.coal3)
                img2.setOnClickListener { showDialogImage(R.drawable.coal3) }
                img3.setImageResource(R.drawable.coal4)
                img3.setOnClickListener { showDialogImage(R.drawable.coal4) }
                img4.setImageResource(R.drawable.coal1)
                img4.setOnClickListener { showDialogImage(R.drawable.coal1) }
                title.setText("${getString(R.string.main_post4_title)}")
                textId.setText("아이디 : Love123")
                userNickName.setText("닉네임 : 작은사랑")
                postdate.setText("2023년 12월 27일")
                detail.setText("${getString(R.string.main_post4_contents)} ")
                detailTime.setText("${getString(R.string.main_post4_date)}")
                detailPlace.setText("${getString(R.string.main_post4_location)}")
            }

            8 ->{
                profileImage.setImageResource(R.drawable.post_image4)
                profileImage.setOnClickListener{showDialogImage(R.drawable.post_image4)}
                img1.setImageResource(R.drawable.post_image4)
                img1.setOnClickListener { showDialogImage(R.drawable.post_image4) }
                img2.setImageResource(R.drawable.post_image1_sub2)
                img2.setOnClickListener { showDialogImage(R.drawable.post_image1_sub2) }
                img3.setImageResource(R.drawable.futsal5)
                img3.setOnClickListener { showDialogImage(R.drawable.futsal5) }
                img4.setImageResource(R.drawable.post_image1_sub1)
                img4.setOnClickListener { showDialogImage(R.drawable.post_image1_sub1) }
                title.setText("${getString(R.string.mypage_post4_title)}")
                textId.setText("아이디 : ${User.id}")
                userNickName.setText("닉네임 : ${User.nickName} ")
                postdate.setText("2023년12월 21일")
                detail.setText("${getString(R.string.mypage_post4_contents)} ")
                detailTime.setText("${getString(R.string.mypage_post4_date)}")
                detailPlace.setText("${getString(R.string.mypage_post4_location)}")
            }


        }

        val btn_back = findViewById<Button>(R.id.btn_back)
        btn_back.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.none , R.anim.horizon_exit)
        }


    }

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

}