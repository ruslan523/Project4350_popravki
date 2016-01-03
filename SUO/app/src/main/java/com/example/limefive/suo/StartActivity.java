package com.example.limefive.suo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class StartActivity extends AppCompatActivity {

    Button button;
    Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView iv = (ImageView) findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.rvia);
        button = (Button) findViewById(R.id.button_go1);
        about = (Button) findViewById(R.id.button_about);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //переходим с первой на вторую активность
                Intent intent = new Intent(StartActivity.this, MainActivity.class);
                startActivity(intent);
                //finish();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }
}