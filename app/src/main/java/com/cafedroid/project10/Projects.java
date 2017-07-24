package com.cafedroid.project10;


import android.app.Activity;

class Projects {
    private String mProjectName;
    private int mImageId,mColor;

    Projects(String projectName, int imageId, int color){
        mProjectName=projectName;
        mImageId=imageId;
        mColor=color;
    }

    String getProjectName(){
        return mProjectName;
    }

    int getImage(){
        return mImageId;
    }

    int getColor()
    {
        return mColor;
    }
}
