package com.java21days;

import java.util.ArrayList;
import java.util.Arrays;

public class FrameGenerator {
    public static void main(String[] args) {
        String title = "Select your option";
        ArrayList<String> buttons = new ArrayList<>(Arrays.asList("download.png", "upload.png", "delete.png", "cancel.png"));

        IconButtonFrame buttonFrame = new IconButtonFrame(title, buttons);
    }
}
