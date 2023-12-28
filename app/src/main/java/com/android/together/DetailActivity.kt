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

        val inputData = intent.getStringExtra("data")

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


        when(inputData){

            "1" -> {
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
                textId.setText("text")
                userInterest.setText("123")
                userHobby.setText("12345 ")
                date.setText("2023년12월 27일")
                detail.setText("123456\n 9999888888")
            }

            "2" ->{
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
        val diaBuilder = AlertDialog.Builder(this) .setView(dialogView)
        val dialog = diaBuilder.create()
            dialog.show()
        val diaImg = dialog.findViewById<ImageView>(R.id.iv_dialog)
        diaImg?.setImageResource(resId)

        diaImg?.setOnClickListener {
            dialog.dismiss()
        }


    }



}//class