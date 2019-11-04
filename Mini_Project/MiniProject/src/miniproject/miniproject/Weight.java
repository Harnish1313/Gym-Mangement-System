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

 

public class Weight extends JFrame {

 

              private JPanel contentPane;

    private JFrame frame2;

              /**

              * Launch the application.

              */

              public static void main(String[] args) {

                           EventQueue.invokeLater(new Runnable() {

                                         public void run() {

                                                       try {

                                                                    Menu frame1 = new Menu();

                                                                    frame1.dispose();                                                               

                                                                    Weight frame2 = new Weight();

                                                                    frame2.setVisible(true);

                                                       } catch (Exception e) {

                                                                    e.printStackTrace();

                                                       }

                                         }

                           });

              }

 

              /**

              * Create the frame.

              */

              public Weight() {

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 922, 661);

                           contentPane = new JPanel();
                           contentPane.setBackground(new Color(0, 0, 0));

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);

                           contentPane.setLayout(null);

                          

                           JLabel lblWeightTrainingAnd = new JLabel("Weight Training and Cardio Section");
                           lblWeightTrainingAnd.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 37));
                           lblWeightTrainingAnd.setForeground(new Color(255, 255, 255));

                           lblWeightTrainingAnd.setBounds(200, 41, 597, 38);

                           contentPane.add(lblWeightTrainingAnd);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(242, 144, 476, 370);
                           contentPane.add(panel);
                                                      panel.setLayout(null);
                           
                                                     
                           
                                                      JButton btnMembers = new JButton("1) Member");
                                                      btnMembers.setBackground(new Color(255, 255, 255));
                                                      btnMembers.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                      btnMembers.setBounds(172, 52, 148, 45);
                                                      panel.add(btnMembers);
                                                      btnMembers.setForeground(new Color(255, 0, 0));
                                                      
                                                                                
                                                      
                                                                                 JButton btnTrainer = new JButton("2) Trainer");
                                                                                 btnTrainer.setBackground(new Color(255, 255, 255));
                                                                                 btnTrainer.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                 btnTrainer.setBounds(169, 150, 151, 45);
                                                                                 panel.add(btnTrainer);
                                                                                 btnTrainer.setForeground(new Color(255, 0, 0));
                                                                                 
                                                                                                           
                                                                                 
                                                                                                            JButton btnMenu = new JButton("Back To Menu");
                                                                                                            btnMenu.setBackground(new Color(255, 255, 255));
                                                                                                            btnMenu.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                                            btnMenu.setBounds(166, 247, 154, 45);
                                                                                                            panel.add(btnMenu);
                                                                                                            btnMenu.setForeground(new Color(255, 0, 0));
                                                                                                            
                                                                                                                                       btnMenu.addActionListener(new ActionListener() {
                                                                                                            
                                                                                                                                                     public void actionPerformed(ActionEvent e) {
                                                                                                            
                                                                                                                                                                   Menu frame1 =new Menu();
                                                                                                            
                                                                                                                                                                   frame1.setVisible(true);
                                                                                                            
                                                                                                                                                                   dispose();
                                                                                                            
                                                                                                                                                     }
                                                                                                            
                                                                                                                                       });
                                                                                 
                                                                                                            btnTrainer.addActionListener(new ActionListener() {
                                                                                 
                                                                                                                          public void actionPerformed(ActionEvent e) {
                                                                                 
                                                                                                                                        trainer_w tw = new trainer_w();
                                                                                 
                                                                                                                                        tw.setVisible(true);
                                                                                 
                                                                                                                                        dispose();
                                                                                 
                                                                                                                          }
                                                                                 
                                                                                                            });
                                                      
                                                                                 btnMembers.addActionListener(new ActionListener() {
                                                      
                                                                                               public void actionPerformed(ActionEvent e) {
                                                      
                                                                                                             member_w mw = new member_w();
                                                      
                                                                                                             mw.setVisible(true);
                                                      
                                                                                                             dispose();
                                                      
                                                                                               }
                                                      
                                                                                 });

              }

}