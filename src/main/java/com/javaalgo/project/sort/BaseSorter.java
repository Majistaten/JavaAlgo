package com.javaalgo.project.sort;

import com.javaalgo.project.gui.MainWindow;

import java.util.Random;

public abstract class BaseSorter {
    private int[] _values;
    protected MainWindow gui;
    // Default constructor
    private BaseSorter(){

    }
    // Custom constructor
    private BaseSorter(int[] values){
        this.setArray(values);
    }
    public void setArray(int[] values){
        this._values = values;
    }
    //
    protected int getIndex(int index){
        updateGui();
        return this._values[index];
    }
    protected void setIndex(int index, int value){
        updateGui();
        this._values[index] = value;
    }
    //
    private void updateGui(){
        this.gui.updateArray(this._values);
    }

    // Class methods
    static public int[] generateArray(int length, int peak){
        Random r = new Random();
        int[] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = (int)(r.nextFloat() * peak);
        }
        return arr;
    }
}
