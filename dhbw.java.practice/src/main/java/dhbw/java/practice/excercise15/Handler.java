package dhbw.java.practice.excercise15;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Handler implements KeyListener, ItemListener {

    private EuroFrame frame;

    public Handler(EuroFrame euroFrame) {
        this.frame = euroFrame;

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            JTextField textField = (JTextField) e.getComponent();
            switch (textField.getName()) {
                case "Euro":
                    convertFromEuro();
                    break;
                case "Waehrung":
                    convertToEuro();
                default:
                    ;
            }
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        convertFromEuro();
    }

    private void convertFromEuro() {
        try {
            int kennung = frame.cbWaehrungAuswahl.getSelectedIndex();
            double euroWert = Double.parseDouble(frame.tfEuro.getText());
            frame.tfWaehrung.setText(String.valueOf(EuroConverter.convertFromEuro(euroWert, kennung)));
        } catch (Exception e) {

        }
    }

    private void convertToEuro() {
        try {
            int kennung = frame.cbWaehrungAuswahl.getSelectedIndex();
            double waehrungWert = Double.parseDouble(frame.tfWaehrung.getText());
            frame.tfEuro.setText(String.valueOf(EuroConverter.convertToEuro(waehrungWert, kennung)));
        } catch (Exception e) {

        }
    }
}
