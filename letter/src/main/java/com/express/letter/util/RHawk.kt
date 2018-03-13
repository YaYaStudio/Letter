package com.express.letter.util

import com.orhanobut.hawk.Hawk

/**
 * Created by angcyo on 2018-03-06.
 */
object RHawk {
    fun saveLoginUser(user: String) {
        Hawk.put("saveLoginUser", user)
    }

    fun getLoginUser() = Hawk.get<String>("saveLoginUser", "")

    fun isLoginSucceed() = Hawk.get<Boolean>("isLoginSucceed", false)

    fun setLoginSucceed(succeed: Boolean) = Hawk.put<Boolean>("isLoginSucceed", succeed)
}