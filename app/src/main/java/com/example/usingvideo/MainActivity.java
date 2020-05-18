package com.example.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Video");

        VideoView videoView = findViewById(R.id.videoView);

        String videoSource = "http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4"; // set http url
        videoView.setVideoURI(Uri.parse(videoSource)); // set video uri


        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();

    }

//    public void startVideoView(View view) {
//        VideoView videoView = findViewById(R.id.videoView); // find id our video
//        MediaController mediaController = new MediaController(this); // add mediaController object
//        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.enjoykin_ready_to_fly); // path for video
//        // Log.d("directory", "android.resource://" + getPackageName()); //com.example.usingvideo
//        mediaController.setAnchorView(videoView); // tie media to video
//        videoView.setMediaController(mediaController); // tie video to media
//        videoView.start(); // start the video
//
//    }
}
