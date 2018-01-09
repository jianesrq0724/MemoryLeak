package com.ruiqin.memoryleak;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/9
 * 版权所有：深圳市亿车科技有限公司
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }

}
