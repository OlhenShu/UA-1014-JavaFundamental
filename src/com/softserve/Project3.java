package com.softserve;

import javax.swing.*;
import javax.swing.plaf.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;

public class Project3 {
    public static void main(String[] args) {
        FrameCalculator3.madeFrame();
    }
}

class Calculator3 {
    static String strAll = "";
    static String s = "";
    static String strJLabel1 = "";
    static String strJLabel2 = "";

    public static void metod() {
        strAll += s;
        char c = s.charAt(0);
        ArrayList<String> arrayList = new ArrayList<>();

        if ((c >= '0' && c <= '9') || c == '.') {
            strJLabel1 += s;
            FrameCalculator3.jTextField1.setText(strJLabel1);

        } else if (c == '+' || c == '-' || c == '×' || c == '÷') {
            char c1 = strJLabel1.charAt(strJLabel1.length() - 1);
            if (c1 == '+' || c1 == '-' || c1 == '×' || c1 == '÷') {
                String substr = strJLabel1.substring(0, strJLabel1.length() - 1);
                strJLabel1 = substr + c;
            } else {
                strJLabel1 += "" + c;
            }
            FrameCalculator3.jTextField1.setText(strJLabel1);

        } else if (s.equals(" +/-")) {
            if (strJLabel1.length() - 1 >= 0) {
                c = strJLabel1.charAt(strJLabel1.length() - 1);
            }
            if (c == ')') {
                String tmp1 = strJLabel1.substring(0, strJLabel1.length() - 3);
                strJLabel1 = tmp1;
            } else if (c == '+' || c == '-' || c == '×' || c == '÷') {
                strJLabel1 += "(-)";
            }
            FrameCalculator3.jTextField1.setText(strJLabel1);
        } else if (s.equals("x²")) {
            c = strJLabel1.charAt(strJLabel1.length() - 1);
            if (c >= '0' && c <= '9') {
                strJLabel1 += "^";
            }
            FrameCalculator3.jTextField1.setText(strJLabel1);
        } else if (s.equals("√x")) {
            c = strJLabel1.charAt(strJLabel1.length() - 1);
            if (c >= '0' && c <= '9') {
                strJLabel1 += "√";
            }
            FrameCalculator3.jTextField1.setText(strJLabel1);
        } else if (s.equals("C")) {
            strJLabel1 = "";
            strJLabel2 = "";
            FrameCalculator3.jTextField1.setText("0");
            FrameCalculator3.jTextField2.setText("");
            arrayList.clear();

        } else if (s.equals("=")) {
            FrameCalculator3.jTextField1.setText(strJLabel2);
            FrameCalculator3.jTextField2.setText("");

            String currentText = FrameCalculator3.jTextArea.getText();
            FrameCalculator3.jTextArea.setText(currentText + "\n" + strJLabel1 + " = " + strJLabel2);

            arrayList.clear();
            if (strJLabel2.charAt(0) != '-') {
                strJLabel1 = strJLabel2;
            } else {
                String tmp2 = strJLabel2.substring(1);
                strJLabel1 = "(-)" + tmp2;
            }
        }

        String substr = "";

        for (int i = 0; i < strJLabel1.length(); i++) {
            c = strJLabel1.charAt(i);

            if ((c >= '0' && c <= '9') || c == '.') {
                for (int j = i; j >= 0; j--) {
                    c = strJLabel1.charAt(j);
                    if ((c >= '0' && c <= '9') || c == '.') {
                        substr += String.valueOf(c);
                    } else {
                        j = 0;
                    }
                }
                StringBuffer strBuffer = new StringBuffer(substr);
                strBuffer.reverse();
                arrayList.add(strBuffer.toString());
                substr = "";
                if (arrayList.size() >= 2) {
                    String tmp = arrayList.get(arrayList.size() - 2);
                    c = tmp.charAt(0);
                    if ((c >= '0' && c <= '9') || c == '.') {
                        arrayList.remove(arrayList.size() - 2);
                    }
                }
            } else if (c == '+' || c == '-' || c == '×' || c == '÷' || c == '√' || c == '^') {
                arrayList.add(String.valueOf(c));
            } else if (c == '(') {
                substr = "-";
                for (int j = i + 3; j < strJLabel1.length(); j++) {
                    c = strJLabel1.charAt(j);
                    if ((c >= '0' && c <= '9') || c == '.') {
                        substr += String.valueOf(c);
                    } else {
                        j = strJLabel1.length();
                    }
                }
                if (!substr.equals("-")) {
                    arrayList.add(substr);
                }
                i += substr.length() + 1;
                substr = "";
            }
        }

        double tmp = 0;
        if (arrayList.size() >= 2) {

            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals("^") && arrayList.size() > i) {
                    tmp = Double.parseDouble(arrayList.get(i - 1)) * Double.parseDouble(arrayList.get(i - 1));
                    arrayList.set(i - 1, String.valueOf(tmp));
                    arrayList.remove(i);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals("√") && arrayList.size() > i) {
                    tmp = Math.sqrt(Double.parseDouble(arrayList.get(i - 1)));
                    arrayList.set(i - 1, String.valueOf(tmp));
                    arrayList.remove(i);
                }
            }
        }
        if (arrayList.size() > 2) {
            for (int i = 0; i < arrayList.size(); i++) {

                if (arrayList.get(i).equals("×") && arrayList.size() > i + 1) {
                    tmp = Double.parseDouble(arrayList.get(i - 1)) * Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i - 1, String.valueOf(tmp));
                    arrayList.remove(i + 1);
                    arrayList.remove(i);
                    i--;
                }
                if (arrayList.get(i).equals("÷") && arrayList.size() > i + 1) {
                    tmp = Double.parseDouble(arrayList.get(i - 1)) / Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i - 1, String.valueOf(tmp));
                    arrayList.remove(i + 1);
                    arrayList.remove(i);
                    i--;
                }
            }
        }
        if (arrayList.size() > 2) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).equals("+") && arrayList.size() > i + 1) {
                    tmp = Double.parseDouble(arrayList.get(i - 1)) + Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i - 1, String.valueOf(tmp));
                    arrayList.remove(i + 1);
                    arrayList.remove(i);
                    i--;

                }
                if (arrayList.get(i).equals("-") && arrayList.size() > i + 1) {
                    tmp = Double.parseDouble(arrayList.get(i - 1)) - Double.parseDouble(arrayList.get(i + 1));
                    arrayList.set(i - 1, String.valueOf(tmp));
                    arrayList.remove(i + 1);
                    arrayList.remove(i);
                    i--;

                }
            }
        }
        if (arrayList.size() > 0) {
            strJLabel2 = arrayList.get(0);
        }
        FrameCalculator3.jTextField2.setText(strJLabel2);
    }
}

