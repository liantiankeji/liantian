package com.bwie.kotlin.find.Presenter

import android.content.Context
import com.bwie.kotlin.find.Bean.Bean2
import com.bwie.kotlin.find.FindApi.Inten_Moudel2
import com.bwie.kotlin.find.FindApi.Inter_Presenter2
import com.bwie.kotlin.find.FindApi.Inter_View2
import com.bwie.kotlin.find.FindApi.Moudel2
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by 王帅彪 on 2017/12/1.
 */
class Presenter2(interview: Inter_View2): Inter_Presenter2 {
    var list=ArrayList<Bean2.Item>()
    var iv:Inter_View2
    var model: Inten_Moudel2
    init {
        iv = interview
        model= Moudel2()
    }
    override fun getm(context: Context) {
        val flowable = model.myContext(context)
        flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe { bean:Bean2.Shows ->

            for (i in bean.itemList.indices){
                list.add(bean.itemList[i])
            }
            iv.success(list)
        }
    }

}



