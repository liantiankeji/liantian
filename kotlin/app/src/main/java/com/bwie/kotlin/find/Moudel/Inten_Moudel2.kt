package com.bwie.kotlin.find.FindApi

import android.content.Context
import com.bwie.kotlin.find.Bean.Bean2
import io.reactivex.Flowable

/**
 * Created by 王帅彪 on 2017/12/1.
 */
interface Inten_Moudel2{
    //fun myContext(context: Context): Flowable<MyBean.MyBean>
    fun myContext(context: Context): Flowable<Bean2.Shows>
}