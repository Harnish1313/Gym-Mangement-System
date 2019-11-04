package miniproject;

 

import java.awt.EventQueue;

 

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JOptionPane;

 

import java.awt.BorderLayout;

import java.awt.Rectangle;

import javax.swing.JTextField;

import javax.swing.JButton;

import javax.swing.JPasswordField;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

 

public class Project1 {

 

              private JFrame frame;

              private JTextField textFieldUn;

 

              /**

              * Launch the application.

              */

              String user[]={"admin@1","admin@2","admin@3","admin@4","admin@5","","","","",""};

              String password[]={"1","2","3","4","5","","","","",""};
              private JTextField textField;

             

              public static void main(String[] args) {

                                        

                           EventQueue.invokeLater(new Runnable() {

                                         public void run() {

                                                       try {

                                                                    Project1 window = new Project1();

                                                                    window.frame.setVisible(true);

                                                       } catch (Exception e) {

                                                                    e.printStackTrace();

                                                       }

                                         }

                           });

              }

 

              /**

              * Create the application.

              */

              public Project1() {

                           initialize();

             

              }

 

              /**

              * Initialize the contents of the frame.

              */

              private void initialize() {

                           frame = new JFrame();
                           frame.getContentPane().setBackground(Color.BLACK);

                           frame.setBounds(100, 100, 920, 564);

                           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           frame.getContentPane().setLayout(null);
                           
                           JPanel panel = new JPanel();
                           panel.setBounds(0, 0, 463, 517);
                           frame.getContentPane().add(panel);
                           panel.setLayout(null);
                           
                           JLabel lblNewLabel_2 = new JLabel("New label");
                           lblNewLabel_2.setIcon(new ImageIcon(Project1.class.getResource("/gym.jpg")));
                           lblNewLabel_2.setBounds(0, 0, 463, 517);
                           panel.add(lblNewLabel_2);
                           
                           JPanel panel_1 = new JPanel();
                           panel_1.setBackground(new Color(255, 99, 71));
                           panel_1.setBounds(464, 54, 386, 417);
                           frame.getContentPane().add(panel_1);
                           panel_1.setLayout(null);
                           
                                                     
                           
                                                      JLabel lblNewLabel_1 = new JLabel("Password");
                                                      lblNewLabel_1.setFont(new Font("Calibri Light", lblNewLabel_1.getFont().getStyle() | Font.BOLD | Font.ITALIC, lblNewLabel_1.getFont().getSize() + 5));
                                                      lblNewLabel_1.setBounds(30, 196, 86, 25);
                                                      panel_1.add(lblNewLabel_1);
                                                      lblNewLabel_1.setForeground(Color.WHITE);
                                                      
                                                                                
                                                      
                                                                                 textFieldUn = new JTextField();
                                                                                 textFieldUn.setBounds(116, 197, 256, 35);
                                                                                 panel_1.add(textFieldUn);
                                                                                 
                                                                                                            textFieldUn.setColumns(10);
                                                                                                            
                                                                                                                                      
                                                                                                            
                                                                                                                                       JButton btnLogin = new JButton("Sign in");
                                                                                                                                       btnLogin.setFont(new Font("Calibri", btnLogin.getFont().getStyle(), btnLogin.getFont().getSize() + 6));
                                                                                                                                       btnLogin.setBackground(new Color(255, 160, 122));
                                                                                                                                       btnLogin.setForeground(new Color(248, 248, 255));
                                                                                                                                       btnLogin.setBounds(128, 306, 144, 35);
                                                                                                                                       panel_1.add(btnLogin);
                                                                                                                                       
                                                                                                                                       textField = new JTextField();
                                                                                                                                       textField.setBounds(116, 113, 256, 35);
                                                                                                                                       panel_1.add(textField);
                                                                                                                                       textField.setColumns(10);
                                                                                                                                       
                                                                                                                                       JLabel lblFitnessFirst = new JLabel("Fitness First");
                                                                                                                                       lblFitnessFirst.setBounds(98, 31, 225, 27);
                                                                                                                                       panel_1.add(lblFitnessFirst);
                                                                                                                                       lblFitnessFirst.setFont(new Font("Arial", lblFitnessFirst.getFont().getStyle() | Font.BOLD | Font.ITALIC, 31));
                                                                                                                                       lblFitnessFirst.setForeground(Color.WHITE);
                                                                                                                                       
                                                                                                                                                                 
                                                                                                                                       
                                                                                                                                                                  JLabel lblNewLabel = new JLabel("Username");
                                                                                                                                                                  lblNewLabel.setFont(new Font("Calibri Light", lblNewLabel.getFont().getStyle() | Font.BOLD | Font.ITALIC, lblNewLabel.getFont().getSize() + 5));
                                                                                                                                                                  lblNewLabel.setBounds(30, 112, 86, 25);
                                                                                                                                                                  panel_1.add(lblNewLabel);
                                                                                                                                                                  lblNewLabel.setForeground(Color.WHITE);
                                                                                                                                       
                                                                                                                                                                  btnLogin.addActionListener(new ActionListener() {
                                                                                                                                       
                                                                                                                                                                                public void actionPerformed(ActionEvent arg0) {
                                                                                                                                       
                                                                                                                                                                                              String user1;
                                                                                                                                       
                                                                                                                                                                                              String pass1;
                                                                                                                                       
                                                                                                                                                                                              int k=0;
                                                                                                                                       
                                                                                                                                                                                              try{
                                                                                                                                       
                                                                                                                                                                                                           user1=textFieldUn.getText();
                                                                                                                                       
                                                                                                                                                                                                           pass1=passwordField.getText();
                                                                                                                                       
                                                                                                                                                                                                           k=Login(user1,pass1);
                                                                                                                                       
                                                                                                                                                                                                           if(k==1)//Login and Password Matches
                                                                                                                                       
                                                                                                                                                                                                           {
                                                                                                                                       
                                                                                                                                                                                                                         //JOptionPane.showMessageDialog(null, "Username and Password Correct");
                                                                                                                                       
                                                                                                                                                                                                                         frame.dispose();
                                                                                                                                       
                                                                                                                                                                                                                         Menu p2 = new Menu();
                                                                                                                                       
                                                                                                                                                                                                                         p2.setVisible(true);
                                                                                                                                       
                                                                                                                                                                                                           }
                                                                                                                                       
                                                                                                                                                                                                           else//Does not Match
                                                                                                                                       
                                                                                                                                                                                                           {
                                                                                                                                       
                                                                                                                                                                                                                         JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                                                                                                                                       
                                                                                                                                                                                                           }
                                                                                                                                       
                                                                                                                                                                                                          
                                                                                                                                       
                                                                                                                                                                                              }catch(Exception e)
                                                                                                                                       
                                                                                                                                                                                              {
                                                                                                                                       
                                                                                                                                                                                                           JOptionPane.showMessageDialog(null, e);
                                                                                                                                       
                                                                                                                                                                                             
                                                                                                                                       
                                                                                                                                                                                             
                                                                                                                                       
                                                                                                                                                                                              }
                                                                                                                                       
                                                                                                                                                                                }
                                                                                                                                       
                                                                                                                                                                  });

              }

             

              int Login(String user1, String pass1)//For checking if username and password matches

              {

                           int i=0,k=0;

                           while(user[i]!="")

                           {

                                         if(user[i].equals(user1))

                                         {

                                            if(password[i].equals(pass1))

                                            {

                                                          k=1;

                                                          break;

                                            }

                                              

                                         }

                                         i++;

                           }

                           return(k);

              }
}