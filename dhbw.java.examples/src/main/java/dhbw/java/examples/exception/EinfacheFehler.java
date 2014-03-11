package dhbw.java.examples.exception;

import java.util.Scanner;

public class EinfacheFehler {
    public static void main(String[] args) {
        int z=5;
        Scanner input = new Scanner(System.in);
        System.out.println("Zahl 1 eingeben:");
        int x=input.nextInt();
        System.out.println("Zahl 2 eingeben:");
        int y=input.nextInt();
        z=x/y;
        System.out.println(z);
    }
}
