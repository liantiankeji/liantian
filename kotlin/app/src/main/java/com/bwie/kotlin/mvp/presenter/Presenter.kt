package com.bwie.kotlin.mvp.presenter

import android.content.Context
import bean.MyBean
import com.bwie.kotlin.mvp.contract.NetContract
import com.bwie.kotlin.mvp.model.bean.IModel
import com.bwie.kotlin.mvp.model.bean.MyModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


class Presenter(netcontract: NetContract) : PresenterInterface {

    var netwo: NetContract
    var mymodel: MyModel

    init {
        netwo = netcontract
        mymodel = IModel()
    }


    override fun getm(context: Context) {

        val flowable = mymodel.myContext(context)
        flowable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe { bean: MyBean.MyBean ->
            netwo.success(bean)
        }
    }
}