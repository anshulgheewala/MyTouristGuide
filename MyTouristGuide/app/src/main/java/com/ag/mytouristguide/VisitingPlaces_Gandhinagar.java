package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VisitingPlaces_Gandhinagar extends AppCompatActivity {
    public CardView akshardham,mahatma,indroda,mahudi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_places_gandhinagar);

        akshardham=findViewById(R.id.cv_g1);
        mahatma=findViewById(R.id.cv_g2);
        indroda=findViewById(R.id.cv_g3);
        mahudi=findViewById(R.id.cv_g4);






        akshardham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VisitingPlaces_Gandhinagar.this,AksharDham.class);
                startActivity(intent);

            }
        });

        mahatma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Gandhinagar.this,Mahatma.class);
                startActivity(intent);

            }
        });

        indroda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Gandhinagar.this,Indroda.class);
                startActivity(intent);

            }
        });


        mahudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(VisitingPlaces_Gandhinagar.this,mahudi.class);
                startActivity(intent);

            }
        });
    }
}