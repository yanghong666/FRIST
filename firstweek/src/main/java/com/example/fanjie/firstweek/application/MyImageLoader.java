package com.example.fanjie.firstweek.application;

import android.content.Context;
import android.widget.ImageView;

import com.youth.banner.loader.ImageLoader;

/**
 * author:Created by Constraint.
 */

public class MyImageLoader extends ImageLoader{
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().displayImage(path.toString(),imageView);
    }
}
