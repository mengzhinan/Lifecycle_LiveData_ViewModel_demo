package com.duke.demo.lifecycle;

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
public class TestBus implements LifecycleObserver {
    private Activity mActivity;

    public void register(Activity activity){
        this.mActivity = activity;
        // TODO: 2019/8/4 if
    }

    private void unRegister(Activity activity){
        // TODO: 2019/8/4 if
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void start(){
        // TODO: 2019/8/4
    }

    // 需要监控 Activity onDestroy
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(){
        unRegister(mActivity);
    }
}
