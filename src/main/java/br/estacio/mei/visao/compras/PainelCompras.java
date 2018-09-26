/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.compras;

import br.estacio.mei.dao.ComprasDao;
import br.estacio.mei.dao.implementacao.ComprasDaoEstatico;


/**
 *
 * @author rhena
 */
public class PainelCompras extends javax.swing.JFrame {

    ComprasDao comprasdao = new ComprasDaoEstatico();
 
    /**
     * Creates new form PainelCompras
     */
    public PainelCompras() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jTextFieldCampoBusca = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonIncluirCompra = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableArmazenamendoDados = new javax.swing.JTable();
        painelLateral = new javax.swing.JPanel();
        separador = new javax.swing.JSeparator();
        btnInicio = new javax.swing.JPanel();
        imgInicio = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnContasAPagar = new javax.swing.JPanel();
        imgContasAPagar = new javax.swing.JLabel();
        lblContasAPagar = new javax.swing.JLabel();
        btnContasAReceber = new javax.swing.JPanel();
        imgContasAReceber = new javax.swing.JLabel();
        lblContasAReceber = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        imgCategorias = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        imgClientes = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        btnFornecedores = new javax.swing.JPanel();
        imgFornecedores = new javax.swing.JLabel();
        lblFornecedores = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        imgSair = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        imgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Compras");
        setBackground(new java.awt.Color(12, 180, 206));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jButtonPesquisar, org.jdesktop.beansbinding.ELProperty.create("${selected}"), jTextFieldCampoBusca, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldCampoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCampoBuscaActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nenhum(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonPesquisarMousePressed(evt);
            }
        });

        jButtonIncluirCompra.setText("Incluir");
        jButtonIncluirCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonIncluirCompraMousePressed(evt);
            }
        });
        jButtonIncluirCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirCompraActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonExcluirMousePressed(evt);
            }
        });
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSalvarMousePressed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        jTableArmazenamendoDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableArmazenamendoDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Valor", "Quantidade", "Data da Compra", "Total"
            }
        ));
        jTableArmazenamendoDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableArmazenamendoDadosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableArmazenamendoDados);

        painelLateral.setBackground(new java.awt.Color(12, 197, 205));

        btnInicio.setBackground(new java.awt.Color(13, 155, 177));

        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Home_25px.png"))); // NOI18N

        lblInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Início");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgInicio)
                .addGap(18, 18, 18)
                .addComponent(lblInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAPagar.setBackground(new java.awt.Color(12, 180, 206));

        lblContasAPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContasAPagar.setForeground(new java.awt.Color(255, 255, 255));
        lblContasAPagar.setText("Contas a Pagar");

        javax.swing.GroupLayout btnContasAPagarLayout = new javax.swing.GroupLayout(btnContasAPagar);
        btnContasAPagar.setLayout(btnContasAPagarLayout);
        btnContasAPagarLayout.setHorizontalGroup(
            btnContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnContasAPagarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgContasAPagar)
                .addGap(18, 18, 18)
                .addComponent(lblContasAPagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnContasAPagarLayout.setVerticalGroup(
            btnContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        btnContasAReceber.setBackground(new java.awt.Color(12, 180, 206));

        lblContasAReceber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContasAReceber.setForeground(new java.awt.Color(255, 255, 255));
        lblContasAReceber.setText("Contas a Receber");

        javax.swing.GroupLayout btnContasAReceberLayout = new javax.swing.GroupLayout(btnContasAReceber);
        btnContasAReceber.setLayout(btnContasAReceberLayout);
        btnContasAReceberLayout.setHorizontalGroup(
            btnContasAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnContasAReceberLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgContasAReceber)
                .addGap(18, 18, 18)
                .addComponent(lblContasAReceber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnContasAReceberLayout.setVerticalGroup(
            btnContasAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        btnCategorias.setBackground(new java.awt.Color(12, 180, 206));

        lblCategorias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCategoriasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgCategorias)
                .addGap(18, 18, 18)
                .addComponent(lblCategorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        btnClientes.setBackground(new java.awt.Color(12, 180, 206));

        lblClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgClientes)
                .addGap(18, 18, 18)
                .addComponent(lblClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        btnFornecedores.setBackground(new java.awt.Color(12, 180, 206));

        lblFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedores.setText("Fornecedores");

        javax.swing.GroupLayout btnFornecedoresLayout = new javax.swing.GroupLayout(btnFornecedores);
        btnFornecedores.setLayout(btnFornecedoresLayout);
        btnFornecedoresLayout.setHorizontalGroup(
            btnFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFornecedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgFornecedores)
                .addGap(18, 18, 18)
                .addComponent(lblFornecedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFornecedoresLayout.setVerticalGroup(
            btnFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        btnSair.setBackground(new java.awt.Color(12, 180, 206));

        imgSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Sign_Out_25px.png"))); // NOI18N

        lblSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");

        javax.swing.GroupLayout btnSairLayout = new javax.swing.GroupLayout(btnSair);
        btnSair.setLayout(btnSairLayout);
        btnSairLayout.setHorizontalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSairLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgSair)
                .addGap(18, 18, 18)
                .addComponent(lblSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSairLayout.setVerticalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSair, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Stocks_64px.png"))); // NOI18N

        javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
        painelLateral.setLayout(painelLateralLayout);
        painelLateralLayout.setHorizontalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFornecedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelLateralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imgLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelLateralLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        painelLateralLayout.setVerticalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(imgLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnContasAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnContasAReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldCampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButtonIncluirCompra)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldCampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonIncluirCompra))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCampoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCampoBuscaActionPerformed
       
        
    }//GEN-LAST:event_jTextFieldCampoBuscaActionPerformed

    private void jButtonExcluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExcluirMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirMousePressed

    private void jButtonPesquisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPesquisarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarMousePressed

    private void nenhum(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nenhum
        // TODO add your handling code here:
    }//GEN-LAST:event_nenhum

    private void jButtonIncluirCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIncluirCompraMousePressed
        
    }//GEN-LAST:event_jButtonIncluirCompraMousePressed

    private void jButtonSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarMousePressed

    private void jTableArmazenamendoDadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableArmazenamendoDadosMousePressed
        
    }//GEN-LAST:event_jTableArmazenamendoDadosMousePressed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonIncluirCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirCompraActionPerformed
        String descricao = jButtonIncluirCompra.getText().trim();
        String valor = jButtonIncluirCompra.getText().trim();
        String quantidade = jButtonIncluirCompra.getText().trim();
        String dataCompra = jButtonIncluirCompra.getText().trim();
        String total = jButtonIncluirCompra.getText().trim();
        
       
    }//GEN-LAST:event_jButtonIncluirCompraActionPerformed
   
    public boolean isCellEditable(int row, int col) {  
       return true; 
    } 
   
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
            java.util.logging.Logger.getLogger(PainelCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PainelCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PainelCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PainelCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(() -> {
           new PainelCompras().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnContasAPagar;
    private javax.swing.JPanel btnContasAReceber;
    private javax.swing.JPanel btnFornecedores;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnSair;
    private javax.swing.JLabel imgCategorias;
    private javax.swing.JLabel imgClientes;
    private javax.swing.JLabel imgContasAPagar;
    private javax.swing.JLabel imgContasAReceber;
    private javax.swing.JLabel imgFornecedores;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgSair;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonIncluirCompra;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableArmazenamendoDados;
    private javax.swing.JTextField jTextFieldCampoBusca;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblContasAPagar;
    private javax.swing.JLabel lblContasAReceber;
    private javax.swing.JLabel lblFornecedores;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblSair;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JSeparator separador;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
