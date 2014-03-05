package dhbw.java.practice.excercise2;

import javax.swing.JOptionPane;


public class NummeriererTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Polymorphismus:
		// Nummerierer zNummerierer = new ZahlenNummerierer();
		// Nummerierer bNummerierer = new BuchstabenNummerierer();

		int action = JOptionPane.showOptionDialog(null, "Waehlen Sie:",
				"OptionDialog",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Buchstaben", "Zahlen" }, "Buchstaben");

		if (action == 0) {
			Schilder.beschriften(new BuchstabenNummerierer());
		} else if (action == 1) {
			Schilder.beschriften(new ZahlenNummerierer());
		}
	}

}
