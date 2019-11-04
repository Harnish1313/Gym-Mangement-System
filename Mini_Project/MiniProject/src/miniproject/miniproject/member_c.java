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

public class member_c extends JFrame {

 

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

                                                                    Crossfit frame1 = new Crossfit();

                                                                    frame1.dispose();

                                                                    member_c frame = new member_c();

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

              private JTextField textField_6;

              private JTextField textField_7;

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

                                                       comboBox.addItem(rs.getString("mid"));

                                         }

                           }catch (Exception a) {

                                         a.printStackTrace();

                           }

              }

             

              public member_c() {

                           connection = sqliteConnection3.dbConnector();

                           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                           setBounds(100, 100, 1230, 778);

                           contentPane = new JPanel();
                           contentPane.setBackground(new Color(0, 0, 0));

                           contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

                           setContentPane(contentPane);

                           contentPane.setLayout(null);

                          

                           JScrollPane scrollPane = new JScrollPane();

                           scrollPane.setBounds(438, 229, 784, 502);

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

                                                                                  textField.setText(rs.getString("mid"));

                                                                                  textField_1.setText(rs.getString("name"));

                                                                                  textField_2.setText(rs.getString("sex"));

                                                                                  textField_3.setText(rs.getString("age"));

                                                                                  textField_4.setText(rs.getString("phno"));

                                                                                  textField_5.setText(rs.getString("jdate"));

                                                                                  textField_6.setText(rs.getString("edate"));

                                                                                  textField_7.setText(rs.getString("ms"));

                                                                                  //textField_8.setText(rs.getString("ptduration"));

                                                                    }

                                                                    pst.close();

                                                                   

                                                       }catch (Exception a) {

                                                                    a.printStackTrace();

                                                       }

                                                      

                                         }

                             

                           });

                           scrollPane.setViewportView(table);

                          

                           JLabel lblPt = new JLabel("Membership Status");
                           lblPt.setFont(new Font("Arial", Font.BOLD, 15));
                           lblPt.setForeground(new Color(255, 255, 255));
                           lblPt.setBounds(12, 479, 137, 16);

                           contentPane.add(lblPt);

                          

                           JButton btnSave = new JButton("Save");
                           btnSave.setForeground(new Color(255, 0, 0));
                           btnSave.setBackground(new Color(255, 255, 255));
                           btnSave.setFont(new Font("Candara", Font.BOLD, 16));
                           btnSave.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent e) {

                                                      

                                                       try {

                                                                    String query="insert into info (mid,name,sex,age,phno,jdate,edate,ms) values(?,?,?,?,?,?,?,?)";

                                                                    PreparedStatement pst= connection.prepareStatement(query);

                                                                    pst.setString(1, textField.getText());

                                                                    pst.setString(2, textField_1.getText());

                                                                    pst.setString(3, textField_2.getText());

                                                                    pst.setString(4, textField_3.getText());

                                                                    pst.setString(5, textField_4.getText());

                                                                    pst.setString(6, textField_5.getText());

                                                                    pst.setString(7, textField_6.getText());

                                                                    pst.setString(8, textField_7.getText());

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

                           btnSave.setBounds(50, 598, 116, 38);

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

                                                                    String query="delete from info where mid='"+textField.getText()+"' ";

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

                           btnDelete.setBounds(227, 598, 129, 38);

                           contentPane.add(btnDelete);

                           //refreshTable();

                          

                           JButton btnUpdate = new JButton("Update");
                           btnUpdate.setForeground(new Color(255, 0, 0));
                           btnUpdate.setBackground(new Color(255, 255, 255));
                           btnUpdate.setFont(new Font("Candara", Font.BOLD, 16));
                           btnUpdate.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent e) {

                                                      

                                                       try {

                                                                    String query="Update info set mid='"+textField.getText()+"' ,name='"+textField_1.getText()+"' , sex='"+textField_2.getText()+"' , age='"+textField_3.getText()+"' , phno='"+textField_4.getText()+"' , jdate='"+textField_5.getText()+"' , edate='"+textField_6.getText()+"' , ms='"+textField_7.getText()+"'  where mid='"+textField.getText()+"'  ";

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

                           btnUpdate.setBounds(50, 662, 116, 38);

                           contentPane.add(btnUpdate);

                          

                  comboBox = new JComboBox();

                  comboBox.addActionListener(new ActionListener() {

                           public void actionPerformed(ActionEvent arg0) {

                                        

                                         try {

                                                                    String query="select * from info where mid=?";

                                                        PreparedStatement pst= connection.prepareStatement(query);

                                                                    pst.setString(1,(String)comboBox.getSelectedItem());

                                                                    ResultSet rs= pst.executeQuery();

                                                                   

                                                                     while(rs.next())

                                                                    {

                                                                                  textField.setText(rs.getString("mid"));

                                                                                  textField_1.setText(rs.getString("name"));

                                                                                  textField_2.setText(rs.getString("sex"));

                                                                                  textField_3.setText(rs.getString("age"));

                                                                                  textField_4.setText(rs.getString("phno"));

                                                                                  textField_5.setText(rs.getString("jdate"));

                                                                                  textField_6.setText(rs.getString("edate"));

                                                                                  textField_7.setText(rs.getString("ms"));

                                                                                  //textField_8.setText(rs.getString("ptduration"));

                                                                    }

                                                                    pst.close();

                                                                   

                                                       }catch (Exception a) {

                                                                    a.printStackTrace();

                                                       }

                           }

                  });

                           comboBox.setBounds(28, 69, 228, 38);

                           contentPane.add(comboBox);

                          

                           JLabel lblSearchDetailsByname = new JLabel("Search Details By M_Id ");
                           lblSearchDetailsByname.setFont(new Font("Arial", Font.BOLD, 15));
                           lblSearchDetailsByname.setForeground(new Color(255, 255, 255));
                           lblSearchDetailsByname.setBounds(28, 26, 228, 30);

                           contentPane.add(lblSearchDetailsByname);

                          

                           JButton btnBackToMenu = new JButton("Back To Menu");
                           btnBackToMenu.setForeground(new Color(255, 0, 0));
                           btnBackToMenu.setBackground(new Color(255, 255, 255));
                           btnBackToMenu.setFont(new Font("Candara", Font.BOLD, 16));
                           btnBackToMenu.addActionListener(new ActionListener() {

                                         public void actionPerformed(ActionEvent e) {

                                                       Crossfit frame1 =new Crossfit();

                                                       frame1.setVisible(true);

                                                       dispose();

                                         }

                           });

                           btnBackToMenu.setBounds(227, 662, 129, 38);

                           contentPane.add(btnBackToMenu);
                           
                           JPanel panel = new JPanel();
                           panel.setBackground(new Color(255, 99, 71));
                           panel.setBounds(0, 0, 537, 537);
                           contentPane.add(panel);
                                                      panel.setLayout(null);
                           
                                                     
                           
                                                      textField_7 = new JTextField();
                                                      textField_7.setBounds(160, 476, 116, 22);
                                                      panel.add(textField_7);
                                                      
                                                                                 textField_7.setColumns(10);
                                                                                 
                                                                                                           
                                                                                 
                                                                                                            textField_6 = new JTextField();
                                                                                                            textField_6.setBounds(160, 435, 116, 22);
                                                                                                            panel.add(textField_6);
                                                                                                            
                                                                                                                                       textField_6.setColumns(10);
                                                                                                                                       
                                                                                                                                                                 
                                                                                                                                       
                                                                                                                                                                  textField_5 = new JTextField();
                                                                                                                                                                  textField_5.setBounds(160, 387, 116, 22);
                                                                                                                                                                  panel.add(textField_5);
                                                                                                                                                                  
                                                                                                                                                                                             textField_5.setColumns(10);
                                                                                                                                                                                             
                                                                                                                                                                                                                       
                                                                                                                                                                                             
                                                                                                                                                                                                                        textField_4 = new JTextField();
                                                                                                                                                                                                                        textField_4.setBounds(160, 335, 116, 22);
                                                                                                                                                                                                                        panel.add(textField_4);
                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                   textField_4.setColumns(10);
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                              textField_3 = new JTextField();
                                                                                                                                                                                                                                                                              textField_3.setBounds(160, 283, 116, 22);
                                                                                                                                                                                                                                                                              panel.add(textField_3);
                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                         textField_3.setColumns(10);
                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                    textField_2 = new JTextField();
                                                                                                                                                                                                                                                                                                                                    textField_2.setBounds(160, 236, 116, 22);
                                                                                                                                                                                                                                                                                                                                    panel.add(textField_2);
                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                               textField_2.setColumns(10);
                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                          textField_1 = new JTextField();
                                                                                                                                                                                                                                                                                                                                                                                          textField_1.setBounds(160, 185, 116, 22);
                                                                                                                                                                                                                                                                                                                                                                                          panel.add(textField_1);
                                                                                                                                                                                                                                                                                                                                                                                          
                                                                                                                                                                                                                                                                                                                                                                                                                     textField_1.setColumns(10);
                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                               
                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                textField = new JTextField();
                                                                                                                                                                                                                                                                                                                                                                                                                                                textField.setBounds(160, 138, 116, 22);
                                                                                                                                                                                                                                                                                                                                                                                                                                                panel.add(textField);
                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           textField.setColumns(10);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      JLabel lblDuration = new JLabel("Expiry Date");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      lblDuration.setBounds(12, 438, 121, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      panel.add(lblDuration);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      lblDuration.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      lblDuration.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 JLabel lblNewLabel = new JLabel("Joining Date");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 lblNewLabel.setBounds(12, 390, 121, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 panel.add(lblNewLabel);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 lblNewLabel.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            JLabel lblLdate = new JLabel("Ph No");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            lblLdate.setBounds(12, 338, 56, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            panel.add(lblLdate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            lblLdate.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            lblLdate.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       JLabel lblJdate = new JLabel("Age");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       lblJdate.setBounds(12, 286, 56, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       panel.add(lblJdate);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       lblJdate.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       lblJdate.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   JLabel lblAge = new JLabel("Sex");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   lblAge.setBounds(12, 242, 56, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   panel.add(lblAge);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   lblAge.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   lblAge.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              JLabel lblPhno = new JLabel("Name");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              lblPhno.setBounds(12, 188, 56, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              panel.add(lblPhno);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              lblPhno.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              lblPhno.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         JLabel lblName = new JLabel("Member Id");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         lblName.setBounds(12, 144, 78, 16);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         panel.add(lblName);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         lblName.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         lblName.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    JLabel lblNewLabel_2 = new JLabel("Filter Using Category");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    lblNewLabel_2.setBounds(331, 30, 156, 25);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    panel.add(lblNewLabel_2);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    lblNewLabel_2.setForeground(new Color(255, 255, 255));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               comboBox_1 = new JComboBox();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               comboBox_1.setBounds(331, 68, 194, 43);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               panel.add(comboBox_1);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               comboBox_1.setFont(new Font("Leelawadee UI", Font.BOLD | Font.ITALIC, 16));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               comboBox_1.setForeground(new Color(255, 0, 0));
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Name", "Sex", "Age", "Phno", "Joining Date", "Expiry Date ", "Membership Status"}));
                           
                           JPanel panel_1 = new JPanel();
                           panel_1.setBackground(new Color(255, 99, 71));
                           panel_1.setBounds(438, 0, 774, 229);
                           contentPane.add(panel_1);
                           panel_1.setLayout(null);
                           
                                                     
                           
                                                      textField_9 = new JTextField();
                                                      textField_9.setBounds(144, 67, 249, 50);
                                                      panel_1.add(textField_9);
                                                      
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
                                                                                                            
                                                                                                                                      
                                                                                                            
                                                                                                                                       JLabel lblNewLabel_3 = new JLabel("Search By Assigned Category");
                                                                                                                                       lblNewLabel_3.setBounds(144, 30, 249, 16);
                                                                                                                                       panel_1.add(lblNewLabel_3);
                                                                                                                                       lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 15));
                                                                                                                                       lblNewLabel_3.setForeground(new Color(255, 255, 255));
                                                                                                                                       
                                                                                                                                                                 
                                                                                                                                       
                                                                                                                                                                  JButton btnLoadTable = new JButton("Load Data");
                                                                                                                                                                  btnLoadTable.setBounds(493, 71, 228, 44);
                                                                                                                                                                  panel_1.add(btnLoadTable);
                                                                                                                                                                  btnLoadTable.setForeground(new Color(255, 0, 0));
                                                                                                                                                                  btnLoadTable.setBackground(new Color(255, 255, 255));
                                                                                                                                                                  btnLoadTable.setFont(new Font("Candara", Font.BOLD, 16));
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

        fillComboBox();   

              }

 

}