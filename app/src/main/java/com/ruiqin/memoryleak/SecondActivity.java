package com.ruiqin.memoryleak;

import android.content.Context;
import android.content.Intent;

import com.ruiqin.memoryleak.base.BaseActivity;

public class SecondActivity extends BaseActivity {

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, SecondActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }



}

