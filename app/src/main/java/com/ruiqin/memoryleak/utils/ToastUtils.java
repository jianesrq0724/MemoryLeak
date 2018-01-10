package com.ruiqin.memoryleak.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * 功能：
 * 创建者：ruiqin.shen
 * 创建日期：2018/1/9
 * 版权所有：深圳市亿车科技有限公司
 */

public class ToastUtils {

    private static Toast mToast;

    /**
     * 使用Application的Context防止内存泄漏
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, String message) {
        if (mToast == null) {
            mToast = Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(message);
        }
        mToast.show();
    }
}
