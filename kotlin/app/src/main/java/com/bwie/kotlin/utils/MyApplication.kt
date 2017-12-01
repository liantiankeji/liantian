package com.bwie.kotlin.utils

import android.app.Application
import com.facebook.drawee.backends.pipeline.Fresco

/**
 * Created by Administrator on 2017/11/30.
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Fresco.initialize(this)
    }

}