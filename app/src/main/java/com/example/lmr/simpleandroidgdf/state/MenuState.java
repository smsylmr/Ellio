package com.example.lmr.simpleandroidgdf.state;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;

import com.example.lmr.simpleandroidgdf.main.Assets;
import com.example.lmr.simpleandroidgdf.util.Painter;
import com.example.lmr.simpleandroidgdf.util.UIButton;

/**
 * Created by LMR on 2017/2/22.
 */

public class MenuState extends State  {
//    private Rect playRect;
//    private Rect scoreRect;
//
//    private boolean playDown=false;
//    private boolean scoreDown=false;
    private UIButton playButton,scoreButton;

    @Override
    public void init() {
        playButton=new UIButton(316,227,484,286,Assets.start,Assets.startDown);
        scoreButton=new UIButton(316,300,484,359,Assets.score,Assets.scoreDown);
    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void render(Painter painter) {

        painter.drawImage(Assets.welcome,0,0);
        playButton.render(painter);
        scoreButton.render(painter);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        if(e.getAction()==MotionEvent.ACTION_DOWN){
           playButton.onTouchDown(scaledX,scaledY);
            scoreButton.onTouchDown(scaledX,scaledY);
            }
        if(e.getAction()==MotionEvent.ACTION_UP){
            if(playButton.isPressed(scaledX,scaledY)){
                playButton.cancel();
                setCurrentState(new PlayState());
            }else if(scoreButton.isPressed(scaledX,scaledY)){
                scoreButton.cancel();
                setCurrentState(new ScoreState());
            }else {
                playButton.cancel();
                scoreButton.cancel();
            }
        }
        return true;
    }
}
