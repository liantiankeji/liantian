package com.bwie.kotlin.find.FindApi

import android.content.Context
import com.bwie.kotlin.find.Bean.Bean
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by 王帅彪 on 2017/11/30.
 */
class Presenter(interview:InterView):Inter_Presenter{
    var iv:InterView
    var model:Inter_Moudel
    init {
        iv = interview
        model=Moudel()
    }
    override fun getm(context: Context) {
        val flowable = model.myContext(context)
        flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe { bean:List<Bean.Datas> ->
            iv.success(bean)
        }
    }

}