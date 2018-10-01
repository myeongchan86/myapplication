package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity { //AppCompatActivity 최신 액티비티를 임포트

    private TextView tv_hello = null, tv_res = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     // res.layout.activity_main.xml

        tv_hello = findViewById(R.id.tv_hello);     // xml 텍스트에서 id값을 갖고있는 주소값을 가져옴 /없으면 null
        tv_res = findViewById(R.id.tv_res);
        //연결만 한 부분

        tv_hello.setText(R.string.change);     //(12) 같은 숫자를 넣을 경우 12가 아니라 주소값으로 인식
        tv_res.setText("이름은 야무지게");

    }
}
