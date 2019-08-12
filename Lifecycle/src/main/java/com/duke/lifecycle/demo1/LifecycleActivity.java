package com.duke.lifecycle.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.duke.lifecycle.R;

public class LifecycleActivity extends AppCompatActivity {
    private TestBus mTestBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        mTestBus = new TestBus();
        mTestBus.registerBusEvent(this);

        // 注册 lifecycle 观察者
        getLifecycle().addObserver(mTestBus);
    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        if (mTestBus != null) {
//            mTestBus.unRegister(this);
//        }
//    }
}
