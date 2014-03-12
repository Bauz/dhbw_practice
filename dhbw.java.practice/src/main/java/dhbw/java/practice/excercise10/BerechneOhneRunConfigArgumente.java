package dhbw.java.practice.excercise10;

import java.util.Scanner;

public class BerechneOhneRunConfigArgumente {

	private static double argument;
	private static String function;

	public static void main(String[] args) {

		Boolean allIsValid = false;
		while (!allIsValid) {
			allIsValid = getArgumentAndCheckIfValid()
					&& getFunctionAndCheckIfValid();
		}

		if (function.toLowerCase().substring(0, 3).equals("sin")) {
			System.out.println("Ergebnis: " + Math.sin(argument));
		} else if (function.toLowerCase().substring(0, 3).equals("cos")) {
			System.out.println("Ergebnis: " + Math.cos(argument));
		} else if (function.toLowerCase().substring(0, 3).equals("tan")) {
			System.out.println("Ergebnis: " + Math.tan(argument));
		}
	}

	private static boolean getFunctionAndCheckIfValid() {
		Boolean doubleOk = false;
		Scanner inputString = new Scanner(System.in);
		System.out.println("Geben Sie eine Funktion ein: ");
		try {
			function = inputString.next();
			if (!function.toLowerCase().substring(0, 3).equals("sin")
					&& !function.toLowerCase().substring(0, 3).equals("cos")
					&& !function.toLowerCase().substring(0, 3).equals("tan")) {
				System.out.println("Keine gültige Funktion!");
				System.out.println("-------------------------------------");
				return false;
			}
			doubleOk = true;
		} catch (Exception e) {
			System.out.println("Keine gültige Funktion!");
			System.out.println("-------------------------------------");
		}
		return doubleOk;
	}

	private static Boolean getArgumentAndCheckIfValid() {
		Boolean doubleOk = false;
		Scanner inputDouble = new Scanner(System.in);
		System.out.println("Geben Sie ein Argument ein: ");
		try {
			argument = inputDouble.nextDouble();
			doubleOk = true;
		} catch (Exception e) {
			System.out.println("Kein gültiger Doublewert!");
			System.out.println("-------------------------------------");
		}
		return doubleOk;
	}
}
