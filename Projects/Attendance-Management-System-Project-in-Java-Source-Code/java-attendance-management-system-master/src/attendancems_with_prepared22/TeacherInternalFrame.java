/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendancems_with_prepared22;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Iqbal-Asi
 */
public class TeacherInternalFrame extends javax.swing.JInternalFrame {
ConnectClass c;
    /**
     * Creates new form TeaherInternalFrame
     */
    public TeacherInternalFrame() {
        initComponents();
        c = new ConnectClass();
        
        //
        setTitle("Select Batch");
        
        teacherName();
        
        
        // Call fillcombo method on On load event
        fillcombo();
    
        
    }
    
    /**
     * Getting Teacher Name through user_name from login frame
     */
    public void teacherName() {
        try {
            String b = LoginFrame.jTextField1.getText();
            ResultSet rs = c.xc.createStatement().executeQuery("select teacher_name from tbl_teacher where [user_name] = '" + b + "'");
            while(rs.next()){
                teacherNameLabel.setText(rs.getString(1));
            }           
        }
        catch(Exception ex) {
            System.out.println( ex.toString());
        }
    }
    
    
    /**
     * Method for filling ComboBox with Database
     */
    public void fillcombo(){
        try {
            
            PreparedStatement pst = c.xc.prepareStatement("select batch_code from tbl_batch join tbl_teacher on tbl_batch.teacher_id = tbl_teacher.teacher_id where tbl_teacher.teacher_name = ? and teacher_status = 'true'");
            pst.setString(1, teacherNameLabel.getText());
                       
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                TeacherInternalFrame.jComboBox1.addItem(rs.getString(1));
            }
            
        }
        catch(Exception ex) {
           System.out.println( ex.toString());
        }
    }
    
    public static JComboBox getComboBox() {
        
        return jComboBox1;
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
        teacherNameLabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        BatchSelectionBG = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Teacher Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 170, 100, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Batch Code");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 210, 100, 30);

        teacherNameLabel.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        teacherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(teacherNameLabel);
        teacherNameLabel.setBounds(390, 170, 180, 30);

        jComboBox1.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 210, 180, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/next.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 280, 150, 40);

        BatchSelectionBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendancems_with_prepared22/Project_Images/FrameBG.png"))); // NOI18N
        getContentPane().add(BatchSelectionBG);
        BatchSelectionBG.setBounds(0, 0, 790, 520);

        setBounds(0, 0, 800, 550);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        
        try {
            
            String getValue = (String)jComboBox1.getSelectedItem().toString();
            
            PreparedStatement pst = c.xc.prepareStatement("select batch_code from tbl_batch join tbl_teacher on tbl_batch.teacher_id = tbl_teacher.teacher_id where tbl_teacher.teacher_name = ? and batch_status = 'true'");
            pst.setString(1, TeacherInternalFrame.teacherNameLabel.getText() );
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
               AttendFrame.jLabel1batchCode.setText(getValue);
            }           
        }
        catch(Exception ex) {
           System.out.println( ex.toString());
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        AttendFrame.jButton1.setEnabled(true);
        AttendFrame.jButton2.setEnabled(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BatchSelectionBG;
    private javax.swing.JButton jButton1;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel teacherNameLabel;
    // End of variables declaration//GEN-END:variables
}
