/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.fornecedor;


import br.estacio.mei.dao.FornecedorDao;
import br.estacio.mei.dao.implementacao.FornecedorDaoJDBC;
import br.estacio.mei.model.Fornecedor;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Marcelo
 */
public class CadastroFornecedor extends javax.swing.JPanel {
    FornecedorDao daofor = new FornecedorDaoJDBC();
    
    int codigoFornecedor = 0;
    String tipo= "";
    
    /**
     * Creates new form FornecedorPrincipal
     */
    public CadastroFornecedor() {
        initComponents();
    }
    
    public CadastroFornecedor(int codigo, String tipo) {
        initComponents();
        
        this.tipo = tipo;
        codigoFornecedor = codigo;
        if (tipo.equals("update")) {
            daofor.listarFornecedores();

            ArrayList<Fornecedor> buscarFornecedor = daofor.listarFornecedores();
            for (int i = 0; i < buscarFornecedor.size(); i++) {
                Fornecedor editarFornecedor = buscarFornecedor.get(i);

                if (editarFornecedor.getCodigo() == codigoFornecedor) {
                    txtRazaoSocial.setText(editarFornecedor.getRazaoSocial());
                    txtFantasia.setText(editarFornecedor.getFantasia());
                    txtEndereco.setText(editarFornecedor.getEndereco());
                    txtNumero.setText(String.valueOf(editarFornecedor.getNumero()));
                    txtCep.setText(String.valueOf(editarFornecedor.getCep()));
                    txtBairro.setText(String.valueOf(editarFornecedor.getBairro()));
                    txtCidade.setText(String.valueOf(editarFornecedor.getCidade()));
                    txtUF.setText(String.valueOf(editarFornecedor.getEstado()));
                    txtCPFCNPJ.setText(editarFornecedor.getCPFCNPJ());
                    txtIE.setText(editarFornecedor.getIe());
                    txtTelefone.setText(editarFornecedor.getTelefone());
                    txtEmail.setText(editarFornecedor.getEmail());
                    
                }
            }
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

        painelDinamico = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFantasia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCPFCNPJ = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        painelDinamico.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Razão Social: *");

        jLabel2.setText("Fantasia:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("N°:");

        jLabel5.setText("Cep:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("Cidade:");

        jLabel8.setText("UF:");

        txtUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUFActionPerformed(evt);
            }
        });

        jLabel9.setText("CPF/CNPJ: *");

        txtCPFCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFCNPJActionPerformed(evt);
            }
        });

        jLabel10.setText("IE:");

        txtIE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIEActionPerformed(evt);
            }
        });

        jLabel11.setText("Telefone:");

        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        jLabel13.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel12.setText("Campos com * são obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRazaoSocial)
                    .addComponent(txtFantasia)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUF))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIE, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(btnCancelar)
                .addGap(98, 98, 98)
                .addComponent(btnSalvar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCPFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtIE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        painelDinamico.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(painelDinamico, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUFActionPerformed

    private void txtCPFCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFCNPJActionPerformed

    private void txtIEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIEActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FornecedorPrincipal gerenciaFornecedor = new FornecedorPrincipal();
        painelDinamico.removeAll();
        painelDinamico.add(gerenciaFornecedor);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtRazaoSocial.getText().isEmpty()) {
            txtRazaoSocial.setBackground(Color.RED);
            txtRazaoSocial.requestFocus();
            

        } else if (txtCPFCNPJ.getText().isEmpty()) {
            txtCPFCNPJ.setBackground(Color.RED);
            txtCPFCNPJ.requestFocus();

        } else {
            Fornecedor fornecedor = new Fornecedor();
            
            fornecedor.setCodigo(codigoFornecedor);
            fornecedor.setRazaoSocial(txtRazaoSocial.getText());
            fornecedor.setCPFCNPJ(txtCPFCNPJ.getText());

            if (!txtFantasia.getText().isEmpty()) {
                fornecedor.setFantasia(txtFantasia.getText());
            }
            if (!txtTelefone.getText().isEmpty()) {
                fornecedor.setTelefone(txtTelefone.getText());
            }
            if (!txtEmail.getText().isEmpty()) {
                fornecedor.setEmail(txtEmail.getText());
            }
            if (!txtIE.getText().isEmpty()) {
                fornecedor.setIe(txtIE.getText());
            }

            if (!txtEndereco.getText().isEmpty()) {

                fornecedor.setEndereco(txtEndereco.getText());

            }
            if (!txtNumero.getText().isEmpty()) {
                fornecedor.setNumero(Integer.parseInt(txtNumero.getText()));
            }
            if (!txtBairro.getText().isEmpty()) {
                fornecedor.setBairro(txtBairro.getText());
            }
            if (!txtCidade.getText().isEmpty()) {
                fornecedor.setCidade(txtCidade.getText());
            }

            fornecedor.setEstado(txtUF.getText());

            if (!txtCep.getText().isEmpty()) {
                fornecedor.setCep(txtCep.getText());
            }

            if (this.tipo.equals("insert") ) {
                daofor.salvarFornecedor(fornecedor);

                JOptionPane.showMessageDialog(null, "Fornecedor Cadastrado!");
            } else {
                daofor.alterarFornecedor(fornecedor);
                JOptionPane.showMessageDialog(null, "Fornecedor Atualizado!");
            }

            FornecedorPrincipal gerenciaFornecedor = new FornecedorPrincipal();
            painelDinamico.removeAll();
            painelDinamico.add(gerenciaFornecedor);
            painelDinamico.validate();
            painelDinamico.repaint();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelDinamico;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPFCNPJ;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFantasia;
    private javax.swing.JTextField txtIE;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables
}
