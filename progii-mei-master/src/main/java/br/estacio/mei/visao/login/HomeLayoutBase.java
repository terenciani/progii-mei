/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.login;

import br.estacio.mei.exemplo.*;

/**
 *
 * @author Marcelo
 */
public class HomeLayoutBase extends javax.swing.JFrame {

    /**
     * Creates new form LayoutBase
     */
    public HomeLayoutBase() {
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

        painelPrincipal = new javax.swing.JPanel();
        painelLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnContasAPagar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnContasAReceber = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnProdutos = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnFornecedores = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        painelFooter = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        painelTitulo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        painelBreadcrumb = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(1280, 720));

        painelLateral.setBackground(new java.awt.Color(12, 180, 206));

        btnInicio.setBackground(new java.awt.Color(12, 155, 176));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Home_25px.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Início");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAPagar.setBackground(new java.awt.Color(12, 198, 225));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contas a Pagar");

        javax.swing.GroupLayout btnContasAPagarLayout = new javax.swing.GroupLayout(btnContasAPagar);
        btnContasAPagar.setLayout(btnContasAPagarLayout);
        btnContasAPagarLayout.setHorizontalGroup(
            btnContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnContasAPagarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnContasAPagarLayout.setVerticalGroup(
            btnContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAReceber.setBackground(new java.awt.Color(12, 198, 225));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contas a Receber");

        javax.swing.GroupLayout btnContasAReceberLayout = new javax.swing.GroupLayout(btnContasAReceber);
        btnContasAReceber.setLayout(btnContasAReceberLayout);
        btnContasAReceberLayout.setHorizontalGroup(
            btnContasAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnContasAReceberLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        btnContasAReceberLayout.setVerticalGroup(
            btnContasAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCategorias.setBackground(new java.awt.Color(12, 198, 225));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCategoriasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnClientes.setBackground(new java.awt.Color(12, 198, 225));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnProdutos.setBackground(new java.awt.Color(12, 198, 225));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Produtos");

        javax.swing.GroupLayout btnProdutosLayout = new javax.swing.GroupLayout(btnProdutos);
        btnProdutos.setLayout(btnProdutosLayout);
        btnProdutosLayout.setHorizontalGroup(
            btnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProdutosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnProdutosLayout.setVerticalGroup(
            btnProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnFornecedores.setBackground(new java.awt.Color(12, 198, 225));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fornecedores");

        javax.swing.GroupLayout btnFornecedoresLayout = new javax.swing.GroupLayout(btnFornecedores);
        btnFornecedores.setLayout(btnFornecedoresLayout);
        btnFornecedoresLayout.setHorizontalGroup(
            btnFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFornecedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFornecedoresLayout.setVerticalGroup(
            btnFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelFooter.setBackground(new java.awt.Color(12, 180, 206));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sair");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logout (2).png"))); // NOI18N

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/logout.png"))); // NOI18N

        javax.swing.GroupLayout painelFooterLayout = new javax.swing.GroupLayout(painelFooter);
        painelFooter.setLayout(painelFooterLayout);
        painelFooterLayout.setHorizontalGroup(
            painelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFooterLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFooterLayout.setVerticalGroup(
            painelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFooterLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(painelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFooterLayout.createSequentialGroup()
                        .addGroup(painelFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel17)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, painelFooterLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(44, 44, 44))))
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        painelTitulo.setBackground(new java.awt.Color(12, 180, 206));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Mayday");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/medal-logo.png"))); // NOI18N

        javax.swing.GroupLayout painelTituloLayout = new javax.swing.GroupLayout(painelTitulo);
        painelTitulo.setLayout(painelTituloLayout);
        painelTituloLayout.setHorizontalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTituloLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelTituloLayout.setVerticalGroup(
            painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
        painelLateral.setLayout(painelLateralLayout);
        painelLateralLayout.setHorizontalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelLateralLayout.setVerticalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(painelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(painelFooter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelBreadcrumb.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bem vindo ao Mayday!");

        javax.swing.GroupLayout painelBreadcrumbLayout = new javax.swing.GroupLayout(painelBreadcrumb);
        painelBreadcrumb.setLayout(painelBreadcrumbLayout);
        painelBreadcrumbLayout.setHorizontalGroup(
            painelBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBreadcrumbLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        painelBreadcrumbLayout.setVerticalGroup(
            painelBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBreadcrumbLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Sistema de Apoio ao Microempreendedor Invidividual");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBreadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(101, 101, 101))))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(painelBreadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(HomeLayoutBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeLayoutBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeLayoutBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeLayoutBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeLayoutBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnContasAPagar;
    private javax.swing.JPanel btnContasAReceber;
    private javax.swing.JPanel btnFornecedores;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel painelBreadcrumb;
    private javax.swing.JPanel painelFooter;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelTitulo;
    // End of variables declaration//GEN-END:variables
}
