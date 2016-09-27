package com.gubenko.mySwingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by DmitriX on 26.09.2016.
 */

class HelloListener implements ActionListener {
    // Метод интерфейса для получения нажатий кнопки
    /*public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello");
    }
}

public class TestGUIWindow extends JFrame {
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JTextArea jTextA;

    public TestGUIWindow()
    {
        super();
        this.setSize(500, 300);
        //схемы(классы) расположения компонентов
        /*
        null-расстановка компонентов вручную
        new FlowLayout()-расстановка компонентов в одну строку если компоненты не уместиолись то переносятся на след строку
        new GridLayout()-расстановка компонентов в окне по принципу таблицы 1 колич строк, 2 колич столбцов
        new GridBagLayout()- сложная растановка компонентов
        new BoxLayout
        new CardLayout
        new GroupLayout
        new SpringLayout
        */

        this.getContentPane().setLayout(null);
        this.add(getJLabel(),null);
        this.add(getJTextField(),null);
        this.add(getJButton(),null);
        // Зарегистрировать прослушиватель для кнопки
        jButton.addActionListener(new HelloListener());
        this.add(getJTextA(),null);
        this.setTitle("HelloWorld");
    }

    private JLabel getJLabel() {
        if(jLabel == null) {
            jLabel = new JLabel();
            //x,y,width,height
            jLabel.setBounds(34,49, 53, 18);
            jLabel.setText("Name:");
        }
        return jLabel;
    }

    private JTextField getJTextField() {
        if(jTextField == null) {
            jTextField = new JTextField();
            jTextField.setBounds(96, 49, 160, 20);
        }
        return jTextField;
    }

    private JButton getJButton() {
        if(jButton == null) {
            jButton = new JButton();
            jButton.setBounds(103, 110, 201, 27);
            jButton.setText("OK");
        }
        return jButton;
    }

    private JTextArea getJTextA() {
        if(jTextA == null) {
            jTextA = new JTextArea();
            jTextA.setBounds(300, 49, 150, 200);
            //jTextA.setText("OK");
        }
        return jTextA;
    }

    public static void main(String[] args) {
        TestGUIWindow tW=new TestGUIWindow();
        tW.setVisible(true);
    }
}

