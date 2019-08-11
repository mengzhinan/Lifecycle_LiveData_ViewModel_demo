package com.duke.demo.livedata;

import android.arch.lifecycle.MutableLiveData;

/**
 * @Author: duke
 * @DateTime: 2019-08-04 15:40
 * @Description:
 */
// m  member 成员
public class DataUtils {
    private MutableLiveData<String> mHeadLiveData;

    public MutableLiveData<String> getHeadLiveData(){
        if (mHeadLiveData == null){
            mHeadLiveData = new MutableLiveData<>();
        }
        return mHeadLiveData;
    }

    public void requestHeadData(){
//        rxjava
//        刷新数据
//        mHeadLiveData.setValue("......");
        getHeadLiveData().setValue("头部请求成功");
    }
}
