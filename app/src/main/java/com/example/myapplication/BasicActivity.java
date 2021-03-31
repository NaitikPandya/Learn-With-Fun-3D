package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class BasicActivity extends AppCompatActivity {
    CardView  alpha , num;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
        alpha = findViewById(R.id.alphabets);
        alpha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(BasicActivity.this , alphabetActivity.class);
                startActivity(intent);
            }
        });
        num = findViewById(R.id.number);
        num.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(BasicActivity.this , numberActivity.class);
                startActivity(intent);
            }
        });
    }
}
