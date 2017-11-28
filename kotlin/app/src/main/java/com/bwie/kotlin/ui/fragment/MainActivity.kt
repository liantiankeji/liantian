package com.bwie.kotlin.ui.fragment

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bwie.kotlin.R
import com.bwie.kotlin.ui.fragment.fragment.FindFragment
import com.bwie.kotlin.ui.fragment.fragment.HomeFragment
import com.bwie.kotlin.ui.fragment.fragment.HotFragment
import com.bwie.kotlin.ui.fragment.fragment.MineFragment
import com.hjm.bottomtabbar.BottomTabBar

class MainActivity : AppCompatActivity() {

    lateinit var bottom: BottomTabBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom = findViewById(R.id.bottom) as BottomTabBar

        bottom.init(getSupportFragmentManager())
                .setImgSize(50F, 50F)
                .setFontSize(8F)
                .setTabPadding(4F, 6F, 10F)
                .setChangeColor(Color.BLACK, Color.GRAY)
                .addTabItem("首页", R.drawable.home_selected, R.drawable.home_normal, HomeFragment::class.java)
                .addTabItem("发现", R.drawable.find_selected, R.drawable.find_normal, FindFragment::class.java)
                .addTabItem("热门", R.drawable.hot_selected, R.drawable.hot_normal, HotFragment::class.java)
                .addTabItem("我的", R.drawable.mine_selected, R.drawable.mine_normal, MineFragment::class.java)


    }
}
