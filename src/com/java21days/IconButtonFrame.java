package com.java21days;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class IconButtonFrame extends JFrame {
    Dimension d = new Dimension(700, 700);

    IconButtonFrame(String title, HashMap<String, String> buttons) {
        super(title);
        setSize(d);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
