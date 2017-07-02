package com.example.lsbykk.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private  void initView(){
        button = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
    }

    private void initEvent(){
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(MainActivity.this,"测试按钮点击是否有效",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
