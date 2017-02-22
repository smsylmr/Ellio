package com.example.lmr.simpleandroidgdf.state;

import android.view.MotionEvent;

import com.example.lmr.simpleandroidgdf.main.Assets;
import com.example.lmr.simpleandroidgdf.util.Painter;

/**
 * Created by LMR on 2017/2/22.
 */

public class LoadState extends State {
    @Override
    public void init() {
        Assets.load();
    }

    @Override
    public void update(float delta) {
        setCurrentState(new MenuState());
    }

    @Override
    public void render(Painter painter) {

    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
