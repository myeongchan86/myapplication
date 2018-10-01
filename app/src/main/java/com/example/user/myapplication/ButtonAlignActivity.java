package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonAlignActivity extends AppCompatActivity {

    private TextView tv_btn_nm;
    private Button btn_1, btn_2, btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //최초 1회 실행
        super.onCreate(savedInstanceState);                 //
        setContentView(R.layout.activity_button_align);     //화면출력
        tv_btn_nm = findViewById(R.id.tv_btn_nm);
        btn_1 = findViewById(R.id.btn_1);                   //일반적
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
    }



    public void clkBtn1(View v) {   //view가 최상위 객체로 모든 것을가리킬 수 있음
                                    // public void _____(View v)  기본형
        Button btn = (Button)v;
        tv_btn_nm.setText(btn.getText());   // 왜 0이 나오는 거지??
        //test

        if(v.getId() == R.id.btn_1){
            btn_1.setText("1");
            btn_2.setText("0");
            btn_3.setText("0");
        } else if (v.getId() == R.id.btn_2){
            btn_1.setText("0");
            btn_2.setText("2");
            btn_3.setText("0");
        } else if (v.getId() == R.id.btn_3){
            btn_1.setText("0");
            btn_2.setText("0");
            btn_3.setText("3");
        }
    }


}
