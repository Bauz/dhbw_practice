package dhbw.java.practice.excercise8;

import java.util.Scanner;

public class Verzinsung {

    private static double zinssatz = 5.3;
    private static double[] werte;

    public static void verzinsen(double[] v, double z) throws AmountException {
        for (int i = 0; i < v.length; i++) {
            if (v[i] > 1000000) throw new AmountException("Der " + (i + 1) + ". Geldanlage-Betrag");
            v[i] = v[i] + (v[i] * z / 100);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        werte = new double[3];
        for (int i = 0; i < werte.length; i++) {
            System.out.println("Den " + (i + 1) + ". Geldbetrag eingeben:");
            werte[i] = scan.nextDouble();
        }
        try {
            verzinsen(werte, zinssatz);
            System.out.println("Alle Geldanlage-Betraege mit 5.3 Prozent verzinst!");
        } catch (AmountException e) {
            System.out.println(e.getMessage() + " ist zu hoch!");
            System.out.println("Verzinsung abgebrochen!");
        }
        System.out.println("Geldanlage-Betraege jetzt:");
        for (double i : werte)
            System.out.println(i);
    }

}
