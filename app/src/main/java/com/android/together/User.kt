package com.android.together

import android.net.Uri
import java.net.URI

object User {
    var name: String = ""
    var nickName: String = ""
    var id: String = ""
    var password: String = ""
    var profile : String = ""

    fun addUser(name: String, nickName: String, id: String, password: String, profile : String) {
        this.name = name
        this.nickName = nickName
        this.id  = id
        this.password = password
        this.profile = profile
    }
}