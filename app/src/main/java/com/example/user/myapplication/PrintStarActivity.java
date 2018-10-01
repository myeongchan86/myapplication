package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrintStarActivity extends AppCompatActivity {

    private EditText btn ;
    private Button btn1;
    private TextView tv_resurt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print_star);
        getSupportActionBar().setTitle("별찍기");
        init();
    }
private  int checkInteger (String v) {

        int result = 0;
        try {
            result = Integer.parseInt(v);
        }catch (Exception e) {}
        return result;
}
    public void init() {

        btn = findViewById(R.id.btn);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = btn.getText().toString();
                int no = checkInteger(value);

                if (no > 0) {
                    String result = "";
                    for (int i = 1; i <= no; i++) {
                        for (int j = 0; j < i; j++) {
                            result += "*";
                        }
                        result +="\n";
                    }
                    tv_resurt.setText(result);
                }
            }
        });

        tv_resurt = findViewById(R.id.tv_resurt);

        }


    }

