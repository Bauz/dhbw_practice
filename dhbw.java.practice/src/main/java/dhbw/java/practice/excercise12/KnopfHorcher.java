package dhbw.java.practice.excercise12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JLabel;

public class KnopfHorcher implements ActionListener {
	private JLabel datumsAzeige;

	public KnopfHorcher(JLabel datumsAnzeige) {
		this.datumsAzeige = datumsAnzeige;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		datumsAzeige.setText(Zeitangabe.gewaehlt.format(new Date()));

	}
}
