package com.javaalgo.project.sort;

import java.util.Random;

public abstract class BaseSorter {


    static public int[] generateArray(int length, int peak){
        Random r = new Random();
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = (int)(r.nextFloat() * peak);
        }
        return arr;
    }
}
