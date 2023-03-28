package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class restaurant_a extends AppCompatActivity {
    CardView cv_tinello,cv_aghasiye,cv_rajwadu,cv_greenhouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        cv_tinello=findViewById(R.id.cv_g1);
        cv_aghasiye=findViewById(R.id.cv_g2);
        cv_greenhouse=findViewById(R.id.cv_g3);
        cv_rajwadu=findViewById(R.id.cv_g4);


        cv_tinello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_a.this,TinelloActivity.class);
                startActivity(intent);
            }
        });
        cv_aghasiye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_a.this,Aghasiye.class);
                startActivity(intent);
            }
        });
        cv_greenhouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_a.this,Greehouse.class);
                startActivity(intent);
            }
        });
        cv_rajwadu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_a.this,Rajwadu.class);
                startActivity(intent);
            }
        });



    }
}