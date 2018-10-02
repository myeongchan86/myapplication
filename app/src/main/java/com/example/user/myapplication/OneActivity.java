package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class OneActivity extends AppCompatActivity {

    private TextView calc1,calc2;
    private EditText div1,div2,div3;
//계산기
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        init();
    }
    private void init(){
        getSupportActionBar().setTitle("계산기");
        div1=findViewById(R.id.div1);
        div1.setShowSoftInputOnFocus(false);
        div2=findViewById(R.id.div2);
        div2.setShowSoftInputOnFocus(false);
        div3=findViewById(R.id.div3);
        div3.setShowSoftInputOnFocus(false);
        calc1 = findViewById(R.id.calc1);
        calc2 = findViewById(R.id.calc2);


    }
public void   aa (View v) {
    if (v instanceof Button) {
        Button b = (Button) v;
        String str = b.getText().toString();
        if (str.equals("c")) {

        } else {
            calc1.setText(str);
        }
    }
}

}
