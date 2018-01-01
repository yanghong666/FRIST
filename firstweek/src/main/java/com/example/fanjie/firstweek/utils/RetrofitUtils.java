package com.example.fanjie.firstweek.utils;

import com.example.fanjie.firstweek.bean.GoodBeanns;
import com.example.fanjie.firstweek.inter.CallBack;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author:Created by Constraint.
 */

public class RetrofitUtils {
    private static volatile RetrofitUtils instance;
    public static RetrofitUtils getInstance(){
        if (instance==null){
            synchronized (RetrofitUtils.class){
                if (instance==null){
                    instance=new RetrofitUtils();
                }
            }
        }
        return instance;
    }
    public void getNews(String baseurl, final CallBack callBack, Map map){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseurl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Call<GoodBeanns> call = apiService.getGoods(map);
        call.enqueue(new Callback<GoodBeanns>() {
            @Override
            public void onResponse(Call<GoodBeanns> call, Response<GoodBeanns> response) {
                GoodBeanns body = response.body();
                callBack.onSuccess(body);
            }

            @Override
            public void onFailure(Call<GoodBeanns> call, Throwable t) {
                callBack.onFailed(t);
            }
        });
    }
}
