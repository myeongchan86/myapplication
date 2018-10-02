package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class explay extends AppCompatActivity {

    private Button btn_1,btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explay);
    init();
    }
    private void init() {
        btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(explay.this,"버튼1",Toast.LENGTH_SHORT).show();
                //번튼을 눌렀을때 실행될 문구작성
                Intent intent = new Intent(explay.this,OneActivity.class);
                startActivity(intent);

            }
        });
        btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(explay.this,"버튼2",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(explay.this,ThreeActivity.class);
                startActivity(intent);
            }
        });
    }

           }



