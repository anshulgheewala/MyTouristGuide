package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hotels_ahmedabad extends AppCompatActivity {
    CardView cv_hyatt,cv_taj,cv_metropole,cv_radison,cv_river,cv_novotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_ahmedabad);

        cv_hyatt=findViewById(R.id.cv_g1);
        cv_radison=findViewById(R.id.cv_g2);
        cv_metropole=findViewById(R.id.cv_g3);
        cv_taj=findViewById(R.id.cv_g4);
        cv_river=findViewById(R.id.cv_g5);
        cv_novotel=findViewById(R.id.cv_g6);



        cv_hyatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_ahmedabad.this,Hyatt.class);
                startActivity(intent);
            }
        });
        cv_taj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_ahmedabad.this,Taj.class);
                startActivity(intent);
            }
        });
        cv_radison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_ahmedabad.this,Radisson_blu.class);
                startActivity(intent);
            }
        });
        cv_metropole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_ahmedabad.this,Metropole.class);
                startActivity(intent);
            }
        });
        cv_river.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_ahmedabad.this,Riverview.class);
                startActivity(intent);
            }
        });
        cv_novotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_ahmedabad.this,Riverview.class);
                startActivity(intent);
            }
        });

    }
}