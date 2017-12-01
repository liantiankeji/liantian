package com.bwie.kotlin.mvp.model.bean

import android.content.Context
import bean.MyBean
import io.reactivex.Flowable

interface MyModel {

    fun myContext(context: Context): Flowable<MyBean.MyBean>

}