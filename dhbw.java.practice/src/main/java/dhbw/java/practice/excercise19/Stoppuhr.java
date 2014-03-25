package dhbw.java.practice.excercise19;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stoppuhr implements Runnable {

    private static Date start, stop;
    private static Scanner scan;
    private static Thread t;
    private static boolean running;

    public static void main(String[] args) {
        System.out.print("Stoppuhr starten mit Eingabetaste!");
        scan = new Scanner(System.in);
        scan.nextLine();
        start = new Date();
        System.out.println("Startzeitpunkt: " + start);
        System.out.println("Stoppuhr anhalten mit Eingabetaste!");
        t = new Thread(new Stoppuhr());
        running = true;
        t.start();
        scan.nextLine();
        stop = new Date();
        running = false;
        System.out.println("Stoppzeitpunkt: " + stop);
        System.out.println("Gesamtlaufzeit: " + (stop.getTime() - start.getTime()) + " ms");
    }

    @Override
    public void run() {
        while (running) {
            System.out.print("\r" + new SimpleDateFormat("HH:mm:ss").format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
