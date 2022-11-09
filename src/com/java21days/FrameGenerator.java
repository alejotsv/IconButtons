package com.java21days;

import javax.swing.*;
import java.util.HashMap;

public class FrameGenerator {
    public static void main(String[] args) {
        String title = "Select your option";
        HashMap<String, String> buttons = new HashMap();

        IconButtonFrame buttonFrame = new IconButtonFrame(title, buttons);
    }
}
