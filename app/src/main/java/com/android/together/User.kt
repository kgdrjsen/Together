package com.android.together

import android.net.Uri

object User {
    var name: String = ""
    var nickName: String = ""
    var id: String = ""
    var password: String = ""

    fun addUser(name: String, nickName: String, id: String, password: String) {
        this.name = name
        this.nickName = nickName
        this.id  = id
        this.password = password
    }
}