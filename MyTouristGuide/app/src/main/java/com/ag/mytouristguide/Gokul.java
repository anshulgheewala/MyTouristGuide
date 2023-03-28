package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gokul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gokul);
        getSupportActionBar().hide();
        Button location;
        location = findViewById(R.id.aaa);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://maps.app.goo.gl/nW5mJqYqnSP4yJNR7");


            }
        });
    }
    private void gotoUrl(String s){
        Uri uri=Uri.parse(s);
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}