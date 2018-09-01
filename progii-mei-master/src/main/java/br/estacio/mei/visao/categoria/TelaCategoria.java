/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.categoria;

/**
 *
 * @author Equipe 7
 */
public class TelaCategoria extends javax.swing.JFrame {

    /**
     * Creates new form TelaCategoria
     */
    public TelaCategoria() {
        initComponents();
        labelAcaoUsuario.setText("");
        panelCategAcao.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCategoria = new javax.swing.JPanel();
        labelBuscaCate = new javax.swing.JLabel();
        textCampoEntradaBusca = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoIncluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoImprimir = new javax.swing.JButton();
        panelCategAcao = new javax.swing.JPanel();
        botaoConfirmar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        labelAcaoUsuario = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textCampoCodigo = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        textCampoDesc = new javax.swing.JTextField();
        botaoSairCateg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Categorias de Produto");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.black);
        setResizable(false);

        panelCategoria.setBackground(new java.awt.Color(12, 180, 206));
        panelCategoria.setPreferredSize(new java.awt.Dimension(637, 561));
        panelCategoria.setRequestFocusEnabled(false);

        labelBuscaCate.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelBuscaCate.setText("Busca Categoria");

        botaoBuscar.setBackground(new java.awt.Color(153, 153, 153));
        botaoBuscar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoBuscar.setText("Pesquisar");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descrição"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        botaoIncluir.setBackground(new java.awt.Color(153, 153, 153));
        botaoIncluir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoIncluir.setText("Incluir");
        botaoIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoAlterar.setBackground(new java.awt.Color(153, 153, 153));
        botaoAlterar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(153, 153, 153));
        botaoExcluir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoImprimir.setBackground(new java.awt.Color(153, 153, 153));
        botaoImprimir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoImprimir.setText("Imprimir");
        botaoImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoImprimir.setMaximumSize(new java.awt.Dimension(97, 23));
        botaoImprimir.setMinimumSize(new java.awt.Dimension(97, 23));
        botaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoImprimirActionPerformed(evt);
            }
        });

        panelCategAcao.setBackground(new java.awt.Color(12, 180, 206));
        panelCategAcao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        panelCategAcao.setToolTipText("");

        botaoConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        botaoConfirmar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(153, 153, 153));
        botaoSair.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setBorderPainted(false);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        labelAcaoUsuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        labelAcaoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAcaoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelCodigo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelCodigo.setText("Código:");

        labelDescricao.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelDescricao.setText("Descrição: ");

        javax.swing.GroupLayout panelCategAcaoLayout = new javax.swing.GroupLayout(panelCategAcao);
        panelCategAcao.setLayout(panelCategAcaoLayout);
        panelCategAcaoLayout.setHorizontalGroup(
            panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategAcaoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelAcaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategAcaoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                                .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        panelCategAcaoLayout.setVerticalGroup(
            panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAcaoUsuario)
                .addGap(35, 35, 35)
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoSair))
                .addContainerGap())
        );

        botaoSairCateg.setBackground(new java.awt.Color(153, 153, 153));
        botaoSairCateg.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoSairCateg.setText("Sair");
        botaoSairCateg.setBorderPainted(false);
        botaoSairCateg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSairCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairCategActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(textCampoEntradaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelBuscaCate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelCategAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSairCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(botaoImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(labelBuscaCate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCampoEntradaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botaoIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSairCateg)
                    .addComponent(panelCategAcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        // TODO add your handling code here:
        labelAcaoUsuario.setText("Inclusão");
        botaoConfirmar.setText("Salvar");
        panelCategAcao.setVisible(true);
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        // TODO add your handling code here:
        labelAcaoUsuario.setText("Alteração");
        botaoConfirmar.setText("Salvar");
        panelCategAcao.setVisible(true);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
        botaoConfirmar.setText("Confirmar");
        labelAcaoUsuario.setText("Exclusão");
        panelCategAcao.setVisible(true);
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoImprimirActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        // TODO add your handling code here:
        // Aqui Rotina de Salvar no Banco de Dados e Sair
        
        //Aqui Esconde Panel
        panelCategAcao.setVisible(false);
        botaoConfirmar.setText("Confirmar");
        labelAcaoUsuario.setText("");
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
        // Aqui Rotina de Cancelar/Sair Ação
        
        //Aqui Esconde Panel
        panelCategAcao.setVisible(false);
        labelAcaoUsuario.setText("");
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoSairCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairCategActionPerformed
        // TODO add your handling code here:
        TelaCategoria.this.dispose();
    }//GEN-LAST:event_botaoSairCategActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoImprimir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSairCateg;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelAcaoUsuario;
    private javax.swing.JLabel labelBuscaCate;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JPanel panelCategAcao;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JTextField textCampoCodigo;
    private javax.swing.JTextField textCampoDesc;
    private javax.swing.JTextField textCampoEntradaBusca;
    // End of variables declaration//GEN-END:variables
}
