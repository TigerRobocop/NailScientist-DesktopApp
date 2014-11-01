/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.brand;

import GUI.polish.GUI_polish;
import GUI.polish.GUI_polish_insert;
import basicas.person.Employee;
import basicas.polish.Brand;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import facade.Facade;

/**
 *
 * @author Livia
 */
import java.util.List;

public class GUI_Brands extends javax.swing.JFrame {

    List<Brand> brandList;
    Employee logged;

    public GUI_Brands() {
        initComponents();
        listarMarcas();
        this.setLocationRelativeTo(null);
    }

    public GUI_Brands(Employee emp) {
        initComponents();
        listarMarcas();
        this.setLocationRelativeTo(null);
        this.logged = emp;
    }

    private void listarMarcas() {
        try {
            Facade f = new Facade();
            this.brandList = f.listAllBrand();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Marca"});
            for (int i = 0; i < brandList.size(); i++) {
                modelo.addRow(new String[]{brandList.get(i).getName()});
            }

            jTableTabelaMarcas.setModel(modelo);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBusca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFilter = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTabelaMarcas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBusca.setText("Pesquisar");
        btnBusca.setActionCommand("Pesquisar");
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtro:");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAdicionar.setText("Adicionar nova marca");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jTableTabelaMarcas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableTabelaMarcas);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Marcas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(35, 35, 35)
                        .addComponent(btnEditar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBusca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExcluir)
                        .addGap(39, 39, 39)
                        .addComponent(btnVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel7)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBusca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnVoltar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed

        //aciona a busca dos nomes de marcas de acordo com o filtro, se o campo for deixado vazio, a lista trará
        //todos as marcas cadastradas no banco
        try {
            Facade f = new Facade();
            Brand filter = new Brand();

            filter.setName(txtFilter.getText());
            this.brandList = f.findByFilter(filter);
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new String[]{"Marca"});

            for (int i = 0; i < this.brandList.size(); i++) {
                modelo.addRow(new String[]{this.brandList.get(i).getName()});
            }
            jTableTabelaMarcas.setModel(modelo);
            txtFilter.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            txtFilter.setText("");
        }
//
//         
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // seleciona a marca da lista para editar
        if (!logged.isAdmin()) {
            JOptionPane.showMessageDialog(rootPane, "Funcionalidade indisponível");
        } else {
            if (brandList.size() <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Não há marcas cadastradas para editar");
            } else if (jTableTabelaMarcas.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Nenhuma linha selecionada");
            } else {
                Brand m = brandList.get(jTableTabelaMarcas.getSelectedRow());
                new GUI_Brand_update(m).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (!logged.isAdmin()) {
            JOptionPane.showMessageDialog(rootPane, "Funcionalidade indisponível");
        } else {
            Facade fa = new Facade();
            if (brandList.size() <= 0) {
                JOptionPane.showMessageDialog(rootPane, "Não há marcas cadastradas para excluir");
            } else if (jTableTabelaMarcas.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(rootPane, "Nenhuma linha selecionada");
            } else {
                try {
                    int opc = JOptionPane.showConfirmDialog(rootPane, "Deseja excluir "
                            + this.brandList.get(jTableTabelaMarcas.getSelectedRow()).getName()
                            + " da lista?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
                    if (opc == JOptionPane.YES_OPTION) {
                        fa.delete(this.brandList.get(jTableTabelaMarcas.getSelectedRow()));
                        JOptionPane.showMessageDialog(rootPane, "Marca excluída com sucesso");
                        listarMarcas();

                    } else {
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        if (!logged.isAdmin()) {
            JOptionPane.showMessageDialog(rootPane, "Funcionalidade indisponível");
        } else {
//            dispose();
            new GUI_Brand_insert().setVisible(true);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new GUI_polish().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Brands.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Brands().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTabelaMarcas;
    private javax.swing.JTextField txtFilter;
    // End of variables declaration//GEN-END:variables
}
