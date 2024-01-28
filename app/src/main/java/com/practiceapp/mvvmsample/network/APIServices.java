package com.practiceapp.mvvmsample.network;

import com.practiceapp.mvvmsample.jsonData.DataModel;
import com.practiceapp.mvvmsample.jsonData.DataResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIServices {

    @GET("unknown")//b from retro Instance class
    Call<DataResponse> getSampleList(
//            @Query("id") int id,
//            @Query("name") String name
    );

}
