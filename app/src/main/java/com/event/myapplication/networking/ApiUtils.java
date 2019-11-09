package com.event.myapplication.networking;

public class ApiUtils {


    private static final String BASE_URL = "https://gergstore.com/";  //Todo


    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);


    }
}