package com.bwie.kotlin.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import bean.HotData
import com.bumptech.glide.Glide
import com.bwie.kotlin.R
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer
import kotlinx.android.synthetic.main.activity_hot_play.*


class HotPlayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot_play)
        val bundleExtra = intent.getBundleExtra("bundle");
        val data = bundleExtra?.getSerializable("data") as HotData.ItemListBean
        data.data?.title
        val setUp = jcplay.setUp(data.data!!.playUrl, JCVideoPlayer.SCREEN_LAYOUT_LIST, "")
        if (setUp) {
            Glide.with(this).load(data.data!!.tags!!.get(0).bgPicture).into(jcplay.cacheImageView)
        }

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
