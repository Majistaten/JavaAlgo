package com.javaalgo.project.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public GraphView graphView;
    public MainWindow(String thenameofthewindowthatisgoingtoopenverysoon) throws InterruptedException {
        super(thenameofthewindowthatisgoingtoopenverysoon);

        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension size = new Dimension(1200,600);
        //
        this.graphView = new GraphView(this);
        add(graphView,      BorderLayout.CENTER);
        add(getInspector(), BorderLayout.EAST);
        add(getHeader(),    BorderLayout.NORTH);
        add(getFooter(),    BorderLayout.SOUTH);
        add(getSide(),      BorderLayout.WEST);
        //
        pack();
        setSize(size);
        //graphView.setPreferredSize(new Dimension(1000,500));
        setLocationRelativeTo(null);
        setVisible(true);
        //
        graphView.setMax(300);

    }
    public void updateArray(int[] arr){
        this.graphView.updateArray(arr);
        repaint();
    }
    private JPanel getInspector(){
        JPanel inspector = new JPanel();
        inspector.setBackground(Color.PINK);
        JButton go = new JButton("Go");
        inspector.add(go);
        //
        return inspector;
    }
    private JPanel getHeader(){
        JPanel header = new JPanel();
        JLabel title = new JLabel("Header");
        header.add(title);
        //
        return header;
    }
    private JPanel getFooter(){
        JPanel footer = new JPanel();
        JLabel title = new JLabel("Footer");
        footer.add(title);
        //
        return footer;
    }
    private JPanel getSide(){
        JPanel side = new JPanel();
        side.setBackground(Color.orange);
        JCheckBox someCHeckbox = new JCheckBox();
        side.add(someCHeckbox);
        //
        return side;
    }
}

