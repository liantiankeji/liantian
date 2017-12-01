package api;

import android.util.Log;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Administrator on 2017/11/30.
 */

public class RetrofitUtils{

    private static RetrofitUtils retrofitUtils;

    public RetrofitUtils() {

    }

    /**
     * RetrofitUtils 对象
     * @return
     */
    public static RetrofitUtils getInstance() {
        if (retrofitUtils == null) {
            synchronized (RetrofitUtils.class) {
                if (retrofitUtils == null) {
                    retrofitUtils = new RetrofitUtils();
                }
            }
        }
        return retrofitUtils;
    }

    private static Retrofit retrofit = null;

    /**
     *
     * @param baseUrl
     * @return Retrofit 对象
     */
    public  Retrofit getRetrofit(String baseUrl) {
        if (retrofit == null) {

            OkHttpClient client=new OkHttpClient.Builder()
                    .addInterceptor(new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
                        @Override
                        public void log(String message) {
                            Log.i("xxx",message);
                        }
                    }).setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }

    /**
     *
     * @param baseUrl
     * @param tClass
     * @param <T>
     * @return 网络接口对象
     */
    public  <T>T getApiSeriver(String baseUrl,Class<T> tClass){
        return  getRetrofit(baseUrl).create(tClass);
    }
}
