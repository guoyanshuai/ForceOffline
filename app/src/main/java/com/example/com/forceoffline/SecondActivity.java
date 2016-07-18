package com.example.com.forceoffline;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2016/7/18.
 */
public class SecondActivity extends BaseActivity {
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        btn1 = (Button) findViewById(R.id.btn_send);
    }

    public void click(View v) {
        Intent intent = new Intent("com.example.com.forceoffline.FORCE_OFFLINE");
        sendBroadcast(intent);
    }
}
