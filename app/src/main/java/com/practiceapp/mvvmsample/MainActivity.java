package com.practiceapp.mvvmsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.practiceapp.mvvmsample.adapter.SampleListAdapter;
import com.practiceapp.mvvmsample.jsonData.DataModel;
import com.practiceapp.mvvmsample.jsonData.DataResponse;
import com.practiceapp.mvvmsample.model.SampleModel;
import com.practiceapp.mvvmsample.viewmodel.SampleListViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DataResponse sampleModelList;
    private SampleListAdapter adapter;
    private SampleListViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=findViewById(R.id.rv_sample);
        TextView tv_noresult=findViewById(R.id.tv_noresult);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new SampleListAdapter(this, new ArrayList<DataModel>());
        recyclerView.setAdapter(adapter);


        viewModel= ViewModelProviders.of(this).get(SampleListViewModel.class);
        viewModel.getSampleListObserver().observe(this, new Observer<DataResponse>() {
            @Override
            public void onChanged(DataResponse sampleModels) {
                if (sampleModels!=null){
                    sampleModelList=sampleModels;
                    adapter.setSampleList (sampleModels.getData());
                    tv_noresult.setVisibility(View.GONE);
                }else {
                    tv_noresult.setVisibility(View.VISIBLE);
                }
            }
        });

        viewModel.makeAPICall();
    }
}