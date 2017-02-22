package com.example.lmr.simpleandroidgdf.util;

import android.view.MotionEvent;
import android.view.View;

import com.example.lmr.simpleandroidgdf.main.GameMainActivity;
import com.example.lmr.simpleandroidgdf.state.State;

/**
 * Created by LMR on 2017/2/21.
 */

public class InputHandler implements View.OnTouchListener {
    private State currntState;
    public void setCurrntState(State currntState){
        this.currntState=currntState;
    }
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int scaledX=(int)(( motionEvent.getX()/ view.getWidth())* GameMainActivity.GAME_WIDTH);
        int scaledY=(int)((motionEvent.getY()/view.getHeight()*GameMainActivity.GAME_HEIGHT));
        return currntState.onTouch(motionEvent,scaledX,scaledY);
    }
}
