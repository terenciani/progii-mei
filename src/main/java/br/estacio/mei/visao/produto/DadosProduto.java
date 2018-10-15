/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.produto;

import br.estacio.mei.dao.ProdutoDao;
import br.estacio.mei.dao.implementacao.ProdutoDaoEstatico;
import br.estacio.mei.model.Categoria;
import br.estacio.mei.model.Fornecedor;
import br.estacio.mei.model.Produto;

/**
 *
 * @author aluno
 */
public class DadosProduto extends javax.swing.JPanel {
    ProdutoDao daoProduto = new ProdutoDaoEstatico();
    /**
     * Creates new form DadosProduto
     */
    public DadosProduto() {
        initComponents();
    }

    DadosProduto(int codigoNovoProduto, String tipo) {
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

        Inserir = new javax.swing.JPanel();
        codigo = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        campoParaNome = new javax.swing.JTextField();
        categoria = new javax.swing.JLabel();
        campoParaCodigo = new javax.swing.JTextField();
        inserirProduto = new javax.swing.JButton();
        Fornecedor = new javax.swing.JLabel();
        campoParaFornecedor = new javax.swing.JTextField();
        descricao = new javax.swing.JLabel();
        campoParaDescricao = new javax.swing.JTextField();
        selcionarCategoria = new javax.swing.JComboBox<>();

        setLayout(new java.awt.BorderLayout());

        Inserir.setBackground(new java.awt.Color(255, 255, 255));

        codigo.setText("Código");

        nome.setText("Nome");

        categoria.setText("Categoria");

        inserirProduto.setBackground(new java.awt.Color(102, 102, 102));
        inserirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png"))); // NOI18N
        inserirProduto.setText("Inserir Produto");
        inserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirProdutoActionPerformed(evt);
            }
        });

        Fornecedor.setText("Fornecedor");

        campoParaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoParaFornecedorActionPerformed(evt);
            }
        });

        descricao.setText("Descrição");

        selcionarCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selcionarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selcionarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout InserirLayout = new javax.swing.GroupLayout(Inserir);
        Inserir.setLayout(InserirLayout);
        InserirLayout.setHorizontalGroup(
            InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InserirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InserirLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431))
                    .addGroup(InserirLayout.createSequentialGroup()
                        .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InserirLayout.createSequentialGroup()
                                .addComponent(descricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoParaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InserirLayout.createSequentialGroup()
                                .addComponent(Fornecedor)
                                .addGap(37, 37, 37)
                                .addComponent(campoParaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InserirLayout.createSequentialGroup()
                                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(categoria)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoParaNome)
                                    .addComponent(campoParaCodigo)
                                    .addComponent(selcionarCategoria, 0, 200, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InserirLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inserirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        InserirLayout.setVerticalGroup(
            InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InserirLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoParaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selcionarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoParaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoParaFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(InserirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoParaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(inserirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(Inserir, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void selcionarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selcionarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selcionarCategoriaActionPerformed

    private void campoParaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoParaFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoParaFornecedorActionPerformed

    private void inserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirProdutoActionPerformed
        //Dados para testes

        //Deverá ser dinâmico do formulário
        Produto produto = new Produto();
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setRazaoSocial("Estácio");
        Categoria categoria = new Categoria();

        categoria.setCodigo(1);
        categoria.setDescricao("Bijuteria");
        produto.setCodigo(1);
        produto.setDescricao("Anel Dourado");
        produto.setFornecedor(fornecedor);
        produto.setLucro(10);
        produto.setNome("Anel");
        produto.setPrecoCompra(10);
        produto.setPrecoVenda(20);
        produto.setQuantidade(15);
        produto.setValorAntigo(10);
        produto.setValorAtual(15);
        daoProduto.salvar(produto);
    }//GEN-LAST:event_inserirProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fornecedor;
    private javax.swing.JPanel Inserir;
    private javax.swing.JTextField campoParaCodigo;
    private javax.swing.JTextField campoParaDescricao;
    private javax.swing.JTextField campoParaFornecedor;
    private javax.swing.JTextField campoParaNome;
    private javax.swing.JLabel categoria;
    private javax.swing.JLabel codigo;
    private javax.swing.JLabel descricao;
    private javax.swing.JButton inserirProduto;
    private javax.swing.JLabel nome;
    private javax.swing.JComboBox<String> selcionarCategoria;
    // End of variables declaration//GEN-END:variables
}
