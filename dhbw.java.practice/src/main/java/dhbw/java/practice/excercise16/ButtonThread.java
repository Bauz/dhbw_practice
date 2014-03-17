package dhbw.java.practice.excercise16;

import javax.swing.*;

public class ButtonThread implements Runnable {
    private JButton button;

    public ButtonThread(BlinkButton blinkButton) {
        this.button = blinkButton;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(1000);
                button.setText(button.getText().equals(BlinkButton.originalText) ? BlinkButton.tauschText : BlinkButton.originalText);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
