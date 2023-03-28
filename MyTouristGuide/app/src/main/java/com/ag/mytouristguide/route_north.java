package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class route_north extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_north);
        videoView=findViewById(R.id.videoview);
        getSupportActionBar().hide();


//        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.route_north);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        videoView.start();

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//    }



}