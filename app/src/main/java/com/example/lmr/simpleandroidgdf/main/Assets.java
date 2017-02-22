package com.example.lmr.simpleandroidgdf.main;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.SoundPool;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by LMR on 2017/2/22.
 */

public class Assets {
    private static SoundPool soundPool;
    public static Bitmap welcome;
    public static void load(){
        welcome=loadBitmap("welcome.png",false);
    }
    private static Bitmap loadBitmap(String filename,boolean transparency){
        InputStream inputStream=null;
        try{
            inputStream= GameMainActivity.assets.open(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BitmapFactory.Options options=new BitmapFactory.Options();
        if(transparency){
            options.inPreferredConfig= Bitmap.Config.ARGB_8888;
        }else{
            options.inPreferredConfig= Bitmap.Config.RGB_565;
        }
        Bitmap bitmap=BitmapFactory.decodeStream(inputStream,null,options);
        return bitmap;
    }
    private static int loadSound(String filename){
        int soundID=0;
        if(soundPool==null){
            soundPool=new SoundPool(25, AudioManager.STREAM_MUSIC,0);
        }
        try{
            soundID=soundPool.load(GameMainActivity.assets.openFd(filename),1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return soundID;
    }
    public static void playSound(int soundID){
        soundPool.play(soundID,1,1,1,0,1);
    }
}
