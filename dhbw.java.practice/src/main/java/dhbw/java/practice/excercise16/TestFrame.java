package dhbw.java.practice.excercise16;

import javax.swing.*;

public class TestFrame extends JFrame {

    public TestFrame() {

        this.add(new BlinkButton("Klausur"));

        this.setSize(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TestFrame();
    }

}
