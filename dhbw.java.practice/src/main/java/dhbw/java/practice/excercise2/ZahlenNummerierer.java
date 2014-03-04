package dhbw.java.practice.excercise2;

public class ZahlenNummerierer extends Nummerierer {

	private int nummer = 0;

	@Override
	public void reset() {
		nummer = 0;
	}

	@Override
	public String next() {
		nummer++;
		return "" + nummer;
	}

	@Override
	public boolean available() {
		if (nummer < 20) {
			return true;
		} else {
			return false;
		}
	}

}
