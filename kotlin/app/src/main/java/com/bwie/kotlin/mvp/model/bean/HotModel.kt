package com.bwie.kotlin.mvp.model.bean

import android.util.Log
import api.ApiService
import api.MyApi
import api.RetrofitUtils.getInstance

import io.reactivex.Flowable

/**
 * Created by Administrator on 2017/11/30.
 */
class HotModel:IHotModel {
    override fun getData(rank: String): Flowable<String> {
        val flowable = getInstance().getApiSeriver(MyApi.api, ApiService::class.java).hot("10",rank,"26868b32e808498db32fd51fb422d00175e179df","83")
        Log.i("xxxx",rank)
        return flowable
    }
}