package dhbw.java.examples.exceptions;

public class MainClassTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Test2 t2 = new Test2();
		try {
			t2.run(0);
		} catch (MyException e) {
			System.out.println(".....");
			System.out.println(e.getMessage());
		}

	}

}
