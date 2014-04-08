package dhbw.java.practice.excercise14;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Rechner extends JFrame {

	private JTextField textParameter1;
	private JTextField textParameter2;
	private JLabel lblOperator;
	private JTextField textSolution;
	private JLabel lblEquals;

	private void checkIfTextFieldsAreEmpty() {
		if (textParameter1.getText().isEmpty()) {
			textParameter1.setText("0");
		}
		if (textParameter2.getText().isEmpty()) {
			textParameter2.setText("0");
		}
	}

	public Rechner() {
		textParameter1 = new JTextField();
		lblOperator = new JLabel();
		textParameter2 = new JTextField();
		lblEquals = new JLabel();
		lblEquals.setText("=");
		textSolution = new JTextField();

		JButton btnAdd = new JButton();
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkIfTextFieldsAreEmpty();
				lblOperator.setText("+");
				textSolution.setText(""
						+ (Double.parseDouble(textParameter1.getText()) + Double
								.parseDouble(textParameter2.getText())));
			}
		});
		btnAdd.setText("Add");

		JButton btnSub = new JButton();
		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkIfTextFieldsAreEmpty();
				lblOperator.setText("-");
				textSolution.setText(""
						+ (Double.parseDouble(textParameter1.getText()) - Double
								.parseDouble(textParameter2.getText())));
			}
		});
		btnSub.setText("Sub");

		JButton btnMul = new JButton();
		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkIfTextFieldsAreEmpty();
				lblOperator.setText("*");
				textSolution.setText(""
						+ (Double.parseDouble(textParameter1.getText()) * Double
								.parseDouble(textParameter2.getText())));
			}
		});
		btnMul.setText("Mul");

		JButton btnDiv = new JButton();
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkIfTextFieldsAreEmpty();
				lblOperator.setText("/");
				if (textParameter2.getText().equals("0")) {
					textSolution.setText("Div durch 0");
				} else {
					textSolution.setText(""
							+ (Double.parseDouble(textParameter1.getText()) / Double
									.parseDouble(textParameter2.getText())));
				}
			}
		});
		btnDiv.setText("Div");

		JButton btnDeleteAll = new JButton();
		btnDeleteAll.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				checkIfTextFieldsAreEmpty();
				lblOperator.setText("");
				textSolution.setText("");
				textParameter1.setText("");
				textParameter2.setText("");
			}
		});
		btnDeleteAll.setText("Clear");

		this.setLayout(new GridLayout(2, 5));
		this.add(textParameter1);
		this.add(lblOperator);
		this.add(textParameter2);
		this.add(lblEquals);
		this.add(textSolution);
		this.add(btnAdd);
		this.add(btnSub);
		this.add(btnMul);
		this.add(btnDiv);
		this.add(btnDeleteAll);
		this.setSize(500, 100);
		this.setTitle("Calculator");
        this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Rechner();

	}

}
