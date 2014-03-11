package dhbw.java.examples.exceptions;

public class Test2 {

	/**
	 * @param args
	 */
	public int run(int a) throws MyException {
		int erg;
		if (a != 0) {
			erg = 50 / a;
			System.out.println("erg = " + erg);
			return erg;
		} else {
			throw new MyException("Fehler: Teilen durch 0 ist nicht erlaubt.");
		}
	}

	public String getInfo() {
		return "Info";
	}

}
