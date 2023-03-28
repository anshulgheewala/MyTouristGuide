package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hotels_vadodra extends AppCompatActivity {
    CardView cv_grand,cv_regenta,cv_frn,cv_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_vadodra);
        cv_grand=findViewById(R.id.cv_g1);
        cv_regenta=findViewById(R.id.cv_g2);
        cv_frn=findViewById(R.id.cv_g3);
        cv_welcome=findViewById(R.id.cv_g4);

        cv_grand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_vadodra.this,Grand_Mercure.class);
                startActivity(intent);

            }
        });
        cv_frn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_vadodra.this,fern.class);
                startActivity(intent);
            }
        });
        cv_regenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_vadodra.this,Regenta.class);
                startActivity(intent);
            }
        });
        cv_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_vadodra.this,welcome.class);
                startActivity(intent);
            }
        });




    }
}