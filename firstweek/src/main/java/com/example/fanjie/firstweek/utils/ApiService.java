package com.example.fanjie.firstweek.utils;

import com.example.fanjie.firstweek.bean.GoodBeanns;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * author:Created by Constraint.
 */

public interface ApiService {
    //http://result.eolinker.com/umIPmfS6c83237d9c70c7c9510c9b0f97171a308d13b611?uri=homepage
    @GET("umIPmfS6c83237d9c70c7c9510c9b0f97171a308d13b611")
    Call<GoodBeanns> getGoods(@QueryMap Map<String,String> map);
}
