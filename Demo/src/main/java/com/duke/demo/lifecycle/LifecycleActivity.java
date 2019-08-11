package com.duke.demo.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.duke.demo.R;

public class LifecycleActivity extends AppCompatActivity {
    private TestBus mTestBus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);
        // 事件注册
        mTestBus.register(this);
        // 注册观察者
        getLifecycle().addObserver(mTestBus);
    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        TestBus.getInstance().unRegister(this);
//    }
}
