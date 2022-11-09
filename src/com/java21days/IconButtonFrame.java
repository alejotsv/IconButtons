package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class IconButtonFrame extends JFrame {

    IconButtonFrame(String title, ArrayList<String> buttons) {
        super(title);
        ArrayList<JButton> jButtons = createButtons(buttons);
        JPanel panel = new JPanel();
        for(JButton jButton : jButtons){
            panel.add(jButton);
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panel);
        setVisible(true);
        pack();
    }

    ArrayList<JButton> createButtons(ArrayList<String> buttons) {
        ArrayList<JButton> jButtons = new ArrayList<>();
        for(String button : buttons){
            ImageIcon icon = new ImageIcon(getClass().getResource("res/" + button));
            JButton btn = new JButton(icon);
            jButtons.add(btn);
        }
        return jButtons;
    }
}
