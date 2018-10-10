/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.vendas;

import br.estacio.mei.visao.cliente.ClientePrincipal;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

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
    public void resetColor(JPanel panelHovered) {
        panelHovered.setBackground(new Color(12, 180, 206));
    }
    
    private void updatePanelDinamic(String label, JPanel panel) {
        lblBreadcrumb.setText(label);
        panelDinamic.removeAll();
        panelDinamic.add(panel);
        panelDinamic.validate();
        panelDinamic.repaint();

    }
    
    private void hoverExited(java.awt.event.MouseEvent evt) {                             
        if (evt.getSource() instanceof JPanel && !evt.getSource().equals(panelActive)) {
            JPanel panel = (JPanel) evt.getSource();
            resetColor(panel);
        }
    }
    
    public void changeColor(JPanel panelHovered) {
        panelHovered.setBackground(new Color(44, 197, 221));
    }
    
    private void hoverEntered(java.awt.event.MouseEvent evt) {                              
        /*  
            Primeiro faço uma verificação de segurança se a origem (fonte)
            do evento é realmente um JPanel
            Isso foi feito pois estou usando o mesmo evento para todos os 
            itens do menu.
         */
        if (evt.getSource() instanceof JPanel) {
            /*  O método getSource retorna um Object, por isso faço a conversão (cast)
                para JPanel
             */
            JPanel panel = (JPanel) evt.getSource();
            /*  o método change color recebe como parâmetro um JPanel e faz a 
                mudança de cores, subistitui o setColor (já existe esse método na 
                classe Jframe)
             */
            changeColor(panel);
        }
    }  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPagamento = new javax.swing.JDialog();
        jpPagamento = new javax.swing.JPanel();
        lblDialogo = new javax.swing.JLabel();
        btnDinheiro = new javax.swing.JRadioButton();
        btnDebito = new javax.swing.JRadioButton();
        btnCredito = new javax.swing.JRadioButton();
        btnFinalizar = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
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
        lblVal = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        painelMeio = new javax.swing.JPanel();
        tblProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        painelFim = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblSifrao = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnPagamento = new javax.swing.JButton();

        lblDialogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDialogo.setText("Escolha o Meio de Pagamento: ");

        buttonGroup1.add(btnDinheiro);
        btnDinheiro.setText("Dinheiro");

        buttonGroup1.add(btnDebito);
        btnDebito.setText("Cartão de Débito");

        buttonGroup1.add(btnCredito);
        btnCredito.setText("Cartão de Crédito");

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizar.setText("Finalizar");

        javax.swing.GroupLayout jpPagamentoLayout = new javax.swing.GroupLayout(jpPagamento);
        jpPagamento.setLayout(jpPagamentoLayout);
        jpPagamentoLayout.setHorizontalGroup(
            jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPagamentoLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCredito)
                    .addComponent(btnDebito)
                    .addComponent(btnDinheiro)
                    .addComponent(lblDialogo)
                    .addComponent(btnFinalizar))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jpPagamentoLayout.setVerticalGroup(
            jpPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPagamentoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(lblDialogo)
                .addGap(27, 27, 27)
                .addComponent(btnDinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCredito)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jdPagamento.getContentPane().add(jpPagamento, java.awt.BorderLayout.CENTER);

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

        lblQtd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQtd.setText("Qtd. :");

        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/findUser20.png"))); // NOI18N

        btnIncluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Incluir_black.png"))); // NOI18N
        btnIncluirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIncluirClienteMousePressed(evt);
            }
        });
        btnIncluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirClienteActionPerformed(evt);
            }
        });

        btnAddProduto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduto.setText("Adicionar");
        btnAddProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdutoActionPerformed(evt);
            }
        });

        lblVal.setText("Valor (u):");

        txtValor.setText("R$ 1,00");

        javax.swing.GroupLayout painelInicioLayout = new javax.swing.GroupLayout(painelInicio);
        painelInicio.setLayout(painelInicioLayout);
        painelInicioLayout.setHorizontalGroup(
            painelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInicioLayout.createSequentialGroup()
                .addGap(18, 18, 18)
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
                                .addGap(18, 18, 18)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIncluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addComponent(btnAddProduto))))))
                    .addComponent(lblNome))
                .addContainerGap(33, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE)
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
        btnIncluirCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIncluirClienteMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverEntered(evt);
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

        add(painelInicio, java.awt.BorderLayout.PAGE_START);

        painelMeio.setPreferredSize(new java.awt.Dimension(804, 150));
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

        btnPagamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPagamento.setText("Pagamento");

        javax.swing.GroupLayout painelFimLayout = new javax.swing.GroupLayout(painelFim);
        painelFim.setLayout(painelFimLayout);
        painelFimLayout.setHorizontalGroup(
            painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFimLayout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(80, 80, 80)
                .addGroup(painelFimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFimLayout.createSequentialGroup()
                        .addComponent(lblSifrao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValor))
                    .addComponent(btnPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
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
                    .addComponent(btnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(painelFim, java.awt.BorderLayout.PAGE_END);
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
 
    private void btnIncluirClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirClienteMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnIncluirClienteMousePressed

    private void btnIncluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirClienteActionPerformed
        // TODO add your handling code here:
        resetColor((JPanel) panelActive);
        panelActive = evt.getSource();
        updatePanelDinamic("Gerenciamento de Clientes", new ClientePrincipal());
    }//GEN-LAST:event_btnIncluirClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduto;
    private javax.swing.JButton btnBusca;
    private javax.swing.JRadioButton btnCredito;
    private javax.swing.JRadioButton btnDebito;
    private javax.swing.JRadioButton btnDinheiro;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnIncluirCliente;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog jdPagamento;
    private javax.swing.JPanel jpPagamento;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDialogo;
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
    // End of variables declaration//GEN-END:variables
    private Object panelActive;
    private javax.swing.JLabel lblBreadcrumb;
    private javax.swing.JPanel panelDinamic;
}
