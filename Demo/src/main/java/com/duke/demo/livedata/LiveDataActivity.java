package com.duke.demo.livedata;

import android.arch.lifecycle.Observer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @Author: duke
 * @DateTime: 2019-08-04 15:39
 * @Description:
 */
public class LiveDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataUtils mDataUtils = new DataUtils();
        // 注册观察者，观测数据变化，刷新 UI
        mDataUtils.getHeadLiveData().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                // refresh ui
            }
        });
        mDataUtils.requestHeadData();


    }


}
