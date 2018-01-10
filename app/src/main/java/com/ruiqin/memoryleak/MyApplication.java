package com.ruiqin.memoryleak;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/9
 * 版权所有：深圳市亿车科技有限公司
 */

public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }

    public static Context getAppContext() {
        return mContext;
    }


}
