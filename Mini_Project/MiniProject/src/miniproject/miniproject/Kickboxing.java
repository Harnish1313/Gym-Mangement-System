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

 

public class Kickboxing extends JFrame {

 

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

                                                                    Kickboxing frame = new Kickboxing();

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

              public Kickboxing() {

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 922, 661);

                           contentPane = new JPanel();
                           contentPane.setBackground(new Color(0, 0, 0));

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);

                           contentPane.setLayout(null);

                          

                           JLabel lblKickboxing = new JLabel("Kickboxing");
                           lblKickboxing.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 38));
                           lblKickboxing.setForeground(new Color(255, 255, 255));

                           lblKickboxing.setBounds(326, 38, 214, 33);

                           contentPane.add(lblKickboxing);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(176, 114, 538, 425);
                           contentPane.add(panel);
                                                      panel.setLayout(null);
                           
                                                     
                           
                                                      JButton btnMembers = new JButton("1) Member");
                                                      btnMembers.setBackground(new Color(255, 255, 255));
                                                      btnMembers.addActionListener(new ActionListener() {
                                                      	public void actionPerformed(ActionEvent e) {
                                                      	}
                                                      });
                                                      btnMembers.setForeground(new Color(255, 0, 0));
                                                      btnMembers.setBounds(185, 59, 154, 49);
                                                      panel.add(btnMembers);
                                                      btnMembers.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                      
                                                                                 
                                                      
                                                                                 JButton btnTrainer = new JButton("2) Trainer");
                                                                                 btnTrainer.setBackground(new Color(255, 255, 255));
                                                                                 btnTrainer.setForeground(new Color(255, 0, 0));
                                                                                 btnTrainer.setBounds(185, 181, 154, 49);
                                                                                 panel.add(btnTrainer);
                                                                                 btnTrainer.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                                           
                                                                                 
                                                                                                            JButton btnBackToMenu = new JButton("Back To Menu");
                                                                                                            btnBackToMenu.setBackground(new Color(255, 255, 255));
                                                                                                            btnBackToMenu.setForeground(new Color(255, 0, 0));
                                                                                                            btnBackToMenu.setBounds(185, 307, 154, 49);
                                                                                                            panel.add(btnBackToMenu);
                                                                                                            btnBackToMenu.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                                            
                                                                                                                                       btnBackToMenu.addActionListener(new ActionListener() {
                                                                                                            
                                                                                                                                                     public void actionPerformed(ActionEvent e) {
                                                                                                            
                                                                                                                                                                   Menu frame1 =new Menu();
                                                                                                            
                                                                                                                                                                   frame1.setVisible(true);
                                                                                                            
                                                                                                                                                                   dispose();
                                                                                                            
                                                                                                                                                     }
                                                                                                            
                                                                                                                                       });

              }

 

}