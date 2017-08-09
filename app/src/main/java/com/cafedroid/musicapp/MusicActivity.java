package com.cafedroid.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.cafedroid.project10.R;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        TextView albums = (TextView) findViewById(R.id.album);
        if (albums != null) albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumIntent = new Intent(MusicActivity.this, albums.class);
                startActivity(albumIntent);
            }
        });
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        if (nowPlaying != null) nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(MusicActivity.this, NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });
        TextView playlist = (TextView) findViewById(R.id.playlist);
        if (playlist != null) playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MusicActivity.this, playlists.class);
                startActivity(playlistIntent);
            }
        });
        TextView artists = (TextView) findViewById(R.id.artist);
        if (artists != null) artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistIntent = new Intent(MusicActivity.this, artists.class);
                startActivity(artistIntent);
            }
        });
        TextView tracks = (TextView) findViewById(R.id.track);
        if (tracks != null) tracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tracksIntent = new Intent(MusicActivity.this, tracks.class);
                startActivity(tracksIntent);
            }
        });
    }
}
