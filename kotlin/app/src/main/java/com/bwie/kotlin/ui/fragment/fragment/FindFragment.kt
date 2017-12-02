package com.bwie.kotlin.ui.fragment.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.bwie.kotlin.R
import com.bwie.kotlin.find.Adapter.MyAdapter
import com.bwie.kotlin.find.Adapter.OnItemClickListener
import com.bwie.kotlin.find.Bean.Bean
import com.bwie.kotlin.find.FindApi.InterView
import com.bwie.kotlin.find.FindApi.Main2
import com.bwie.kotlin.find.FindApi.Presenter

class FindFragment : Fragment()  , InterView {
    override fun success(mybean: List<Bean.Datas>) {
        adapter= MyAdapter(activity,mybean)
        recycc.adapter=adapter
        adapter!!.setOnItemClickLinean(object : OnItemClickListener {
            override fun onItemClick(view: View, postion: Int) {
               val intent= Intent(activity, Main2::class.java)
                startActivity(intent)
            }
        })
    }
    lateinit var recycc:RecyclerView
    var adapter: MyAdapter?=null
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater!!.inflate(R.layout.fragment_find, container, false)
        recycc =view.findViewById<RecyclerView>(R.id.recyc)

        recycc.layoutManager= StaggeredGridLayoutManager(2, LinearLayout.VERTICAL)
        var  presenter= Presenter(this)
        presenter.getm(activity)
        return view
    }

}