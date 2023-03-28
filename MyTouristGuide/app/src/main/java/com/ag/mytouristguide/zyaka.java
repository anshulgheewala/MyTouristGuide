package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class zyaka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zyaka);
        Button location;
        location = findViewById(R.id.aaa);
        getSupportActionBar().hide();
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://maps.app.goo.gl/5ock9utbWxErpXMXA");


            }
        });
    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}