package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MainActivity;

public class splashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {

            @Override

            public void run() {

                //Do something after 5000ms
                Intent i = new Intent(splashActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            }

        }, 3000);

      }
}
