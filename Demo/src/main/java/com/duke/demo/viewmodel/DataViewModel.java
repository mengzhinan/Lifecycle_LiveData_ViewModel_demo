package com.duke.demo.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

/**
 * @Author: duke
 * @DateTime: 2019-08-04 16:14
 * @Description:
 */
// implementation 'android.arch.lifecycle:extensions:1.1.1'
public class DataViewModel extends ViewModel {
    private MutableLiveData<String> mHeadLiveData;
    private MutableLiveData<Integer> mListLiveData;

    public MutableLiveData<String> getHeadLiveData() {
        if (mHeadLiveData == null) {
            mHeadLiveData = new MutableLiveData<>();
        }
        return mHeadLiveData;
    }

    public MutableLiveData<Integer> getListLiveData() {
        if (mListLiveData == null) {
            mListLiveData = new MutableLiveData<>();
        }
        return mListLiveData;
    }

    public void requestHeadData() {
//        rxjava
//        刷新数据
//        mHeadLiveData.setValue("......");
        getHeadLiveData().setValue("头部请求成功");
    }

    public void requestListData() {
//        rxjava
//        刷新数据
//        mHeadLiveData.setValue("......");
        getListLiveData().setValue(100);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        // 资源释放
    }
}
