package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class restaurant_v extends AppCompatActivity {
    CardView cv_bayleaf,cv_jassi,cv_mandap,cv_secret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_v);

        cv_bayleaf=findViewById(R.id.cv_g1);
        cv_jassi=findViewById(R.id.cv_g2);
        cv_mandap=findViewById(R.id.cv_g3);
        cv_secret=findViewById(R.id.cv_g4);


        cv_bayleaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_v.this,bayleaf.class);
                startActivity(intent);
            }
        });
        cv_jassi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_v.this,jassi.class);
                startActivity(intent);
            }
        });
        cv_mandap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_v.this,mandap.class);
                startActivity(intent);
            }
        });
        cv_secret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(restaurant_v.this,secretKitchen.class);
                startActivity(intent);
            }
        });
    }
}