package com.cafedroid.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cafedroid.project10.R;

public class albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
    }
    public void home(View view){
        Intent homeIntent = new Intent(this,MusicActivity.class);
        startActivity(homeIntent);
    }
    public void playlistCategory(View view){
        Intent playlistIntent = new Intent(this,playlists.class);
        startActivity(playlistIntent);
    }
    public void nowPlayingCategory(View view){
        Intent nowPlayingIntent = new Intent(this,NowPlaying.class);
        startActivity(nowPlayingIntent);
    }
    public void artistsCategory(View view){
        Intent artistsIntent = new Intent(this,artists.class);
        startActivity(artistsIntent);
    }
    public void tracksCategory(View view){
        Intent tracksIntent = new Intent(this,tracks.class);
        startActivity(tracksIntent);
    }
}
