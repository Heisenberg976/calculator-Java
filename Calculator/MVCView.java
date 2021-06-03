package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVCView {
    private final JFrame frame;
    private FireListener listener;
    private JPanel textPanel;
    private JTextField textField;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, dot, equals, plus, minus, multiply, divide, delete, percent, bracketLeft, bracketRight, squareRoot, squared, cubeRoot, cubed;
    private  String  mode;

    public MVCView() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 600);
        frame.setResizable(false);

    }

    public void setListener(FireListener listener) {
        this.listener = listener;
    }

    public void doubleToint() {
        String text = textField.getText();
        if (text.length() > 2 && text.substring(text.length() - 2, text.length()).equals(".0")) {
            textField.setText(text.substring(0, text.length() - 2));
        }
    }
    public void setUpPanels() {
        textPanel = new JPanel();
        textField = new JTextField();

        textField.setPreferredSize(new Dimension(380, 100));
        textField.setFont(new Font("Tahoma", Font.BOLD, 30));
        textField.setHorizontalAlignment(JTextField.RIGHT);

        textPanel.add(textField);

        frame.add(textPanel, BorderLayout.NORTH);
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 4));
        one = new JButton("1");
        one.addActionListener(e -> {
            listener.Fireone(textField);
            one.setFocusPainted(false);
        });
        two = new JButton("2");
        two.addActionListener(e -> {
            listener.Firetwo(textField);
            two.setFocusPainted(false);
        });
        three = new JButton("3");
        three.addActionListener(e -> {
            listener.FireThree(textField);
            three.setFocusPainted(false);
        });
        four = new JButton("4");
        four.addActionListener(e -> {
            listener.FireFour(textField);
            four.setFocusPainted(false);
        });
        five = new JButton("5");
        five.addActionListener(e -> {
            listener.FireFive(textField);
            five.setFocusPainted(false);
        });
        six = new JButton("6");
        six.addActionListener(e -> {
            listener.FireSix(textField);
            six.setFocusPainted(false);
        });
        seven = new JButton("7");
        seven.addActionListener(e -> {
            listener.FireSeven(textField);
            seven.setFocusPainted(false);
        });
        eight = new JButton("8");
        eight.addActionListener(e -> {
            listener.FireEight(textField);
            eight.setFocusPainted(false);
        });
        nine = new JButton("9");
        nine.addActionListener(e -> {
            listener.FireNine(textField);
            nine.setFocusPainted(false);
        });
        dot = new JButton(".");
        dot.addActionListener(e -> {
            listener.addDot(textField);
            dot.setFocusPainted(false);
        });
        zero = new JButton("0");
        zero.addActionListener(e -> {
            listener.FireZero(textField);
            zero.setFocusPainted(false);
        });

        equals = new JButton("=");
        equals.addActionListener(e -> {
            listener.addEquals(textField);
            equals.setFocusPainted(false);
            doubleToint();

        });
        plus = new JButton("+");
        plus.addActionListener(e -> {
            listener.FireaddPlus(textField);
            plus.setFocusPainted(false);
        });
        minus = new JButton("-");
        minus.addActionListener(e -> {
            listener.FireaddMinus(textField);
            minus.setFocusPainted(false);
        });
        multiply = new JButton("*");
        multiply.addActionListener(e -> {
            listener.FireaddMuliply(textField);
            multiply.setFocusPainted(false);
        });
        delete = new JButton("Del");
        delete.addActionListener(e -> {
            listener.FireRemove(textField);
            delete.setFocusPainted(false);
        });
        percent = new JButton("AC");
        percent.addActionListener(e -> {
            listener.FireClearAll(textField);
            percent.setFocusPainted(false);
        });
        bracketLeft = new JButton("Dark");
        bracketLeft.addActionListener(e -> {
           if (mode.equals("white")){
               darkMode();
           }
           else  whiteMode();
            bracketLeft.setFocusPainted(false);
        });
        bracketRight = new JButton("x^2+");
        bracketRight.addActionListener(e -> {
            listener.Firequadratic();
            bracketRight.setFocusPainted(false);
        });
        divide = new JButton("/");
        divide.addActionListener(e -> {
            listener.FireaddDivide(textField);
            divide.setFocusPainted(false);
        });

        squared = new JButton("x^2");
        squared.addActionListener(e -> {
            listener.FireSquared(textField);
            squared.setFocusPainted(false);
            doubleToint();

        });
        squareRoot = new JButton("√x");
        squareRoot.addActionListener(e -> {
            listener.Firesqrt(textField);
            squareRoot.setFocusPainted(false);
            doubleToint();
        });
        cubed = new JButton("x^3");
        cubed.addActionListener(e -> {
            listener.FireCubed(textField);
            cubed.setFocusPainted(false);
            doubleToint();
        });
        cubeRoot = new JButton("3√x");
        cubeRoot.addActionListener(e -> {
            listener.Firecbrt(textField);
            cubeRoot.setFocusPainted(false);
            doubleToint();

        });

        mainPanel.add(squared);
        mainPanel.add(squareRoot);
        mainPanel.add(cubed);
        mainPanel.add(cubeRoot);

        mainPanel.add(bracketLeft);
        mainPanel.add(bracketRight);
        mainPanel.add(percent);
        mainPanel.add(delete);

        mainPanel.add(seven);
        mainPanel.add(eight);
        mainPanel.add(nine);
        mainPanel.add(divide);

        mainPanel.add(four);
        mainPanel.add(five);
        mainPanel.add(six);
        mainPanel.add(multiply);

        mainPanel.add(one);
        mainPanel.add(two);
        mainPanel.add(three);
        mainPanel.add(minus);

        mainPanel.add(dot);
        mainPanel.add(zero);
        mainPanel.add(equals);
        mainPanel.add(plus);

        frame.add(mainPanel);


    }

    public void setUpFonts() {
        one.setFont(new Font("Tahoma", Font.BOLD, 21));
        two.setFont(new Font("Tahoma", Font.BOLD, 21));
        three.setFont(new Font("Tahoma", Font.BOLD, 21));
        four.setFont(new Font("Tahoma", Font.BOLD, 21));
        five.setFont(new Font("Tahoma", Font.BOLD, 21));
        six.setFont(new Font("Tahoma", Font.BOLD, 21));
        seven.setFont(new Font("Tahoma", Font.BOLD, 21));
        eight.setFont(new Font("Tahoma", Font.BOLD, 21));
        nine.setFont(new Font("Tahoma", Font.BOLD, 21));
        dot.setFont(new Font("Tahoma", Font.BOLD, 21));
        plus.setFont(new Font("Tahoma", Font.BOLD, 21));
        minus.setFont(new Font("Tahoma", Font.BOLD, 21));
        divide.setFont(new Font("Tahoma", Font.BOLD, 21));
        multiply.setFont(new Font("Tahoma", Font.BOLD, 21));
        bracketLeft.setFont(new Font("Tahoma", Font.BOLD, 21));
        bracketRight.setFont(new Font("Tahoma", Font.BOLD, 21));
        zero.setFont(new Font("Tahoma", Font.BOLD, 21));
        percent.setFont(new Font("Tahoma", Font.BOLD, 21));
        equals.setFont(new Font("Tahoma", Font.BOLD, 21));
        delete.setFont(new Font("Tahoma", Font.BOLD, 21));
        cubeRoot.setFont(new Font("Tahoma", Font.BOLD, 21));
        squareRoot.setFont(new Font("Tahoma", Font.BOLD, 21));
        squared.setFont(new Font("Tahoma", Font.BOLD, 21));
        cubed.setFont(new Font("Tahoma", Font.BOLD, 21));

    }

    public void darkMode() {
        mode = "dark";
        bracketLeft.setText("White");
        Color button = new Color(66, 133, 244);
        textPanel.setBackground(Color.black);
        squareRoot.setBackground(Color.black);
        squared.setBackground(Color.black);
        cubeRoot.setBackground(Color.black);
        cubed.setBackground(Color.black);
        one.setBackground(Color.black);
        two.setBackground(Color.black);
        three.setBackground(Color.black);
        four.setBackground(Color.black);
        five.setBackground(Color.black);
        six.setBackground(Color.black);
        seven.setBackground(Color.black);
        eight.setBackground(Color.black);
        nine.setBackground(Color.black);
        zero.setBackground(Color.black);
        plus.setBackground(Color.black);
        minus.setBackground(Color.black);
        multiply.setBackground(Color.black);
        divide.setBackground(Color.black);
        percent.setBackground(Color.black);
        bracketLeft.setBackground(Color.black);
        bracketRight.setBackground(Color.black);
        delete.setBackground(Color.black);
        equals.setBackground(Color.black);
        dot.setBackground(Color.black);

        one.setForeground(Color.white);
        two.setForeground(Color.white);
        three.setForeground(Color.white);
        four.setForeground(Color.white);
        squared.setForeground(Color.white);
        squareRoot.setForeground(Color.white);
        cubed.setForeground(Color.white);
        cubeRoot.setForeground(Color.white);
        five.setForeground(Color.white);
        six.setForeground(Color.white);
        seven.setForeground(Color.white);
        eight.setForeground(Color.white);
        nine.setForeground(Color.white);
        zero.setForeground(Color.white);
        plus.setForeground(button);
        minus.setForeground(button);
        delete.setForeground(button);
        multiply.setForeground(button);
        percent.setForeground(button);
        equals.setForeground(button);
        divide.setForeground(button);
        cubeRoot.setForeground(button);
        cubed.setForeground(button);
        squareRoot.setForeground(button);
        squared.setForeground(button);
        dot.setForeground(Color.white);
        bracketLeft.setForeground(button);
        bracketRight.setForeground(button);
        textField.setBackground(Color.black);
        textField.setForeground(Color.white);
        bracketLeft.setName("White");
    }

    public void whiteMode() {
        bracketLeft.setText("Dark");
        mode = "white";
        squared.setBackground(Color.white);
        squareRoot.setBackground(Color.white);
        cubeRoot.setBackground(Color.white);
        cubed.setBackground(Color.white);
        textPanel.setBackground(Color.white);
        textField.setBackground(Color.white);
        textField.setForeground(Color.black);
        one.setBackground(Color.white);
        two.setBackground(Color.white);
        three.setBackground(Color.white);
        four.setBackground(Color.white);
        five.setBackground(Color.white);
        six.setBackground(Color.white);
        seven.setBackground(Color.white);
        eight.setBackground(Color.white);
        nine.setBackground(Color.white);
        zero.setBackground(Color.white);
        plus.setBackground(Color.white);
        minus.setBackground(Color.white);
        multiply.setBackground(Color.white);
        divide.setBackground(Color.white);
        percent.setBackground(Color.white);
        bracketLeft.setBackground(Color.white);
        bracketRight.setBackground(Color.white);
        delete.setBackground(Color.white);
        equals.setBackground(Color.white);
        dot.setBackground(Color.white);
        one.setForeground(Color.black);
        two.setForeground(Color.black);
        three.setForeground(Color.black);
        four.setForeground(Color.black);
        five.setForeground(Color.black);
        six.setForeground(Color.black);
        seven.setForeground(Color.black);
        eight.setForeground(Color.black);
        nine.setForeground(Color.black);
        zero.setForeground(Color.black);
        plus.setForeground(Color.black);
        minus.setForeground(Color.black);
        delete.setForeground(Color.black);
        multiply.setForeground(Color.black);
        percent.setForeground(Color.black);
        equals.setForeground(Color.black);
        divide.setForeground(Color.black);
        dot.setForeground(Color.black);
        bracketLeft.setForeground(Color.black);
        bracketRight.setForeground(Color.black);
        squared.setForeground(Color.black);
        squareRoot.setForeground(Color.black);
        cubeRoot.setForeground(Color.black);
        cubed.setForeground(Color.black);
    }

    public void start() {
        setUpPanels();
        setUpFonts();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        setListener(listener);
        whiteMode();
    }


}
