package com.android.together

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MyPageActivity : AppCompatActivity() {
    private val userImage: ImageView by lazy {
        findViewById(R.id.mypage_user_image)
    }
    private val userName: TextView by lazy {
        findViewById(R.id.mypage_user_name)
    }
    private val userNickName: TextView by lazy {
        findViewById(R.id.mypage_user_nickName)
    }
    private val userDescription: TextView by lazy {
        findViewById(R.id.mypage_user_description)
    }
    private val userEdit: ImageView by lazy {
        findViewById(R.id.mypage_user_edit)
    }
    private val postList: ListView by lazy {
        findViewById(R.id.postList)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        initEdit()
        initPostList()
    }

    private fun initView() {
        userName.text = User.name
        userNickName.text = User.nickName
    }

    private fun initEdit() {
        userEdit.setOnClickListener {
            val dialog = MyPageDialog { introduceText ->
                userDescription.text = introduceText
            }
            dialog.isCancelable = false
            dialog.show(this.supportFragmentManager, "MyPageDialog")
        }
    }

    private fun initPostList() {
        val postAdapter = PostListAdapter(this@MyPageActivity, PostList.postList)
        postList.adapter = postAdapter
        postList.setOnItemClickListener { _, _, i, _ ->
            Log.d("PostList","${PostList.postList[i]}")
        }
    }
}