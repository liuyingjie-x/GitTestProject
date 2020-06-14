package com.mvp.view

import android.content.Context
import android.support.constraint.ConstraintLayout
import android.util.AttributeSet
import android.widget.Button
import android.widget.EditText
import com.lyj.git.R
import com.mvp.model.UserBean

/**
 * @program: GitTestProject
 *
 * @description: MVP练手View类
 *
 * @author: LYJ
 *
 * @create: 2020-06-14
 **/
class MvpView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr), MvpViewInterface {

    override fun onFinishInflate() {
        super.onFinishInflate()
        findViewById<Button>(R.id.btnLogin).setOnClickListener {

        }
    }
    override fun getName(): String {
        return findViewById<EditText>(R.id.etName).text.toString()
    }

    override fun getPassword(): String {
        return findViewById<EditText>(R.id.etPassword).text.toString()
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun clearName() {
        findViewById<EditText>(R.id.etName).setText("")
    }

    override fun clearPassword() {
        findViewById<EditText>(R.id.etPassword).setText("")
    }

    override fun toMainActivity(user: UserBean) {
    }

    override fun showFailedError() {
    }

}