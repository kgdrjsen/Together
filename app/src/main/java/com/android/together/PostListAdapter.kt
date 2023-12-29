package com.android.together

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PostListAdapter(private val context: Context, private val postList: MutableList<Post>): BaseAdapter() {

    override fun getCount(): Int {
        return postList.size
    }

    override fun getItem(position: Int): Any {
        return postList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val view  = LayoutInflater.from(context).inflate(R.layout.item_post, null)

        val postTitle = view.findViewById<TextView>(R.id.post_title)
        val postContent = view.findViewById<TextView>(R.id.post_description)
        val postImage = view.findViewById<ImageView>(R.id.post_image)
        val postLocation = view.findViewById<TextView>(R.id.post_location_text)
        val postDate = view.findViewById<TextView>(R.id.post_calendar_text)
        val postItem = postList[position]
        postImage.setImageResource(postItem.postImage)
        postTitle.text = postItem.postTitle
        postContent.text = postItem.postContent
        postLocation.text = postItem.postLocation
        postDate.text = postItem.postDate

        return view
    }
}