package dhbw.java.practice.excercise2;

public class ZahlenNummerierer extends Nummerierer {

	private int Nummer = 0;

	@Override
	public void reset() {
		Nummer = 0;
	}

	@Override
	public String next() {
		Nummer++;
		return "" + Nummer;
	}

	@Override
	public boolean available() {
		if (Nummer < 20) {
			return true;
		} else {
			return false;
		}
	}

}
