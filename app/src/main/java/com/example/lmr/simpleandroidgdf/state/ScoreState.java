package com.example.lmr.simpleandroidgdf.state;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.MotionEvent;

import com.example.lmr.simpleandroidgdf.main.GameMainActivity;
import com.example.lmr.simpleandroidgdf.util.Painter;

/**
 * Created by LMR on 2017/2/23.
 */

public class ScoreState extends State {
    private String highScore;

    @Override
    public void init() {
        highScore= GameMainActivity.getHighScore()+"";
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(Painter painter) {
        painter.setColor(Color.rgb(53,156,253));
        painter.fillRect(0,0,GameMainActivity.GAME_WIDTH,GameMainActivity.GAME_HEIGHT);
        painter.setColor(Color.WHITE);
        painter.setFont(Typeface.DEFAULT_BOLD,50);
        painter.drawString("The All-Time High Score",120,175);
        painter.setFont(Typeface.DEFAULT_BOLD,70);
        painter.drawString(highScore,370,260);
        painter.setFont(Typeface.DEFAULT_BOLD,50);
        painter.drawString("Touch the screen",220,350);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        if(e.getAction()==MotionEvent.ACTION_UP){
            setCurrentState(new MenuState());
        }
        return true;
    }
}
