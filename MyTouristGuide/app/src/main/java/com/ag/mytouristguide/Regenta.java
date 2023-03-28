package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Regenta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regenta);
        getSupportActionBar().hide();
        Button goibibo,tripadvisor,makemytrip,location;
        goibibo = findViewById(R.id.goibibo);
        tripadvisor = findViewById(R.id.tripadvisor);
        makemytrip = findViewById(R.id.makemytrip);
        location = findViewById(R.id.aaa);


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/3d1EhfYWeEx1JeBUA");


            }
        });
        goibibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.goibibo.com/hotels/regenta-inn-hotel-in-vadodara-4553039452186231030/");


            }
        });
        tripadvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tripadvisor.in/Hotel_Review-g297613-d11920948-Reviews-Regenta_Inn_Vadodara-Vadodara_Vadodara_District_Gujarat.html");


            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.makemytrip.com/hotels/regenta_inn-details-vadodara.html");


            }
        });

    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}