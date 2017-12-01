package com.bwie.kotlin.find.FindApi

import android.content.Context
import com.bawei.superhero.utils.RetrofitUtils
import com.bwie.kotlin.find.Bean.Bean
import io.reactivex.Flowable

/**
 * Created by 王帅彪 on 2017/11/30.
 */
class Moudel:Inter_Moudel{
    override fun myContext(context: Context): Flowable<List<Bean.Datas>> {
        //val flowable = RetrofitUtils.getInstance(context)!!.create(ApiService::class.java, MyApi.getdata)!!.getdata()
        //return flowable
        val flow = RetrofitUtils.getInstance(context)!!.create(ApiService::class.java,Api.getdata)!!.getdata()
        return flow

    }

}