/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package curtain.call;

import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import curtain.call.DBloader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 91788
 */

public class moviedetails extends javax.swing.JFrame {

    /**
     * Creates new form moviedetails
     */
    public moviedetails() {
        initComponents();
        setSize(1300,800);
        setVisible(true);
        jt1.setText("");
        jt2.setText("");
        //setbackground(COLOR.CYAN);
         getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jc1 = new javax.swing.JComboBox<>();
        jc2 = new javax.swing.JComboBox<>();
        jc3 = new javax.swing.JComboBox<>();
        jc4 = new javax.swing.JComboBox<>();
        jt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtt1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Select Movie ::");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 260, 210, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Theatre ::");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 320, 200, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Date ::");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 360, 150, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Time ::");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 420, 140, 30);

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No Of Tickets ::");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 480, 170, 30);

        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(250, 550, 210, 50);

        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ram Setu", "Puaada", "Drishyam 2" }));
        jc1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jc1);
        jc1.setBounds(240, 260, 160, 30);

        jc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinepolis", "Ambessador Movie plaza", "Curtain call" }));
        jc2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jc2);
        jc2.setBounds(240, 320, 160, 30);

        jc3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10  nov", "14 nov", "16 nov", "18 nov", "20 nov" }));
        jc3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jc3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jc3);
        jc3.setBounds(240, 370, 160, 30);

        jc4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:A.M", "12:P.M", "14:P.M", "16:P.M", "21:P.M" }));
        jc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc4ActionPerformed(evt);
            }
        });
        getContentPane().add(jc4);
        jc4.setBounds(240, 420, 170, 30);

        jt1.setText("jTextField1");
        getContentPane().add(jt1);
        jt1.setBounds(240, 480, 71, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/wel13.gif"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 0, 200, 210);

        jtt1.setColumns(20);
        jtt1.setRows(5);
        jScrollPane1.setViewportView(jtt1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(530, 150, 410, 380);

        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jButton2.setText("Add Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 550, 220, 50);

        jt2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jt2.setText("jTextField1");
        getContentPane().add(jt2);
        jt2.setBounds(740, 550, 200, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("Total Fare:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(530, 550, 200, 40);

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("Movie Details::");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(570, 60, 390, 60);

        jButton3.setFont(new java.awt.Font("Lucida Handwriting", 0, 18)); // NOI18N
        jButton3.setText("Continue  for Payment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 620, 340, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ticketts=jt1.getText();
        
         String faree=jt2.getText();
         
         
        try{
            ResultSet rs=DBloader.executeSQL("select * from detailss");
            rs.moveToInsertRow();
           // while(rs.next()){
           // String moviee = rs.getString("movie");
            // String theatree = rs.getString("theatre");
              //String datee = rs.getString("date");
              // String timee = rs.getString("time");
               // String ticketss = rs.getString("tickets");
                //jc1.addItem(moviee);
                //jc1.addItem(theatree);
                //jc1.addItem(datee);
                //jc1.addItem(timee);
                 rs.updateString("tickets", ticketts);
                 rs.updateString("fare", faree);
        //    String moviee="";
          //       rs.updateString("movie", moviee);
           // String theatree = null;
             //    rs.updateString("theatre", theatree);
            //String datee = null;
              //   rs.updateString("date", datee);
            //String timee = null;
              //   rs.updateString("time", timee);
              String moviee=jc1.getSelectedItem().toString();
               String theatree=jc2.getSelectedItem().toString();
               String datee=jc3.getSelectedItem().toString();
                String timee=jc4.getSelectedItem().toString();
                
                rs.updateString("movie", moviee);
                rs.updateString("theatre", theatree);
                rs.updateString("time", timee);
                rs.updateString("date", datee);
               // rs.updateString("fare", datee);
                
                jt2.setText(faree);
               // rs.setString(moviee);
                
                rs.insertRow();
                JOptionPane.showMessageDialog(this,"movie seleceted successfully");
                
            //new payment(ticketts).setVisible(true);
            //setVisible(false);
            
            
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jc1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc1ItemStateChanged
        // TODO add your handling code here:
        String moviee=jc1.getSelectedItem().toString();
       
    }//GEN-LAST:event_jc1ItemStateChanged

    private void jc2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc2ItemStateChanged
        // TODO add your handling code here:
         String theatree=jc2.getSelectedItem().toString();
    }//GEN-LAST:event_jc2ItemStateChanged

    private void jc3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jc3ItemStateChanged
        // TODO add your handling code here:
         String datee=jc3.getSelectedItem().toString();
    }//GEN-LAST:event_jc3ItemStateChanged

    private void jc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc4ActionPerformed
        // TODO add your handling code here:
         String timee=jc4.getSelectedItem().toString();
    }//GEN-LAST:event_jc4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int num=Integer.parseInt(jt1.getText());
        int tot=num*20;
        String tots = String.valueOf(tot);
        
        System.out.println(String.valueOf(tot));
       jt2.setText(tots);
        
        jtt1.append("\t\t Movie Details\n\n"+
                "\n ===========================================================\n"+
                "Selected Movie:\t\t"+jc1.getSelectedItem().toString()+"\n\n"+
                "Selected theatre:\t\t"+jc2.getSelectedItem().toString()+"\n\n"+
                "Selected Date:\t\t"+jc3.getSelectedItem().toString()+"\n\n"+
                "Selected timing:\t\t"+jc4.getSelectedItem().toString()+"\n\n"+
                "no of tickets:\t\t"+jt1.getText()+"\n\n"+
                "total fare:\t\t"+ tots +"\n"+
              //  "total fare:\t\t"+jt2.getText()+"\n"+
                
                "================================================================"
                        
            +""     );
        
       // String ticketts=jt1.getText();
       
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
              
           payment obj=new payment();
           payment.jta1.setText(moviedetails.jtt1.getText());  
           
                      // payment.jta1.setText(moviedetails.jt2.getText());
           obj.setVisible(true);
            
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(moviedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(moviedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(moviedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(moviedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new moviedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JComboBox<String> jc2;
    private javax.swing.JComboBox<String> jc3;
    private javax.swing.JComboBox<String> jc4;
    private javax.swing.JTextField jt1;
    public static javax.swing.JTextField jt2;
    public static javax.swing.JTextArea jtt1;
    // End of variables declaration//GEN-END:variables
}