package com.cafedroid.project10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReportCard extends AppCompatActivity {

    private StringBuilder stringBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card);
        BufferedReader reader=null;
        try {
            reader= new BufferedReader(
                    new InputStreamReader(getAssets().open("report.txt")));
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                stringBuilder.append(mLine);
                stringBuilder.append('\n');
            }
        } catch (IOException e) {
            Toast.makeText(this, "Error in the file", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }finally {
            if (reader!=null){
                try{
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        TextView output= (TextView) findViewById(R.id.report);
        output.setText(stringBuilder);
    }
}
