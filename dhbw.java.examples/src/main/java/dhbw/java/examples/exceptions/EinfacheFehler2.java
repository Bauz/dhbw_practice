package dhbw.java.examples.exceptions;

import java.util.Scanner;

public class EinfacheFehler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");

		String str = input.next();

		int Zahl;
		try {
			Zahl = Integer.parseInt(str);
			System.out.println(Zahl * 30);
		} catch (NumberFormatException e) {
			System.out.println("Falsches Format: " + e
					+ " . Zahl muss vom Typ int sein!");

		}


	}

}
