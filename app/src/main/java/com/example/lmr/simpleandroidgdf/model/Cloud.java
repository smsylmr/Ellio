package com.example.lmr.simpleandroidgdf.model;

import com.example.lmr.simpleandroidgdf.util.RandomNumber;

/**
 * Created by LMR on 2017/2/22.
 */

public class Cloud {
    private float x,y;
    private static final int VEL_X=-15;

    public Cloud(float x,float y){
        this.x=x;
        this.y=y;
    }
    public void update(float delta){
        x+=VEL_X*delta;
        if(x<=-200){
            x+=1000;
            y= RandomNumber.getRandIntBetween(20,100);
        }
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
}
