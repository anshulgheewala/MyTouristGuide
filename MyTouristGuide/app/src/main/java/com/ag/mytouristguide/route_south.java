package com.ag.mytouristguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class route_south extends AppCompatActivity {
    VideoView videoView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_south);
        getSupportActionBar().hide();
        videoView=findViewById(R.id.videoview);


//        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.route_south);
//        MediaController mediaController = new MediaController(this);
//        mediaController.setAnchorView(videoView);
//        videoView.setMediaController(mediaController);
//        videoView.start();
    }
}