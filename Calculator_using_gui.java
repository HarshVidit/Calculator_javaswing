

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calc implements ActionListener
{
    JFrame frame1;
    JButton []b;
    JPanel panel1;
    JTextField tfield1,tfield2;
    ActionEvent recg=null;
    Calc()
    {
        frame1 = new JFrame("Calculator");
        frame1.setBounds(100,100,500,600);
        frame1.setLayout(new BorderLayout());

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(5,4));

        b = new JButton[20];
        for(int i=0;i<10;i++)
        {
            b[i] = new JButton();
            b[i].setText((i)+"");
            b[i].setFocusable(false);
            panel1.add(b[i]);
        }
        b[10] = new JButton("+");
        b[11]=new JButton("-");
        b[12]= new JButton("*");
        b[13]= new JButton("/");
        b[14] = new JButton("%");
        b[15] = new JButton("x^2");
        b[16] = new JButton("x^1/2");
        b[17]= new JButton("x^3");
        b[18]=new JButton("C");
        b[19]=new JButton("=");
        for(int i=10;i<20;i++)
        {
            b[i].setFocusable(false);
            panel1.add(b[i]);
        }

        for(int i=0;i<20;i++)
        {
            b[i].addActionListener(this);
        }

        Font font1 = new Font("Arial",Font.BOLD,20);

        tfield2=new JTextField();
        tfield1 = new JTextField();
        tfield1.setFont(font1);
        tfield1.setBorder(BorderFactory.createLineBorder(Color.cyan,3));
        tfield1.setPreferredSize(new Dimension(50,40));

        frame1.add(panel1,BorderLayout.CENTER);
        frame1.add(tfield1,BorderLayout.NORTH);


        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b[0])
        {
            tfield1.setText(tfield1.getText()+b[0].getText());
        }
        if(e.getSource()==b[1])
        {
            tfield1.setText(tfield1.getText()+b[1].getText());
        }
        if(e.getSource()==b[2])
        {
            tfield1.setText(tfield1.getText()+b[2].getText());
        }
        if(e.getSource()==b[3])
        {
            tfield1.setText(tfield1.getText()+b[3].getText());
        }
        if(e.getSource()==b[4])
        {
            tfield1.setText(tfield1.getText()+b[4].getText());
        }
        if(e.getSource()==b[5])
        {
            tfield1.setText(tfield1.getText()+b[5].getText());
        }
        if(e.getSource()==b[6])
        {
            tfield1.setText(tfield1.getText()+b[6].getText());
        }
        if(e.getSource()==b[7])
        {
            tfield1.setText(tfield1.getText()+b[7].getText());
        }
        if(e.getSource()==b[8])
        {
            tfield1.setText(tfield1.getText()+b[8].getText());
        }
        if(e.getSource()==b[9])
        {
            tfield1.setText(tfield1.getText()+b[9].getText());
        }
        if(e.getSource()==b[10])
        {
            tfield2.setText(tfield1.getText());
            recg = e;
            tfield1.setText("");
        }
        if(e.getSource()==b[11])
        {
            tfield2.setText(tfield1.getText());
            recg = e;
            tfield1.setText("");
        }
        if(e.getSource()==b[12])
        {
            tfield2.setText(tfield1.getText());
            recg=e;
            tfield1.setText("");
        }
        if(e.getSource()==b[13])
        {
            tfield2.setText(tfield1.getText());
            recg=e;
            tfield1.setText("");
        }
        if(e.getSource()==b[14])
        {
            tfield2.setText(tfield1.getText());
            recg=e;
            tfield1.setText("");
        }
        if(e.getSource()==b[15])
        {
            tfield2.setText(tfield1.getText());
            recg = e;
        }
        if(e.getSource()==b[16])
        {
            tfield2.setText(tfield1.getText());
            recg = e;
        }
        if(e.getSource()==b[17])
        {
            tfield2.setText(tfield1.getText());
            recg = e;
        }
        if(e.getSource()==b[18])
        {
            tfield1.setText("");
            tfield2.setText("");
        }
        if(e.getSource()==b[19])
        {
            //String button_recognition;
            if(recg.getSource()==b[10])
            {
               tfield1.setText(Double.parseDouble(tfield2.getText())+Double.parseDouble(tfield1.getText())+"");
            }
            if(recg.getSource()==b[11])
            {
                tfield1.setText(Double.parseDouble(tfield2.getText())-Double.parseDouble(tfield1.getText())+"");
            }
            if(recg.getSource()==b[12])
            {
                tfield1.setText(Double.parseDouble(tfield2.getText())*Double.parseDouble(tfield1.getText())+"");
            }
            if(recg.getSource()==b[13])
            {
                tfield1.setText(Double.parseDouble(tfield2.getText())/Double.parseDouble(tfield1.getText())+"");
            }
            if(recg.getSource()==b[14])
            {
                tfield1.setText(Double.parseDouble(tfield2.getText())%Double.parseDouble(tfield1.getText())+"");
            }
            if(recg.getSource()==b[15])
            {
                tfield1.setText(Double.parseDouble(tfield2.getText())*Double.parseDouble(tfield2.getText())+"");
            }
            if(recg.getSource()==b[16])
            {
                tfield1.setText(Math.pow(Double.parseDouble(tfield2.getText()),0.5)+"");
            }
            if(recg.getSource()==b[17])
            {
                tfield1.setText(Math.pow(Double.parseDouble(tfield2.getText()),3)+"");
            }
        }
    }
}
public class Calculator_using_gui {
    public static void main(String []arv)
    {
        new Calc();
    }
}