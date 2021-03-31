package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication.vehicle.*;

public class vehicleActivity extends AppCompatActivity {

    CardView o0,o1,o2,o3,o4,o5,o6,o7;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);
        o0 = findViewById(R.id.cycle);
        o0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , cycleobject.class);
                startActivity(intent);
            }
        });
        o1 = findViewById(R.id.bike);
        o1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , bikeobject.class);
                startActivity(intent);
            }
        });
        o2 = findViewById(R.id.car);
        o2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , carobject.class);
                startActivity(intent);
            }
        });
        o3 = findViewById(R.id.rickshaw);
        o3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , rixaobject.class);
                startActivity(intent);
            }
        });

        o4 = findViewById(R.id.train);
        o4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , trainobject.class);
                startActivity(intent);
            }
        });
        o5 = findViewById(R.id.plane);
        o5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , planeobject.class);
                startActivity(intent);
            }
        });
        o6 = findViewById(R.id.boat);
        o6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , boatobject.class);
                startActivity(intent);
            }
        });
        o7 = findViewById(R.id.truck);
        o7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(vehicleActivity.this , truckobject.class);
                startActivity(intent);
            }
        });
    }
}
