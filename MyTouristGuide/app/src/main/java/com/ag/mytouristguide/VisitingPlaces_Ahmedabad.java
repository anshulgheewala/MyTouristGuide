package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VisitingPlaces_Ahmedabad extends AppCompatActivity {
    public CardView riverfront,sciencecity,kankaria,adalaj,sidi,autov,flower,callico;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_places_ahmedabad);

        riverfront=findViewById(R.id.cv_g1);
        kankaria=findViewById(R.id.cv_g2);
        adalaj=findViewById(R.id.cv_g3);
        sciencecity=findViewById(R.id.cv_g4);
        autov=findViewById(R.id.cv_g5);
        sidi=findViewById(R.id.cv_g6);
        flower=findViewById(R.id.cv_g7);
        callico=findViewById(R.id.cv_g8);


        riverfront.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,RiverFront.class);
                startActivity(intent);

            }
        });

        kankaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,kankaria.class);
                startActivity(intent);

            }
        });

        adalaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,Adalaj.class);
                startActivity(intent);

            }
        });

        sciencecity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,sciencecity.class);
                startActivity(intent);

            }
        });

        autov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,autovintage.class);
                startActivity(intent);

            }
        });

        sidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,sidisaiyyad.class);
                startActivity(intent);

            }
        });

        flower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,flowerpark.class);
                startActivity(intent);

            }
        });

        callico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Ahmedabad.this,callico.class);
                startActivity(intent);

            }
        });
    }
}