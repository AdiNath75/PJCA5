/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iqbal-Asi
 */
public class NewJStudentInternalFrame extends javax.swing.JInternalFrame {
ConnectClass c;
Validation v;
    /**
     * Creates new form NewJStudentInternalFrame
     */
    public NewJStudentInternalFrame() {
        initComponents();
        
        c = new ConnectClass();
        v = new Validation();
        
        setTitle("New Student");
        
        getID();
        
        getStdData();
        
        stdBatch();
        
        statusCombo();
        
        jTable1Student.setSelectionForeground(Color.WHITE);
        
    }
    /**
     * total number of students
     */
    public void totalstd() {
        try {
            ResultSet rs = c.st.executeQuery("select COUNT(std_id) from tbl_std where std_batch_code = '"+jComboBox2batchname.getSelectedItem()+"'");
            while (rs.next()){
                jLabel16.setText(rs.getString(1));
            }
        }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
    } 
    
    /**
     * Auto Generating IDs
     */
    public void getID (){
        try {
            ResultSet rs = c.st.executeQuery("select max(std_id) from tbl_std ");
            if(rs.next()) {
                int stdID = Integer.parseInt(rs.getString(1))+1;
                jLabel12.setText(String.valueOf(stdID));
            }
            
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
            
    /**
     * Get Date Method
     */
    public void getStdData() {
        try {
            DefaultTableModel dt = (DefaultTableModel)jTable1Student.getModel();
            
            ResultSet rs = c.st.executeQuery("select std_id as 'Student Id', std_name as 'Student Name', std_batch_code as 'Batch Code', semester_name as 'Semester Name', std_days as 'Student Days', std_time as 'Student Timing', std_book as 'Book', teacher_id as 'Teacher Id', teacher_name as 'Teacher Name', date_added as 'Added On', std_status as 'Student Status' from tbl_std where std_status = 'true'");
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            }
            jTable1Student.setModel(dt);
            
        }
        catch(Exception ex ) {
            System.out.println(ex.toString());
        }
    }

    /**
     * Filling Batch
     */
    public void stdBatch() {
        try {
            jComboBox2batchname.addItem("Please Select....");
            ResultSet rs = c.st.executeQuery("select batch_code from tbl_batch where batch_status = 'true'");
            while (rs.next()) {
                jComboBox2batchname.addItem(rs.getString(1));
            }
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    /**
     * Clearing the Data
     */
    public void clearingFields(){
        jTextField1.setText("");
        jLabeldays.setText("");
        jLabeltimeings.setText("");
        jComboBoxStatus.setSelectedIndex(0);
        jLabelsemester.setText("");
        jLabelteacherName.setText("");
        jComboBox2batchname.setSelectedIndex(0);
        jLabelbook.setText("");
        jLabelteacherID.setText("");
        jDateChooser1.setDate(null);
        getID ();
    }
    
    /**
     * Clearing table
     */
    public void clearingTabel(){
        try {
            /**
             * Clearing Rows from jTable1
             */
            DefaultTableModel dm = (DefaultTableModel) jTable1Student.getModel();
            int rowCount = dm.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                dm.removeRow(i);
            }   
        }
        catch(Exception ex) {
            System.out.println(ex.toString());
        }
    }
    
    /**
     * Student Status Combo
     */
    public void statusCombo(){
        jComboBoxStatus.addItem("true");
        jComboBoxStatus.addItem("false");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelteacherID = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2batchname = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1Student = new javax.swing.JTable();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonViewAll = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jLabeltimeings = new javax.swing.JLabel();
        jLabeldays = new javax.swing.JLabel();
        jLabelsemester = new javax.swing.JLabel();
        jLabelbook = new javax.swing.JLabel();
        jLabelteacherName = new javax.swing.JLabel();
        StudeInterBG = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(990, 550));
        setMinimumSize(new java.awt.Dimension(990, 550));
        setPreferredSize(new java.awt.Dimension(990, 550));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 30, 150, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 70, 150, 30);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Batch");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 110, 150, 30);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Student Timing");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 150, 150, 30);

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student Days");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 190, 150, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Student Status");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 230, 150, 30);

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Semester Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(550, 60, 130, 30);

        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Semester Book");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(550, 100, 130, 30);

        jLabel9.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(550, 140, 130, 30);

        jLabel10.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Teacher Name");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(550, 180, 130, 30);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Teacher ID");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(550, 220, 130, 30);

        jLabel12.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(250, 30, 170, 30);

        jLabelteacherID.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabelteacherID.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelteacherID);
        jLabelteacherID.setBounds(670, 220, 180, 30);

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(670, 140, 180, 30);

        jComboBox2batchname.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBox2batchname.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2batchnamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(jComboBox2batchname);
        jComboBox2batchname.setBounds(250, 110, 180, 30);

        jTextField1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(250, 70, 180, 30);

        jTable1Student.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jTable1Student.setForeground(new java.awt.Color(255, 255, 255));
        jTable1Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name", "Batch Code", "Semester Name", "Student Days", "Student Timing", "Book", "Teacher Id", "Teacher Name", "Added On", "Student Status"
            }
        ));
        jTable1Student.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1StudentMouseClicked(evt);
            }
        });
        jTable1Student.setOpaque(false);
        ((DefaultTableCellRenderer)jTable1Student.getDefaultRenderer(Object.class)).setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        jTable1Student.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1Student);
        if (jTable1Student.getColumnModel().getColumnCount() > 0) {
            jTable1Student.getColumnModel().getColumn(1).setMinWidth(120);
            jTable1Student.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable1Student.getColumnModel().getColumn(1).setMaxWidth(120);
            jTable1Student.getColumnModel().getColumn(2).setMinWidth(150);
            jTable1Student.getColumnModel().getColumn(2).setPreferredWidth(150);
            jTable1Student.getColumnModel().getColumn(2).setMaxWidth(150);
            jTable1Student.getColumnModel().getColumn(6).setMinWidth(350);
            jTable1Student.getColumnModel().getColumn(6).setPreferredWidth(350);
            jTable1Student.getColumnModel().getColumn(6).setMaxWidth(350);
            jTable1Student.getColumnModel().getColumn(8).setMinWidth(120);
            jTable1Student.getColumnModel().getColumn(8).setPreferredWidth(120);
            jTable1Student.getColumnModel().getColumn(8).setMaxWidth(120);
            jTable1Student.getColumnModel().getColumn(10).setMinWidth(90);
            jTable1Student.getColumnModel().getColumn(10).setPreferredWidth(90);
            jTable1Student.getColumnModel().getColumn(10).setMaxWidth(90);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 330, 860, 170);

        jButtonInsert.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jButtonInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/add.png"))); // NOI18N
        jButtonInsert.setBorder(null);
        jButtonInsert.setBorderPainted(false);
        jButtonInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonInsert);
        jButtonInsert.setBounds(170, 280, 110, 30);

        jButtonUpdate.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/update.png"))); // NOI18N
        jButtonUpdate.setBorder(null);
        jButtonUpdate.setBorderPainted(false);
        jButtonUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUpdate);
        jButtonUpdate.setBounds(420, 280, 110, 30);

        jButtonViewAll.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jButtonViewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/viewAll.png"))); // NOI18N
        jButtonViewAll.setBorder(null);
        jButtonViewAll.setBorderPainted(false);
        jButtonViewAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewAllActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonViewAll);
        jButtonViewAll.setBounds(700, 280, 110, 30);

        jButtonClear.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/clear.png"))); // NOI18N
        jButtonClear.setBorder(null);
        jButtonClear.setBorderPainted(false);
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonClear);
        jButtonClear.setBounds(560, 280, 110, 30);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(440, 70, 70, 30);

        jLabel15.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Total Students");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 10, 120, 30);

        jLabel16.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel16);
        jLabel16.setBounds(700, 10, 110, 30);

        jButtonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/remove.png"))); // NOI18N
        jButtonDelete.setBorder(null);
        jButtonDelete.setBorderPainted(false);
        jButtonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(300, 280, 100, 30);

        jComboBoxStatus.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        getContentPane().add(jComboBoxStatus);
        jComboBoxStatus.setBounds(250, 230, 180, 30);

        jLabeltimeings.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabeltimeings.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabeltimeings);
        jLabeltimeings.setBounds(250, 150, 180, 30);

        jLabeldays.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabeldays.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabeldays);
        jLabeldays.setBounds(250, 190, 180, 30);

        jLabelsemester.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelsemester.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelsemester);
        jLabelsemester.setBounds(670, 60, 180, 30);

        jLabelbook.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabelbook.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelbook);
        jLabelbook.setBounds(670, 100, 240, 30);

        jLabelteacherName.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabelteacherName.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelteacherName);
        jLabelteacherName.setBounds(670, 180, 180, 30);

        StudeInterBG.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        StudeInterBG.setForeground(new java.awt.Color(255, 255, 255));
        StudeInterBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        getContentPane().add(StudeInterBG);
        StudeInterBG.setBounds(0, 0, 990, 520);

        setBounds(0, 0, 990, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooser1.getDate());
            String batch = (String) jComboBox2batchname.getSelectedItem();
            
            String statusStd = (String)jComboBoxStatus.getSelectedItem();
                                    
            PreparedStatement pst = c.xc.prepareStatement("insert into tbl_std values (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, d.trim() );
            pst.setString(2, jLabel12.getText().trim() );
            pst.setString(3, jTextField1.getText().trim());
            pst.setString(4, batch.trim() );
            pst.setString(5, jLabelsemester.getText().trim());
            pst.setString(6, jLabeldays.getText().trim());
            pst.setString(7, jLabeltimeings.getText().trim());
            pst.setString(8, jLabelbook.getText().trim());
            pst.setString(9, jLabelteacherName.getText().trim());
            pst.setString(10, jLabelteacherID.getText().trim());
            pst.setString(11, statusStd.trim());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "Student Data Added Successfully");
            
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Enter Data");
            System.out.println(ex.toString());
            
        }        
        getID ();
        clearingFields();
        clearingTabel();
        getStdData();
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewAllActionPerformed
        // TODO add your handling code here:
        
        try {
            clearingTabel();
            
            DefaultTableModel dt = (DefaultTableModel)jTable1Student.getModel();
            
            ResultSet rs = c.st.executeQuery("select std_id as 'Student Id', std_name as 'Student Name', std_batch_code as 'Batch Code', semester_name as 'Semester Name', std_days as 'Student Days', std_time as 'Student Timing', std_book as 'Book', teacher_id as 'Teacher Id', teacher_name as 'Teacher Name', date_added as 'Added On', std_status as 'Student Status' from tbl_std");
            while (rs.next()) {
                dt.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11)});
            }
            jTable1Student.setModel(dt);
            
        }
        catch(Exception ex ) {
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_jButtonViewAllActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        try {
            PreparedStatement pst = c.xc.prepareStatement("update tbl_std set date_added = ?, std_name = ?, std_batch_code = ?, semester_name = ?, std_days = ?, std_time = ?, std_book = ?, teacher_name = ?, teacher_id = ?, std_status = ? where std_id = ?");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(jDateChooser1.getDate());
            String batch = (String) jComboBox2batchname.getSelectedItem();
            
            pst.setString(1, d.trim() );
            pst.setString(2, jTextField1.getText().trim() );
            pst.setString(3, batch.trim() );
            pst.setString(4, jLabelsemester.getText().trim());
            pst.setString(5, jLabeldays.getText().trim());
            pst.setString(6, jLabeltimeings.getText().trim());
            pst.setString(7, jLabelbook.getText().trim());
            pst.setString(8, jLabelteacherName.getText().trim());
            pst.setString(9, jLabelteacherID.getText().trim());
            pst.setString(10, jComboBoxStatus.getSelectedItem().toString().trim());
            pst.setString(11, jLabel12.getText().trim() );
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "Updated Successfully");
            
            
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Please Fill all the Text Fields");
        }
        
        clearingFields();
        clearingTabel();
        getStdData();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTable1StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1StudentMouseClicked
        // TODO add your handling code here:
        
        int i = jTable1Student.getSelectedRow();
        jLabel12.setText(jTable1Student.getModel().getValueAt(i, 0).toString().trim());
        jTextField1.setText(jTable1Student.getModel().getValueAt(i, 1).toString().trim());
        jComboBox2batchname.setSelectedItem(jTable1Student.getModel().getValueAt(i, 2).toString().trim());
        jLabelsemester.setText(jTable1Student.getModel().getValueAt(i, 3).toString().trim());
        jLabeldays.setText(jTable1Student.getModel().getValueAt(i, 4).toString().trim());
        jLabeltimeings.setText(jTable1Student.getModel().getValueAt(i, 5).toString().trim());
        jLabelbook.setText(jTable1Student.getModel().getValueAt(i, 6).toString().trim());
        jLabelteacherID.setText(jTable1Student.getModel().getValueAt(i, 7).toString().trim());
        jLabelteacherName.setText(jTable1Student.getModel().getValueAt(i, 8).toString().trim());
        jComboBoxStatus.setSelectedItem(jTable1Student.getModel().getValueAt(i, 10).toString().trim());
        
    }//GEN-LAST:event_jTable1StudentMouseClicked

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        
        clearingFields();
               
        
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        // TODO add your handling code here:
        jLabel14.setText(v.validateData("[A-Za-z0-9-]{3,30}", jTextField1.getText()));
        if (jLabel14.getText().equals("Valid")) {
            jLabel14.setForeground(Color.green);
        }
        else {
            jLabel14.setForeground(Color.red);
        }
    }//GEN-LAST:event_jTextField1CaretUpdate

    private void jComboBox2batchnamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2batchnamePopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        
        //total number of student in selected bstch
        totalstd();
        
        try {
            ResultSet rs = c.st.executeQuery("select batch_time, batch_days, semester_name, batch_book, teacher_name,teacher_id from tbl_batch where batch_code = '"+jComboBox2batchname.getSelectedItem()+"'");
            while(rs.next()){
                jLabeltimeings.setText(rs.getString(1));
                jLabeldays.setText(rs.getString(2));
                jLabelsemester.setText(rs.getString(3));
                jLabelbook.setText(rs.getString(4));
                jLabelteacherName.setText(rs.getString(5));
                jLabelteacherID.setText(rs.getString(6));
            }
        }
        catch(Exception ex){
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_jComboBox2batchnamePopupMenuWillBecomeInvisible

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        try {
            c.st.executeUpdate("update tbl_std set std_status = 'false' where std_id = '"+jLabel12.getText()+"'");
            
            JOptionPane.showMessageDialog(this, "Student with Id "+jLabel12.getText()+" is deleted");
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        getStdData();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        
         
        /**
         * Restricting Using from Marking Attendance on future date
         */
        try{
            //JDateChooser Format
            SimpleDateFormat comparedate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String finaldate = comparedate.format(jDateChooser1.getDate());
            
            //Current Date Formats
            DateFormat dateFormatcurrrent = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date date = new java.util.Date();
            String matchdate = dateFormatcurrrent.format(date);
            
            if(finaldate.compareTo(matchdate) > 0){
                JOptionPane.showMessageDialog(null, "Your can't Add future date", "Future Date", JOptionPane.WARNING_MESSAGE);
                jButtonInsert.setEnabled(false);
            }
            else {
                jButtonInsert.setEnabled(true);
            }
        } catch(Exception ex){
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_jDateChooser1PropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel StudeInterBG;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonViewAll;
    private javax.swing.JComboBox<String> jComboBox2batchname;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelbook;
    private javax.swing.JLabel jLabeldays;
    private javax.swing.JLabel jLabelsemester;
    private javax.swing.JLabel jLabelteacherID;
    private javax.swing.JLabel jLabelteacherName;
    private javax.swing.JLabel jLabeltimeings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1Student;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
