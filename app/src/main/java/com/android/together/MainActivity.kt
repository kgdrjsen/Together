package com.android.together

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val button = findViewById<Button>(R.id.btn_button)
        button.setOnClickListener {

            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("data","2")
            startActivity(intent)

        }


    }


}