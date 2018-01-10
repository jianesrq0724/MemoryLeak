package com.ruiqin.memoryleak;

import android.os.Handler;
import android.os.Message;
import android.view.View;

import com.ruiqin.memoryleak.base.BaseActivity;
import com.ruiqin.memoryleak.singleton.TestSingleton;
import com.ruiqin.memoryleak.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    final MyHandler mMyHandler = new MyHandler();

    List<Test> list = new ArrayList<>();

    class Test {
    }

    @Override
    protected void initView() {
        //跳转下一个页面
        findViewById(R.id.second_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondActivity.startActivity(mContext);
                finish();
//                mMyHandler.sendEmptyMessageDelayed(1, 10 * 1000);
//                ToastUtils.showShort(MyApplication.getAppContext(), "delay toast");
            }
        });


        //单例
        findViewById(R.id.single_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestSingleton.getInstance(mContext).test1();

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


    /**
     * Handler导致内存泄漏
     */
    public static class MyHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    ToastUtils.showShort(MyApplication.getAppContext(), "delay toast");
                    break;
                default:
                    break;
            }
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        if (mMyHandler != null) {
//            mMyHandler.removeCallbacksAndMessages(null);
//        }
    }
}
