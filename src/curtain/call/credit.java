/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package curtain.call;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import curtain.call.moviedetails;
import static curtain.call.moviedetails.jtt1;
import curtain.call.payment;

/**
 *
 * @author 91788
 */
public class credit extends javax.swing.JFrame {

    /**
     * Creates new form credit
     */
    public credit() {
        initComponents();
        setSize(950,710);
          jt1.setText("");
         jt2.setText("");
          jt3.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jt1 = new javax.swing.JTextField();
        jt2 = new javax.swing.JTextField();
        jt3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jc2 = new javax.swing.JComboBox<>();
        jc1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta3 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel2.setText("Card Number :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 20, 210, 30);

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel3.setText("Card Holder Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 130, 300, 40);

        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel4.setText("CVV :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 250, 70, 30);

        jButton1.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(40, 320, 170, 40);

        jt1.setText("jTextField1");
        jPanel1.add(jt1);
        jt1.setBounds(30, 70, 310, 40);

        jt2.setText("jTextField2");
        jPanel1.add(jt2);
        jt2.setBounds(20, 180, 320, 40);

        jt3.setText("jTextField3");
        jPanel1.add(jt3);
        jt3.setBounds(120, 250, 60, 30);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jLabel5.setText("EXP :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(200, 250, 90, 30);

        jc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029" }));
        jPanel1.add(jc2);
        jc2.setBounds(360, 250, 72, 30);

        jc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        jPanel1.add(jc1);
        jc1.setBounds(270, 250, 72, 30);

        jButton2.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jButton2.setText("Confirm ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(220, 320, 170, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 150, 460, 420);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 36)); // NOI18N
        jLabel1.setText("Card  Details ::");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 0, 460, 70);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 60, 340, 60);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jta3.setColumns(20);
        jta3.setRows(5);
        jta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jta3);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(50, 30, 300, 360);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(510, 150, 390, 420);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 1, 24)); // NOI18N
        jLabel6.setText("Confirm Details ::");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(560, 70, 290, 50);

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel7.setText("Confirm Details");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 20, 340, 40);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(540, 50, 380, 70);

        jButton3.setFont(new java.awt.Font("Lucida Handwriting", 0, 24)); // NOI18N
        jButton3.setText("Generate Receipt");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(360, 602, 290, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/img20.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1, 0, 2480, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String numberr=jt1.getText();
         String namee=jt2.getText();
         String cvvv=jt3.getText();
          
        try{
            ResultSet rs=DBloader.executeSQL("select * from card");
            rs.moveToInsertRow();
            String exp=jc1.getSelectedItem().toString();
            String expy=jc2.getSelectedItem().toString();
            
            rs.updateString("number", numberr);
            rs.updateString("name", namee);
            rs.updateString("cvv", cvvv);
            rs.updateString("expire", exp);
            rs.updateString("expirey", expy);
             rs.insertRow();
                JOptionPane.showMessageDialog(this,"Payment Successful");
                 
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jta3.append("================="+
                "card no is:\t\t"+jt1.getText()+"\n"+
                "name of card holder is:\t\t"+jt3.getText()+"\n"+
                "Exp Month is:\t\t"+jc1.getSelectedItem().toString()+"\n\n"+
                "Expiry Year is:\t\t"+jc2.getSelectedItem().toString()+"\n"+
                "==================="
                        
                );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        receipt obj=new receipt();
        receipt.jta4.setText(credit.jta3.getText());  
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
            java.util.logging.Logger.getLogger(credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(credit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new credit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jc1;
    private javax.swing.JComboBox<String> jc2;
    private javax.swing.JTextField jt1;
    private javax.swing.JTextField jt2;
    private javax.swing.JTextField jt3;
    public static javax.swing.JTextArea jta3;
    // End of variables declaration//GEN-END:variables
}
