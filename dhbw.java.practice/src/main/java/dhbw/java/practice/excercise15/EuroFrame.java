package dhbw.java.practice.excercise15;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EuroFrame extends JFrame {

    JTextField tfEuro, tfWaehrung;
    JComboBox cbWaehrungAuswahl;
    JLabel lblEuro;
    Handler eventHandler;
    ArrayList waehrungsNamen;

    public EuroFrame() {
        waehrungsNamen = new ArrayList();
        lblEuro = new JLabel("Euro");
        tfEuro = new JTextField();
        tfWaehrung = new JTextField();

        for (int i = 0; i < 12; i++)
            waehrungsNamen.add(EuroConverter.getBezeichnung(i));

        cbWaehrungAuswahl = new JComboBox(waehrungsNamen.toArray());
        eventHandler = new Handler(this);

        tfEuro.setName("Euro");
        tfWaehrung.setName("Waehrung");

        tfEuro.addKeyListener(eventHandler);
        tfWaehrung.addKeyListener(eventHandler);
        cbWaehrungAuswahl.addItemListener(eventHandler);

        this.setLayout(new GridLayout(4, 1));

        this.add(lblEuro);
        this.add(tfEuro);
        this.add(cbWaehrungAuswahl);
        this.add(tfWaehrung);

        this.setSize(200, 130);
        this.setTitle("EuroFrame");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new EuroFrame();
    }
}
