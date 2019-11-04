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


 

public class Crossfit extends JFrame {

 

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

                                                                    Crossfit frame = new Crossfit();

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

              public Crossfit() {

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 923, 662);

                           contentPane = new JPanel();
                           contentPane.setBackground(Color.BLACK);
                           contentPane.setForeground(Color.BLACK);

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);
                           contentPane.setLayout(null);

                          

                           JLabel lblCrossfit = new JLabel("Crossfit");
                           lblCrossfit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 38));
                           lblCrossfit.setForeground(Color.WHITE);
                           lblCrossfit.setBounds(369, 51, 141, 35);

                           contentPane.add(lblCrossfit);
                           panel.add(btnMembers);
                           panel.add(btnTrainers);
                           panel.add(btnBackToMenu);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(209, 130, 481, 425);
                           contentPane.add(panel);
                                                      panel.setLayout(null);
                           
                                                     
                           
                                                      JButton btnBackToMenu = new JButton("Back To Menu");
                                                      btnBackToMenu.setBounds(160, 276, 141, 50);
                                                      panel.add(btnBackToMenu);
                                                      btnBackToMenu.setBackground(new Color(255, 255, 255));
                                                      btnBackToMenu.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                      btnBackToMenu.setForeground(new Color(255, 0, 0));
                                                      
                                                                                
                                                      
                                                                                 JButton btnTrainers =  new JButton("2) Trainer");
                                                                                 btnTrainers.addActionListener(new ActionListener() {
                                                                                 	public void actionPerformed(ActionEvent e) {
                                                                                 	}
                                                                                 });
                                                                                 btnTrainers.setBounds(160, 168, 141, 50);
                                                                                 panel.add(btnTrainers);
                                                                                 btnTrainers.setBackground(new Color(255, 255, 255));
                                                                                 btnTrainers.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                 btnTrainers.setForeground(new Color(255, 0, 0));
                                                                                 
                                                                                                           
                                                                                 
                                                                                                            JButton btnMembers = new JButton("1) Member");
                                                                                                            btnMembers.setBounds(160, 66, 141, 50);
                                                                                                            panel.add(btnMembers);
                                                                                                            btnMembers.setBackground(new Color(255, 255, 255));
                                                                                                            btnMembers.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
                                                                                                            btnMembers.setForeground(new Color(255, 0, 0));
                                                                                                            btnMembers.addActionListener(new ActionListener() {

                                                                                                                          public void actionPerformed(ActionEvent arg0) {

                                                                                                                                        member_c mw = new member_c();

                                                                                                                                        mw.setVisible(true);

                                                                                                                                        dispose();

                                                                                                                          }

                                                                                                            });
                                                      
                                                                                 btnBackToMenu.addActionListener(new ActionListener() {
                                                      
                                                                                               public void actionPerformed(ActionEvent e) {
                                                      
                                                                                                             Menu frame1 =new Menu();
                                                      
                                                                                                             frame1.setVisible(true);
                                                      
                                                                                                             dispose();
                                                      
                                                                                               }
                                                      
                                                                                 });

              }
}