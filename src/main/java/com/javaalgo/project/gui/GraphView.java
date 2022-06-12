package com.javaalgo.project.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphView extends JPanel {
    private int[] arr = new int[1000];
    private int peak = 100;
    private MainWindow mainFrame;
    public GraphView(MainWindow frame) {
        this.mainFrame = frame;
    }
    public void setMax(int max){
        this.peak = max;
    }
    public void updateArray(int[] arr){
        this.arr = arr;
        System.out.println("Update");
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int height = this.getHeight();
        for(int i=0; i<this.arr.length; i++){
            g2d.drawLine(i,height,i,height-this.arr[i]);
        }
    }
}
