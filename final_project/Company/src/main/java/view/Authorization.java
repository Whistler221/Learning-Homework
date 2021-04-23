/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OperatorProcessing;
import java.awt.event.KeyEvent;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import model.Operator;

/**
 *
 * @author filip
 */
public class Authorization extends javax.swing.JFrame {

    /**
     * Creates new form Authorization
     */
    public Authorization() {
        initComponents();
        setTitle(Application.TITLE_APP);
        txtEmail.setText("filip.klobucar1@hotmail.com");
        pswPassword.setText("Company");
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
        txtEmail = new javax.swing.JTextField();
        pswPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Company");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/company.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        pswPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        pswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pswPasswordKeyReleased(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(pswPassword)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && !txtEmail.getText().isEmpty()) {
            pswPassword.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void pswPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER && pswPassword.getPassword().length > 0) {
            login();
        }

    }//GEN-LAST:event_pswPasswordKeyReleased

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        login();
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void login() {
        if (txtEmail.getText().isEmpty()) {
            errorProcessing(txtEmail, "Email is mandatory");
            return;
        }
        try {
            InternetAddress email = new InternetAddress(txtEmail.getText());
            email.validate();
        } catch (AddressException e) {
            errorProcessing(txtEmail, "Email is not correct");
            return;
        }

        if (pswPassword.getPassword().length == 0) {
            errorProcessing(pswPassword, "Password is mandatory");
            return;
        }

        
        OperatorProcessing op = new OperatorProcessing();
        Operator o = op.authorize(txtEmail.getText(), pswPassword.getPassword());
        
        if(o==null){
            errorProcessing(pswPassword, "Email and Password do not match");
            return;
          }
        o.setPassword(null);
        Application.operator=o;
        new Menu().setVisible(true);
        dispose();
        
        //Application.operator=o;
    }

    private void errorProcessing(JComponent component, String message) {
        component.requestFocus();
        JOptionPane.showMessageDialog(rootPane, message);
    }
}
