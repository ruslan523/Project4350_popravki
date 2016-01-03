package com.example.limefive.suo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    EditText et1, et3, et4, et5, et6, et7, et8;
    String zaryad;
    //int[] opornye_dalnosti = new int[3];
    String h_op;
    String angle_on;
    String Tz;
    String V0sum;
    String group3;
    String group4;
    //int[] groups_of_vysota_vhoda = new int[3];
    //String[] number_of_meteo = new String[3];
    int choose_of_OP;
    int[] table_for_GA = { 0, 0, 0, 1, 1, 2, 3, 5, 7, 10, 14, 19, 24, 31, 40, 53 };
    int[] OD = new int[3];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_go2);
        et1 = (EditText) findViewById(R.id.et1);
        et3 = (EditText) findViewById(R.id.et3);
        et4 = (EditText) findViewById(R.id.et4);
        et5 = (EditText) findViewById(R.id.et5);
        et6 = (EditText) findViewById(R.id.et6);
        et7 = (EditText) findViewById(R.id.et7);
        et8 = (EditText) findViewById(R.id.et8);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);

        String[] data = {"4/6/8", "5/7/9", "6/8/10", "7/9/11", "8/10/12"};
        // адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
        // заголовок
        spinner.setPrompt("Title");
        // выделяем элемент
        spinner.setSelection(0);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                zaryad = et1.getText().toString();
                h_op = et3.getText().toString();
                angle_on = et4.getText().toString();
                Tz = et5.getText().toString();
                V0sum = et6.getText().toString();
                group3 = et7.getText().toString();
                group4 = et8.getText().toString();
                choose_of_OP = spinner.getSelectedItemPosition();

                for (int i = 0; i < 3; i++) {
                    OD[i] = table_for_GA[choose_of_OP + 4 + i * 2];
                }

                //переходим с первой на вторую активность
                Intent intent = new Intent(MainActivity.this, GroupsActivity.class);
                intent.putExtra("zaryad", zaryad);
                intent.putExtra("angle_on", angle_on);
                intent.putExtra("Tz", Tz);
                intent.putExtra("V0сум", V0sum);
                intent.putExtra("h_op", h_op);
                intent.putExtra("OD", OD);
                intent.putExtra("group3", group3);
                intent.putExtra("group4", group4);
                startActivity(intent);
                //finish();
            }
        });
        /*
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.button_go2:
                        Intent intent = new Intent(MainActivity.this, GroupsActivity.class);
                        intent.putExtra("ZARYAD", ZARYAD);
                        intent.putExtra("opornye_dalnosti", opornye_dalnosti);
                        intent.putExtra("angle_on", angle_on);
                        intent.putExtra("Tz", Tz);
                        intent.putExtra("V0сум", V0sum);
                        intent.putExtra("H_op", H_op);
                        intent.putExtra("number_of_meteo", number_of_meteo);
                        startActivity(intent);
                }
            }
        });
        */
    }
}