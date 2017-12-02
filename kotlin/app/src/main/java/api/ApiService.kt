package api

import bean.MyBean
import io.reactivex.Flowable
import retrofit2.http.GET

interface ApiService {


    @GET("feed?num=2&udid=26868b32e808498db32fd51fb422d00175e179df&vc=83")

    fun getdata(): Flowable<MyBean.MyBean>

}