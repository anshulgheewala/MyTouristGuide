package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vadodra extends AppCompatActivity {
    public CardView cv1,cv2,cv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vadodra);


        getSupportActionBar().hide();
        cv1=findViewById(R.id.visiting_a);
        cv2=findViewById(R.id.hotel_a);
        cv3=findViewById(R.id.restaurant_a);




        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Vadodra.this,visiting_places_vadodra.class);
                startActivity(intent1);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Vadodra.this,hotels_vadodra.class);
                startActivity(intent1);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Vadodra.this,restaurant_v.class);
                startActivity(intent1);
            }
        });
    }
}
