package com.bwie.kotlin.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.bwie.kotlin.ui.fragment.fragment.RankFragment

/**
 * Created by Administrator on 2017/11/30.
 */
class HotAdatpter(fm: FragmentManager, listFrags: Array<String>, mTabs: ArrayList<String>): FragmentPagerAdapter(fm){
    var fm: FragmentManager = fm
    var listFrags: Array<String> = listFrags
    val mTabs: ArrayList<String> = mTabs



    override fun getPageTitle(position: Int): CharSequence {
        return mTabs?.get(position)
    }
    override fun getCount(): Int {
        return listFrags.size
    }

    override fun getItem(position: Int): Fragment {
        return RankFragment.getINstance(listFrags.get(position))
    }
}