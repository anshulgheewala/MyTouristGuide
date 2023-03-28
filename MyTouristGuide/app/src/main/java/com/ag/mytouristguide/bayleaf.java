package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bayleaf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayleaf);
        getSupportActionBar().hide();
        Button location;
        location = findViewById(R.id.aaa);
        getSupportActionBar().hide();
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://goo.gl/maps/Vbkrnj6LDhRGHGuz7");


            }
        });
    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}