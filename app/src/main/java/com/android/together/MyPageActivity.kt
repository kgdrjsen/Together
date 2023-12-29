package com.android.together

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible

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
//    private val postList: ListView by lazy {
//        findViewById(R.id.postList)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        initView()
        initEdit()
//        initPostList()
    }

    private fun initView() {
        userImage.setImageURI(Uri.parse(User.profile))
        userName.text = User.name
        userNickName.text = User.nickName

        val textIds = listOf(
            R.id.post_description1, R.id.post_description2, R.id.post_description3, R.id.post_description4
        )
        val moreIds = listOf(
            R.id.txt_more1, R.id.txt_more2, R.id.txt_more3, R.id.txt_more4
        )
        val lessIds = listOf(
            R.id.txt_less1, R.id.txt_less2, R.id.txt_less3, R.id.txt_less4
        )

        textIds.forEachIndexed { index, textId ->
            val textView = findViewById<TextView>(textId)
            val moreText = findViewById<TextView>(moreIds[index])
            val lessText = findViewById<TextView>(lessIds[index])

            moreText.setOnClickListener { setViewMoreAndLess(textView, moreText, lessText) }
            lessText.setOnClickListener { setViewMoreAndLess(textView, moreText, lessText) }
        }

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

    private fun setViewMoreAndLess(contentTextView: TextView, viewMoreTextView: TextView,viewLessTextView: TextView) {
        contentTextView.post {
            val lineCount = contentTextView.layout.lineCount
            if (lineCount > 0) {
                if (contentTextView.layout.getEllipsisCount(lineCount - 1) > 0) {
                    viewMoreTextView.visibility = View.VISIBLE

                    viewMoreTextView.setOnClickListener {
                        contentTextView.maxLines = Int.MAX_VALUE
                        viewMoreTextView.visibility = View.GONE
                        viewLessTextView.visibility = View.VISIBLE
                    }
                } else {
                    viewLessTextView.setOnClickListener {
                        contentTextView.maxLines = contentTextView.ellipsize.ordinal
                        viewLessTextView.visibility = View.GONE
                        viewMoreTextView.visibility = View.VISIBLE
                    }
                }
            }
        }
    }

//    private fun initPostList() {
//        val postAdapter = PostListAdapter(this@MyPageActivity, PostList.postList)
//        postList.adapter = postAdapter
//        postList.setOnItemClickListener { _, _, index, _ ->
//            val intent = Intent(this@MyPageActivity, DetailActivity::class.java)
//            intent.putExtra(Contants.POST_NUMBER, index)
//            startActivity(intent)
//        }
//    }
}
