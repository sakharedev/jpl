package AWT;

import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    Frame f = new Frame();
    Label firstNumber = new Label("First Number");
    Label secondNumber = new Label("Second Number");
    Label resultNumber = new Label("Result");
    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();
    Button add = new Button("Add");
    Button sub = new Button("Substract");
    Button mul = new Button("Multiply");
    Button div = new Button("Division");
    Button cancel = new Button("Cancel");

    Calculator() {
        int windowWidth = 1820;
        int windowHeight = 1100;

        int snippetWidth = 400;
        int snippetHeight = 300;

        int snippetX = (windowWidth - snippetWidth) / 2;
        int snippetY = (windowHeight - snippetHeight) / 2;

        firstNumber.setBounds(snippetX + 50, snippetY + 100, 200, 20); //(x ,y, width, height)
        secondNumber.setBounds(snippetX + 50, snippetY + 140, 200, 20);
        resultNumber.setBounds(snippetX + 50, snippetY + 180, 200, 20);
        t1.setBounds(snippetX + 300, snippetY + 100, 100, 20);
        t2.setBounds(snippetX + 300, snippetY + 140, 100, 20);
        t3.setBounds(snippetX + 300, snippetY + 180, 100, 20);
        add.setBounds(snippetX + 50, snippetY + 250, 100, 30); // Increase button size
        sub.setBounds(snippetX + 160, snippetY + 250, 100, 30); // Increase button size
        mul.setBounds(snippetX + 270, snippetY + 250, 100, 30); // Increase button size
        div.setBounds(snippetX + 380, snippetY + 250, 100, 30); // Increase button size
        cancel.setBounds(snippetX + 490, snippetY + 250, 100, 30); // Increase button size

        Font labelFont = new Font("Arial", Font.PLAIN, 15); // Increase font size
        firstNumber.setFont(labelFont);
        secondNumber.setFont(labelFont);
        resultNumber.setFont(labelFont);

        Font buttonFont = new Font("Arial", Font.PLAIN, 16); // Increase font size
        add.setFont(buttonFont);
        sub.setFont(buttonFont);
        mul.setFont(buttonFont);
        div.setFont(buttonFont);
        cancel.setFont(buttonFont);

        f.add(firstNumber);
        f.add(secondNumber);
        f.add(resultNumber);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(cancel);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        cancel.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(windowWidth, windowHeight);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        if (e.getSource() == add) {
            t3.setText(String.valueOf(n1+n2));
        }
        if (e.getSource() == sub) {
            t3.setText(String.valueOf(n1-n2));
        }
        if (e.getSource() == mul) {
            t3.setText(String.valueOf(n1*n2));
        }
        if (e.getSource() == div) {
            t3.setText(String.valueOf((float)n1/n2));
        }
        if (e.getSource() == cancel) {
            System.exit(0);
        }
    }
}

public class Code {
    public static void main(String[] args) {
        new Calculator();
    }
}
