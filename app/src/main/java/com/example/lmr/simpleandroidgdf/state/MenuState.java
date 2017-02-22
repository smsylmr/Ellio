package com.example.lmr.simpleandroidgdf.state;

import android.view.MotionEvent;

import com.example.lmr.simpleandroidgdf.main.Assets;
import com.example.lmr.simpleandroidgdf.util.Painter;

/**
 * Created by LMR on 2017/2/22.
 */

public class MenuState extends State  {
    @Override
    public void init() {

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(Painter painter) {
        painter.drawImage(Assets.welcome,0,0);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
