package dhbw.java.practice.excercise2;

import javax.swing.JOptionPane;


public class NummeriererTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		final ZahlenNummerierer zNummerierer = new ZahlenNummerierer();
		final BuchstabenNummerierer bNummerierer = new BuchstabenNummerierer();
		
		JOptionPane option = new JOptionPane("Nummerierer Test");

		int action = JOptionPane.showOptionDialog(null, "Wählen Sie:",
				"OptionDialog",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, new String[] { "Buchstaben", "Zahlen" }, "Buchstaben");

		if (action == 0) {
			Schilder.beschriften(bNummerierer);
		} else if (action == 1) {
			Schilder.beschriften(zNummerierer);
		}
	}

}
