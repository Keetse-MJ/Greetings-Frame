/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Jane
 */
public class GreetingsGUI extends JFrame{
    

    
    
       private JPanel namePnl;
       private JPanel surnamePnl;
        private JPanel nameAndSurnamePnl;
      private JPanel greetinsAreaPnl;
      private JPanel btnpnl;
      private JPanel mainPnl;
     private JPanel headingPnl;
     
     
     //labels
     private JLabel headinglb1;
    private JLabel nameLb1;
      private JLabel surnameLb1;
      
      //textfields
      private JTextField  nameTxtField;
      private JTextField surnameTxtField;
      
      //buttons
      
     private  JTextArea greetingstxtArea;
      
      private  JButton greetBtn;
      private  JButton clearBtn;
      private JButton exitBtn;
      
    public GreetingsGUI() {
        
        
        setLayout(new BorderLayout());
        setTitle("Greetinggs GUI");
        setSize(700,750);
        setBackground(Color.yellow);
        
        
        namePnl=new JPanel(new FlowLayout());
       surnamePnl=new JPanel(new FlowLayout());
       
       nameAndSurnamePnl=new JPanel(new GridLayout(2,1));
       
       greetinsAreaPnl=new JPanel(new FlowLayout());
       greetinsAreaPnl.setBorder(new  TitledBorder(new LineBorder(Color.black, 1), "Greetings"));
       
       
       btnpnl=new JPanel(new FlowLayout());
       mainPnl=new JPanel(new BorderLayout());
       
       
       headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
       headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
       
       headinglb1=new JLabel("Greetings App");
       nameLb1=new JLabel("Name: ");
       surnameLb1=new JLabel("Surname: ");
       
       
       nameTxtField=new JTextField(20);
       surnameTxtField=new JTextField(20);
       
       
       greetingstxtArea=new JTextArea(40, 50);
       greetingstxtArea.setEditable(false);
       greetingstxtArea.setText("Hello [name[  [surname]");
       
       
       greetBtn=new JButton("Greet");
       clearBtn=new JButton("Clear");
       exitBtn=new JButton("Exit");
       
       
       namePnl.add(nameLb1);
       namePnl.add(nameTxtField);
       
       surnamePnl.add(surnameLb1);
       surnamePnl.add(surnameTxtField);
       
       
       nameAndSurnamePnl.add(namePnl);
       nameAndSurnamePnl.add(surnamePnl);
       
       
       greetinsAreaPnl.add(greetingstxtArea);
       
       btnpnl.add(greetBtn);
       btnpnl.add(clearBtn);
       btnpnl.add(exitBtn);
       
       
       mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
       mainPnl.add(greetinsAreaPnl, BorderLayout.CENTER);
       mainPnl.add(btnpnl, BorderLayout.SOUTH);
       
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl,BorderLayout.CENTER);
        setVisible(true);
        
    }
}
