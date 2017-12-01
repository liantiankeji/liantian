package com.bwie.kotlin.find.FindApi

import android.content.Context
import com.bwie.kotlin.find.Bean.Bean
import io.reactivex.Flowable

/**
 * Created by 王帅彪 on 2017/11/30.
 */
interface Inter_Moudel{
    //fun myContext(context: Context): Flowable<MyBean.MyBean>
    fun myContext(context:Context): Flowable<List<Bean.Datas>>
}