class FrameCalculator3 extends JFrame implements ActionListener {
    static JTextField jTextField1 = new JTextField(String.valueOf(0), 60);
    static JTextField jTextField2 = new JTextField(60);
    static JTextArea jTextArea = new JTextArea("Journal: ", 31, 15);

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
        jPanelWest.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 0));

        GridLayout gridLayout = new GridLayout(5, 5);
        gridLayout.setVgap(1);
        gridLayout.setHgap(2);
        jPanelWest.setLayout(gridLayout);

        List<String> operations = Arrays.asList("C", "x²", "√x", "÷", "7", "8", "9", "×", "4", "5", "6", "-", "1", "2", "3", "+", " +/-", "0", ".", "=");
        Font font1 = new Font("SanSerif", Font.CENTER_BASELINE, 17);
        FrameCalculator3 frameCalculatorame = new FrameCalculator3();
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

        jPanelNorth.add(jTextField1);
        Font font2 = new Font("SanSerif", Font.LAYOUT_LEFT_TO_RIGHT, 50);
        jTextField1.setFont(font2);
        jTextField1.setHorizontalAlignment(JTextField.TRAILING);
        jTextField1.setBackground(new ColorUIResource(238, 238, 238));

        jPanelNorth.add(jTextField2);
        Font font3 = new Font("SanSerif", Font.LAYOUT_LEFT_TO_RIGHT, 25);
        jTextField2.setFont(font3);
        jTextField2.setHorizontalAlignment(JTextField.TRAILING);
        jTextField2.setBackground(new ColorUIResource(238, 238, 238));

        JPanel jPanelEast = new JPanel();
        jFrame.add(jPanelEast, BorderLayout.EAST);
        jPanelEast.setBorder(BorderFactory.createEmptyBorder(50, 10, 50, 10));
        Font font4 = new Font("SanSerif", Font.CENTER_BASELINE, 12);

        jTextArea.setLineWrap(true);
        jTextArea.setFont(font4);
        jTextArea.setBackground(new ColorUIResource(238, 238, 238));
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanelEast.add(jScrollPane);

        jFrame.revalidate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calculator3.s = e.getActionCommand();
        Calculator3.metod();
    }
}
