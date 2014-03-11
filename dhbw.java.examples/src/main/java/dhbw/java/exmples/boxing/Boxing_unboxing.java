package dhbw.java.exmples.boxing;

public class Boxing_unboxing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer x = new Integer(5); // Boxing
		Integer x2 = Integer.valueOf(5); // Boxing
		Boolean b = Boolean.valueOf(true); // Boxing

		int i = x.intValue(); // Unboxing
		boolean b2 = b.booleanValue(); // Unboxing

	}

}
