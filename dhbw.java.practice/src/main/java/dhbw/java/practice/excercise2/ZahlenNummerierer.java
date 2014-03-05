package dhbw.java.practice.excercise2;

public class ZahlenNummerierer extends Nummerierer {

	private int nummer = 0;

	@Override
	public void reset() {
		nummer = 0;
	}

	@Override
	public String nextItem() {
		nummer++;
		return "" + nummer;
	}

	@Override
	public boolean nextItemIsAvailable() {
		return nummer < 20;
	}

}
