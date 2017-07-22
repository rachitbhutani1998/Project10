package com.cafedroid.project10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {
    GridAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = displayMetrics.widthPixels;

        GridView grid=(GridView) findViewById(R.id.grid);
        ArrayList<Projects> projectList= new ArrayList<>();
        projectList.add(new Projects("Single Screen",R.drawable.ic_smartphone_white_24dp,R.color.blue));
        projectList.add(new Projects("Music App",R.drawable.ic_music_note_white_24dp,R.color.colorAccent));
        projectList.add(new Projects("Inventory",R.drawable.ic_build_white_24dp,R.color.inventory));
        projectList.add(new Projects("Quiz App",R.drawable.ic_help_white_24dp,R.color.quiz));
        projectList.add(new Projects("Court Counter",R.drawable.ic_build_white_24dp,R.color.football));
        mAdapter=new GridAdapter(getApplicationContext(),projectList);
        grid.setAdapter(mAdapter);
        grid.setColumnWidth(width/2);
    }
}
