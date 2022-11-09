package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class IconButtonFrame extends JFrame {
    Dimension d = new Dimension(700, 700);

    IconButtonFrame(String title, ArrayList<String> buttons) {
        super(title);
        ArrayList<JButton> jButtons = createButtons(buttons);
        setSize(d);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    ArrayList<JButton> createButtons(ArrayList<String> buttons) {
        ArrayList<JButton> jButtons = new ArrayList<>();
        for(String button : buttons){
            ImageIcon icon = new ImageIcon(button);
            JButton btn = new JButton(icon);
            jButtons.add(btn);
        }
        return jButtons;
    }
}
