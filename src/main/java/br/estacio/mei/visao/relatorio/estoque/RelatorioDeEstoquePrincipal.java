/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.relatorio.estoque;

import br.estacio.mei.dao.FornecedorDao;
import br.estacio.mei.dao.ProdutoDao;
import br.estacio.mei.dao.implementacao.FornecedorDaoEstatica;
import br.estacio.mei.dao.implementacao.ProdutoDaoEstatico;
import br.estacio.mei.model.Fornecedor;
import br.estacio.mei.model.Produto;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcelo
 */
public class RelatorioDeEstoquePrincipal extends javax.swing.JPanel {
    ProdutoDao produtoDao = new ProdutoDaoEstatico();
    /**
     * Creates new form RelatorioDeEstoque
     */
    public RelatorioDeEstoquePrincipal() {
        initComponents();
        lblError.setVisible(false);
        
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setRazaoSocial("Estacio");
        FornecedorDao fornecedorDao = new FornecedorDaoEstatica();
        fornecedorDao.salvarFornecedor(fornecedor);
        Produto produto = new Produto(0, "Camisa", 10, fornecedor, 10, 20);
        produtoDao.salvar(produto);
        
        produto = new Produto(1, "Short", 5, fornecedor, 40, 80);
        
        produtoDao.salvar(produto);
        
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel)tbProdutos.getModel();

        ArrayList<Produto> listaDeProdutos = produtoDao.buscarProdutos();
        for (int i=0; i< listaDeProdutos.size();i++)
        {
            Produto p = listaDeProdutos.get(i);
            Object[] dadosDaLinha = new Object[6];
            dadosDaLinha[0] = p.getCodigo();
            dadosDaLinha[1] = p.getNome();
            dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
            dadosDaLinha[3] = p.getPrecoCompra();
            dadosDaLinha[4] = p.getPrecoVenda();
            dadosDaLinha[5] = p.getQuantidade();
            modeloDeColunasDaTabela.addRow(dadosDaLinha);
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPesquisar = new javax.swing.JTextPane();
        btnPesquisar = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        tipoPesquisa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        pnlError = new javax.swing.JPanel();
        lblError = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(675, 625));

