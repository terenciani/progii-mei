/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.vendas;

import br.estacio.mei.model.Cliente;
import br.estacio.mei.visao.cliente.ClientePrincipal;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author aluno
 */
public class VendaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form PainelVendas
     */
    public VendaPrincipal() {
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

        painelInicio = new javax.swing.JPanel();
        lblCodCliente = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lclCodProduto = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtd = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        btnIncluirCliente = new javax.swing.JButton();
        btnAddProduto = new javax.swing.JButton();
        painelMeio = new javax.swing.JPanel();
        tblProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        painelFim = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblSifrao = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        painelInicio.setPreferredSize(new java.awt.Dimension(800, 200));

        lblCodCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodCliente.setText("Cod. :");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome :");

        lclCodProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lclCodProduto.setText("Cod. :");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setText("Descrição :");

        txtCodCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCodCliente.setText("Ex: 00000");
        txtCodCliente.setToolTipText("");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNome.setText("Nome do Cliente");

        txtCodProduto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCodProduto.setText("Ex: 00000");
        txtCodProduto.setToolTipText("");

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescricao.setText("Descrição do Produto");

        txtQtd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtQtd.setText("Ex: 00");
        txtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtdActionPerformed(evt);
            }
        });

        lblQtd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtd.setText("Qtd. :");

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/findUser20.png"))); // NOI18N

        btnIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Incluir_black.png"))); // NOI18N

        btnAddProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduto.setText("Adicionar");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelInicioLayout = new javax.swing.GroupLayout(painelInicio);
        painelInicio.setLayout(painelInicioLayout);
        painelInicioLayout.setHorizontalGroup(
            painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicioLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodCliente)
                    .addComponent(lclCodProduto)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicioLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addContainerGap(581, Short.MAX_VALUE))
                    .addGroup(painelInicioLayout.createSequentialGroup()
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelInicioLayout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelInicioLayout.createSequentialGroup()
                                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricao)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblQtd))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddProduto)
                            .addGroup(painelInicioLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnIncluirCliente)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelInicioLayout.setVerticalGroup(
            painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicioLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodCliente)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIncluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnBusca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lclCodProduto)
                    .addComponent(lblDescricao)
                    .addComponent(lblQtd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        txtCodCliente .addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCodCliente .getText().equals("Ex: 00000")) {
                    txtCodCliente .setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtCodCliente .getText().isEmpty()) {
                    txtCodCliente .setText("Ex: 00000");
                }
            }
        });
        txtNome .addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNome .getText().equals("Nome do Cliente")) {
                    txtNome .setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtNome .getText().isEmpty()) {
                    txtNome .setText("Nome do Cliente");
                }
            }
        });
        txtCodProduto .addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCodProduto .getText().equals("Ex: 00000")) {
                    txtCodProduto .setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtCodProduto .getText().isEmpty()) {
                    txtCodProduto .setText("Ex: 00000");
                }
            }
        });
        txtDescricao .addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtDescricao .getText().equals("Descrição do Produto")) {
                    txtDescricao .setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtDescricao .getText().isEmpty()) {
                    txtDescricao .setText("Descrição do Produto");
                }
            }
        });
        txtQtd .addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtQtd .getText().equals("Ex: 00")) {
                    txtQtd .setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtQtd .getText().isEmpty()) {
                    txtQtd .setText("Ex: 00");
                }
            }
        });

        add(painelInicio, java.awt.BorderLayout.PAGE_START);

        painelMeio.setPreferredSize(new java.awt.Dimension(804, 150));
        painelMeio.setLayout(new java.awt.BorderLayout());

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor"
            }
        ));
        tblProdutos.setViewportView(tbProdutos);

        painelMeio.add(tblProdutos, java.awt.BorderLayout.CENTER);

        add(painelMeio, java.awt.BorderLayout.CENTER);

        painelFim.setPreferredSize(new java.awt.Dimension(804, 150));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setText("Total :");

        lblSifrao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSifrao.setText("R$ ");

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValor.setText("00,00");

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(86, 36));
        btnSalvar.setMinimumSize(new java.awt.Dimension(86, 36));
        btnSalvar.setPreferredSize(new java.awt.Dimension(86, 36));

        btFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFimLayout = new javax.swing.GroupLayout(painelFim);
        painelFim.setLayout(painelFimLayout);
        painelFimLayout.setHorizontalGroup(
            painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFimLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(80, 80, 80)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFimLayout.createSequentialGroup()
                        .addComponent(lblSifrao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValor))
                    .addComponent(btFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        painelFimLayout.setVerticalGroup(
            painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFimLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblSifrao)
                    .addComponent(lblValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(painelFim, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void txtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQtdActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        // TODO add your handling code here:
        txtCodProduto.getText();
        txtDescricao.getText();
        txtQtd.getText();
    }//GEN-LAST:event_btnAddProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblSifrao;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lclCodProduto;
    private javax.swing.JPanel painelFim;
    private javax.swing.JPanel painelInicio;
    private javax.swing.JPanel painelMeio;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JScrollPane tblProdutos;
    private javax.swing.JTextField txtCodCliente;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

}
