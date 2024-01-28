package com.practiceapp.mvvmsample.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.practiceapp.mvvmsample.jsonData.DataModel;
import com.practiceapp.mvvmsample.jsonData.DataResponse;
import com.practiceapp.mvvmsample.network.APIServices;
import com.practiceapp.mvvmsample.network.RetroInstance;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SampleListViewModel extends ViewModel {

    private MutableLiveData<DataResponse> sampleList;



    public SampleListViewModel() {
        sampleList=new MutableLiveData<>();
    }

    public MutableLiveData<DataResponse> getSampleListObserver() {
        return sampleList;
    }

    public void makeAPICall(){
        APIServices apiServices= RetroInstance.getRetroClient().create(APIServices.class);
        Call<DataResponse> call=apiServices.getSampleList();
        call.enqueue(new Callback<DataResponse>() {
            @Override
            public void onResponse(Call<DataResponse> call, Response<DataResponse> response) {
                sampleList.postValue(response.body());
            }

            @Override
            public void onFailure(Call<DataResponse> call, Throwable t) {
                sampleList.postValue(null);

            }
        });
    }
    public MutableLiveData<DataResponse> sampleList() {
        return sampleList;
    }
}

//    public void makeAPICall(int id, String name) {
//        APIServices apiServices= RetroInstance.getRetroClient().create(APIServices.class);
//        SampleListViewModel.makeAPICall(id, name)
//                .enqueue(new Callback<SampleModel>() {
//                    @Override
//                    public void onResponse(Call<SampleModel> call, Response<SampleModel> response) {
//                        if (response.body() != null) {
//                            sampleList.postValue((List<SampleModel>) response.body());
//                        }
//                    }
//
//                    @Override
//                    public void onFailure(Call<SampleModel> call, Throwable t) {
//                        sampleList.postValue(null);
//                    }
//
//
//                });
//    }

