package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class visiting_places_vadodra extends AppCompatActivity {
    public CardView sayaji,lakshmivillas,atapi,planet,kirti,ajwa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiting_places_vadodra);
        sayaji=findViewById(R.id.cv_g1);
        lakshmivillas=findViewById(R.id.cv_g2);
        ajwa=findViewById(R.id.cv_g3);
        planet=findViewById(R.id.cv_g4);
        kirti=findViewById(R.id.cv_g5);
        atapi=findViewById(R.id.cv_g6);


        sayaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(visiting_places_vadodra.this, sayaji.class);
                startActivity(intent);
            }
        });
        lakshmivillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(visiting_places_vadodra.this, lakshmivillas.class);
                startActivity(intent);
            }
        });
        ajwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(visiting_places_vadodra.this, Ajwa.class);
                startActivity(intent);
            }
        });
        planet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(visiting_places_vadodra.this, planet.class);
                startActivity(intent);
            }
        });
        kirti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(visiting_places_vadodra.this, kirti.class);
                startActivity(intent);
            }
        });
        atapi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(visiting_places_vadodra.this, atapi.class);
                startActivity(intent);
            }
        });


    }
}