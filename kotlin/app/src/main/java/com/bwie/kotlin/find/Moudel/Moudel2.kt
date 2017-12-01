package com.bwie.kotlin.find.FindApi
import android.content.Context
import com.bawei.superhero.utils.RetrofitUtils
import com.bwie.kotlin.find.Bean.Bean2
import io.reactivex.Flowable

/**
 * Created by 王帅彪 on 2017/12/1.
 */
class Moudel2:Inten_Moudel2{
    override fun myContext(context: Context): Flowable<Bean2.Shows> {
        //val flowable = RetrofitUtils.getInstance(context)!!.create(ApiService::class.java, MyApi.getdata)!!.getdata()
        //return flowable
        val flow2= RetrofitUtils.getInstance(context)!!.create(ApiService::class.java, Api.getdata)!!.data()
        return flow2

    }

}