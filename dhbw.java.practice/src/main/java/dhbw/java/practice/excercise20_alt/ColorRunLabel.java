package dhbw.java.practice.excercise20_alt;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ColorRunLabel extends JLabel implements Runnable {

    public boolean flagRunning;

    public ColorRunLabel(Color bgColor) {
        super();

        this.setBackground(bgColor);
        this.setOpaque(true);
        this.setFont(new java.awt.Font("Arial", Font.BOLD, 50));
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
    }

    public void start() {
        new Thread(this).start();
        flagRunning = true;
    }

    public void stop() {
        flagRunning = false;
    }

    @Override
    public void run() {
        while (flagRunning)
            this.setText(String.valueOf(new Random().nextInt(10)));
    }
}
