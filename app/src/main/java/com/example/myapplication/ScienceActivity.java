package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication.animal.*;

public class ScienceActivity  extends AppCompatActivity {

    CardView ani,vec,bop,gadget;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        ani = findViewById(R.id.animal);
        ani.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(ScienceActivity.this , animalActivity.class);
                startActivity(intent);
            }
        });
        vec = findViewById(R.id.vehicle);
        vec.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(ScienceActivity.this , vehicleActivity.class);
                startActivity(intent);
            }
        });
        bop = findViewById(R.id.body);
        bop.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(ScienceActivity.this , bodypartActivity.class);
                startActivity(intent);
            }
        });
        gadget = findViewById(R.id.gadget);
        gadget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent =new Intent(ScienceActivity.this,gadgetActivity.class);
                startActivity(intent);
            }
        });
    }
}
