package dhbw.java.practice.excercise2;

public class Schilder {

	public static void beschriften(Nummerierer n) {
		for (int i = 1; i <= 5; i++)
			System.out.println("Naechste Beschriftung: " + n.next());

		n.reset();

		while (n.available())
			System.out.println("Naechste Beschriftung: " + n.next());
	}

}
