package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fern extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fern);
        getSupportActionBar().hide();
        Button goibibo,tripadvisor,makemytrip,location;
        goibibo = findViewById(R.id.goibibo);
        tripadvisor = findViewById(R.id.tripadvisor);
        makemytrip = findViewById(R.id.makemytrip);
        location = findViewById(R.id.aaa);


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/jUo5BdFpJKeY23by7");


            }
        });
        goibibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.goibibo.com/hotels/the-fern-an-ecotel-vadodara-hotel-in-vadodara-5598162763112212991/");


            }
        });
        tripadvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tripadvisor.in/Hotel_Review-g297613-d13339642-Reviews-The_Fern_An_Ecotel_Hotel_Vadodara-Vadodara_Vadodara_District_Gujarat.html");


            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tripadvisor.in/Hotel_Review-g297613-d13339642-Reviews-The_Fern_An_Ecotel_Hotel_Vadodara-Vadodara_Vadodara_District_Gujarat.html");


            }
        });

    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}