package com.zly.walle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.meituan.android.walle.WalleChannelReader;

/**
 * Walle多渠道打包
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //如何获取渠道信息
        String channel = WalleChannelReader.getChannel(this.getApplicationContext());
    }
}