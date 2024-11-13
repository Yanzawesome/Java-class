import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[9];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton, negButton;
    JPanel panel;

    Font font = new Font("Arial", Font.PLAIN, 50);

    String expression = ""; // To store the expression
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    public Calculator() {
        frame = new JFrame("FIRCalc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        // Set skull icon for the JFrame
        ImageIcon icon = new ImageIcon("skull icon.png"); // Load the skull image from the file
        frame.setIconImage(icon.getImage()); // Set the skull image as the icon

        // Text field with purple background and yellow text
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        textField.setEditable(false);
        textField.setBackground(new Color(110, 0, 110)); // Purple background
        textField.setForeground(Color.WHITE); // WHITE text

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("÷");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("←");
        clrButton = new JButton("Clr");
        negButton = new JButton("(-)");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;
        functionButtons[8] = negButton;

        for (int i = 0; i < 9; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(font);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setBackground(new Color(110, 0, 111)); // Purple background
            functionButtons[i].setForeground(Color.WHITE); // WHITE text
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setBackground(new Color(150, 0, 113)); // PINK background for number buttons
            numberButtons[i].setForeground(Color.WHITE); // WHITE text for number buttons
        }

        // Buttons for Del, Clr, Neg
        negButton.setBounds(50, 430, 100, 50);
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        // Panel with purple background
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(new Color(80, 0, 80)); // PURPLE GELAP SIKIT background PANEL

        // Add buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Add components to the frame
        frame.add(panel);
        frame.add(negButton);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                // Append the number to the expression
                expression += String.valueOf(i);
                textField.setText(expression); // Display the current expression
            }
        }
        if (e.getSource() == decButton) {
            expression += ".";
            textField.setText(expression);
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(expression);
            operator = '+';
            expression += " + ";
            textField.setText(expression);
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(expression);
            operator = '-';
            expression += " - ";
            textField.setText(expression);
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(expression);
            operator = 'x';
            expression += " x ";
            textField.setText(expression);
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(expression);
            operator = '÷';
            expression += " ÷ ";
            textField.setText(expression);
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText().split(" ")[2]); // Get second number
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case 'x':
                    result = num1 * num2;
                    break;
                case '÷':
                    result = num1 / num2;
                    break;
            }

            // Check if the result is a whole number
            if (result == (int) result) {
                // Display as an integer if the result is a whole number
                textField.setText(expression + " = " + (int) result);
            } else {
                // Display as a decimal if the result has a fraction
                textField.setText(expression + " = " + result);
            }
            num1 = result; // Store result for further calculations
        }
        if (e.getSource() == clrButton) {
            expression = ""; // Clear the expression
            textField.setText("");
        }
        if (e.getSource() == delButton) {
            // Remove the last character from the expression
            if (expression.length() > 0) {
                expression = expression.substring(0, expression.length() - 1);
                textField.setText(expression);
            }
        }
        if (e.getSource() == negButton) {
            if (expression.isEmpty()) {
                // Append negative symbol if the expression is empty
                expression = "-";
                textField.setText(expression);
            } else {
                double temp = Double.parseDouble(expression);
                temp *= -1;
                expression = String.valueOf(temp);
                textField.setText(expression);

                // Set skull icon for the JFrame
                ImageIcon icon = new ImageIcon("/mnt/data/skull icon.png"); // Load the skull image from the file path
                frame.setIconImage(icon.getImage()); // Set the skull image as the icon

            }
        }
    }
}
