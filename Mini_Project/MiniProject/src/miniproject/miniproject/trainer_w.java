package miniproject;

 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.border.EmptyBorder;

 

import net.proteanit.sql.DbUtils;

 

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

 

import java.sql.*;

import javax.swing.*;

import java.awt.event.MouseAdapter;

import java.awt.event.MouseEvent;

import java.awt.event.KeyAdapter;

import java.awt.event.KeyEvent;

 

import java.util.*;

import java.lang.*;

 

 

public class trainer_w extends JFrame {

             

 

              private JPanel contentPane;

              private JTable table;

              private JComboBox comboBox ;

              //private JFrame frame ;

              private JComboBox comboBox_1 ;

 

 

              /**

              * Launch the application.

              */

              public static void main(String[] args) {

                           EventQueue.invokeLater(new Runnable() {

                                         public void run() {

                                                       try {

                                                                    Weight frame1 = new Weight();

                                                                    frame1.dispose();

                                                                    trainer_w frame = new trainer_w();

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

              Connection connection=null;

              private JTextField textField;

              private JTextField textField_1;

              private JTextField textField_2;

              private JTextField textField_3;

              private JTextField textField_4;

              private JTextField textField_5;

              //private JTextField textField_8;

              private JTextField textField_9;

             

              public void refreshTable()

              {

                           try {

                                         String query="select * from info";

                                         PreparedStatement pst= connection.prepareStatement(query);

                                         ResultSet rs= pst.executeQuery();

                                         table.setModel(DbUtils.resultSetToTableModel(rs));

                                         pst.close();

                                         rs.close();

                           }catch (Exception a) {

                                         a.printStackTrace();

                           }

                          

              }

             

              public void fillComboBox()

              {

                           try {

                                         String query="select * from info";

                                         PreparedStatement pst= connection.prepareStatement(query);

                                         ResultSet rs= pst.executeQuery();

                                        

                                          while(rs.next())

                                         {

                                                       comboBox.addItem(rs.getString("name"));

                                         }

                           }catch (Exception a) {

                                         a.printStackTrace();

                           }

              }

              public trainer_w() {

                           connection = sqliteConnection2.dbConnector();

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 1230, 778);

                           contentPane = new JPanel();
                           contentPane.setBackground(new Color(0, 0, 0));

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);

                           contentPane.setLayout(null);

                          

                           JScrollPane scrollPane = new JScrollPane();

                           scrollPane.setBounds(438, 229, 762, 487);

                           contentPane.add(scrollPane);

                          

                           table = new JTable();

                           table.addMouseListener(new MouseAdapter() {

                          

                                         @Override

                                         public void mouseClicked(MouseEvent arg0) {

                                                                    try {

                                                                    int row= table.getSelectedRow();

                                                                    String Name_=(table.getModel().getValueAt(row,0)).toString();

                                                                   

                                                                     String query="select * from info where mid='"+Name_+"'";

                                                        PreparedStatement pst= connection.prepareStatement(query);

                                                                   

                                                                     ResultSet rs= pst.executeQuery();

                                                                   

                                                                     while(rs.next())

                                                                    {

                                                                                  textField.setText(rs.getString("name"));

                                                                                  textField_1.setText(rs.getString("sex"));

                                                                                  textField_2.setText(rs.getString("age"));

                                                                                  textField_3.setText(rs.getString("phno"));

                                                                                  textField_4.setText(rs.getString("shift_start"));

                                                                                  textField_5.setText(rs.getString("shift_end"));

                                                                                  //textField_6.setText(rs.getString("edate"));

                                                                                  //textField_7.setText(rs.getString("ms"));

                                                                                  //textField_8.setText(rs.getString("ptduration"));

                                                                    }

                                                                    pst.close();

                                                                   

                                                       }catch (Exception a) {

                                                                    a.printStackTrace();

                                                       }

                                                      

                                         }

                             

                           });

                           scrollPane.setViewportView(table);

               

                           JButton btnSave = new JButton("Save");
                           btnSave.setForeground(new Color(255, 0, 0));
                           btnSave.setBackground(new Color(255, 255, 255));
                           btnSave.setFont(new Font("Candara", Font.BOLD, 16));
                           btnSave.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent e) {

                                                      

                                                       try {

                                                                    String query="insert into info (name,sex,age,phno,shift_start,shift_end) values(?,?,?,?,?,?)";

                                                                    PreparedStatement pst= connection.prepareStatement(query);

                                                                    pst.setString(1, textField.getText());

                                                                    pst.setString(2, textField_1.getText());

                                                                    pst.setString(3, textField_2.getText());

                                                                    pst.setString(4, textField_3.getText());

                                                                    pst.setString(5, textField_4.getText());

                                                                    pst.setString(6, textField_5.getText());

                                                                    //pst.setString(7, textField_6.getText());

                                                                    //pst.setString(8, textField_7.getText());

                                                                    //pst.setString(9, textField_8.getText());

                                                                   

                                                                     pst.execute();

                                                                    JOptionPane.showMessageDialog(null, "Data Saved");

                                                                   

                                                                     pst.close();

                                                                   

                                                       }catch (Exception a) {

                                                                    a.printStackTrace();

                                                       }

                                             refreshTable();

                                         }

                           });

                           btnSave.setBounds(59, 570, 129, 44);

                           contentPane.add(btnSave);

                          

                           //textField_8 = new JTextField();

                           //textField_8.setBounds(140, 526, 116, 22);

                           //contentPane.add(textField_8);

                           //textField_8.setColumns(10);

                          

                           JButton btnDelete = new JButton("Delete");
                           btnDelete.setForeground(new Color(255, 0, 0));
                           btnDelete.setBackground(new Color(255, 255, 255));
                           btnDelete.setFont(new Font("Candara", Font.BOLD, 16));

                           btnDelete.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent e) {

                                                       int action= JOptionPane.showConfirmDialog(null, "Do you really want to Delete","Delete",JOptionPane.YES_NO_OPTION);

                                                       if(action==0)

                                                       {

                                                       try {

                                                                    String query="delete from info where name='"+textField.getText()+"' ";

                                                                    PreparedStatement pst= connection.prepareStatement(query);

                                                                                                                                        

                                                                     pst.execute();

                                                                    JOptionPane.showMessageDialog(null, "Data Deleted");

                                                                   

                                                                     pst.close();

                                                                   

                                                       }catch (Exception ex) {

                                                                    ex.printStackTrace();

                                                       }

                                                       refreshTable();

                                         }

                                         }

                           });

                           btnDelete.setBounds(254, 570, 142, 44);

                           contentPane.add(btnDelete);

                           //refreshTable();

                          

                           JButton btnUpdate = new JButton("Update");
                           btnUpdate.setForeground(new Color(255, 0, 0));
                           btnUpdate.setBackground(new Color(255, 255, 255));
                           btnUpdate.setFont(new Font("Candara", Font.BOLD, 16));

                           btnUpdate.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent e) {

                                                      

                                                       try {

                                                                    String query="Update info set name='"+textField.getText()+"' , sex='"+textField_1.getText()+"' , age='"+textField_2.getText()+"' , phno='"+textField_3.getText()+"' , shift_start='"+textField_4.getText()+"' , shift_end='"+textField_5.getText()+"'  where name='"+textField.getText()+"'  ";

                                                                    PreparedStatement pst= connection.prepareStatement(query);

                                                                                                                                        

                                                                     pst.execute();

                                                                    JOptionPane.showMessageDialog(null, "Data Updated");

                                                                   

                                                                     pst.close();

                                                                   

                                                       }catch (Exception a) {

                                                                     a.printStackTrace();

                                                       }

                                                       refreshTable();

                                         }

                           });

                           btnUpdate.setBounds(59, 649, 129, 46);

                           contentPane.add(btnUpdate);

                          

                  comboBox = new JComboBox();

                  comboBox.addActionListener(new ActionListener() {

                           public void actionPerformed(ActionEvent arg0) {

                                        

                                         try {

                                                                    String query="select * from info where name=?";

                                                        PreparedStatement pst= connection.prepareStatement(query);

                                                                    pst.setString(1,(String)comboBox.getSelectedItem());

                                                                    ResultSet rs= pst.executeQuery();

                                                                   

                                                                     while(rs.next())

                                                                    {

                                                                                  //textField.setText(rs.getString("mid"));

                                                                                  textField.setText(rs.getString("name"));

                                                                                  textField_1.setText(rs.getString("sex"));

                                                                                  textField_2.setText(rs.getString("age"));

                                                                                  textField_3.setText(rs.getString("phno"));

                                                                                  textField_4.setText(rs.getString("shift_start"));

                                                                                  textField_5.setText(rs.getString("shift_end"));

                                                                                  //textField_7.setText(rs.getString("ms"));

                                                                                  //textField_8.setText(rs.getString("ptduration"));

                                                                    }

                                                                    pst.close();

                                                                   

                                                       }catch (Exception a) {

                                                                    a.printStackTrace();

                                                       }

                           }

                  });

                           comboBox.setBounds(28, 63, 228, 44);

                           contentPane.add(comboBox);

                          

                           JLabel lblSearchDetailsByname = new JLabel("Search Details By Name ");
                           lblSearchDetailsByname.setForeground(new Color(255, 255, 255));
                           lblSearchDetailsByname.setFont(new Font("Calibri", Font.BOLD, 16));
                           lblSearchDetailsByname.setBounds(28, 26, 228, 30);

                           contentPane.add(lblSearchDetailsByname);
                           lblSearchDetailsByname.setForeground(new Color(255, 255, 255));
                           lblSearchDetailsByname.setFont(new Font("Calibri", Font.BOLD, 16));
                           lblSearchDetailsByname.setForeground(new Color(255, 255, 255));
                           lblSearchDetailsByname.setFont(new Font("Calibri", Font.BOLD, 16));

                          

                           JButton btnBackToMenu = new JButton("Back To Menu");
                           btnBackToMenu.setForeground(new Color(255, 0, 0));
                           btnBackToMenu.setBackground(new Color(255, 255, 255));
                           btnBackToMenu.setFont(new Font("Candara", Font.BOLD, 16));

                           btnBackToMenu.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent arg0) {

                                                       Weight frame1 =new Weight();

                                                       frame1.setVisible(true);

                                                       dispose();

                                         }

                           });

                           btnBackToMenu.setBounds(254, 649, 142, 46);

                           contentPane.add(btnBackToMenu);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(0, 0, 1212, 230);
                           contentPane.add(panel);
                                                      panel.setLayout(null);
                           
                                                     
                           
                                                      JLabel lblNewLabel_2 = new JLabel("Filter Using Category");
                                                      lblNewLabel_2.setBounds(343, 28, 141, 20);
                                                      panel.add(lblNewLabel_2);
                                                      lblNewLabel_2.setForeground(new Color(255, 255, 255));
                                                      lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 16));
                                                      
                                                                                
                                                      
                                                                                 comboBox_1 = new JComboBox();
                                                                                 comboBox_1.setBounds(330, 61, 204, 48);
                                                                                 comboBox_1.setBackground(new Color(255, 255, 255));
                                                                                 panel.add(comboBox_1);
                                                                                 comboBox_1.setFont(new Font("Leelawadee UI", Font.BOLD | Font.ITALIC, 16));
                                                                                 comboBox_1.setForeground(new Color(255, 0, 0));
                                                                                 
                                                                                                            comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Name", "Sex", "Age", "Phno", "Shift Start Time", "Shift End Time"}));
                                                                                                            
                                                                                                                                      
                                                                                                            
                                                                                                                                       JLabel lblNewLabel_3 = new JLabel("Search By Assigned Category");
                                                                                                                                       lblNewLabel_3.setBounds(585, 30, 249, 16);
                                                                                                                                       panel.add(lblNewLabel_3);
                                                                                                                                       lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                                                       lblNewLabel_3.setForeground(new Color(255, 255, 255));
                                                                                                                                       
                                                                                                                                                                 
                                                                                                                                       
                                                                                                                                                                  textField_9 = new JTextField();
                                                                                                                                                                  textField_9.setBounds(585, 62, 249, 50);
                                                                                                                                                                  panel.add(textField_9);
                                                                                                                                                                  
                                                                                                                                                                                             textField_9.addKeyListener(new KeyAdapter() {
                                                                                                                                                                  
                                                                                                                                                                                                           @Override
                                                                                                                                                                  
                                                                                                                                                                                                           public void keyReleased(KeyEvent arg0) {
                                                                                                                                                                  
                                                                                                                                                                                                                         try {
                                                                                                                                                                  
                                                                                                                                                                                                                                      String selection=(String)comboBox_1.getSelectedItem();
                                                                                                                                                                  
                                                                                                                                                                                                                                     
                                                                                                                                                                  
                                                                                                                                                                                                                                       String query="select * from info where "+selection+"=? ";
                                                                                                                                                                  
                                                                                                                                                                                                                          System.out.println(query);
                                                                                                                                                                  
                                                                                                                                                                                                                                      PreparedStatement pst= connection.prepareStatement(query);
                                                                                                                                                                  
                                                                                                                                                                                                                                      pst.setString(1,textField_9.getText());
                                                                                                                                                                  
                                                                                                                                                                                                                                      ResultSet rs= pst.executeQuery();
                                                                                                                                                                  
                                                                                                                                                                                                                                     
                                                                                                                                                                  
                                                                                                                                                                                                                                       table.setModel(DbUtils.resultSetToTableModel(rs));
                                                                                                                                                                  
                                                                                                                                                                                                                                      //while(rs.next())
                                                                                                                                                                  
                                                                                                                                                                                                                                      //{
                                                                                                                                                                  
                                                                                                                                                                                                                                                   
                                                                                                                                                                  
                                                                                                                                                                                                                                       //}
                                                                                                                                                                  
                                                                                                                                                                                                                                      pst.close();
                                                                                                                                                                  
                                                                                                                                                                                                                                     
                                                                                                                                                                  
                                                                                                                                                                                                                         }catch (Exception a) {
                                                                                                                                                                  
                                                                                                                                                                                                                                      a.printStackTrace();
                                                                                                                                                                  
                                                                                                                                                                                                                         }
                                                                                                                                                                  
                                                                                                                                                                                                          
                                                                                                                                                                  
                                                                                                                                                                                                           }
                                                                                                                                                                  
                                                                                                                                                                                             });
                                                                                                                                                                                             
                                                                                                                                                                                                                        textField_9.setColumns(10);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                   JButton btnLoadTable = new JButton("Load Data");
                                                                                                                                                                                                                                                   btnLoadTable.setBounds(920, 61, 228, 48);
                                                                                                                                                                                                                                                   panel.add(btnLoadTable);
                                                                                                                                                                                                                                                   btnLoadTable.setForeground(new Color(255, 0, 0));
                                                                                                                                                                                                                                                   btnLoadTable.setBackground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                   btnLoadTable.setFont(new Font("Candara", Font.BOLD, 16));
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                              textField_1 = new JTextField();
                                                                                                                                                                                                                                                                              textField_1.setBounds(140, 208, 116, 22);
                                                                                                                                                                                                                                                                              panel.add(textField_1);
                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                         textField_1.setColumns(10);
                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                    textField = new JTextField();
                                                                                                                                                                                                                                                                                                                                    textField.setBounds(140, 154, 116, 22);
                                                                                                                                                                                                                                                                                                                                    panel.add(textField);
                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                               textField.setColumns(10);
                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                          JLabel lblName = new JLabel("Name");
                                                                                                                                                                                                                                                                                                                                                                                          lblName.setBounds(12, 158, 64, 16);
                                                                                                                                                                                                                                                                                                                                                                                          panel.add(lblName);
                                                                                                                                                                                                                                                                                                                                                                                          lblName.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                          lblName.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                                                                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                                                                                                                                                                     JLabel lblPhno = new JLabel("Sex");
                                                                                                                                                                                                                                                                                                                                                                                                                     lblPhno.setBounds(12, 212, 56, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                     panel.add(lblPhno);
                                                                                                                                                                                                                                                                                                                                                                                                                     lblPhno.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                     lblPhno.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                                                                                                                                                                   btnLoadTable.addActionListener(new ActionListener() {

                                                                                                                                                                                                                                                                 public void actionPerformed(ActionEvent e) {

                                                                                                                                                                                                                                                                               try {

                                                                                                                                                                                                                                                                                            String query="select * from info ";

                                                                                                                                                                                                                                                                                            PreparedStatement pst= connection.prepareStatement(query);

                                                                                                                                                                                                                                                                                            ResultSet rs= pst.executeQuery();

                                                                                                                                                                                                                                                                                            table.setModel(DbUtils.resultSetToTableModel(rs));

                                                                                                                                                                                                                                                                                            pst.close();

                                                                                                                                                                                                                                                                                            rs.close();

                                                                                                                                                                                                                                                                               }catch (Exception a) {

                                                                                                                                                                                                                                                                                            a.printStackTrace();

                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                              

                                                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                                   });
                           
                           JPanel panel_1 = new JPanel();
                           panel_1.setBackground(new Color(255, 99, 71));
                           panel_1.setBounds(0, 229, 438, 280);
                           contentPane.add(panel_1);
                           panel_1.setLayout(null);
                           
                                                     
                           
                                                      textField_5 = new JTextField();
                                                      textField_5.setBounds(140, 209, 116, 22);
                                                      panel_1.add(textField_5);
                                                      
                                                                                 textField_5.setColumns(10);
                                                                                 
                                                                                                           
                                                                                 
                                                                                                            JLabel lblNewLabel = new JLabel("Shift End Time");
                                                                                                            lblNewLabel.setBounds(12, 213, 104, 16);
                                                                                                            panel_1.add(lblNewLabel);
                                                                                                            lblNewLabel.setForeground(new Color(255, 255, 255));
                                                                                                            lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                            
                                                                                                                                      
                                                                                                            
                                                                                                                                       textField_4 = new JTextField();
                                                                                                                                       textField_4.setBounds(140, 157, 116, 22);
                                                                                                                                       panel_1.add(textField_4);
                                                                                                                                       
                                                                                                                                                                  textField_4.setColumns(10);
                                                                                                                                                                  
                                                                                                                                                                                            
                                                                                                                                                                  
                                                                                                                                                                                             textField_3 = new JTextField();
                                                                                                                                                                                             textField_3.setBounds(140, 100, 116, 22);
                                                                                                                                                                                             panel_1.add(textField_3);
                                                                                                                                                                                             
                                                                                                                                                                                                                        textField_3.setColumns(10);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                  
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                   textField_2 = new JTextField();
                                                                                                                                                                                                                                                   textField_2.setBounds(140, 37, 116, 22);
                                                                                                                                                                                                                                                   panel_1.add(textField_2);
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                              textField_2.setColumns(10);
                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                         JLabel lblLdate = new JLabel("Shift Start Time");
                                                                                                                                                                                                                                                                                                         lblLdate.setBounds(12, 161, 116, 16);
                                                                                                                                                                                                                                                                                                         panel_1.add(lblLdate);
                                                                                                                                                                                                                                                                                                         lblLdate.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                                                                                                                                                                                                                         lblLdate.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                         lblLdate.setBackground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                    JLabel lblJdate = new JLabel("Ph No");
                                                                                                                                                                                                                                                                                                                                    lblJdate.setBounds(12, 104, 56, 16);
                                                                                                                                                                                                                                                                                                                                    panel_1.add(lblJdate);
                                                                                                                                                                                                                                                                                                                                    lblJdate.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                    lblJdate.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                                                                                                                                                                                                                                                    lblJdate.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                    lblJdate.setFont(new Font("Calibri", Font.BOLD, 16));
                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                               JLabel lblAge = new JLabel("Age");
                                                                                                                                                                                                                                                                                                                                                               lblAge.setBounds(12, 41, 56, 16);
                                                                                                                                                                                                                                                                                                                                                               panel_1.add(lblAge);
                                                                                                                                                                                                                                                                                                                                                               lblAge.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                               lblAge.setFont(new Font("Calibri", Font.BOLD, 16));

                          

                           fillComboBox();            

              }

 

}