package dhbw.java.practice.excercise20_alt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutomatFrame extends JFrame {

    private ColorRunLabel lblLinks, lblMitte, lblRechts;
    private StartStopButton btnLinks, btnMitte, btnRechts;

    public AutomatFrame() {

        lblLinks = new ColorRunLabel(Color.red);
        lblMitte = new ColorRunLabel(Color.yellow);
        lblRechts = new ColorRunLabel(Color.green);

        btnLinks = new StartStopButton(Color.red);
        btnMitte = new StartStopButton(Color.yellow);
        btnRechts = new StartStopButton(Color.green);

        btnLinks.setActionCommand("links");
        btnMitte.setActionCommand("mitte");
        btnRechts.setActionCommand("rechts");

        btnLinks.addActionListener(new StartStopListener(btnLinks, lblLinks));
        btnMitte.addActionListener(new StartStopListener(btnMitte, lblMitte));
        btnRechts.addActionListener(new StartStopListener(btnRechts, lblRechts));

        this.setLayout(new GridLayout(2, 3));

        this.add(lblLinks);
        this.add(lblMitte);
        this.add(lblRechts);
        this.add(btnLinks);
        this.add(btnMitte);
        this.add(btnRechts);


        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AutomatFrame();
    }

    private class StartStopListener implements ActionListener {

        private StartStopButton pressedButton;
        private ColorRunLabel label;

        public StartStopListener(StartStopButton btn, ColorRunLabel lbl) {
            this.pressedButton = btn;
            this.label = lbl;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (pressedButton.isStart())
                label.start();
            else label.stop();
            pressedButton.switchText();
        }
    }
}
