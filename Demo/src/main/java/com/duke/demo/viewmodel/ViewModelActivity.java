package com.duke.demo.viewmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.duke.demo.R;

public class ViewModelActivity extends AppCompatActivity {
    private DataViewModel mDataViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model);

        mDataViewModel = ViewModelProviders.of(this).get(DataViewModel.class);
        mDataViewModel.getHeadLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        mDataViewModel.getListLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer s) {

            }
        });
        mDataViewModel.requestHeadData();
        mDataViewModel.requestListData();
    }
}
