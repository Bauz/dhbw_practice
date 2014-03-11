package dhbw.java.examples.exceptions;

public class Test {

	/**
	 * @param args
	 */
	public static void run(int a) {
		int erg;
		try {
			erg = 50 / a;
			System.out.println("erg = " + erg);
		} catch (Exception e) {
			System.out.println("Divisionsfehler : " + e);
		}
	}

	public String getInfo() {
		return "Info";
	}

}
