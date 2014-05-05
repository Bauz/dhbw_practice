package dhbw.java.practice.algorithms.excercise13;

public class TestMain {

    public static void main(String[] args) {
        FeldStapel testfeld = new FeldStapel();
        KettenStapel testkette = new KettenStapel();

        for (int i = 0; i < 10; i++) {
            testfeld.push(new Integer(i));
            testkette.push(new Integer(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Feld: " + (Integer) testfeld.pop());
            System.out.println("Kette: " + (Integer) testkette.pop());
        }
    }
}

