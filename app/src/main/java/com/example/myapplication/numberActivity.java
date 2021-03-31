package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication.number.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class numberActivity extends AppCompatActivity {
    CardView   o0,o1,o2,o3,o4,o5,o6,o7,o8,o9;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        o0 = findViewById(R.id.o0);
        o0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , zeroobject.class);
                startActivity(intent);
            }
        });
        o1 = findViewById(R.id.o1);
        o1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , oneobject.class);
                startActivity(intent);
            }
        });
        o2 = findViewById(R.id.o2);
        o2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , twoobject.class);
                startActivity(intent);
            }
        });
        o3 = findViewById(R.id.o3);
        o3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , threeobject.class);
                startActivity(intent);
            }
        });
        o4 = findViewById(R.id.o4);
        o4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , fourobject.class);
                startActivity(intent);
            }
        });
        o5 = findViewById(R.id.o5);
        o5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , fiveobject.class);
                startActivity(intent);
            }
        });
        o6 = findViewById(R.id.o6);
        o6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , sixobject.class);
                startActivity(intent);
            }
        });
        o7 = findViewById(R.id.o7);
        o7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , sevenobject.class);
                startActivity(intent);
            }
        });
        o8 = findViewById(R.id.o8);
        o8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , eightobject.class);
                startActivity(intent);
            }
        });
        o9 = findViewById(R.id.o9);
        o9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(numberActivity.this , nineobject.class);
                startActivity(intent);
            }
        });
    }
}

