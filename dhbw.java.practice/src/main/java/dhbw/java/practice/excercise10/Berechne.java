package dhbw.java.practice.excercise10;

public class Berechne {

	public static void main(String[] args) {
		// zu wenige Argumente Abfangen
		if (args.length < 2) {
			System.out.println("Falscher Aufruf! Die korrekte Form lautet:\n"
					+ "java Berechne <Funktion> <Argument>");
			System.exit(0);
		}
		// nur die ersten 3 Zeichen der Eingabe speichern, da diese bereits
		// Eindeutig sind; außerdem alles in
		// kleinbuchstaben
		String funktionsName = args[0].toLowerCase().substring(0, 3);
		double wert = 0;
		try {
			wert = Double.parseDouble(args[1]);
		} catch (Exception e) {
			System.out.println(args[1] + " ist kein double-Wert!");
			System.exit(0);
		}
		switch (funktionsName) {
		case "sin":
			System.out.println("Ergebnis: " + Math.sin(wert));
			break;
		case "cos":
			System.out.println("Ergebnis: " + Math.cos(wert));
			break;
		case "tan":
			System.out.println("Ergebnis: " + Math.tan(wert));
			break;
		default:
			System.out.println(funktionsName + " ist keine erlaubte Funktion!");
		}
	}
}
