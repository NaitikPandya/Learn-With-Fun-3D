package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class secondActivity extends AppCompatActivity {

    CardView basic,sci,videos;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basic=findViewById(R.id.basic);
        sci=findViewById(R.id.science);
        videos=findViewById(R.id.videos);
        basic.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(secondActivity.this,BasicActivity.class);
                startActivity(intent);
            }
        });
        sci.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(secondActivity.this,ScienceActivity.class);
                startActivity(intent);
            }
        });
        videos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(secondActivity.this,BasicActivity.class);
                startActivity(intent);
            }
        });
    }
}
