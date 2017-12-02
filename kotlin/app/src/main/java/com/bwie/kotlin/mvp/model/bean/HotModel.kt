package com.bwie.kotlin.mvp.model.bean

import android.util.Log
import api.RetrofitUtils.getInstance
import com.bwie.kotlin.Hot.Api
import com.bwie.kotlin.Hot.HotApiService
import io.reactivex.Flowable

/**
 * Created by Administrator on 2017/11/30.
 */
class HotModel:IHotModel {
    override fun getData(rank: String): Flowable<String> {
        val flowable = getInstance().getApiSeriver(Api.api, HotApiService::class.java).hot("10",rank,"26868b32e808498db32fd51fb422d00175e179df","83")
        Log.i("xxxx",rank)
        return flowable
    }
}