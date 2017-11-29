package com.bwie.kotlin.ui.fragment.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import bean.MyBean
import com.bwie.kotlin.R
import com.bwie.kotlin.adapter.HomeAdapter
import com.bwie.kotlin.mvp.contract.NetContract
import com.bwie.kotlin.mvp.presenter.Presenter

/**
 * 类的名称：HomeFragment第一个Fragment
 * 类的作用：展示第一个Fragment
 * 类的作者：陈令鸽
 */

class HomeFragment : Fragment(), NetContract {

    lateinit var recycler: RecyclerView
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //获取布局文件
        val view = inflater!!.inflate(R.layout.fragment_home, container, false)
        //获取资源ID
        recycler = view.findViewById<RecyclerView>(R.id.recycler)

        var mypresenter = Presenter(this)

        mypresenter.getm(context)

        return view
    }

    override fun success(mybean: MyBean.MyBean) {

        Log.e("xxx", mybean.toString())
        var adapter = HomeAdapter(activity, mybean)
        //创建RecyclerView线性布局管理器
        recycler.layoutManager = LinearLayoutManager(activity)
        recycler.adapter = adapter
    }
}
