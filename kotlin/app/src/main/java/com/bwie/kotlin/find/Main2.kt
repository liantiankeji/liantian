package com.bwie.kotlin.find.FindApi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import com.bwie.kotlin.R
import com.bwie.kotlin.find.Adapter.MyAdapter2
import com.bwie.kotlin.find.Adapter.OnItemClickListener2
import com.bwie.kotlin.find.Bean.Bean2
import com.bwie.kotlin.find.Presenter.Presenter2
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
import kotlinx.android.synthetic.main.activity2.*



/**
 * Created by 王帅彪 on 2017/11/30.
 */

//class Main2:AppCompatActivity(){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity2)
//    }
//}
class Main2 : AppCompatActivity() ,Inter_View2{
    override fun success(mybean: List<Bean2.Item>) {
        adapter= MyAdapter2(this,mybean)
        recycview.adapter=adapter
        adapter!!.setOnItemClickLinean2(object : OnItemClickListener2 {
            override fun onItemClick(view: View, postion: Int) {
                val url = mybean.get(postion).data.playUrl
               Toast.makeText(this@Main2,"ss"+url, Toast.LENGTH_SHORT).show()


            }
        })
    }
    var adapter:MyAdapter2?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        recycview.layoutManager= LinearLayoutManager(this)
        var presenter2= Presenter2(this)
        presenter2.getm(this)
    }

    override fun onBackPressed() {
        if (JCVideoPlayer.backPress()) {
            return
        }
        super.onBackPressed()
    }

    override fun onPause() {
        super.onPause()
        JCVideoPlayer.releaseAllVideos()
    }
}