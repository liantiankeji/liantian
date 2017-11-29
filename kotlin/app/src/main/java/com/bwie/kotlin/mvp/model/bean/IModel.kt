package com.bwie.kotlin.mvp.model.bean

import android.content.Context
import api.ApiService
import api.MyApi
import bean.MyBean
import com.bawei.superhero.utils.RetrofitUtils
import io.reactivex.Flowable

class IModel : MyModel {

    override fun myContext(context: Context): Flowable<MyBean.MyBean> {
        //数据处理
        val flowable = RetrofitUtils.getInstance(context)!!.create(ApiService::class.java, MyApi.getdata)!!.getdata()
        return flowable
    }
}