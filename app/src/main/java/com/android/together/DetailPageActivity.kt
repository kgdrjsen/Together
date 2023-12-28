package com.android.together

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)


        val arr = intent?.getByteArrayExtra("img")
        if (arr != null) {
            val setimge = BitmapFactory.decodeByteArray(arr,0,arr.size)
            val bigimage = findViewById<ImageView>(R.id.iv_set)
            bigimage.setImageBitmap(setimge)
        }

        val ttdata = intent.getStringExtra("con")
        val etData = findViewById<TextView>(R.id.txt_tt)
        etData.setText(ttdata)

        val id = intent?.getIntExtra("id",0)
            if (id ==0) {
                val img = findViewById<ImageView>(R.id.iv_img1)
                img.setImageResource(R.drawable.ic_lotto)
            } else if (id == 1) {
                val img = findViewById<ImageView>(R.id.iv_img1)
                img.setImageResource(R.drawable.logo)
            } else if (id == 2) {
                val img = findViewById<ImageView>(R.id.iv_img1)
                img.setImageResource(R.drawable.logo)
            } else if (id == 3) {
                val img = findViewById<ImageView>(R.id.iv_img1)
                img.setImageResource(R.drawable.logo)
            } else if (id == 4) {
                val img = findViewById<ImageView>(R.id.iv_img1)
                img.setImageResource(R.drawable.logo)
            }

    }
}