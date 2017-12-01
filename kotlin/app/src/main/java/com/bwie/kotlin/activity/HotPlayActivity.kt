package com.bwie.kotlin.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import bean.HotData
import com.bwie.kotlin.R
import kotlinx.android.synthetic.main.activity_hot_play.*


class HotPlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot_play)
        val bundleExtra = intent.getBundleExtra("bundle");
        val data = bundleExtra?.getSerializable("data") as HotData.ItemListBean
        data.data?.title

        hot_play.setUp(data.data?.playUrl,false,"")
    }
}
