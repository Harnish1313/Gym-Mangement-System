package miniproject;

 

import java.awt.BorderLayout;

import java.awt.EventQueue;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

 

public class Zumba extends JFrame {

 

              private JPanel contentPane;

              private JFrame frame;

              /**

              * Launch the application.

              */

              public static void main(String[] args) {

                           EventQueue.invokeLater(new Runnable() {

                                         public void run() {

                                                       try {

                                                                    Menu frame1 = new Menu();

                                                                    frame1.dispose();                      

                                                                    Zumba frame = new Zumba();

                                                                    frame.setVisible(true);

                                                       } catch (Exception e) {

                                                                    e.printStackTrace();

                                                       }

                                         }

                           });

              }

 

              /**

              * Create the frame.

              */

              public Zumba() {

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 922, 659);

                           contentPane = new JPanel();
                           contentPane.setBackground(new Color(0, 0, 0));

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);

                           contentPane.setLayout(null);

                          

                           JLabel lblZumba = new JLabel("Zumba");
                           lblZumba.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 43));
                           lblZumba.setForeground(new Color(255, 255, 255));

                           lblZumba.setBounds(390, 23, 134, 72);

                           contentPane.add(lblZumba);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(195, 127, 544, 432);
                           contentPane.add(panel);
                                                      panel.setLayout(null);
                           
                                                     
                           
                                                      JButton btnMembers = new JButton("1) Member");
                                                      btnMembers.setBackground(new Color(255, 255, 255));
                                                      btnMembers.setForeground(new Color(255, 0, 0));
                                                      btnMembers.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                      btnMembers.setBounds(192, 65, 141, 50);
                                                      panel.add(btnMembers);
                                                      
                                                                                
                                                      
                                                                                 JButton btnBackToMenu = new JButton("Back To Menu");
                                                                                 btnBackToMenu.setBackground(new Color(255, 255, 255));
                                                                                 btnBackToMenu.setForeground(new Color(255, 0, 0));
                                                                                 btnBackToMenu.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                 btnBackToMenu.setBounds(192, 302, 141, 50);
                                                                                 panel.add(btnBackToMenu);
                                                                                 
                                                                                                           
                                                                                 
                                                                                                            JButton btnTrainer = new JButton("2) Trainer");
                                                                                                            btnTrainer.setBackground(new Color(255, 255, 255));
                                                                                                            btnTrainer.setForeground(new Color(255, 0, 0));
                                                                                                            btnTrainer.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                                            btnTrainer.setBounds(192, 188, 141, 50);
                                                                                                            panel.add(btnTrainer);
                                                                                 
                                                                                                            btnBackToMenu.addActionListener(new ActionListener() {
                                                                                 
                                                                                                                          public void actionPerformed(ActionEvent e) {
                                                                                 
                                                                                                                                        Menu frame1 =new Menu();
                                                                                 
                                                                                                                                        frame1.setVisible(true);
                                                                                 
                                                                                                                                        dispose();
                                                                                 
                                                                                                                          }
                                                                                 
                                                                                                            });

              }

 

}