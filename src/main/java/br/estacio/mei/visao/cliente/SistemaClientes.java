/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.cliente;

import br.estacio.mei.visao.contas.receber.*;
import br.estacio.mei.exemplo.*;
import br.estacio.mei.visao.categoria.TelaPrincipalCategoria;
import br.estacio.mei.visao.cliente.GerenciamentoCliente;
import br.estacio.mei.visao.contas.pagar.ContasAPagarPrincipal;
import br.estacio.mei.visao.relatorio.estoque.RelatorioDeEstoque;
import javax.swing.JFrame;

/**
 *
 * @author Marcelo
 */
public class SistemaClientes extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public SistemaClientes() {
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

        menuLateral = new javax.swing.JPanel();
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
        btnSair = new javax.swing.JPanel();
        imgSair = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        btnFornecedores = new javax.swing.JPanel();
        imgFornecedores = new javax.swing.JLabel();
        lblFornecedores = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        imgLogo = new javax.swing.JLabel();
        areaDeTrabalho = new javax.swing.JPanel();
        painelBreadcrumb = new javax.swing.JPanel();
        lblBreadcrumb = new javax.swing.JLabel();
        lblNomeSistema = new javax.swing.JLabel();
        painelDinamico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Sistema de Apoio ao Micro Empreendedor Individual Regional");

        menuLateral.setBackground(new java.awt.Color(12, 197, 205));

        btnInicio.setBackground(new java.awt.Color(13, 155, 177));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicioMousePressed(evt);
            }
        });

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
            .addComponent(imgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAPagar.setBackground(new java.awt.Color(12, 180, 206));
        btnContasAPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnContasAPagarMousePressed(evt);
            }
        });

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
            .addComponent(imgContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAReceber.setBackground(new java.awt.Color(12, 180, 206));
        btnContasAReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnContasAReceberMousePressed(evt);
            }
        });

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
            .addComponent(imgContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnContasAReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCategorias.setBackground(new java.awt.Color(12, 180, 206));
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCategoriasMousePressed(evt);
            }
        });

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
            .addComponent(imgCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
            .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnClientes.setBackground(new java.awt.Color(12, 180, 206));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });

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
            .addComponent(imgClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSair.setBackground(new java.awt.Color(12, 180, 206));
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSairMousePressed(evt);
            }
        });

        imgSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Sign_Out_25px.png"))); // NOI18N

        lblSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSairMousePressed(evt);
            }
        });

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

        btnFornecedores.setBackground(new java.awt.Color(12, 180, 206));
        btnFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFornecedoresMousePressed(evt);
            }
        });

        lblFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedores.setText("Relatório de Estoque");

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

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Stocks_64px.png"))); // NOI18N

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFornecedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imgLogo)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        areaDeTrabalho.setBackground(new java.awt.Color(255, 255, 255));
        areaDeTrabalho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        painelBreadcrumb.setBackground(new java.awt.Color(102, 102, 102));

        lblBreadcrumb.setBackground(new java.awt.Color(204, 204, 204));
        lblBreadcrumb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBreadcrumb.setForeground(new java.awt.Color(153, 153, 153));
        lblBreadcrumb.setText("Estou na Tela de Produtos");

        javax.swing.GroupLayout painelBreadcrumbLayout = new javax.swing.GroupLayout(painelBreadcrumb);
        painelBreadcrumb.setLayout(painelBreadcrumbLayout);
        painelBreadcrumbLayout.setHorizontalGroup(
            painelBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBreadcrumbLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBreadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBreadcrumbLayout.setVerticalGroup(
            painelBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBreadcrumbLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblBreadcrumb)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        lblNomeSistema.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeSistema.setForeground(new java.awt.Color(153, 153, 153));
        lblNomeSistema.setText("Sistema de Apoio ao Microempreendedor Individual");

        painelDinamico.setBackground(new java.awt.Color(255, 255, 255));
        painelDinamico.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelDinamico.setToolTipText("MayDay");
        painelDinamico.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Powered by Students of Estácio TV-Morena");

        javax.swing.GroupLayout areaDeTrabalhoLayout = new javax.swing.GroupLayout(areaDeTrabalho);
        areaDeTrabalho.setLayout(areaDeTrabalhoLayout);
        areaDeTrabalhoLayout.setHorizontalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelBreadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblNomeSistema)
                .addGap(0, 301, Short.MAX_VALUE))
            .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        areaDeTrabalhoLayout.setVerticalGroup(
            areaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaDeTrabalhoLayout.createSequentialGroup()
                .addComponent(lblNomeSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelBreadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelDinamico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(areaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(areaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContasAPagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContasAPagarMousePressed
        painelDinamico.removeAll();
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnContasAPagarMousePressed

    private void btnContasAReceberMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContasAReceberMousePressed
      
           ContasAReceberPrincipal painelInicial = new ContasAReceberPrincipal();
        lblBreadcrumb.setText("Gerência de Contas a Receber");
        painelDinamico.removeAll();
        painelDinamico.add(painelInicial);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnContasAReceberMousePressed

    private void btnInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMousePressed
        ExemploPopulaTabela exemplo = new ExemploPopulaTabela();
        lblBreadcrumb.setText("Gerência de Contas a Pagar");
        painelDinamico.removeAll();
        painelDinamico.add(exemplo);
        painelDinamico.validate();
        painelDinamico.repaint();

    }//GEN-LAST:event_btnInicioMousePressed

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        GerenciamentoCliente gerenciaCliente = new GerenciamentoCliente();
        lblBreadcrumb.setText("Gerência de Clientes");
        painelDinamico.removeAll();
        painelDinamico.add(gerenciaCliente);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnFornecedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFornecedoresMousePressed
        // TODO add your handling code here:
        RelatorioDeEstoque relatorioDeEstoque = new RelatorioDeEstoque();
        lblBreadcrumb.setText("Relatório de Estoque");
        painelDinamico.removeAll();
        painelDinamico.add(relatorioDeEstoque);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnFornecedoresMousePressed

    private void btnCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMousePressed
        TelaPrincipalCategoria gerenciaCliente = new TelaPrincipalCategoria();
        lblBreadcrumb.setText("Gerência de Clientes");
        painelDinamico.removeAll();
        painelDinamico.add(gerenciaCliente);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnCategoriasMousePressed

    private void lblSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMousePressed
    System.exit(0);
    }//GEN-LAST:event_lblSairMousePressed

    private void btnSairMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMousePressed
    System.exit(0);
    }//GEN-LAST:event_btnSairMousePressed

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
            java.util.logging.Logger.getLogger(SistemaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame sistema = new SistemaClientes();
                sistema.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaDeTrabalho;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBreadcrumb;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblContasAPagar;
    private javax.swing.JLabel lblContasAReceber;
    private javax.swing.JLabel lblFornecedores;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblNomeSistema;
    private javax.swing.JLabel lblSair;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JPanel painelBreadcrumb;
    private javax.swing.JPanel painelDinamico;
    private javax.swing.JSeparator separador;
    // End of variables declaration//GEN-END:variables
}
