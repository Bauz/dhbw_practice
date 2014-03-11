package dhbw.java.practice.excercise5;

//import Prog1Tools.IOTools;

public class KontostandTest {
	public static void main(String[] args) {
		//Zahl z1 = new Kontostand(IOTools.readDouble("Kontostand 1 eingeben: "));
		//Zahl z2 = new Kontostand(IOTools.readDouble("Kontostand 2 eingeben: "));
		Zahl z1 = new Kontostand(5);
		Zahl z2 = new Kontostand(6);

		ZahlTest.operationenMenue(z1, z2);
	}
}
