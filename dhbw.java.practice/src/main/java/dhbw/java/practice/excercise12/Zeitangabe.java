package dhbw.java.practice.excercise12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zeitangabe extends JFrame {
    private JLabel beschriftung, datumsAnzeige;
    private JComboBox formatAuswahl;

    private Date datum;
    private JButton aktualisierung;
    private final SimpleDateFormat kurz = new SimpleDateFormat("E, d.MMMM, H:mm");
    private final SimpleDateFormat mittel = new SimpleDateFormat("d.MM, H:mm:ss");
    private final SimpleDateFormat lang = new SimpleDateFormat("d.M.yy (H:mm)");
    public static SimpleDateFormat gewaehlt;
    String[] comboBoxItems = {"Tag, Datum und Uhrzeit", "Datum und Uhrzeit mit Sekunden", "Datum mit Jahr und Uhrzeit"};

    public Zeitangabe() {

        gewaehlt = lang;
        datum = new Date();
        formatAuswahl = new JComboBox(comboBoxItems);
        beschriftung = new JLabel("Datum und Uhrzeit:");
        datumsAnzeige = new JLabel();
        aktualisierung = new JButton("Anzeige aktualisieren");

        datumsAnzeige.setText(kurz.format(datum));

        formatAuswahl.addItemListener(new AnzeigeListener());
        aktualisierung.addActionListener(new KnopfHorcher(datumsAnzeige));

        this.add(formatAuswahl, BorderLayout.NORTH);
        this.add(beschriftung, BorderLayout.WEST);
        this.add(datumsAnzeige, BorderLayout.EAST);
        this.add(aktualisierung, BorderLayout.SOUTH);

        this.setSize(255, 132);
        this.setTitle("Zeitangabe");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new Zeitangabe();
    }

    private class AnzeigeListener implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            switch ((String) e.getItem()) {
                case "Datum und Uhrzeit mit Sekunden":
                    datumsAnzeige.setText(mittel.format(datum));
                    gewaehlt = mittel;
                    break;
                case "Datum mit Jahr und Uhrzeit":
                    datumsAnzeige.setText(lang.format(datum));
                    gewaehlt = lang;
                    break;
                case "Tag, Datum und Uhrzeit":
                default:
                    datumsAnzeige.setText(kurz.format(datum));
                    gewaehlt = kurz;
                    break;

            }
        }
    }
}
