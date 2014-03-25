package dhbw.java.pratice.excercise20;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AutomatFrame extends JFrame {

	public AutomatFrame() {

		this.setLayout(new GridLayout(2, 3));
		this.setSize(400, 200);

		final ColorRunLabel label1 = new ColorRunLabel(Color.BLUE);
		ColorRunLabel label2 = new ColorRunLabel(Color.GRAY);
		ColorRunLabel label3 = new ColorRunLabel(Color.GREEN);

		final StartStopButton btn1 = new StartStopButton(Color.BLUE);
		btn1.addActionListener(new Listeners(btn1, label1));
		StartStopButton btn2 = new StartStopButton(Color.GRAY);
		btn2.addActionListener(new Listeners(btn2, label2));
		StartStopButton btn3 = new StartStopButton(Color.GREEN);
		btn3.addActionListener(new Listeners(btn3, label3));

		this.add(label1);
		this.add(label2);
		this.add(label3);
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);

		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new AutomatFrame();

	}
	
	public class Listeners implements ActionListener {

		private StartStopButton btn;
		private ColorRunLabel lbl;

		public Listeners(StartStopButton btn, ColorRunLabel lbl) {
			this.btn = btn;
			this.lbl = lbl;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (btn.isStart()) {
				lbl.start();
				btn.switchText();
			} else {
				lbl.stop();
				btn.switchText();
			}

		}

	}
	

}
