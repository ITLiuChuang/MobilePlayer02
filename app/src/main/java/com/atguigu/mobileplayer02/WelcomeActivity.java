package com.atguigu.mobileplayer02;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class WelcomeActivity extends AppCompatActivity {
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        /**
         * 两秒钟进入主页面
         */
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMainActivity();
            }

            
        }, 2000);

    }

    /**
     * 进入主页面
     */
    private void startMainActivity() {
        //进入主页面
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        //关闭当前页面
        finish();
    }

    /**
     * 点击立即进入
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        startMainActivity();
        return super.onTouchEvent(event);
    }
    /**
     * 移除所有消息
     */
    @Override
    protected void onDestroy() {
        handler.removeCallbacksAndMessages(null);
        super.onDestroy();
    }
}
