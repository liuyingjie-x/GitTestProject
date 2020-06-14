package com.mvp.contract

import com.mvp.model.UserBean

public interface LoginListener {
    fun loginSuccess(user: UserBean)
    fun loginFailed()
}