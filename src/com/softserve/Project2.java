package com.softserve;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class Project2 {

    public static void main(String[] args) {
        FrameCalculator.madeFrame();
    }
}

class Calculator {
    static String strAll = "";
    static String strAllFrame = "";
    static String strJLabel1 = "";
    static String str1 = "";
    static String str2 = "";
    static String s = "";
    static char operations = '0';
    static boolean operationsFull = false;
    static boolean numb2Full = false;
    static int result = 0;
    static int numb1;
    static int numb2;
    static boolean operation1 = false;

    public static void metod() {

        char c = s.charAt(0);
        if (c >= '0' && c <= '9' && operationsFull == false) {
            str1 += s;
            strAll += s;
            strJLabel1 += s;
            FrameCalculator.jLabel1.setText(strJLabel1);
        } else if ((c == '+' || c == '-' || c == '×' || c == '÷') && operationsFull == false) {
            operations = c;
            operationsFull = true;

            strAll += s;
            strJLabel1 += "" + c;
            FrameCalculator.jLabel1.setText(strJLabel1);
        } else if ((c == '+' || c == '-' || c == '×' || c == '÷') && operationsFull == true && numb2Full == false) {
            operations = c;
            String substr = strJLabel1.substring(0, strJLabel1.length() - 1);
            strAll += s;
            strJLabel1 = substr + c;
            FrameCalculator.jLabel1.setText(strJLabel1);
        } else if (c >= '0' && c <= '9' && operationsFull == true) {
            str2 += s;
            strAll += s;
            numb2Full = true;
            numb1 = Integer.valueOf(str1);
            numb2 = Integer.valueOf(str2);
            result = switch (operations) {
                case ('+') -> numb1 + numb2;
                case ('-') -> numb1 - numb2;
                case ('×') -> numb1 * numb2;
                case ('÷') -> numb1 / numb2;
                default -> 0;
            };
            FrameCalculator.jLabel2.setText(String.valueOf(result));
            strJLabel1 += s;
            FrameCalculator.jLabel1.setText(strJLabel1);
        } else if ((c == '+' || c == '-' || c == '×' || c == '÷') && numb2Full == true) {
            numb1 = Integer.valueOf(str1);
            numb2 = Integer.valueOf(str2);
            operation1 = false;
            strJLabel1 += s;
            FrameCalculator.jLabel1.setText(strJLabel1);
            strAll += s;
            strAllFrame = "" + numb1 + operations + numb2 + " = " + result;
            String currentText = FrameCalculator.jLabelEast.getText();
            String newText = currentText.substring(0, currentText.length() - 7);
            FrameCalculator.jLabelEast.setText(newText + "<br>" + Calculator.strAllFrame + "</html>");

            str1 = String.valueOf(result);
            str2 = "";
            operations = c;
            operationsFull = true;
            numb2Full = false;
        } else if (c == 'C') {
            strAll += s;
            strJLabel1 = "";
            str1 = "";
            str2 = "";
            operations = '0';
            operationsFull = false;
            operation1 = false;
            numb2Full = false;
            result = 0;
            FrameCalculator.jLabel1.setText("0");
            FrameCalculator.jLabel2.setText("");
        } else if (c == '=') {
            strAll += s;
            numb1 = Integer.valueOf(str1);
            numb2 = Integer.valueOf(str2);
            strAllFrame = "" + numb1 + operations + numb2 + " = " + result;
            String currentText = FrameCalculator.jLabelEast.getText();
            String newText = currentText.substring(0, currentText.length() - 7);
            FrameCalculator.jLabelEast.setText(newText + "<br>" + Calculator.strAllFrame + "</html>");
            str1 = String.valueOf(result);
            str2 = "";
            strJLabel1 = String.valueOf(result);
            operationsFull = false;
            numb2Full = false;
            FrameCalculator.jLabel1.setText(String.valueOf(result));
            FrameCalculator.jLabel2.setText("");
        } else if (s == " +/-") {
            strAll += s;
            c = strJLabel1.charAt(strJLabel1.length() - 1);

            if ((c == '+' || c == '-' || c == '×' || c == '÷') && operation1 == false) {
                str2 = "-";
                operation1 = true;
                strJLabel1 += "(-)";
                FrameCalculator.jLabel1.setText(strJLabel1);
            } else if ((c == '+' || c == '-' || c == '×' || c == '÷' || c == ')') && operation1 == true) {
                str2 = "";
                operation1 = false;
                strJLabel1 = strJLabel1.substring(0, strJLabel1.length() - 3);
                FrameCalculator.jLabel1.setText(strJLabel1);
            }
        }
    }
}

class FrameCalculator extends JFrame implements ActionListener {
    static JLabel jLabel1 = new JLabel(String.valueOf(0));
    static JLabel jLabel2 = new JLabel();
    static JLabel jLabelEast = new JLabel("<html>Journal</html>");

    public static void madeFrame() {
        JFrame jFrame = new JFrame("Сalculator");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 400, 800, 800);

        JPanel jPanel = new JPanel();
        BorderLayout borderLayout = new BorderLayout();
        jPanel.setLayout(borderLayout);

        JPanel jPanelWest = new JPanel();
        jFrame.add(jPanelWest);
        jPanelWest.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

        GridLayout gridLayout = new GridLayout(5, 5);
        gridLayout.setVgap(1);
        gridLayout.setHgap(2);
        jPanelWest.setLayout(gridLayout);

        List<String> operations = Arrays.asList("C", " ", " ", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", " +/-", "0", " ", "=");
        Font font1 = new Font("SanSerif", Font.CENTER_BASELINE, 17);
        FrameCalculator frameCalculatorame = new FrameCalculator();
        operations.forEach(x -> {
            JButton jTmpButton = new JButton(x);
            jTmpButton.setFont(font1);
            jTmpButton.addActionListener(frameCalculatorame);
            jPanelWest.add(jTmpButton);
        });

        JPanel jPanelNorth = new JPanel();
        jFrame.add(jPanelNorth, BorderLayout.NORTH);
        BoxLayout boxLayout = new BoxLayout(jPanelNorth, BoxLayout.PAGE_AXIS);
        jPanelNorth.setLayout(boxLayout);
        jPanelNorth.setBorder(BorderFactory.createEmptyBorder(50, 50, 0, 50));

        jPanelNorth.add(jLabel1);
        Font font2 = new Font("SanSerif", Font.LAYOUT_LEFT_TO_RIGHT, 50);
        jLabel1.setFont(font2);
        jLabel1.setAlignmentX(Component.RIGHT_ALIGNMENT);

        jPanelNorth.add(jLabel2);
        Font font3 = new Font("SanSerif", Font.LAYOUT_LEFT_TO_RIGHT, 25);
        jLabel2.setFont(font3);


        JPanel jPanelEast = new JPanel();
        jFrame.add(jPanelEast, BorderLayout.EAST);
        jPanelEast.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
        Font font4 = new Font("SanSerif", Font.CENTER_BASELINE, 12);
        jLabelEast.setFont(font4);
        jPanelEast.add(jLabelEast);

        jFrame.revalidate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator.s = e.getActionCommand();
        Calculator.metod();
    }
}