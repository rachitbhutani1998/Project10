package com.cafedroid.project10;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

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
        projectList.add(new Projects("Court Counter",R.drawable.ic_plus_one_white_24dp,R.color.football));
        projectList.add(new Projects("Quiz App",R.drawable.ic_help_white_24dp,R.color.quiz));
        projectList.add(new Projects("Music App",R.drawable.ic_music_note_white_24dp,R.color.colorAccent));
        projectList.add(new Projects("Report Card",R.drawable.ic_content_paste_white_24dp,R.color.report));
        projectList.add(new Projects("Tour Guide",R.drawable.ic_directions_white_24dp,R.color.tour));
        projectList.add(new Projects("Book Listing",R.drawable.ic_book_white_24dp,R.color.book));
        projectList.add(new Projects("News App",R.drawable.ic_featured_play_list_white_24dp,R.color.news));
        projectList.add(new Projects("Habit Tracker",R.drawable.ic_videogame_asset_white_24dp,R.color.habbit));
        projectList.add(new Projects("Inventory",R.drawable.ic_build_white_24dp,R.color.inventory));
        mAdapter=new GridAdapter(getApplicationContext(),projectList);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        startActivity(new Intent(GridActivity.this,SquareOne.class));
                        break;
                    case 1:
                        startActivity(new Intent(GridActivity.this,FootballActivity.class));
                        break;
                    default:
                        Toast.makeText(GridActivity.this, "No Data Exists", Toast.LENGTH_SHORT).show();
                }
            }
        });
        grid.setAdapter(mAdapter);
        grid.setColumnWidth(width/2);
    }
}
