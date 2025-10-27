/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ul;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;


/**
 *
 * @author Hefs Consulting
 */
public class LoginFrame extends JFrame{
    //panels
   private JPanel headingPnl;
   private JPanel usernamePnl;
   private JPanel passwordPnl;
   private JPanel btnPnl;
   private JPanel mainPnl;
   private JPanel usernamePasswordCombinedPnl;
    
   
   //labels
   private JLabel headingLbl;
   private JLabel usernameLbl;
   private JLabel passwordLbl;
   
   //testFields
   private JTextField usernameTxtFld;
   
   //passwordField
   private JPasswordField passwordFld;
   
   //buttons
   private JButton submitBtn;
   private JButton clearBtn;
   private JButton exitBtn;
   
   //coonstructor 
   public LoginFrame(){
   
       setTitle("Login page");
       setSize(600, 650);
       setResizable(true);
       setDefaultLookAndFeelDecorated(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       //create panels
       headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
       usernamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
       
       usernamePasswordCombinedPnl = new JPanel(new GridLayout(2,1,1,1));
       usernamePasswordCombinedPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Line details"));
       
       mainPnl = new JPanel(new BorderLayout());
       
       //create Labels
       headingLbl = new JLabel("Login");
       headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
       headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC,30));
       headingLbl.setForeground(Color.RED);
       
       usernameLbl = new JLabel("Username: ");
       passwordLbl = new JLabel("Password: ");
       
       
       //create fields
       usernameTxtFld = new JTextField(10);
       usernameTxtFld.setFocusable(true);
       
       passwordFld = new JPasswordField(10);
       
       //create buttons
       
       submitBtn = new JButton("Submit");
       clearBtn = new JButton("Clear");
       exitBtn = new JButton("Exit");
       
       //add components to respective panels
       headingPnl.add(headingLbl);
       
       usernamePnl.add(usernameLbl);
       usernamePnl.add(usernameTxtFld);
       
       passwordPnl.add(passwordLbl);
       passwordPnl.add(passwordFld);
       
       usernamePasswordCombinedPnl.add(usernamePnl);
       usernamePasswordCombinedPnl.add(passwordPnl);
       
       btnPnl.add(submitBtn);
       btnPnl.add(clearBtn);
       btnPnl.add(exitBtn);
       
       mainPnl.add(headingPnl, BorderLayout.NORTH);
       mainPnl.add(usernamePasswordCombinedPnl, BorderLayout.CENTER);
       mainPnl.add(btnPnl, BorderLayout.SOUTH);
       
       //add the main panel to the panel of the frame
       add(mainPnl);
       
       pack();
       
       //make the frame visible
       setVisible(true);
   }
   
}
