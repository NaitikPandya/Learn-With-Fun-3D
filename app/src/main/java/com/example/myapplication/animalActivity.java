package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.myapplication.animal.*;

public class animalActivity extends AppCompatActivity {
    CardView horse;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);
        horse = findViewById(R.id.horse);
        horse.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(animalActivity.this , horseobject.class);
                startActivity(intent);
            }
        });
    }
}
