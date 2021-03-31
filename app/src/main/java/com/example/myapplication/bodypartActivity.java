package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.myapplication.bodyparts.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bodypartActivity extends AppCompatActivity {
    CardView heart , hand , skeleton , eye;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodypart);
        heart = findViewById(R.id.heart);
        heart.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(bodypartActivity.this , heartobject.class);
                startActivity(intent);
            }
        });
         hand = findViewById(R.id.hand);
        hand.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(bodypartActivity.this , handobject.class);
                startActivity(intent);
            }
        });
        skeleton = findViewById(R.id.skeleton);
        skeleton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(bodypartActivity.this , skeletonobject.class);
                startActivity(intent);
            }
        });
        eye = findViewById(R.id.eye);
        eye.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                intent=new Intent(bodypartActivity.this , eyeobject.class);
                startActivity(intent);
            }
        });
    }
}
