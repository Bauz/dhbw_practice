package dhbw.java.practice.excercise2;

public class BuchstabenNummerierer extends Nummerierer{

	private char buchstabe = 64;
	
	@Override
	public void reset() {
		buchstabe = 64;
	}

	@Override
	public String next() {
		++buchstabe;
		return "" + buchstabe;
	}

	@Override
	public boolean available() {
		if (buchstabe != 'Z') {
			return true;
		} else {
			return false;
		}
	}

}
