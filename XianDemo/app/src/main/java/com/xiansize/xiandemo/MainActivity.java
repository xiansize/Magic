package com.xiansize.xiandemo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //按钮控件
    Button btn_datatbase;
    Button btn_netword;
    Button btn_drawable;
    Button btn_pay;
    Button btn_chat;

    //Intent
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        init();
        intent = new Intent();
    }

    private void init() {
        btn_datatbase = (Button) findViewById(R.id.btn_database);
        btn_datatbase.setOnClickListener(this);
        btn_netword.setOnClickListener(this);
        btn_drawable.setOnClickListener(this);
        btn_pay.setOnClickListener(this);
        btn_chat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_database:
                swithActivity(DatabaseActivity.class);
                break;
            case R.id.btn_netword:
                swithActivity(NetwordActivity.class);
                break;
            case R.id.btn_drawable:
                swithActivity(DrawableActivity.class);
                break;
            case R.id.btn_chat:
                swithActivity(PayActivity.class);
                break;
            case R.id.btn_pay:
                swithActivity(PayActivity.class);
                break;
        }
    }

    private void swithActivity(Class<? extends Activity> otherActivity){
        intent.setClass(this,otherActivity);
        startActivity(intent);
    }
}
