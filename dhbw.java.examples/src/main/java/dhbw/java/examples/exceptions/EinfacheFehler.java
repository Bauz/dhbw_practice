package dhbw.java.examples.exceptions;

import java.util.Scanner;

public class EinfacheFehler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int z = 5;
		Scanner input = new Scanner(System.in);
		System.out.println("Zahl eingeben: ");

		int x = input.nextInt();
		System.out.println("Zahl 2 eingeben: ");
		int y = input.nextInt();

		z = x / y;
		System.out.println(z);

	}

}
