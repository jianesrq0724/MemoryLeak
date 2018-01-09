package com.ruiqin.memoryleak;

import android.content.Intent;
import android.view.View;

import com.ruiqin.memoryleak.base.BaseActivity;
import com.ruiqin.memoryleak.utils.ToastUtils;

public class MainActivity extends BaseActivity {

    @Override
    protected void initView() {
        findViewById(R.id.second_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
                ToastUtils.showShort(MainActivity.this, "go to secondActivity");
            }
        });
    }

    @Override
    protected void initData() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
}
