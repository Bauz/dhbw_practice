package dhbw.java.practice.excercise5;

public class Kontostand extends Zahl {

	private double wert;

	public Kontostand(double wert) {
		super();
		this.wert = wert;
	}

	@Override
	public Zahl neg() {
		return new Kontostand(wert * -1);
	}

	@Override
	public Zahl add(Zahl zahl) {
		Kontostand kontostand = (Kontostand) zahl;
		return new Kontostand((wert + kontostand.wert));
	}

	@Override
	public String toString() {
		return "" + wert;
	}

	@Override
	public boolean equals(Object obj) {
		Kontostand kontostand = (Kontostand) obj;
		return (wert == kontostand.wert);
	}

}
