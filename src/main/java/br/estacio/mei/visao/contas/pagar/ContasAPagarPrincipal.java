/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.contas.pagar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ContasAPagarPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form ContasAPagarPrincipal
     */
    public ContasAPagarPrincipal() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        txtdtv = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdtp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaP = new javax.swing.JTable();
        Bexcluir = new javax.swing.JButton();
        Beditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_calendar-book-date-monthly_2203551.png"))); // NOI18N
        jLabel1.setText("Data de vencimento");

        txtdtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtvActionPerformed(evt);
            }
        });

        txtdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_pie-chart-stat-graph_2203521.png"))); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_cash-money-coin-value_2203534.png"))); // NOI18N
        jLabel3.setText("Valor");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_calendar-book-date-monthly_2203551.png"))); // NOI18N
        jLabel4.setText("Data de Pagamento");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_credit-card-debit-payment_2203532.png"))); // NOI18N
        jLabel5.setText("Código");

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_botton-on-launch-point_2203535.png"))); // NOI18N
        jLabel6.setText("Status");

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        jTabelaP.setAutoCreateRowSorter(true);
        jTabelaP.setBackground(new java.awt.Color(204, 204, 204));
        jTabelaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DT venc", "Descrição", "Valor", "DT pag", "Código", "Status"
            }
        ));
        jTabelaP.setGridColor(new java.awt.Color(2, 75, 219));
        jTabelaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaP);

        Bexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        Bexcluir.setText("Excluir");
        Bexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BexcluirActionPerformed(evt);
            }
        });

        Beditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        Beditar.setText("Editar");
        Beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(Beditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bexcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdtv))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(53, 53, 53)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdtp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(19, 19, 19)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addGap(40, 40, 40)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Bexcluir)
                    .addComponent(Beditar))
                .addGap(7, 7, 7))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtvActionPerformed

    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void jTabelaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaPMouseClicked
        if(jTabelaP.getSelectedRow() != -1){
            txtdtv.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow() , 0).toString());
            txtdesc.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow() , 1).toString());
            txtv.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow() , 2).toString());
            txtdtp.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow() , 3).toString());
            txtcod.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow() , 4).toString());
            txtstatus.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow() , 5).toString());
        }
    }//GEN-LAST:event_jTabelaPMouseClicked

    private void BexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BexcluirActionPerformed

        if(jTabelaP.getSelectedRow() != -1){
            DefaultTableModel dtmContas = (DefaultTableModel) jTabelaP.getModel();
            dtmContas.removeRow(jTabelaP.getSelectedRow());

        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }
    }//GEN-LAST:event_BexcluirActionPerformed

    private void BeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditarActionPerformed
        if(jTabelaP.getSelectedRow() != -1){
            jTabelaP.setValueAt(txtdtv.getText(), jTabelaP.getSelectedRow(), 0);
            jTabelaP.setValueAt(txtdesc.getText(), jTabelaP.getSelectedRow(), 1);
            jTabelaP.setValueAt(txtv.getText(), jTabelaP.getSelectedRow(), 2);
            jTabelaP.setValueAt(txtdtp.getText(), jTabelaP.getSelectedRow(), 3);
            jTabelaP.setValueAt(txtcod.getText(), jTabelaP.getSelectedRow(), 4);
            jTabelaP.setValueAt(txtstatus.getText(), jTabelaP.getSelectedRow(), 5);

        }
    }//GEN-LAST:event_BeditarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel dtmContas = (DefaultTableModel) jTabelaP.getModel();
        Object[] dados = {txtdtv.getText(),txtdesc.getText(),txtv.getText(),txtdtp.getText(),txtcod.getText(),txtstatus.getText()};
        dtmContas.addRow(dados);

        txtdtv.setText(" ");
        txtdesc.setText(" ");
        txtv.setText(" ");
        txtdtp.setText(" ");
        txtcod.setText(" ");
        txtstatus.setText(" ");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Beditar;
    private javax.swing.JButton Bexcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaP;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtdtp;
    private javax.swing.JTextField txtdtv;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtv;
    // End of variables declaration//GEN-END:variables
}
