package com.example.lmr.simpleandroidgdf.animation;

import android.graphics.Bitmap;

/**
 * Created by LMR on 2017/2/22.
 */

public class Frame {
    private Bitmap image;
    private double duration;
    public Frame(Bitmap image,double duration){
        this.image=image;
        this.duration=duration;
    }
    public double getDuration(){
        return duration;
    }
    public Bitmap getImage(){
        return image;
    }
}
