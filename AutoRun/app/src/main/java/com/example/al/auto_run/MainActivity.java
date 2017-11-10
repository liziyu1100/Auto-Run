package com.example.al.auto_run;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bnt_12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnt_12=(Button)findViewById(R.id.button1);
        //实例化以上控件
        bnt_12.setOnClickListener(this);
        //设置以上按钮的点击事件
    }
    public void onClick(View v) {

        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
