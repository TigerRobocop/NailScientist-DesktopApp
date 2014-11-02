/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.polish;

import GUI.Main;
import GUI.brand.GUI_Brand_insert;
import GUI.brand.GUI_Brands;
import GUI.finish.GUI_Finish;
import GUI.finish.GUI_finish_insert;
import basicas.polish.Brand;
import basicas.polish.Finish;
import basicas.polish.Polish;
import facade.Facade;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Livia
 */
public class GUI_polish_insert extends javax.swing.JFrame {

    private List<Brand> listBrands;
    private List<Finish> listFinish;

    public GUI_polish_insert() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.loadBrands();
        comboBrands.setSelectedIndex(-1);
        this.loadFinish();
        comboFinish.setSelectedIndex(-1);
    }

    public void loadBrands() {
        try {
            Facade fa = new Facade();

            this.listBrands = fa.listAllBrand();

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();

            for (int i = 0; i < this.listBrands.size(); i++) {
                modelo.addElement(this.listBrands.get(i).getName());
            }

            comboBrands.setModel(modelo);

        } catch (Exception me) {
            JOptionPane.showMessageDialog(rootPane, me.getMessage());
        }
    }

    public void loadFinish() {
        try {
            Facade fa = new Facade();

            this.listFinish = fa.listAllFinish();

            DefaultComboBoxModel modelof = new DefaultComboBoxModel();

            for (int i = 0; i < this.listFinish.size(); i++) {
                modelof.addElement(this.listFinish.get(i).getName());
            }

            comboFinish.setModel(modelof);
        } catch (Exception fe) {
            JOptionPane.showMessageDialog(rootPane, fe.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsert = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        comboBrands = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboFinish = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBrandMgr = new javax.swing.JButton();
        btnGoBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNamePolish = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        btnFisishMgr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnInsert.setText("Inserir");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jLabel3.setText("Marca:");

        comboBrands.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma marca" }));

        jLabel4.setText("Nome:");

        comboFinish.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um acabamento" }));

        jLabel5.setText("Finalização:");

        jLabel6.setText("Descrição da Cor:");

        btnBrandMgr.setText("Nova Marca");
        btnBrandMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandMgrActionPerformed(evt);
            }
        });

        btnGoBack.setText("Voltar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Cadastro de Novo Esmalte");

        btnFisishMgr.setText("Novo Acabamento");
        btnFisishMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFisishMgrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtNamePolish, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(28, 28, 28)
                            .addComponent(comboBrands, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBrandMgr, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnFisishMgr))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addComponent(jLabel8)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboBrands, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrandMgr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamePolish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFisishMgr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel8)
                    .addContainerGap(202, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try {
            Polish s = new Polish();

            int marca = comboBrands.getSelectedIndex();
            s.setBrand(this.listBrands.get(marca));

            s.setName(txtNamePolish.getText());

            int finalizacao = comboFinish.getSelectedIndex();

            s.setFinish(this.listFinish.get(finalizacao));

            s.setColor(txtColor.getText());

            Facade fa = new Facade();

            fa.insert(s);

            int opc = JOptionPane.showConfirmDialog(rootPane, "Item cadastrado com sucesso \nDeseja cadastrar outro item?", "Novo Esmalte", JOptionPane.OK_CANCEL_OPTION);
            if (opc == JOptionPane.YES_OPTION) {
            } else {
                dispose();
            }

            comboBrands.setSelectedIndex(-1);
            txtNamePolish.setText("");
            comboFinish.setSelectedIndex(-1);
            txtColor.setText("");

        } catch (ArrayIndexOutOfBoundsException ex) {
            int marca = comboBrands.getSelectedIndex();
            if (marca < 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione uma marca");
            }

            int finalizacao = comboFinish.getSelectedIndex();
            if (finalizacao < 0) {
                JOptionPane.showMessageDialog(rootPane, "Selecione um acabamento");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }

    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnBrandMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandMgrActionPerformed
        // TODO add your handling code here:
        
        new GUI_Brand_insert(this).setVisible(true);
    }//GEN-LAST:event_btnBrandMgrActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        dispose();
      //  new GUI_polish().setVisible(true);
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnFisishMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFisishMgrActionPerformed
        
        new GUI_finish_insert(this).setVisible(true);
    }//GEN-LAST:event_btnFisishMgrActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_polish_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_polish_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_polish_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_polish_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_polish_insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandMgr;
    private javax.swing.JButton btnFisishMgr;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnInsert;
    private javax.swing.JComboBox comboBrands;
    private javax.swing.JComboBox comboFinish;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNamePolish;
    // End of variables declaration//GEN-END:variables
}
