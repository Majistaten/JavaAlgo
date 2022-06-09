package com.javaalgo.project.gui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(String thenameofthewindowthatisgoingtoopenverysoon){
        super(thenameofthewindowthatisgoingtoopenverysoon);

        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Dimension size = new Dimension(1200,600);
        //
        GraphView graphView = new GraphView();

        add(graphView,BorderLayout.CENTER);
        add(getInspector(),BorderLayout.EAST);
        add(getHeader(),BorderLayout.NORTH);
        add(getFooter(),BorderLayout.SOUTH);
        add(getSide(),BorderLayout.WEST);
        //
        pack();
        setSize(size);
        setLocationRelativeTo(null);
        setVisible(true);

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

