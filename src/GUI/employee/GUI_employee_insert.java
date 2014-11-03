/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.employee;

import basicas.person.Employee;
import facade.Facade;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Livia
 */
public class GUI_employee_insert extends javax.swing.JFrame {
    
    SimpleDateFormat data;
    GUI_employee formParent;
    
    public GUI_employee_insert(GUI_employee form) {
        this.data = new SimpleDateFormat("dd-mm-yyyy");
        this.formParent = form;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        txtPosition = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtPhone = new javax.swing.JFormattedTextField();
        rdComum = new javax.swing.JRadioButton();
        rdAdmin = new javax.swing.JRadioButton();
        dtpDOB = new datechooser.beans.DateChooserCombo();
        lblLogin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Novo Funcionário");

        btnInsert.setText("Inserir");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Posição:");

        btnGoBack.setText("Voltar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        lblDOB.setText("Data de Nascimento:");

        try {
            txtPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonGroup1.add(rdComum);
        rdComum.setSelected(true);
        rdComum.setText("Comum");

        buttonGroup1.add(rdAdmin);
        rdAdmin.setText("Admin");

        try {
            dtpDOB.setDefaultPeriods(new datechooser.model.multiple.PeriodSet());
        } catch (datechooser.model.exeptions.IncompatibleDataExeption e1) {
            e1.printStackTrace();
        }
        dtpDOB.setLocale(new java.util.Locale("pt", "", ""));

        lblLogin.setText("Login:");

        lblPassword.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDOB)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dtpDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 57, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblLogin)
                                    .addComponent(lblPassword))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addComponent(txtLogin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdComum)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdAdmin))
                                    .addComponent(txtPosition))))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDOB)
                    .addComponent(dtpDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdComum)
                    .addComponent(rdAdmin))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
            Employee s = new Employee();
            
            s.setName(txtName.getText());
            
            Date dob = null;
            try {
                dob = new Date(data.parse(dtpDOB.getText()).getTime());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma DATA DE NASCIMENTO");
            }
            s.setDob(dob);
            
            s.setPhone(txtPhone.getText());
            //            int teste = s.getPhone().length();
            s.setPosition(txtPosition.getText());            
            
            boolean isAdmin;
            if (rdAdmin.isSelected()) {
                isAdmin = true;
            } else {
                isAdmin = false;
            }
            s.setAdmin(isAdmin);
            
            s.setLogin(txtLogin.getText());
            s.setPassword(txtPassword.getText());
            
            Facade fa = new Facade();
            
            fa.insert(s);
            formParent.listAll();
            
            int opc = JOptionPane.showConfirmDialog(rootPane, "Funcionário cadastrado com sucesso \nDeseja cadastrar outro Funcionário?", "Novo Funcionário", JOptionPane.OK_CANCEL_OPTION);
            if (opc == JOptionPane.YES_OPTION) {
            } else {
                dispose();
            }
            
            txtName.setText("");
            dtpDOB.setText("");
            txtPosition.setText("");
            txtPhone.setText("");
            rdComum.setSelected(true); 
            txtLogin.setText("");
            txtPassword.setText("");
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        dispose();
//        new GUI_employee().setVisible(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_employee_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_employee_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_employee_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_employee_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_employee_insert(new GUI_employee()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnInsert;
    private javax.swing.ButtonGroup buttonGroup1;
    private datechooser.beans.DateChooserCombo dtpDOB;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JRadioButton rdAdmin;
    private javax.swing.JRadioButton rdComum;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtPosition;
    // End of variables declaration//GEN-END:variables
}
