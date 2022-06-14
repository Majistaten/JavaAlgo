package com.javaalgo.project.sort;

import java.util.Random;

public abstract class BaseSorter {
    protected int[] values;
    private BaseSorter(){

    }
    private BaseSorter(int[] values){
        this.setArray(values);
    }
    public void setArray(int[] values){
        this.values = values;
    }

    static public int[] generateArray(int length, int peak){
        Random r = new Random();
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = (int)(r.nextFloat() * peak);
        }
        return arr;
    }
}
