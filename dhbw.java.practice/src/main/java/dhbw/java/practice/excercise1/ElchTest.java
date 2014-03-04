package dhbw.java.practice.excercise1;

public class ElchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AKlasse aKlasse = new AKlasse();
		System.out.println("aKlasse mit Tempo " + aKlasse.t + " bzw. "
				+ aKlasse.tempo());

		CKlasse cKlasse = new CKlasse();
		System.out.println("cKlasse mit Tempo " + cKlasse.t + " bzw. "
				+ cKlasse.tempo());

		AKlasse x = cKlasse;
		System.out.println("x mit Tempo " + x.t + " bzw. " + x.tempo());

	}

}
