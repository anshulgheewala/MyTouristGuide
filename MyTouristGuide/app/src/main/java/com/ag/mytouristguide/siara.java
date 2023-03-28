package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class siara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siara);
        Button goibibo,tripadvisor,makemytrip,location;
        goibibo = findViewById(R.id.goibibo);
        tripadvisor = findViewById(R.id.tripadvisor);
        makemytrip = findViewById(R.id.makemytrip);
        location = findViewById(R.id.aaa);
        getSupportActionBar().hide();
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://maps.app.goo.gl/mECKULZSm8V8FZs79");


            }
        });
        goibibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.goibibo.com/hotels/siara-styles-amba-suites-hotel-in-gandhinagar-8823289221178845508/");


            }
        });
        tripadvisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.tripadvisor.in/Hotel_Review-g297609-d15701437-Reviews-Siara_Styles_Amba_Suites-Gandhinagar_Gandhinagar_District_Gujarat.html");


            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.makemytrip.com/hotels/siara_styles_amba_suites-details-gandhinagar.html");


            }
        });
    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}