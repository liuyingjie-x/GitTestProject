package com.mvp.contract

public interface UserContract {
    public fun login(userName: String, password: String, listener: LoginListener)
}