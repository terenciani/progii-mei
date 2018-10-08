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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Inserir = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        Inserir.setBackground(new java.awt.Color(255, 255, 255));
        Inserir.setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Inserir.add(jTextField1);
        jTextField1.setBounds(70, 40, 70, 20);

        jLabel1.setText("Código");
        Inserir.add(jLabel1);
        jLabel1.setBounds(30, 40, 40, 20);

        jLabel2.setText("Nome");
        Inserir.add(jLabel2);
        jLabel2.setBounds(170, 40, 30, 20);
        Inserir.add(jTextField2);
        jTextField2.setBounds(200, 40, 200, 20);

        jLabel3.setText("Quantidade");
        Inserir.add(jLabel3);
        jLabel3.setBounds(430, 40, 56, 20);
        Inserir.add(jTextField3);
        jTextField3.setBounds(490, 40, 50, 20);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Inserir Produto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Inserir.add(jButton1);
        jButton1.setBounds(250, 210, 105, 23);

        jLabel4.setText("Valor Atual");
        Inserir.add(jLabel4);
        jLabel4.setBounds(30, 90, 52, 20);
        Inserir.add(jTextField4);
        jTextField4.setBounds(90, 90, 50, 20);

        jLabel5.setText("Valor Antigo");
        Inserir.add(jLabel5);
        jLabel5.setBounds(170, 90, 58, 20);
        Inserir.add(jTextField5);
        jTextField5.setBounds(230, 90, 50, 20);

        jLabel6.setText("Lucro %");
        Inserir.add(jLabel6);
        jLabel6.setBounds(300, 90, 40, 20);
        Inserir.add(jTextField6);
        jTextField6.setBounds(350, 90, 60, 20);

        jLabel7.setText("Descrição");
        Inserir.add(jLabel7);
        jLabel7.setBounds(30, 130, 46, 20);
        Inserir.add(jTextField7);
        jTextField7.setBounds(80, 130, 470, 70);

        add(Inserir, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inserir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
