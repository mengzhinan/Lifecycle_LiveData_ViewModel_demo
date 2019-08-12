package com.duke.lifecycle.demo2;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;

/**
 * @Author: duke
 * @DateTime: 2019-08-04 15:18
 * @Description: 事件注册类
 */
//LifecycleOwner 26 8.0
public class TestBus2 implements LifecycleObserver {
    private Activity mActivity;

    public void registerBusEvent(Activity activity) {
        this.mActivity = activity;
        // TODO: 2019/8/4 if
    }

    private void unRegister(Activity activity) {
        // TODO: 2019/8/4 if
    }

    // 需要监控 Activity onDestroy
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        unRegister(mActivity);
    }
}
