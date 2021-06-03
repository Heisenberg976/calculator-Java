package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc {
    private String action = "";
    private String actn = "first";
    private double a;


    public void addOne(JTextField textField) {

        textField.setText(textField.getText() + "1");
    }

    public void addTwo(JTextField textField) {

        textField.setText(textField.getText() + "2");
    }

    public void addThree(JTextField textField) {

        textField.setText(textField.getText() + "3");
    }

    public void addFour(JTextField textField) {

        textField.setText(textField.getText() + "4");
    }

    public void addFive(JTextField textField) {

        textField.setText(textField.getText() + "5");
    }

    public void addSix(JTextField textField) {

        textField.setText(textField.getText() + "6");
    }

    public void addSeven(JTextField textField) {

        textField.setText(textField.getText() + "7");
    }

    public void addEight(JTextField textField) {

        textField.setText(textField.getText() + "8");
    }

    public void addNine(JTextField textField) {

        textField.setText(textField.getText() + "9");
    }

    public void addZero(JTextField textField) {

        textField.setText(textField.getText() + "0");
    }

    public void addPlus(JTextField textField) {
        switch (action) {
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                actn = "";
            }
            case "cubed" ->{
                a *= a*a;
                textField.setText("");
                actn = "";
            }

            default -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
        }
        action = "plus";


    }

    public void addMinus(JTextField textField) {

        switch (action) {
            case "plus" -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                System.out.println(a);
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                System.out.println(a);
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                System.out.println(a);
            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                System.out.println(a);
            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                System.out.println(a);
            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                System.out.println(a);
            }
            case "cubed" ->{
                a *= a*a;
                textField.setText("");
                System.out.println(a);
            }

            default -> {
                if(actn.equals("first")){
                    a = Double.parseDouble((textField.getText()));
                }
                else a -= Double.parseDouble(textField.getText());

                textField.setText("");
                System.out.println(a);
            }
        }
        action = "minus";
    }


    public void addmultiply(JTextField textField) {
        switch (action) {
            case "plus" -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";

            }
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                actn = "";
            }
            case "cubed" ->{
                a *= a*a;
                textField.setText("");
                actn = "";
            }

            default -> {
                if(actn.equals("first")){
                    a = 1;
                    a = Double.parseDouble(textField.getText());
                }
               else  a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
        }
        action = "multiply";
    }

    public void addDivide(JTextField textField) {
        switch (action) {
            case "plus" -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                actn = "";
            }
            case "cubed" ->{
                a *= a*a;
                textField.setText("");
                actn = "";
            }

            default -> {
                if(actn.equals("first")){
                    a = 1;
                    a = Double.parseDouble(textField.getText());
                }
               else  a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
        }
        action = "divide";
    }


    public void ClearAll(JTextField textField) {
        textField.setText("");
    }

    public void Remove(JTextField textField) {
        String text = textField.getText();
        if (textField.getText().length() != 0) {
            textField.setText(text.substring(0, text.length() - 1));
        }

    }

    public void squareRoot(JTextField textField) {
        switch (action) {
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                actn = "";
            }
            case "cubed" ->{
                a *= a*a;
                textField.setText("");
                actn = "";
            }

            default -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
        }
        action = "sqrt";
    }

    public void squared(JTextField textField) {

        switch (action) {
            case "plus" -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "cubed" ->{
                a *= a*a;
                textField.setText("");
                actn = "";
            }

            default -> {
                if(actn.equals("first")){
                    a = Double.parseDouble(textField.getText());
                }
                a *= a;
                textField.setText("");
                actn = "";
            }
        }
        action = "squared";

    }

    public void cubeRoot(JTextField textField) {
        switch (action) {
            case "plus" -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                actn = "";
            }
            case "cubed" ->{
                if(actn.equals("first")) a = 1;
                a *= a*a;
                textField.setText("");
                actn = "";
            }

            default -> {
                if(actn.equals("first")){
                    a = Math.cbrt(Double.parseDouble(textField.getText()));

                }
                else a *= Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
        }
        action = "cubed";
    }

    public void cubed(JTextField textField) {
        switch (action) {
            case "plus" -> {
                a += Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "minus" -> {
                a -= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "multiply" -> {
                a *= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "divide" -> {
                a /= Double.parseDouble(textField.getText());
                textField.setText("");
                actn = "";
            }
            case "sqrt" -> {
                a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "cbrt" ->{
                a = Math.cbrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                actn = "";
            }
            case "squared" ->{
                a *= a;
                textField.setText("");
                actn = "";
            }

            default -> {
                if(actn.equals("first")){
                    a =  Double.parseDouble(textField.getText());
                    a *= a*a;
                }
                else a *= a*a;
                textField.setText("");
                actn = "";
            }
        }
        action = "cubed";

    }
//Quadratic equation
    public void quadratic() {
        JFrame frame1 = new JFrame("quadratic");
        frame1.setSize(550,500);
        frame1.setLayout(new GridLayout(4,2,2,2));

        JLabel a = new JLabel(" Value of A");
        JTextField valueOfA =  new JTextField();
        JLabel b = new JLabel(" Value of B");
        JTextField valueOfB =  new JTextField();
        valueOfA.setSize(10,100);
        JLabel c = new JLabel(" Value of C");
        JTextField valueOfC =  new JTextField();
        c.setPreferredSize(new Dimension(4,100));
        JButton button = new JButton("Solve");
        JTextField solution = new JTextField();
        solution.setEditable(false);
        valueOfA.setText("1");
        valueOfB.setText("1");
        valueOfC.setText("0");
        valueOfA.setHorizontalAlignment(JTextField.CENTER);
        valueOfB.setHorizontalAlignment(JTextField.CENTER);
        valueOfC.setHorizontalAlignment(JTextField.CENTER);

        a.setHorizontalAlignment(SwingConstants.CENTER);
        b.setHorizontalAlignment(SwingConstants.CENTER);
        c.setHorizontalAlignment(SwingConstants.CENTER);


        solution.setHorizontalAlignment(JTextField.LEFT);


        button.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Double A, B, C, D, x1, x2;
               String answer = "";
               String pas1 = "";
               String pas2 = "";

               A = Double.parseDouble(valueOfA.getText());
               B = Double.parseDouble(valueOfB.getText());
               C = Double.parseDouble(valueOfC.getText());
               D = (B * B) + (-4 * A * C);
               if (D < 0) {
                   solution.setText("no solutions :(");
               }
               else {

                   x1 = (-B + Math.sqrt(D)) / (2 * A);
                   x2 = (-B - Math.sqrt(D)) / (2 * A);


                   if(x1.toString().length()>7) {
                       Double a = (-B + Math.sqrt(D));
                       Double b = 2*A;
                       pas1 = a.toString() + " / " + b.toString();
                   }

                   if(x2.toString().length()>7) {
                       Double a1 = (-B - Math.sqrt(D));
                       Double b1 = 2*A;
                       pas2 = a1.toString() + " / " + b1.toString();
                   }

                    if(pas1.length()>0 && pas2.length()>0){
                        answer = "x1 = " + pas1 + ";  " + "x2 = " + pas2;
                    }

                 else  if(pas1.length()>0){
                       answer = "x1 = " + pas1 + ";  " + "x2 = " + x2.toString();
                   }

                  else  if(pas2.length()>0){
                       answer = "x1 = " + x1.toString() + ";  " + "x2 = " + pas2;
                   }


                  else answer = "x1 = " + x1.toString() + ";  " + "x2 = " + x2.toString();
                   solution.setText(answer);

               }
           }
       });



        frame1.add(a);
        frame1.add(valueOfA);
        frame1.add(b);
        frame1.add(valueOfB);
        frame1.add(c);
        frame1.add(valueOfC);
        frame1.add(button);
        frame1.add(solution);

        solution.setFont(new Font("Tahoma", Font.BOLD, 19));
        a.setFont(new Font("Tahoma", Font.BOLD, 17));
        b.setFont(new Font("Tahoma", Font.BOLD, 17));
        c.setFont(new Font("Tahoma", Font.BOLD, 17));
        valueOfA.setFont(new Font("Tahoma", Font.BOLD, 17));
        valueOfB.setFont(new Font("Tahoma", Font.BOLD, 17));
        valueOfC.setFont(new Font("Tahoma", Font.BOLD, 17));
        button.setFont(new Font("Tahoma", Font.BOLD, 17));

        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setVisible(true);

    }


    public void addDot(JTextField textField) {
        textField.setText(textField.getText() + ".");
    }

    public void addEquals(JTextField textField) {

        switch (action) {
            case "plus" -> {
                if(textField.getText().length()>0){
                    a += Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "minus" -> {
              if(textField.getText().length()>0){
                    a -= Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "multiply" -> {
                if(textField.getText().length()>0){
                    a *= Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "divide" -> {
                if(textField.getText().length()>0){
                    a /= Double.parseDouble(textField.getText());
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "sqrt" -> {
                if(textField.getText().length()>0){
                    a = Math.sqrt(Double.parseDouble(textField.getText()));
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "cbrt" ->{
                if(textField.getText().length()>0){
                    a = Math.cbrt(Double.parseDouble(textField.getText()));
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "squared" ->{
                if(textField.getText().length()>0){
                    a *= a;
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
            case "cubed" ->{
                if(textField.getText().length()>0){
                    a *= a*a;
                    textField.setText(Double.toString(a));
                }
                textField.setText(Double.toString(a));
                a = 0;
                actn = "first";
            }
        }
        action = "";




//        switch (action) {
//            case "plus" -> {
//                b = Double.parseDouble(textField.getText());
//                textField.setText(Double.toString(a+b));
//                a=b=0;
//            }
//            case "minus" -> {
//                b = Double.parseDouble(textField.getText());
//                textField.setText(Double.toString(a - b));
//
//            }
//            case "multiply" -> {
//                b = Double.parseDouble(textField.getText());
//                textField.setText(Double.toString(a * b));
//
//
//            }
//            case "divide" -> {
//                b = Double.parseDouble(textField.getText());
//                textField.setText(Double.toString(a / b));
//
//            }
//
//        }


    }

}
