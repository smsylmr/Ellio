package com.example.lmr.simpleandroidgdf.state;

import android.view.MotionEvent;

import com.example.lmr.simpleandroidgdf.main.GameMainActivity;
import com.example.lmr.simpleandroidgdf.util.Painter;

/**
 * Created by LMR on 2017/2/21.
 */

public abstract class State {
    public void setCurrentState(State newState) {
        GameMainActivity.sGame.setCurrentState(newState);
    }
    public abstract void init();
    public abstract void update(float delta);
    public abstract void render(Painter painter);
    public abstract boolean onTouch(MotionEvent e,int scaledX,int scaledY);
}
