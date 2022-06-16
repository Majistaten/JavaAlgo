package com.javaalgo.project.sort;

import com.javaalgo.project.gui.MainWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class BaseSorter {
    private int[] _values;
    protected MainWindow gui;
    // Default constructor
    protected BaseSorter(){

    }
    // Custom constructor
    protected BaseSorter(int[] values){
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
    public List verifySorting(){
        List<Integer> indicies = new ArrayList<>();
        int errors = 0;

        for(int i : this._values){
            int cur = this._values[i];
            if(i != 0){
                if(!(this._values[(i-1)] <= cur)){
                    errors++;
                    indicies.add(i);
                }
            }
            if(i != this._values.length){
                if(!(this._values[(i+1)] >= cur)){
                    errors++;
                    indicies.add(i);
                }
            }
        }
        return indicies;
    }
    public boolean isSorted(){
        return (verifySorting().size() == 0);
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
