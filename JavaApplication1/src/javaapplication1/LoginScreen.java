/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;
import java.awt.Color;
import java.awt.Cursor;
import static java.sql.JDBCType.NULL;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication1.MainApp.VerifyUser;

import javax.swing.JOptionPane;


public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    static String utilizatorPublic;
  static boolean foodAdded=false;
    public LoginScreen() {
        initComponents();
       // LoginScreen loginScreen = new LoginScreen();
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textUserLogin = new javax.swing.JTextField();
        buttonLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PassForgot = new javax.swing.JButton();
        textPasswordLogin = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        radioDa = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        buttonCreateNewAccount = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(920, 442));

        jLabel5.setFont(new java.awt.Font("MingLiU-ExtB", 1, 21)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bine ai venit !");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Introduceti datele de conectare");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 282, -1));

        textUserLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textUserLogin.setText("Utilizator");
        textUserLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textUserLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textUserLoginFocusLost(evt);
            }
        });
        jPanel1.add(textUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 114, 202, -1));

        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(buttonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 211, 202, -1));

        jLabel2.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 12)); // NOI18N
        jLabel2.setText("Utilizator");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 93, -1, -1));

        jLabel3.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 12)); // NOI18N
        jLabel3.setText("Parola");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        PassForgot.setForeground(new java.awt.Color(255, 0, 0));
        PassForgot.setText("Am uitat parola");
        PassForgot.setBorderPainted(false);
        PassForgot.setContentAreaFilled(false);
        PassForgot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        PassForgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassForgotMouseEntered(evt);
            }
        });
        PassForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassForgotActionPerformed(evt);
            }
        });
        jPanel1.add(PassForgot, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 182, -1, -1));

        textPasswordLogin.setText("parola");
        textPasswordLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textPasswordLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textPasswordLoginFocusLost(evt);
            }
        });
        textPasswordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordLoginActionPerformed(evt);
            }
        });
        jPanel1.add(textPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 161, 202, -1));

        jLabel7.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        jLabel7.setText("Manager ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        radioDa.setText("Da");
        radioDa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDaActionPerformed(evt);
            }
        });
        jPanel1.add(radioDa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        radioNu.setText("Nu");
        jPanel1.add(radioNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Nu ai un cont?");

        buttonCreateNewAccount.setFont(new java.awt.Font("MingLiU_HKSCS-ExtB", 0, 14)); // NOI18N
        buttonCreateNewAccount.setBorderPainted(false);
        buttonCreateNewAccount.setContentAreaFilled(false);
        buttonCreateNewAccount.setLabel("Creeaza unul");
        buttonCreateNewAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCreateNewAccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCreateNewAccountMouseEntered(evt);
            }
        });
        buttonCreateNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateNewAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonCreateNewAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(buttonCreateNewAccount))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/img/logoPrajitura_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassForgotActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PassRecovery recover=new PassRecovery();
        recover.setVisible(true);
    }//GEN-LAST:event_PassForgotActionPerformed

    private void PassForgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassForgotMouseEntered
        // TODO add your handling code here:
       // System.out.println("hovering");
        PassForgot.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_PassForgotMouseEntered

    private void buttonCreateNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateNewAccountActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonCreateNewAccountActionPerformed

    private void buttonCreateNewAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreateNewAccountMouseEntered
        // TODO add your handling code here:
         buttonCreateNewAccount.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_buttonCreateNewAccountMouseEntered

    private void buttonCreateNewAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCreateNewAccountMouseClicked
        // TODO add your handling code here:
        CreateNewAccount newAccWindow = new CreateNewAccount();
      this.setVisible(false);
        newAccWindow.setVisible(true);
    }//GEN-LAST:event_buttonCreateNewAccountMouseClicked

    private void textUserLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUserLoginFocusGained
        // TODO add your handling code here:
        if(textUserLogin.getText().trim().toLowerCase().equals("utilizator"))
        {
            textUserLogin.setText("");
            textUserLogin.setForeground(Color.black);
        }

    }//GEN-LAST:event_textUserLoginFocusGained

    private void textUserLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUserLoginFocusLost
        // TODO add your handling code here:
        if(textUserLogin.getText().trim().equals("") || textUserLogin.getText().trim().toLowerCase().equals("utilizator"))
        {
            textUserLogin.setText("utilizator");
            textUserLogin.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_textUserLoginFocusLost

    private void textPasswordLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPasswordLoginFocusGained
        // TODO add your handling code here:
        String parola = String.valueOf(textPasswordLogin.getPassword());
        if(parola.trim().toLowerCase().equals("parola"))
        {
            textPasswordLogin.setText("");
            textPasswordLogin.setForeground(Color.black);
        }

    }//GEN-LAST:event_textPasswordLoginFocusGained

    private void textPasswordLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textPasswordLoginFocusLost
        // TODO add your handling code here:
        String parola = String.valueOf(textPasswordLogin.getPassword());
        
        if(parola.trim().equals("") || parola.trim().toLowerCase().equals("parola"))
        {
            textPasswordLogin.setText("Parola");
            textPasswordLogin.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_textPasswordLoginFocusLost

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        String utilizator;
        String parola;
        String manager="0";
        int accepted=0;
        
        utilizator = textUserLogin.getText(); // preluare nume utilizator
        utilizatorPublic=utilizator;
        parola=textPasswordLogin.getText(); // preluare parola utilizator
        if(radioDa.isSelected()&&!radioNu.isSelected())manager=String.valueOf(1);
        else manager=String.valueOf(0);
        System.out.println(manager);
        try {
            accepted=VerifyUser(utilizator,parola,manager); // verificare date utilizator 
        } catch (SQLException ex) {
            Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        if(accepted==1) // daca datele au fost acceptate (nume/parola)
        {
            //JOptionPane.showMessageDialog(null,"CONECTAT !");
            ShopMainScreen main = null;
            try {
                main = new ShopMainScreen(); // deschidere interfata principala 
            } catch (SQLException ex) {
                Logger.getLogger(LoginScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            main.setVisible(true);
            this.setVisible(false); // ascundere interfata logare
           
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Datele introduse nu sunt valide !");
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void textPasswordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordLoginActionPerformed
        // TODO add your handling code here:
        buttonLoginActionPerformed(evt);
    }//GEN-LAST:event_textPasswordLoginActionPerformed

    private void radioDaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDaActionPerformed

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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PassForgot;
    private javax.swing.JButton buttonCreateNewAccount;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton radioDa;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JPasswordField textPasswordLogin;
    private javax.swing.JTextField textUserLogin;
    // End of variables declaration//GEN-END:variables
}
