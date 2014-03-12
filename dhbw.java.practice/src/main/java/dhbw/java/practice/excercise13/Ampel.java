package dhbw.java.practice.excercise13;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ampel extends JFrame {

	private ButtonGroup btngroup;
	private JRadioButton radioRot, radioGelb, radioGruen;
	private JButton btnRot, btnGelb, btnGruen;
	private AmpelListener ampelListener;

	public Ampel() {
		ampelListener = new AmpelListener();

		radioRot = new JRadioButton("Rot");
		radioGelb = new JRadioButton("Gelb");
		radioGruen = new JRadioButton("Grün");

		btnGelb = new JButton();
		btnGruen = new JButton();
		btnRot = new JButton();

		radioRot.setSelected(true);

		btngroup = new ButtonGroup();
		btngroup.add(radioGelb);
		btngroup.add(radioGruen);
		btngroup.add(radioRot);

		btnRot.setBackground(Color.red);
		btnGelb.setBackground(Color.black);
		btnGruen.setBackground(Color.black);

		btnRot.setActionCommand("rot");
		btnGelb.setActionCommand("gelb");
		btnGruen.setActionCommand("gruen");

		btnRot.addActionListener(ampelListener);
		btnGelb.addActionListener(ampelListener);
		btnGruen.addActionListener(ampelListener);

		radioRot.addChangeListener(ampelListener);
		radioGelb.addChangeListener(ampelListener);
		radioGruen.addChangeListener(ampelListener);

		this.add(radioRot);
		this.add(btnRot);
		this.add(radioGelb);
		this.add(btnGelb);
		this.add(radioGruen);
		this.add(btnGruen);

		GridLayout grid = new GridLayout(3, 2);
		this.setLayout(grid);

		this.setSize(200, 200);
		this.setTitle("Ampel");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Ampel();
	}

	private class AmpelListener implements ActionListener, ChangeListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			switch (e.getActionCommand()) {
			case "rot":
				btnRot.setBackground(Color.red);
				btnGelb.setBackground(Color.black);
				btnGruen.setBackground(Color.black);
				radioRot.setSelected(true);
				break;
			case "gelb":
				btnRot.setBackground(Color.black);
				btnGelb.setBackground(Color.yellow);
				btnGruen.setBackground(Color.black);
				radioGelb.setSelected(true);
				break;
			case "gruen":
				btnRot.setBackground(Color.black);
				btnGelb.setBackground(Color.black);
				btnGruen.setBackground(Color.green);
				radioGruen.setSelected(true);
				break;
			}

		}

		@Override
		public void stateChanged(ChangeEvent e) {
			if (radioRot.isSelected()) {
				btnRot.setBackground(Color.red);
				btnGelb.setBackground(Color.black);
				btnGruen.setBackground(Color.black);
				radioRot.setSelected(true);
			} else if (radioGelb.isSelected()) {
				btnRot.setBackground(Color.black);
				btnGelb.setBackground(Color.yellow);
				btnGruen.setBackground(Color.black);
				radioGelb.setSelected(true);
			} else if (radioGruen.isSelected()) {
				btnRot.setBackground(Color.black);
				btnGelb.setBackground(Color.black);
				btnGruen.setBackground(Color.green);
				radioGruen.setSelected(true);
			}

		}
	}
}
