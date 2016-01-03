package com.example.limefive.suo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GroupsActivity extends AppCompatActivity {

    Button button;
    TextView tv1, tv2, tv3;
    EditText et1, et2, et3;
    String zaryad;
    String angle_on;
    String Tz;
    String V0sum;
    String h_op;
    int[] OD = new int[3];
    String[] groups_from_GA = new String[3];
    String group3, group4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);

        button = (Button) findViewById(R.id.button_go3);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        zaryad = getIntent().getStringExtra("zaryad");
        angle_on = getIntent().getStringExtra("angle_on");
        Tz = getIntent().getStringExtra("Tz");
        V0sum = getIntent().getStringExtra("V0sum");
        h_op = getIntent().getStringExtra("H_op");
        OD = getIntent().getIntArrayExtra("OD");
        group3 = getIntent().getStringExtra("group3");
        group4 = getIntent().getStringExtra("group4");

        tv1.setText(Integer.toString(OD[0]));
        tv2.setText(Integer.toString(OD[1]));
        tv3.setText(Integer.toString(OD[2]));
        //tv1.setText(OD[0]);
        //tv2.setText(OD[1]);
        //tv3.setText(OD[2]);

			/*
			groups_of_meteo [0] = Convert.ToInt32 (et1.Text);
			groups_of_meteo [1] = Convert.ToInt32 (et2.Text);
			groups_of_meteo [2] = Convert.ToInt32 (et3.Text);
			*/

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_go3:

                        groups_from_GA[0] = et1.getText().toString();
                        groups_from_GA[1] = et2.getText().toString();
                        groups_from_GA[2] = et3.getText().toString();


                        Intent intent = new Intent(GroupsActivity.this, AnswerActivity.class);

                        intent.putExtra("zaryad", zaryad);
                        intent.putExtra("angle_on", angle_on);
                        intent.putExtra("Tz", Tz);
                        intent.putExtra("V0сум", V0sum);
                        intent.putExtra("h_op", h_op);
                        //intent.putExtra("choose_of_OP", choose_of_OP);
                        intent.putExtra("group3", group3);
                        intent.putExtra("group4", group4);
                        intent.putExtra("groups_from_GA", groups_from_GA);

                        startActivity(intent);
                }
            }
        });
    }
}
