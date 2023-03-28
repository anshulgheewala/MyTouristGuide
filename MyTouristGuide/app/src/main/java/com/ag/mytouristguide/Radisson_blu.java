package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Radisson_blu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radisson_blu);
        getSupportActionBar().hide();
        Button goibibo,tripadvisor,makemytrip,location;
        goibibo = findViewById(R.id.goibibo);
        tripadvisor = findViewById(R.id.tripadvisor);
        makemytrip = findViewById(R.id.makemytrip);
        location = findViewById(R.id.aaa);


        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/KQvUqEACpvzkTDkr9");


            }
        });
        goibibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.goibibo.com/hotels/radisson-blu-ahmedabad-hotel-in-ahmedabad-7473486932334038895/");


            }
        });
        tripadvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tripadvisor.in/Hotel_Review-g297608-d3504960-Reviews-Radisson_Blu_Hotel_Ahmedabad-Ahmedabad_Ahmedabad_District_Gujarat.html");


            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.makemytrip.com/hotels/radisson_blu_hotel_ahmedabad-details-ahmedabad.html");


            }
        });

    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
 }
