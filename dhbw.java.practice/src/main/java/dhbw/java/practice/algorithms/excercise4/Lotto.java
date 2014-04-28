package dhbw.java.practice.algorithms.excercise4;

public class Lotto {

	public long produkt = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(iterativeBerechnung(4, 2));
		System.out.println(rekursiveBerechnung(4, 2));
	}

	private static long iterativeBerechnung(int m, int k) {

		if (m >= k && k >= 0) {
			long wert = 1;
			for (int i = 1; i <= k; i++) {
				wert = wert * (m - i + 1) / i;
			}
			return wert;
		}
		return 0;
	}

	private static double rekursiveBerechnung(double m, double k) {

		if (k == 0) {
			return 1;
		} else if (k == 1) {
			return m;
		} else {
			return rekursiveBerechnung(m, k - 1) * ((m - k + 1) / k);
		}
	}

}
