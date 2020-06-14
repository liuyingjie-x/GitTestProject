package com.mvp.view

import com.mvp.model.UserBean

public interface MvpViewInterface {
    fun getName():String
    fun getPassword():String
    fun showLoading()
    fun hideLoading()
    fun clearName()
    fun clearPassword()
    fun toMainActivity(user: UserBean)
    fun showFailedError()
}