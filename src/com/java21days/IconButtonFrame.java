package com.java21days;

import javax.swing.*;
import java.util.HashMap;

public class IconButtonFrame extends JFrame {
    IconButtonFrame(String title, HashMap<String, String> buttons) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
