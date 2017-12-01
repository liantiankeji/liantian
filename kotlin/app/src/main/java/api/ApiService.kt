package api

import bean.MyBean
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {


    @GET("feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")

    fun getdata(): Flowable<MyBean.MyBean>


    //热门排行
    @GET("api/v3/ranklist")
    fun hot(@Query("num") num:String, @Query("strategy") strategy:String, @Query("udid") udid:String, @Query("vc") vc:String):Flowable<String>

    @GET("api/v2/feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")
    fun mine():Flowable<String>
}