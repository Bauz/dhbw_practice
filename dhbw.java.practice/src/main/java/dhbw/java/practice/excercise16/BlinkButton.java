package dhbw.java.practice.excercise16;

import javax.swing.*;

public class BlinkButton extends JButton {

    public static String tauschText = "Hoppala";
    public static String originalText;

    private Thread blinkThread;

    public BlinkButton(String text) {
        super(text);
        originalText = text;
        blinkThread = new Thread(new ButtonThread(this));
        blinkThread.start();
    }

}
