package dhbw.java.examples.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class SimpleCalc extends JFrame {

    private JLabel lblOperand1, lblOperand2, lblResult;
    private JTextField tfOperand1, tfOperand2, tfResult;
    private JButton btnAddition, btnMultiplication;
    private SimpleCalcListener listener;


    public SimpleCalc() {

        lblOperand1 = new JLabel("Operand 1:");
        lblOperand2 = new JLabel("Operand 2:");
        lblResult = new JLabel("Result");

        tfOperand1 = new JTextField();
        tfOperand2 = new JTextField();
        tfResult = new JTextField();

        tfResult.setEditable(false);

        btnAddition = new JButton("+");
        btnMultiplication = new JButton("*");

        btnAddition.setActionCommand("addition");
        btnMultiplication.setActionCommand("multiplication");

        listener = new SimpleCalcListener();

        btnAddition.addActionListener(listener);
        btnMultiplication.addActionListener(listener);

        this.setLayout(new GridLayout(4, 2));

        this.add(lblOperand1);
        this.add(tfOperand1);
        this.add(lblOperand2);
        this.add(tfOperand2);
        this.add(lblResult);
        this.add(tfResult);
        this.add(btnAddition);
        this.add(btnMultiplication);

        this.setTitle("Simple Calculator");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        new SimpleCalc();
    }

    private class SimpleCalcListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                switch(e.getActionCommand()) {
                    case "addition":
                        tfResult.setText(String.valueOf(Double.parseDouble(tfOperand1.getText()) + Double.parseDouble
                                                                                                                  (tfOperand2.getText())));
                        break;
                    case "multiplication":
                        tfResult.setText(String.valueOf(Double.parseDouble(tfOperand1.getText()) * Double.parseDouble
                                                                                                                  (tfOperand2.getText())));
                        break;
                    default:
                        break;
                }
            } catch(Exception exc) {
                tfResult.setText("Error");
            }
        }
    }
}
