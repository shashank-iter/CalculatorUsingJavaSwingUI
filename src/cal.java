//Authored by Shashank Pandey
//Comments will be added for better understanding.
import javax.swing.*;
import java.awt.event.*;



class cal implements ActionListener {
    JFrame f; //this adds a frame where we will display content
    JTextField textField; //adds text field for display
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, bdec, beq, bdel, bclear;
    static double a = 0, b = 0, res = 0;
    static int operator = 0;

    cal() {
        f = new JFrame("Calculator");
        textField = new JTextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdiv = new JButton("/");
        badd = new JButton("+");
        bmul = new JButton("*");
        bsub = new JButton("-");
        bdec = new JButton(".");
        beq = new JButton("=");
        bclear = new JButton("Clear");
        bdel = new JButton("Delete");

        //Setting the size of the buttons
        //the method take int x-axis, yaxis, height width
        textField.setBounds(30, 40, 280, 30);
        b1.setBounds(40, 100, 50, 40);
        b2.setBounds(110, 100, 50, 40);
        b3.setBounds(180, 100, 50, 40);
        beq.setBounds(250, 100, 50, 40);
        b4.setBounds(40, 170, 50, 40);
        b5.setBounds(110, 170, 50, 40);
        b6.setBounds(180, 170, 50, 40);
        bmul.setBounds(250, 170, 50, 40);
        b7.setBounds(40, 240, 50, 40);
        b6.setBounds(110, 240, 50, 40);
        b9.setBounds(180, 240, 50, 40);
        bsub.setBounds(250, 240, 50, 40);
        bdec.setBounds(40, 310, 50, 40);
        b0.setBounds(110, 310, 50, 40);
        beq.setBounds(180, 310, 50, 40);
        badd.setBounds(250, 310, 50, 40);
        bdel.setBounds(60, 380, 100, 40);
        bclear.setBounds(180, 380, 100, 40);
        //Adding the buttons to layout
        f.add(textField);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(bdiv);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(bmul);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(bsub);
        f.add(bdec);
        f.add(b0);
        f.add(beq);
        f.add(badd);
        f.add(bdel);
        f.add(bclear);
        f.setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1)     //IF THE B1 IS PRESSED
            textField.setText(textField.getText().concat("1"));   //SET TEXT IN TEXT BOX "1"
        if (e.getSource() == b2)
            textField.setText(textField.getText().concat("2"));
        if (e.getSource() == b3)
            textField.setText(textField.getText().concat("3"));
        if (e.getSource() == b4)
            textField.setText(textField.getText().concat("4"));
        if (e.getSource() == b5)
            textField.setText(textField.getText().concat("5"));
        if (e.getSource() == b6)
            textField.setText(textField.getText().concat("6"));
        if (e.getSource() == b7)
            textField.setText(textField.getText().concat("7"));
        if (e.getSource() == b8)
            textField.setText(textField.getText().concat("8"));
        if (e.getSource() == b9)
            textField.setText(textField.getText().concat("9"));
        if (e.getSource() == b0)
            textField.setText(textField.getText().concat("0"));
        if (e.getSource() == bdec)
            textField.setText(textField.getText().concat("."));
        if (e.getSource() == badd) {
            a = Double.parseDouble(textField.getText());
            operator = 1;
            textField.setText("");
        }
        if (e.getSource() == bsub) {
            a = Double.parseDouble(textField.getText());
            operator = 2;
            textField.setText("");
        }
        if (e.getSource() == badd) {
            a = Double.parseDouble(textField.getText());
            operator = 1;
            textField.setText("");
        }
        if (e.getSource() == bmul) {
            a = Double.parseDouble(textField.getText());
            operator = 3;
            textField.setText("");
        }
        if (e.getSource() == bdiv) {
            a = Double.parseDouble(textField.getText());
            operator = 4;
            textField.setText("");
        }
        if (e.getSource() == beq) {
            b = Double.parseDouble(textField.getText());
            switch (operator) {
                case 1:
                    res = a + b;
                    break;
                case 2:
                    res = a - b;
                    break;
                case 3:
                    res = a * b;
                    break;
                case 4:
                    res = a / b;
                    break;
                default:
                    res = 0;
            }
            textField.setText("" + res);


        }
        if (e.getSource() == bclear)
            textField.setText("");
        if (e.getSource() == bdel) {
            String s = textField.getText();
            textField.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                textField.setText(textField.getText() + s.charAt(i));
            }
        }

    }

    public static void main(String...s)
    {

        try {
            // set look and feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }

        // create a object of class

        cal c =new cal();
    }



    }







