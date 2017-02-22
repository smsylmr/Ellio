package com.example.lmr.simpleandroidgdf.util;

import java.util.Random;

/**
 * Created by LMR on 2017/2/22.
 */

public class RandomNumber {
    private static Random rand=new Random();
    public static int getRandIntBetween(int lowerBound,int upperBound){
        return rand.nextInt(upperBound-lowerBound)+lowerBound;
    }
    public static int getRandInt(int upperBound){
        return rand.nextInt(upperBound);
    }
}
