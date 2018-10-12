/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.vendas;

import br.estacio.mei.visao.cliente.ClientePrincipal;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Familia TOPz
 */
public class VendaPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form backup
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

        vendasPainel = new javax.swing.JPanel();
        painelInicio = new javax.swing.JPanel();
        lblCodCliente = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JTextField();
        txtCodProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lclCodProduto = new javax.swing.JLabel();
        btnBusca = new javax.swing.JButton();
        txtQtd = new javax.swing.JTextField();
        lblQtd = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblVal = new javax.swing.JLabel();
        btnIncluirCliente = new javax.swing.JButton();
        btnAddProduto = new javax.swing.JButton();
        painelMeio = new javax.swing.JPanel();
        tblProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        painelFim = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        btnPagamento = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        lblSifrao = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        vendasPainel.setLayout(new java.awt.BorderLayout());

        lblCodCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodCliente.setText("Cod. :");

        txtCodCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCodCliente.setText("Ex: 00000");
        txtCodCliente.setToolTipText("");

        txtCodProduto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCodProduto.setText("Ex: 00000");
        txtCodProduto.setToolTipText("");

        txtDescricao.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDescricao.setText("Descrição do Produto");

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNome.setText("Nome do Cliente");

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("Nome :");

        lblDescricao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescricao.setText("Descrição :");

        lclCodProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lclCodProduto.setText("Cod. :");

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/findUser20.png"))); // NOI18N
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });

        txtQtd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtQtd.setText("Ex: 00");

        lblQtd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtd.setText("Qtd. :");

        txtValor.setText("R$ 1,00");

        lblVal.setText("Valor (u):");

        btnIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Incluir_black.png"))); // NOI18N
        btnIncluirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIncluirClienteMousePressed(evt);
            }
        });

        btnAddProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Incluir_black.png"))); // NOI18N
        btnAddProduto.setText("Add");
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
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lclCodProduto)
                        .addComponent(txtCodCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(lblCodCliente))
                .addGap(18, 18, 18)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicioLayout.createSequentialGroup()
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)))
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInicioLayout.createSequentialGroup()
                                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelInicioLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblQtd)
                                        .addGap(36, 36, 36))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVal)
                                    .addGroup(painelInicioLayout.createSequentialGroup()
                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddProduto))))
                            .addGroup(painelInicioLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIncluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblNome))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        painelInicioLayout.setVerticalGroup(
            painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicioLayout.createSequentialGroup()
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelInicioLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodCliente)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtNome)))
                    .addGroup(painelInicioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInicioLayout.createSequentialGroup()
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQtd))
                        .addGap(59, 59, 59))
                    .addGroup(painelInicioLayout.createSequentialGroup()
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescricao)
                            .addComponent(lclCodProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))))
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
        txtValor .addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtValor .getText().equals("R$ 1,00")) {
                    txtValor .setText("");
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (txtValor .getText().isEmpty()) {
                    txtValor .setText("R$ 1,00");
                }
            }
        });

        vendasPainel.add(painelInicio, java.awt.BorderLayout.PAGE_START);

        painelMeio.setLayout(new java.awt.BorderLayout());

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Valor"
            }
        ));
        tblProdutos.setViewportView(tbProdutos);

        painelMeio.add(tblProdutos, java.awt.BorderLayout.CENTER);

        vendasPainel.add(painelMeio, java.awt.BorderLayout.CENTER);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setMaximumSize(new java.awt.Dimension(86, 36));
        btnSalvar.setMinimumSize(new java.awt.Dimension(86, 36));
        btnSalvar.setPreferredSize(new java.awt.Dimension(86, 36));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setText("Total :");

        btnPagamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_cash-money.png"))); // NOI18N
        btnPagamento.setText("Pagar");
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblValor.setText("00,00");

        lblSifrao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSifrao.setText("R$ ");

        javax.swing.GroupLayout painelFimLayout = new javax.swing.GroupLayout(painelFim);
        painelFim.setLayout(painelFimLayout);
        painelFimLayout.setHorizontalGroup(
            painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFimLayout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(80, 80, 80)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFimLayout.createSequentialGroup()
                        .addComponent(lblSifrao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValor))
                    .addComponent(btnPagamento))
                .addContainerGap(362, Short.MAX_VALUE))
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
                    .addComponent(btnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        vendasPainel.add(painelFim, java.awt.BorderLayout.PAGE_END);

        add(vendasPainel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdutoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tbProdutos.getModel();
        dtm.addRow(new Object[]{txtCodProduto.getText(),txtDescricao.getText(),txtQtd.getText(),txtValor.getText()});

        txtCodProduto.setText("Ex: 00000");
        txtDescricao.setText("Descrição do Produto");
        txtQtd.setText("Ex: 00");
        txtValor.setText("R$ 1,00");
    }//GEN-LAST:event_btnAddProdutoActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        // TODO add your handling code here:
        jdPagamento dialog = new jdPagamento (new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnPagamentoActionPerformed

    private void btnIncluirClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirClienteMousePressed
        // TODO add your handling code here:
        ClientePrincipal areaNova = new ClientePrincipal();
        vendasPainel.removeAll();
        vendasPainel.add(areaNova);
        vendasPainel.validate();
        vendasPainel.repaint();
    }//GEN-LAST:event_btnIncluirClienteMousePressed

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
    }//GEN-LAST:event_btnBuscaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtd;
    private javax.swing.JLabel lblSifrao;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVal;
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
    private javax.swing.JTextField txtValor;
    private javax.swing.JPanel vendasPainel;
    // End of variables declaration//GEN-END:variables
}
