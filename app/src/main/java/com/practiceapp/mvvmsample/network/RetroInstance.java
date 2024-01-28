package com.practiceapp.mvvmsample.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroInstance {

    public static String Base_url="https://reqres.in/api/";//+b
    private static Retrofit retrofit;

    public static Retrofit getRetroClient(){

        if(retrofit==null){
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
