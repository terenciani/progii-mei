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
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        tbProdutos.setRowHeight(15);
        
//        Cria dados para poder ser testado
        if (produtoDao.buscarProdutos().size() <= 0) {
            Fornecedor fornecedor = new Fornecedor();	
            fornecedor.setRazaoSocial("Estacio");	
            FornecedorDao fornecedorDao = new FornecedorDaoEstatica();	
            fornecedorDao.salvarFornecedor(fornecedor);	
            Produto produto = new Produto(0, "Camisa", 10, fornecedor, 10, 20);	
            produtoDao.salvar(produto);		
            produto = new Produto(1, "Short", 5, fornecedor, 40, 80);
            produtoDao.salvar(produto);
        }
//      Insere Todos os produto na tabela
        DefaultTableModel tableColumns = (DefaultTableModel)tbProdutos.getModel();
        clearTable(tableColumns);
        ArrayList<Produto> listaDeProdutos = produtoDao.buscarProdutos();
        addProductToTable(listaDeProdutos, tableColumns);  
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
        pnlError = new javax.swing.JPanel();
        lblError = new javax.swing.JLabel();
        btnExportar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        txtPesquisar.setToolTipText("");
        txtPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(txtPesquisar);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/re_search.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnTodos.setText("Todos Produtos");
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

        lblError.setText("Errors");

        btnExportar.setText("Gerar relatório");
        btnExportar.setMaximumSize(new java.awt.Dimension(124, 32));
        btnExportar.setMinimumSize(new java.awt.Dimension(124, 32));
        btnExportar.setPreferredSize(new java.awt.Dimension(124, 32));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlErrorLayout = new javax.swing.GroupLayout(pnlError);
        pnlError.setLayout(pnlErrorLayout);
        pnlErrorLayout.setHorizontalGroup(
            pnlErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlErrorLayout.createSequentialGroup()
                .addGroup(pnlErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlErrorLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlErrorLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(lblError)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlErrorLayout.setVerticalGroup(
            pnlErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblError)
                .addContainerGap())
        );

        jLabel1.setText("Filtrar por");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(pnlError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tipoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(pnlError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Fornecedor", "Preço de Compra", "Preço de Venda", "Qtde Estoque"
            }
        ));
        tbProdutos.setMaximumSize(new java.awt.Dimension(650, 400));
        jScrollPane1.setViewportView(tbProdutos);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        int itemSelecionado = tipoPesquisa.getSelectedIndex();
        DefaultTableModel tableColumns = (DefaultTableModel)tbProdutos.getModel();
        try {
            switch(itemSelecionado) {
                case 0:
                    lblError.setVisible(false);
                    int pesqCodigo = Integer.parseInt(txtPesquisar.getText());
                    clearTable(tableColumns);
                    ArrayList<Produto> produtosPorCodigo = produtoDao.pesquisarPorCodigo(pesqCodigo);
                    addProductToTable(produtosPorCodigo, tableColumns);  
                    break;
                case 1:
                    lblError.setVisible(false);
                    String pesqNome = txtPesquisar.getText();
                    clearTable(tableColumns);
                    ArrayList<Produto> produtosPorNome = produtoDao.pesquisarPorNome(pesqNome);
                    addProductToTable(produtosPorNome, tableColumns);  
                    break;
                case 2:
                    lblError.setVisible(false);
                    String pesqFornecedor = txtPesquisar.getText();
                    clearTable(tableColumns);
                    ArrayList<Produto> produtosPorFornecedor = produtoDao.pesquisarPorFornecedor(pesqFornecedor);
                    addProductToTable(produtosPorFornecedor, tableColumns);

                        break;
                case 3:
                    lblError.setVisible(false);
                    int pesqPrecoCompra = Integer.parseInt(txtPesquisar.getText());
                    clearTable(tableColumns);
                    ArrayList<Produto> produtosPorPrecoCompra = produtoDao.pesquisarPorPrecoCompra(pesqPrecoCompra);
                    addProductToTable(produtosPorPrecoCompra, tableColumns);
                    break;
                case 4:
                    lblError.setVisible(false);
                    int pesqPrecoVenda = Integer.parseInt(txtPesquisar.getText());
                    clearTable(tableColumns);
                    ArrayList<Produto> produtosPorPrecoVenda = produtoDao.pesquisarPorPrecoVenda(pesqPrecoVenda);
                    addProductToTable(produtosPorPrecoVenda, tableColumns);
                    break;
                case 5:
                    lblError.setVisible(false);
                    int pesqQtdEstoque = Integer.parseInt(txtPesquisar.getText());
                    clearTable(tableColumns);
                    ArrayList<Produto> produtosPorQtdEstoque = produtoDao.pesquisarPorQtdEstoque(pesqQtdEstoque);
                    addProductToTable(produtosPorQtdEstoque, tableColumns);
                        break;
            }
        } catch (Exception e) {
            lblError.setText("Pesquisa Invalida!");
            lblError.setVisible(true);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed
    
    private void tipoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoPesquisaActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        DefaultTableModel tableColumns = (DefaultTableModel)tbProdutos.getModel();
        clearTable(tableColumns);
        ArrayList<Produto> listaDeProdutos = produtoDao.buscarProdutos();
        addProductToTable(listaDeProdutos, tableColumns);
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        Document relatorioPDF = new Document();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");
        LocalDateTime now = LocalDateTime.now();
        try {            
            PdfWriter.getInstance(relatorioPDF, new FileOutputStream("/home/dayves/pdfs/relatorio_estoque"+dtf.format(now)+".pdf"));
            relatorioPDF.open();
            Paragraph title = new Paragraph("Relatorio de estoque - SAMI");
            title.setSpacingAfter(5);
            relatorioPDF.add(title);
            PdfPTable table = new PdfPTable(tbProdutos.getColumnCount());
            for (int i = 0; i < tbProdutos.getColumnCount(); i++) {
                table.addCell(tbProdutos.getColumnName(i));
            }
            for (int rows = 0; rows < tbProdutos.getRowCount(); rows++) {
                for (int cols = 0; cols < tbProdutos.getColumnCount(); cols++) {
                    table.addCell(tbProdutos.getModel().getValueAt(rows, cols).toString());
                }
            }
            relatorioPDF.add(table);
        } catch (DocumentException | IOException de) {
            lblError.setText("Relatorio nao pode ser gerado!");
            lblError.setVisible(true);
        }finally{
            relatorioPDF.close();
        }
    }//GEN-LAST:event_btnExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel jLabel1;
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
   
    private void addProductToTable(ArrayList<Produto> products, DefaultTableModel TableColumns){
        for (int i=0; i< products.size();i++) {
            Produto p = products.get(i);
            Object[] lineData = new Object[3];
            lineData[0] = p.getCodigo();
            lineData[1] = p.getNome();
            lineData[2] = p.getQuantidade();
            TableColumns.addRow(lineData);
        }
    }
    
    private void clearTable(DefaultTableModel tableColumns) {
        while (tableColumns.getRowCount() != 0) {
            tableColumns.removeRow(0);
        }
    }
}
