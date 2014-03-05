package dhbw.java.practice.excercise2;

public class BuchstabenNummerierer extends Nummerierer{

	private char buchstabe = 64;
	
	@Override
	public void reset() {
		buchstabe = 64;
	}

	@Override
	public String nextItem() {
		++buchstabe;
		return "" + buchstabe;
	}

	@Override
	public boolean nextItemIsAvailable() {
		return buchstabe != 'Z';
	}

}
