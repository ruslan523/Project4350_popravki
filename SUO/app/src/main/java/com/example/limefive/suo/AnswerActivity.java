package com.example.limefive.suo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {

    Button button;
    String zaryad;
    TextView tv1, tv2, tv3;
    //String[] opornye_dalnosti = new String[3];
    String angle_on;
    String Tz;
    String V0sum;
    String H_op;
    String[] groups_of_meteo = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        button = (Button) findViewById(R.id.button_go4);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        zaryad = getIntent().getStringExtra("zaryad");
        //opornye_dalnosti = getIntent().getStringExtra("opornye_dalnosti");
        angle_on = getIntent().getStringExtra("angle_on");
        Tz = getIntent().getStringExtra("Tz");
        V0sum = getIntent().getStringExtra("V0sum");
        H_op = getIntent().getStringExtra("H_op");
        groups_of_meteo = getIntent().getStringArrayExtra("groups_of_meteo");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_go4:
                        Intent intent = new Intent(AnswerActivity.this, StartActivity.class);
                        startActivity(intent);
                }
            }
        });
    }
}