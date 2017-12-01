package com.bwie.kotlin.find.FindApi

import com.bwie.kotlin.find.Bean.Bean
import com.bwie.kotlin.find.Bean.Bean2
import io.reactivex.Flowable
import retrofit2.http.GET

/**
 * Created by 王帅彪 on 2017/11/30.
 */
interface ApiService{
    //http://baobab.kaiyanapp.com/api/v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83
    @GET("v2/categories?udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun getdata(): Flowable<List<Bean.Datas>>
    //http://baobab.kaiyanapp.com/api/v3/videos?strategy=%s&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83&categoryName=%E6%97%B6%E5%B0%9A&start=1
//    //http://baobab.kaiyanapp.com/api/v3/videos?start=10&num=10&categoryName=%E6%97%B6%E5%B0%9A&strategy=date
    @GET("v3/videos?start=10&num=100&categoryName=%E6%97%B6%E5%B0%9A&strategy=date")
    fun data(): Flowable<Bean2.Shows>
}