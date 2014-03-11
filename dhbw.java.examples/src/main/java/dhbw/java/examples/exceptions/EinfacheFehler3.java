package dhbw.java.examples.exceptions;

public class EinfacheFehler3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = null;
		try {
			if (str.equals("Hallo")) {
				System.out.println("Hallo");
			} else {
				System.out.println(".......");
			}
		} catch (Exception e) {
			System.out.println("String ist null: " + e);
		}

	}

}
