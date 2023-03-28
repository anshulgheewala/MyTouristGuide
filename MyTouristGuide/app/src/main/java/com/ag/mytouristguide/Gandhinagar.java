package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Gandhinagar extends AppCompatActivity {
    CardView cv1,cv2,cv3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gandhinagar);







        cv1=findViewById(R.id.visiting_g);
        cv2=findViewById(R.id.hotel_g);
        cv3=findViewById(R.id.restaurant_g);


        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Gandhinagar.this,VisitingPlaces_Gandhinagar.class);
                startActivity(intent1);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Gandhinagar.this,hotels_gandhinagar.class);
                startActivity(intent1);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Gandhinagar.this,restaurant_g.class);
                startActivity(intent1);
            }
        });
    }
}