package com.example.myapplication;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

import com.example.myapplication.gadget.*;

public class gadgetActivity extends AppCompatActivity {

    CardView wash,comp,lap,cal;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gadget);
        wash = findViewById(R.id.wash);
        wash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(gadgetActivity.this, washobject.class);
                startActivity(intent);

            }
        });
        cal=findViewById(R.id.calculator);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(gadgetActivity.this,calculatorobject.class);
                startActivity(intent);
            }
        });
        lap = findViewById(R.id.laptop);
        lap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(gadgetActivity.this,laptopobject.class);
                startActivity(intent);
            }
        });

    }

}