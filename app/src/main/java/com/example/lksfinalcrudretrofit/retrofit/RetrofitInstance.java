package com.example.lksfinalcrudretrofit.retrofit;

import com.example.lksfinalcrudretrofit.data.App;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit RETROFIT;

    public static Retrofit getRetrofitInstance() {
        if(RETROFIT == null) {
            RETROFIT = new Retrofit.Builder().baseUrl(App.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return RETROFIT;
    }
}
