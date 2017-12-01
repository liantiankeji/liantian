package com.bwie.kotlin.mvp.contract

import bean.HotData

/**
 * Created by Administrator on 2017/11/30.
 */
interface HotView {
    fun setData(itemList: List<HotData.ItemListBean>);
}