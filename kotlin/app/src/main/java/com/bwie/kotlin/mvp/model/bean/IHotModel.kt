package com.bwie.kotlin.mvp.model.bean

import io.reactivex.Flowable

/**
 * Created by Administrator on 2017/11/30.
 */
interface IHotModel {
    fun getData(rank : String)  : Flowable<String>
}