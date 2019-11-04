package miniproject;

 

import java.awt.BorderLayout;

import java.awt.EventQueue;

 

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import javax.swing.JTextField;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.Color;

 

public class Menu extends JFrame {

 

              private JPanel contentPane;

    private JFrame frame1;

              /**

              * Launch the application.

              */

              public static void main(String[] args) {

                           EventQueue.invokeLater(new Runnable() {

                                         public void run() {

                                                       try {

                                                                    Menu frame = new Menu();

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

              public Menu() {

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 911, 661);

                           contentPane = new JPanel();
                           contentPane.setBackground(new Color(0, 0, 0));

                           contentPane.setFont(new Font("Tahoma", Font.BOLD, 16));

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);

                           contentPane.setLayout(null);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(204, 96, 489, 467);
                           contentPane.add(panel);
                                                                                                            panel.setLayout(null);
                                                                                 
                                                                                                           
                                                                                 
                                                                                                            JButton btnWeightTraining = new JButton("1) Weight Training");
                                                                                                            btnWeightTraining.setBounds(170, 53, 171, 48);
                                                                                                            btnWeightTraining.setForeground(new Color(255, 0, 0));
                                                                                                            btnWeightTraining.setBackground(new Color(255, 255, 255));
                                                                                                            btnWeightTraining.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 15));
                                                                                                            panel.add(btnWeightTraining);
                                                                                                            
                                                                                                                                      
                                                                                                            
                                                                                                                                       JButton btnNewButton = new JButton("2) Crossfit");
                                                                                                                                       btnNewButton.setBounds(170, 127, 171, 48);
                                                                                                                                       btnNewButton.setForeground(new Color(255, 0, 0));
                                                                                                                                       btnNewButton.setBackground(new Color(255, 255, 255));
                                                                                                                                       btnNewButton.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
                                                                                                                                       panel.add(btnNewButton);
                                                                                                                                       
                                                                                                                                                                 
                                                                                                                                       
                                                                                                                                                                  JButton btnNewButton_2 = new JButton("4) Zumba");
                                                                                                                                                                  btnNewButton_2.setBounds(170, 279, 171, 48);
                                                                                                                                                                  btnNewButton_2.setForeground(new Color(255, 0, 0));
                                                                                                                                                                  btnNewButton_2.setBackground(new Color(255, 255, 255));
                                                                                                                                                                  btnNewButton_2.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
                                                                                                                                                                  panel.add(btnNewButton_2);
                                                                                                                                                                  
                                                                                                                                                                                            
                                                                                                                                                                  
                                                                                                                                                                                             JButton btnNewButton_1 = new JButton("3)  Kickboxing");
                                                                                                                                                                                             btnNewButton_1.setBounds(170, 205, 171, 48);
                                                                                                                                                                                             btnNewButton_1.setForeground(new Color(255, 0, 0));
                                                                                                                                                                                             btnNewButton_1.setBackground(new Color(255, 255, 255));
                                                                                                                                                                                             btnNewButton_1.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
                                                                                                                                                                                             panel.add(btnNewButton_1);
                                                                                                                                                                                             
                                                                                                                                                                                                                       
                                                                                                                                                                                             
                                                                                                                                                                                                                        JButton btnNewButton_3 = new JButton("Exit");
                                                                                                                                                                                                                        btnNewButton_3.setBounds(170, 353, 171, 48);
                                                                                                                                                                                                                        btnNewButton_3.setForeground(new Color(255, 0, 0));
                                                                                                                                                                                                                        btnNewButton_3.setBackground(new Color(255, 255, 255));
                                                                                                                                                                                                                        btnNewButton_3.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 15));
                                                                                                                                                                                                                        panel.add(btnNewButton_3);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                   JLabel lblNewLabel = new JLabel("  Menu");
                                                                                                                                                                                                                                                   lblNewLabel.setBounds(350, 26, 165, 57);
                                                                                                                                                                                                                                                   contentPane.add(lblNewLabel);
                                                                                                                                                                                                                                                   lblNewLabel.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                              lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 41));
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                   btnNewButton_3.addActionListener(new ActionListener() {
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                 public void actionPerformed(ActionEvent e) {
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                               System.exit(JFrame.EXIT_ON_CLOSE);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                 }
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                   });
                                                                                                                                                                                             
                                                                                                                                                                                                                        btnNewButton_1.addActionListener(new ActionListener() {
                                                                                                                                                                                             
                                                                                                                                                                                                                                      public void actionPerformed(ActionEvent e) {
                                                                                                                                                                                             
                                                                                                                                                                                                                                                    Kickboxing k = new Kickboxing();
                                                                                                                                                                                             
                                                                                                                                                                                                                                                    k.setVisible(true);
                                                                                                                                                                                             
                                                                                                                                                                                                                                                    dispose();
                                                                                                                                                                                             
                                                                                                                                                                                                                                      }
                                                                                                                                                                                             
                                                                                                                                                                                                                        });
                                                                                                                                                                  
                                                                                                                                                                                             btnNewButton_2.addActionListener(new ActionListener() {
                                                                                                                                                                  
                                                                                                                                                                                                           public void actionPerformed(ActionEvent arg0) {
                                                                                                                                                                  
                                                                                                                                                                                                                         Zumba z = new Zumba();
                                                                                                                                                                  
                                                                                                                                                                                                                         z.setVisible(true);
                                                                                                                                                                  
                                                                                                                                                                                                                         dispose();
                                                                                                                                                                  
                                                                                                                                                                                                           }
                                                                                                                                                                  
                                                                                                                                                                                             });
                                                                                                                                       
                                                                                                                                                                  btnNewButton.addActionListener(new ActionListener() {
                                                                                                                                       
                                                                                                                                                                                public void actionPerformed(ActionEvent e) {
                                                                                                                                       
                                                                                                                                                                                              Crossfit c = new Crossfit();
                                                                                                                                       
                                                                                                                                                                                              c.setVisible(true);
                                                                                                                                       
                                                                                                                                                                                              dispose();
                                                                                                                                       
                                                                                                                                                                                }
                                                                                                                                       
                                                                                                                                                                  });
                                                                                                            
                                                                                                                                       btnWeightTraining.addActionListener(new ActionListener() {
                                                                                                            
                                                                                                                                                     public void actionPerformed(ActionEvent e) {
                                                                                                            
                                                                                                                                                                  
                                                                                                            
                                                                                                                                                                   Weight w = new Weight();
                                                                                                            
                                                                                                                                                                   w.setVisible(true);
                                                                                                            
                                                                                                                                                                   dispose();
                                                                                                            
                                                                                                                                                     }
                                                                                                            
                                                                                                                                       });

              }

}