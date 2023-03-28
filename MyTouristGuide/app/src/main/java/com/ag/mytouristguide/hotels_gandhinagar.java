package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hotels_gandhinagar extends AppCompatActivity {


    CardView cv_leela,cv_green,cv_siara,cv_royal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_gandhinagar);

        cv_leela=findViewById(R.id.cv_g1);
        cv_green=findViewById(R.id.cv_g2);
        cv_royal=findViewById(R.id.cv_g3);
        cv_siara =findViewById(R.id.cv_g4);

        cv_leela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_gandhinagar.this,Leela.class);
                startActivity(intent);
            }
        });
        cv_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_gandhinagar.this,greencity.class);
                startActivity(intent);

            }
        });
        cv_royal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_gandhinagar.this,Royal.class);
                startActivity(intent);
            }
        });
        cv_siara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hotels_gandhinagar.this,siara.class);
                startActivity(intent);
            }
        });
    }

}