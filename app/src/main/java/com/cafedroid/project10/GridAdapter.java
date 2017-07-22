package com.cafedroid.project10;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


class GridAdapter extends ArrayAdapter<Projects> {

    GridAdapter(@NonNull Context context, ArrayList<Projects> list) {
        super(context, 0,list);
    }

    @NonNull
    @Override
    public View getView(int position,View convertView, @NonNull ViewGroup parent) {
        View gridView=convertView;
        if (gridView==null)
        {
            gridView=LayoutInflater.from(getContext()).inflate(R.layout.grid_item,parent,false);
        }
        Projects projects=getItem(position);
        String name="Project name";
        View containerView=gridView.findViewById(R.id.container);
        TextView projectName= gridView.findViewById(R.id.title_project);
        ImageView projectImage=gridView.findViewById(R.id.icon_project);
        if (projects != null) {
            name=projects.getProjectName();
            int color = ContextCompat.getColor(getContext(), projects.getColor());
            containerView.setBackgroundColor(color);
            projectImage.setBackgroundResource(projects.getImage());
        }
        projectName.setText(name);
        return gridView;
    }
}
