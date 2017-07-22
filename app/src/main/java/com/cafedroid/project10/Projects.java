package com.cafedroid.project10;

/**
 * Created by rachit on 22/07/17.
 */

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
