package dhbw.java.practice.excercise11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * User: Marc Date: 11.03.14 Time: 17:01
 */
public class SchwarzWeissFrame extends JFrame {

    private JButton button1;

    public SchwarzWeissFrame(int width, int height) {
        super();

        //neuen Button erzeugen und listener für Action (button geklickt) hinzugefügt
        button1 = new JButton("Drueck mich");
        button1.addActionListener(new ButtonBearbeiter());

        //button zum Frame hinzufügen
        this.add(button1, BorderLayout.NORTH);

        //mouse listener zum frame hinzufügen
        this.addMouseListener(new MausBearbeiter());

        //größe, titel u.ä. setzen und sichtbar machen
        this.setSize(width, height);
        this.setTitle("Schwarz oder Weiß?");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new SchwarzWeissFrame(250, 150);
    }


    //innere klasse für ActionEvents
    private class ButtonBearbeiter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //Quellkomponente des Events ermitteln, casten, hintergrundfarbe setzen
            ((JButton) e.getSource()).getParent().setBackground(Color.black);
        }
    }

    //innvere klasse für Maus Events
    private class MausBearbeiter implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            //Quellkomponente des Events ermitteln, casten, hintergrundfarbe setzen
            ((SchwarzWeissFrame) e.getSource()).getContentPane().setBackground(Color.WHITE);
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
}
