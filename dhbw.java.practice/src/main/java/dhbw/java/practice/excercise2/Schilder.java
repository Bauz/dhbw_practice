package dhbw.java.practice.excercise2;

public class Schilder {

	public static void beschriften(Nummerierer n) {
		for (int i = 1; i <= 5; i++)
			System.out.println("Naechste Beschriftung: " + n.nextItem());

		n.reset();

		while (n.nextItemIsAvailable())
			System.out.println("Naechste Beschriftung: " + n.nextItem());
	}

}
