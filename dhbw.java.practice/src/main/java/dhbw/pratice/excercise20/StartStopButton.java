package dhbw.pratice.excercise20;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class StartStopButton extends JButton {

	public StartStopButton(Color color) {

		this.setBackground(color);
		this.setFont(new Font("Arial", Font.PLAIN, 25));
		this.setHorizontalTextPosition(CENTER);
		this.setText("START");
	}

	public boolean isStart() {
		return this.getText().equals("START");
	}

	public void switchText() {
		if (this.getText().equals("START")) {
			this.setText("STOP");
		} else {
			this.setText("START");
		}
	}

}
