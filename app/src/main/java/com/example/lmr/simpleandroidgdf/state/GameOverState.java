package com.example.lmr.simpleandroidgdf.state;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.MotionEvent;

import com.example.lmr.simpleandroidgdf.main.GameMainActivity;
import com.example.lmr.simpleandroidgdf.util.Painter;

/**
 * Created by LMR on 2017/2/22.
 */

public class GameOverState extends State {
    private String playerScore;
    private String gameOverMessage="GAME OVER";

    public GameOverState(int playerScore){
        this.playerScore=playerScore+"";
        if(playerScore>GameMainActivity.getHighScore()){
            GameMainActivity.setHighScore(playerScore);
            gameOverMessage="HIGH SCORE";
        }
    }
    @Override
    public void init() {

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(Painter painter) {
        painter.setColor(Color.rgb(255,145,0));
        painter.fillRect(0,0, GameMainActivity.GAME_WIDTH,GameMainActivity.GAME_HEIGHT);
        painter.setColor(Color.DKGRAY);
        painter.setFont(Typeface.DEFAULT_BOLD,50);
        painter.drawString(gameOverMessage,257,175);
        painter.drawString(playerScore,385,250);
        painter.drawString("Touch the screen.",220,350);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        if(e.getAction()==MotionEvent.ACTION_UP){
            setCurrentState(new MenuState());
        }
        return true;
    }
}
