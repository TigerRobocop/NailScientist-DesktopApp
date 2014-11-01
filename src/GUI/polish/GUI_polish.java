/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.polish;

import GUI.brand.GUI_Brands;
import GUI.finish.GUI_Finish;
import basicas.person.Employee;
import basicas.polish.Brand;
import basicas.polish.Finish;
import basicas.polish.Polish;
import facade.Facade;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Livia
 */
public class GUI_polish extends javax.swing.JFrame {

    List<Polish> polishList;
    Employee logged;

    public GUI_polish() {
        initComponents();
        this.setLocationRelativeTo(null);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Marca", "Nome", "Acabamento", "Descrição da Cor"});
        jTableTabela.setModel(modelo);
        listAll();
    }

    public GUI_polish(Employee emp) {
        this.logged = emp;
        initComponents();
        this.setLocationRelativeTo(null);

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Marca", "Nome", "Acabamento", "Descrição da Cor"});
        jTableTabela.setModel(modelo);
        listAll();
    }

    private void listAll() {
        try {
            Facade f = new Facade();

            this.polishList = f.listAllPolish();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Marca", "Nome", "Acabamento", "Descrição da Cor"});

            for (int i = 0; i < this.polishList.size(); i++) {
                modelo.addRow(new String[]{
                    this.polishList.get(i).getBrand().getName(),
                    this.polishList.get(i).getName(),
                    this.polishList.get(i).getFinish().getName(),
                    this.polishList.get(i).getColor()});
            }
            jTableTabela.setModel(modelo);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabela = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtFilterFinish = new javax.swing.JTextField();
        btnBuscaFiltro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtFilterName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFIlterBrand = new javax.swing.JTextField();
        txtFiilterColor = new javax.swing.JTextField();
        btnNewPolish = new javax.swing.JButton();
        btnBrandMrg = new javax.swing.JButton();
        btnFinishMgr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Marca:");

        jLabel3.setText("Nome:");

        jTableTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTabela);

        jLabel4.setText("Cor:");

        btnBuscaFiltro.setText("Pesquisar");
        btnBuscaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaFiltroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Lista de Esmaltes");

        btnGoBack.setText("Voltar");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Busca por filtros");

        btnDelete.setText("Excluir");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Editar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel2.setText("Acabamento:");

        btnNewPolish.setText("Novo Esmalte");
        btnNewPolish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPolishActionPerformed(evt);
            }
        });

        btnBrandMrg.setText("Marcas");
        btnBrandMrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrandMrgActionPerformed(evt);
            }
        });

        btnFinishMgr.setText("Acabamentos");
        btnFinishMgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishMgrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(btnBuscaFiltro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFilterName)
                                    .addComponent(txtFIlterBrand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFilterFinish)
                                    .addComponent(txtFiilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBrandMrg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFinishMgr, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel6)))
                        .addGap(148, 148, 148)
                        .addComponent(btnNewPolish, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewPolish, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFIlterBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFilterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFiilterColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFilterFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBrandMrg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinishMgr)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscaFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaFiltroActionPerformed
        // busca de esmalte de acordo com os campos de filtro preenchidos
        try {
            Facade f = new Facade();
            Polish filtro = new Polish();

            filtro.setName(txtFilterName.getText());
            filtro.setColor(txtFiilterColor.getText());
            Brand b = new Brand();
            b.setName(txtFIlterBrand.getText());
            filtro.setBrand(b);
            Finish fi = new Finish();
            fi.setName(txtFilterFinish.getText());
            filtro.setFinish(fi);

            this.polishList = f.findByFilters(filtro);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Marca", "Nome", "Acabamento", "Descrição da Cor"});

            for (int i = 0; i < this.polishList.size(); i++) {
                modelo.addRow(new String[]{
                    this.polishList.get(i).getBrand().getName(),
                    this.polishList.get(i).getName(),
                    this.polishList.get(i).getFinish().getName(),
                    this.polishList.get(i).getColor()});
            }
            jTableTabela.setModel(modelo);
            txtFIlterBrand.setText("");
            txtFilterName.setText("");
            txtFiilterColor.setText("");
            txtFilterFinish.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());

        }
    }//GEN-LAST:event_btnBuscaFiltroActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (logged.isAdmin()) {
            deleteLine();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Funcionalidade indisponível");
        }        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void deleteLine(){
        Facade fa = new Facade();
        if (polishList.size() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Não há esmaltes cadastrados para excluir");
        } else if (jTableTabela.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma linha selecionada");
        } else {
            try {
                int opc = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir o esmalte da lista?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
                if (opc == JOptionPane.YES_OPTION) {
                    fa.delete(this.polishList.get(jTableTabela.getSelectedRow()));
                    JOptionPane.showMessageDialog(rootPane, "Esmalte excluído com sucesso");
                    listAll();
                } else {
                }
            } catch (Exception fe) {
                JOptionPane.showMessageDialog(rootPane, fe.getMessage());
            }
        }
    }
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (!logged.isAdmin()) {
            JOptionPane.showMessageDialog(rootPane, "Funcionalidade indisponível");
        } else {
            if (polishList.size() <= 0) {
            JOptionPane.showMessageDialog(rootPane, "Não há esmaltes cadastrados para alterar");
        } else if (jTableTabela.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma linha selecionada");
        } else {
            Polish s = polishList.get(jTableTabela.getSelectedRow());
            new GUI_polish_update(s).setVisible(true);
            this.dispose();
        }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnNewPolishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPolishActionPerformed
        if (logged.isAdmin()) {
            new GUI_polish_insert().setVisible(true);
//            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Funcionalidade indisponível");
        }
    }//GEN-LAST:event_btnNewPolishActionPerformed

    private void btnBrandMrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrandMrgActionPerformed
        dispose();
        new GUI_Brands(logged).setVisible(true);
    }//GEN-LAST:event_btnBrandMrgActionPerformed

    private void btnFinishMgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishMgrActionPerformed
        dispose();
        new GUI_Finish(logged).setVisible(true);
    }//GEN-LAST:event_btnFinishMgrActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_polish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_polish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_polish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_polish.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_polish().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrandMrg;
    private javax.swing.JButton btnBuscaFiltro;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFinishMgr;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnNewPolish;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabela;
    private javax.swing.JTextField txtFIlterBrand;
    private javax.swing.JTextField txtFiilterColor;
    private javax.swing.JTextField txtFilterFinish;
    private javax.swing.JTextField txtFilterName;
    // End of variables declaration//GEN-END:variables
}
