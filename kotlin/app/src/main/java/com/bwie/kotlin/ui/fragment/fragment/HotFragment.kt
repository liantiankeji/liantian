package com.bwie.kotlin.ui.fragment.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bwie.kotlin.R
import com.bwie.kotlin.adapter.HotAdatpter
import kotlinx.android.synthetic.main.fragment_hot.*


class HotFragment : Fragment() {
    val STRATEGY = arrayOf("weekly", "monthly", "historical")
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_hot, container, false)
        return view

    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val mTabs = ArrayList<String>()

        mTabs.add("周排行")
        mTabs.add("月排行")
        mTabs.add("总排行")

        var apater = HotAdatpter(fragmentManager,STRATEGY,mTabs)
        vp_hot.adapter =apater
        tab_hot.setupWithViewPager(vp_hot)
    }






    








}
