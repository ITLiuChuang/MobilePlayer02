package com.atguigu.mobileplayer02.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 刘闯 on 2017/1/24.
 */

public abstract class BaseFragment extends Fragment {
    private Context mContext;
    /**
     * 当系统创建当前BaseFragment类的时候回调
     * @param savedInstanceState
     */
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    /**
     * 当系统创建Fragment视图是回调的方法
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return initView();
    }

    /**
     * 抽象方法,让子类实现
     * @return
     */
    public abstract View initView();

    /**
     *当Activity创建成功的时候回调该方法
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    /**
     * 当子类需要:
     * 1.联网请求时重写该方法
     * 2.数据绑定时
     */
    private void initData() {
    }


}
