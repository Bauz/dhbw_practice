package dhbw.java.pratice.excercise20;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class ColorRunLabel extends JLabel implements Runnable {

	private boolean flag = false;

	public ColorRunLabel(Color color) {
		this.setBackground(color);
		this.setFont(new Font("Arial", Font.BOLD, 50));
		this.setHorizontalAlignment(CENTER);
		this.setOpaque(true);
	}

	@Override
	public void run() {
		while (flag) {
			this.setText("" + ((int) (Math.random() * 9)));
		}
	}

	public void start() {
		Thread t = new Thread(this);
		t.start();
		flag = true;
	}

	public void stop() {
		flag = false;
	}

}
