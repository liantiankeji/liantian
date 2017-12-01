package com.bwie.kotlin.mvp.presenter

import android.util.Log
import bean.HotData
import com.bwie.kotlin.mvp.model.bean.HotModel
import com.bwie.kotlin.ui.fragment.fragment.RankFragment
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

/**
 * Created by Administrator on 2017/11/30.
 */
class HotPresenter(rankFragment: RankFragment, hotModel: HotModel) {


    var rankFragment : RankFragment = rankFragment
    var hotModel : HotModel = hotModel

    fun getData(rank : String){
        hotModel.getData(rank).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { data:String ->
                    Log.i("hot",data.toString())
                    var gson = Gson()
                    val json = gson.fromJson(data, HotData::class.java)
                    var itemList = json.itemList
                    rankFragment.setData(itemList!!)

                }
    }
}