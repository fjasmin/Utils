package com.fjasmin.activitytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.blankj.utilcode.util.LogUtils;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogUtils.d(TAG,"onCreate ---> 创建时调用");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.d(TAG,"onRestart ---> 重启时调用");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.d(TAG,"onStart ---> 即将可见不可交互时调用");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.d(TAG,"onResume ---> 可见可交互时调用");
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.d(TAG,"onPause ---> 即将暂停时调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.d(TAG,"onStop ---> 即将停止不可见时调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.d(TAG,"onDestroy ---> 即将销毁时调用");
    }
}