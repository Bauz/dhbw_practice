package dhbw.java.practice.algorithms.excercise12;

import java.util.Scanner;

public class TestArztPraxis {

	public static void main(String[] args) {
		FCFSListe liste = new FCFSListe();
		int wahl = 1;
		while (wahl != 0) {
			System.out
					.println("Mögliche Optionen: Patient aufnehmen (1), Patient drannehmen (2), Programmende (0)");
			Scanner scanner = new Scanner(System.in);
			wahl = scanner.nextInt();
			if (wahl == 1) {
				System.out.println("Patienten-Aufnahme:");
				System.out.println("Name: ");
				String name = scanner.next();
				System.out.println("Geburtsjahr: ");
				int gj = scanner.nextInt();
				ZPatient patient = new ZPatient(name,gj);
				liste.anmelden(patient);
			} else if (wahl == 2) {
				System.out.println("Patienten drannehmen:");
				System.out.println("es kommt dran: "
						+ checkPatient(liste));
			}
		}
	}

	private static String checkPatient(FCFSListe liste) {
		String patient = "kein Patient im Wartezimmer!";
		try {
			patient = liste.derNaechsteBitte().toString();
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return patient;
	}

}
