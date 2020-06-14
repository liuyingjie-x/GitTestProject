package com.mvp.presenter

import com.mvp.contract.UserContract
import com.mvp.view.MvpViewInterface
import java.util.logging.Handler

public class LoginPresenter {
    private var userContract: UserContract? = null
    private var mvpViewInterface: MvpViewInterface? = null
    private lateinit var handler: Handler

    constructor(mvpViewInterface: MvpViewInterface) {
        this.mvpViewInterface = mvpViewInterface
    }
}