        txtPesquisar.setToolTipText("");
        txtPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(txtPesquisar);

        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnTodos.setText("Novo Produto");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        tipoPesquisa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nome", "Fornecedor", "Preço de Compra", "Preço de Venda", "Qtde Estoque" }));
        tipoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTodos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addGap(50, 50, 50))
        );

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Fornecedor", "Preço de Compra", "Preço de Venda", "Qtde Estoque"
            }
        ));
        jScrollPane1.setViewportView(tbProdutos);

        lblError.setText("Errors");

        javax.swing.GroupLayout pnlErrorLayout = new javax.swing.GroupLayout(pnlError);
        pnlError.setLayout(pnlErrorLayout);
        pnlErrorLayout.setHorizontalGroup(
            pnlErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlErrorLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(lblError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlErrorLayout.setVerticalGroup(
            pnlErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int itemSelecionado = tipoPesquisa.getSelectedIndex();
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel)tbProdutos.getModel();
        switch(itemSelecionado) {
            case 0:
                try {
                    lblError.setVisible(false);
                    int pesqCodigo = Integer.parseInt(txtPesquisar.getText());
                    while (modeloDeColunasDaTabela.getRowCount() != 0) {
                        modeloDeColunasDaTabela.removeRow(0);
                    }
                    ArrayList<Produto> produtosPorCodigo = produtoDao.pesquisarPorCodigo(pesqCodigo);
                    for (int i=0; i< produtosPorCodigo.size();i++)
                       {
                           Produto p = produtosPorCodigo.get(i);
                           Object[] dadosDaLinha = new Object[6];
                           dadosDaLinha[0] = p.getCodigo();
                           dadosDaLinha[1] = p.getNome();
                           dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
                           dadosDaLinha[3] = p.getPrecoCompra();
                           dadosDaLinha[4] = p.getPrecoVenda();
                           dadosDaLinha[5] = p.getQuantidade();
                           modeloDeColunasDaTabela.addRow(dadosDaLinha);
                       }
                } catch (Exception e) {
                    lblError.setText("Pesquisa Invalida!");
                    lblError.setVisible(true);
                }

                break;
            case 1:
                try {
                    lblError.setVisible(false);
                    String pesqNome = txtPesquisar.getText();
                    while (modeloDeColunasDaTabela.getRowCount() != 0) {
                        modeloDeColunasDaTabela.removeRow(0);
                    }
                    System.out.println(pesqNome);
                    ArrayList<Produto> produtosPorNome = produtoDao.pesquisarPorNome(pesqNome);
                    for (int i=0; i< produtosPorNome.size();i++)
                    {
                        Produto p = produtosPorNome.get(i);
                        Object[] dadosDaLinha = new Object[6];
                        dadosDaLinha[0] = p.getCodigo();
                        dadosDaLinha[1] = p.getNome();
                        dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
                        dadosDaLinha[3] = p.getPrecoCompra();
                        dadosDaLinha[4] = p.getPrecoVenda();
                        dadosDaLinha[5] = p.getQuantidade();
                        modeloDeColunasDaTabela.addRow(dadosDaLinha);
                    }    
                } catch (Exception e) {
                    lblError.setText("Pesquisa Invalida!");
                    lblError.setVisible(true);
                }
                break;
            case 2:
                try {
                    lblError.setVisible(false);
                    String pesqFornecedor = txtPesquisar.getText();
                    while (modeloDeColunasDaTabela.getRowCount() != 0) {
                        modeloDeColunasDaTabela.removeRow(0);
                    }
                    ArrayList<Produto> produtosPorFornecedor = produtoDao.pesquisarPorFornecedor(pesqFornecedor);
                    for (int i=0; i< produtosPorFornecedor.size();i++)
                    {
                        Produto p = produtosPorFornecedor.get(i);
                        Object[] dadosDaLinha = new Object[6];
                        dadosDaLinha[0] = p.getCodigo();
                        dadosDaLinha[1] = p.getNome();
                        dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
                        dadosDaLinha[3] = p.getPrecoCompra();
                        dadosDaLinha[4] = p.getPrecoVenda();
                        dadosDaLinha[5] = p.getQuantidade();
                        modeloDeColunasDaTabela.addRow(dadosDaLinha);
                    }
                } catch (Exception e) {
                    lblError.setText("Pesquisa Invalida!");
                    lblError.setVisible(true);
                }
                    break;
            case 3:
                try {
                    lblError.setVisible(false);
                    int pesqPrecoCompra = Integer.parseInt(txtPesquisar.getText());
                    while (modeloDeColunasDaTabela.getRowCount() != 0) {
                        modeloDeColunasDaTabela.removeRow(0);
                    }
                    ArrayList<Produto> produtosPorPrecoCompra = produtoDao.pesquisarPorPrecoCompra(pesqPrecoCompra);
                    for (int i=0; i< produtosPorPrecoCompra.size();i++)
                    {
                        Produto p = produtosPorPrecoCompra.get(i);
                        Object[] dadosDaLinha = new Object[6];
                        dadosDaLinha[0] = p.getCodigo();
                        dadosDaLinha[1] = p.getNome();
                        dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
                        dadosDaLinha[3] = p.getPrecoCompra();
                        dadosDaLinha[4] = p.getPrecoVenda();
                        dadosDaLinha[5] = p.getQuantidade();
                        modeloDeColunasDaTabela.addRow(dadosDaLinha);
                    }
                } catch (Exception e) {
                    lblError.setText("Pesquisa Invalida!");
                    lblError.setVisible(true);
                }
                    break;
            case 4:
                try {
                    lblError.setVisible(false);
                    int pesqPrecoVenda = Integer.parseInt(txtPesquisar.getText());
                    while (modeloDeColunasDaTabela.getRowCount() != 0) {
                        modeloDeColunasDaTabela.removeRow(0);
                    }
                    ArrayList<Produto> produtosPorPrecoVenda = produtoDao.pesquisarPorPrecoVenda(pesqPrecoVenda);
                    for (int i=0; i< produtosPorPrecoVenda.size();i++)
                    {
                        Produto p = produtosPorPrecoVenda.get(i);
                        Object[] dadosDaLinha = new Object[6];
                        dadosDaLinha[0] = p.getCodigo();
                        dadosDaLinha[1] = p.getNome();
                        dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
                        dadosDaLinha[3] = p.getPrecoCompra();
                        dadosDaLinha[4] = p.getPrecoVenda();
                        dadosDaLinha[5] = p.getQuantidade();
                        modeloDeColunasDaTabela.addRow(dadosDaLinha);
                    }
                } catch (Exception e) {
                    lblError.setText("Pesquisa Invalida!");
                    lblError.setVisible(true);
                }
                    break;
            case 5:
                try {
                    lblError.setVisible(false);
                    int pesqQtdEstoque = Integer.parseInt(txtPesquisar.getText());
                    while (modeloDeColunasDaTabela.getRowCount() != 0) {
                        modeloDeColunasDaTabela.removeRow(0);
                    }
                    ArrayList<Produto> produtosPorQtdEstoque = produtoDao.pesquisarPorQtdEstoque(pesqQtdEstoque);
                    for (int i=0; i< produtosPorQtdEstoque.size();i++)
                    {
                        Produto p = produtosPorQtdEstoque.get(i);
                        Object[] dadosDaLinha = new Object[6];
                        dadosDaLinha[0] = p.getCodigo();
                        dadosDaLinha[1] = p.getNome();
                        dadosDaLinha[2] = p.getFornecedor().getRazaoSocial();
                        dadosDaLinha[3] = p.getPrecoCompra();
                        dadosDaLinha[4] = p.getPrecoVenda();
                        dadosDaLinha[5] = p.getQuantidade();
                        modeloDeColunasDaTabela.addRow(dadosDaLinha);
                    }
                } catch (Exception e) {
                    lblError.setText("Pesquisa Invalida!");
                    lblError.setVisible(true);
                }
                    break;
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPesquisaActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        int linha = tbProdutos.getSelectedRow();
        int codigo = (int)tbProdutos.getModel().getValueAt(linha, 0);
    }//GEN-LAST:event_btnTodosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblError;
    private javax.swing.JPanel pnlError;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JComboBox<String> tipoPesquisa;
    private javax.swing.JTextPane txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
