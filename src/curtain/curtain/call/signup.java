
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package curtain.call;

import java.awt.Color;
import java.awt.Image;
import java.beans.Statement;
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
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
        //setSize(900,800);
          setSize(900,650);
          
       // setVisible(true);
       // photolb.setBounds(0,0,1536,864);
       //ImageIcon i1 = new ImageIcon("src/photos/8.jpg");
       // Image img = i1.getImage().getScaledInstance(photolb.getWidth(),photolb.getHeight(), Image.SCALE_SMOOTH);
       //ImageIcon i2 = new ImageIcon(img);
       //photolb.setIcon(i2);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jname = new javax.swing.JTextField();
        juname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jphone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(410, 160, 100, 34);

        jname.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jname.setText("ENTER YOUR NAME");
        jname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jnameMouseClicked(evt);
            }
        });
        jname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnameActionPerformed(evt);
            }
        });
        getContentPane().add(jname);
        jname.setBounds(610, 150, 220, 40);

        juname.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        juname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        juname.setText("ENTER YOUR USERNAME");
        juname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                junameMouseClicked(evt);
            }
        });
        getContentPane().add(juname);
        juname.setBounds(610, 220, 220, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel5.setText("Username");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 230, 150, 34);

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel6.setText("Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(380, 440, 160, 30);

        jpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpassMouseClicked(evt);
            }
        });
        getContentPane().add(jpass);
        jpass.setBounds(610, 440, 220, 40);

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel7.setText("Phone");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 370, 120, 30);

        jphone.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jphone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jphone.setText("ENTER YOUR CONTACT NUMBER");
        jphone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jphoneMouseClicked(evt);
            }
        });
        getContentPane().add(jphone);
        jphone.setBounds(610, 370, 220, 40);

        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 530, 130, 40);

        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(600, 530, 160, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel2.setText("Email");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 300, 120, 34);

        jemail.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jemail.setText("ENTER YOUR EMAIL");
        jemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jemailMouseClicked(evt);
            }
        });
        getContentPane().add(jemail);
        jemail.setBounds(610, 290, 220, 40);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setText("Registration Form");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 30, 380, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/reg7-removebg-preview.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-150, 60, 541, 510);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/img20.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 900, 640);

        jLabel9.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel9.setText("Name");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 160, 100, 34);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nam=jname.getText();
        String u_nam=juname.getText();
        String E_mail=jemail.getText();
        String phn=jphone.getText();
        String pas=jpass.getText();
      if(nam.equals("")||u_nam.equals("")||E_mail.equals("")||phn.equals("")||pas.equals("")){
          JOptionPane.showMessageDialog(this,"all fields are manadatory");
      }
      else{
        
        //PreparedStatement st=(PreparedStatement)
        // ResultSet rs= DBloader.executeSQL("INSERT INTO user(`Name`, `username`, `Phone`, `Email`, `password`) VALUES ( '"+nam+"', '"+u_nam+"', '"+E_mail+"', '"+phn+"', '"+pas+"')");
        //JOptionPane.showMessageDialog(this,"your  account created");
        
        // java.sql.Statement s =conn.createStatement();
        // java.sql.Statement s=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        try{
       // String s1=("insert into user values('"+nam+"', '"+u_nam+"', '"+E_mail+"', '"+phn+"', '"+pas+"')");
        //System.out.println("success");
       // ResultSet rs= DBloader.executeSQL(s1);
                ResultSet rs = DBloader.executeSQL("select * from user");

                rs.moveToInsertRow();
                rs.updateString("name", nam);
                rs.updateString("username", u_nam);
                 rs.updateString("email", E_mail);
                  rs.updateString("phone", phn);
                   rs.updateString("password", pas);
                rs.insertRow();
        JOptionPane.showMessageDialog(this,"your  account created");
         //DBloader.executeUpdate(s1);
        }
        catch(Exception e)
       {
           Logger.getLogger(signup.class.getName()).log(Level.SEVERE,null,e);
       }
      }
      login obj=new login();
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        startpage1 obj=new startpage1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnameActionPerformed

    private void jnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnameMouseClicked
        // TODO add your handling code here:
        jname.setText(null);
        
    }//GEN-LAST:event_jnameMouseClicked

    private void junameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_junameMouseClicked
    juname.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_junameMouseClicked

    private void jemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jemailMouseClicked
    jemail.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jemailMouseClicked

    private void jphoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jphoneMouseClicked
    jphone.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jphoneMouseClicked

    private void jpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpassMouseClicked
    jpass.setText(null);        // TODO add your handling code here:
    }//GEN-LAST:event_jpassMouseClicked

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JTextField jphone;
    private javax.swing.JTextField juname;
    // End of variables declaration//GEN-END:variables

       }
    