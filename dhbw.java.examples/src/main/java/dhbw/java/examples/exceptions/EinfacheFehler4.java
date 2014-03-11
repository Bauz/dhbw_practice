package dhbw.java.examples.exceptions;

import java.util.Scanner;

public class EinfacheFehler4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 0;
		int erg;

		Scanner input = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");

		String str = input.next();
		int zahl;
		try {
			zahl = Integer.parseInt(str);
			try {
				erg = zahl / i;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Fehler: " + e);
			}
		} catch (NumberFormatException e) {
			System.out.println("Fehler: " + e);
		}


	}

}
