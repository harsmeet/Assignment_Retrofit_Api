package com.event.myapplication.networking;


import com.event.myapplication.pojoi.Example;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers({"Content-Type: application/json;charset=UTF-8"})
    @GET("category_list.php/?id_category=43")
    Call<Example> getwikiData();

}
