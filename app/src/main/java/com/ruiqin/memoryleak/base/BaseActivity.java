package com.ruiqin.memoryleak.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/9
 * 版权所有：深圳市亿车科技有限公司
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initData();
        initView();
    }

    protected abstract void initView();

    protected abstract void initData();

    public abstract int getLayoutId();

}
