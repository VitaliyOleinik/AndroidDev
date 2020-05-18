package com.example.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void startVideoView(View view) {
        VideoView videoView = findViewById(R.id.videoView); // find id our video
        MediaController mediaController = new MediaController(this); // add mediaController object
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.enjoykin_ready_to_fly); // path for video
        mediaController.setAnchorView(videoView); // tie media to video
        videoView.setMediaController(mediaController); // tie video to media
        videoView.start(); // start the video
    }
}
