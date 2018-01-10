package com.ruiqin.memoryleak.singleton;

import android.content.Context;

import com.ruiqin.memoryleak.MyApplication;
import com.ruiqin.memoryleak.utils.ToastUtils;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/10
 * 版权所有：深圳市亿车科技有限公司
 */

public class TestSingleton {

    private static Context mContext;

    private TestSingleton() {

    }

    public static TestSingleton getInstance(Context context) {
        mContext = context;
        return SingleHolder.INSTANCE;
    }

    public static class SingleHolder {
        private final static TestSingleton INSTANCE = new TestSingleton();
    }

    public final void test1() {
        ToastUtils.showShort(MyApplication.getAppContext(), "test1");
    }

}

