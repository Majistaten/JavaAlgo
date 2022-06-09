package com.javaalgo.project.gui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphView extends JPanel {
    private int[] arr = new int[1000];
    private int peak = 100;
    public GraphView() {
        Random r = new Random();
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = r.nextInt(500);
        }
    }
    public void setMax(int max){
        this.peak = max;
        this.arr = new int[max];
    }
    public void setArray(int[] arr){
        this.arr = arr;
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        for(int i : this.arr){
            g2d.drawLine(i,500,i,500-this.arr[i]);
        }

    }
}
