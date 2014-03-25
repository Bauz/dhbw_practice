package dhbw.java.practice.excercise20_alt;

import javax.swing.*;
import java.awt.*;

public class StartStopButton extends JButton {

    public StartStopButton(Color bgColor) {
        super();
        this.setFont(new Font("Arial", 0, 25));
        this.setBackground(bgColor);
        this.setText("START");
        this.setHorizontalAlignment(JButton.CENTER);
        this.setVerticalAlignment(JButton.CENTER);
    }

    public boolean isStart() {
        return this.getText().equalsIgnoreCase("Start");
    }

    public void switchText() {
        this.setText(isStart() ? "STOP" : "START");
    }
}
