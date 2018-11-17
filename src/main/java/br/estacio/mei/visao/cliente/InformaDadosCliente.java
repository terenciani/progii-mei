/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.cliente;

import br.estacio.mei.dao.ClienteDao;
import br.estacio.mei.dao.EnderecoDao;
import br.estacio.mei.dao.implementacao.ClienteDaoEstatico;
import br.estacio.mei.dao.implementacao.ClienteDaoJDBC;
import br.estacio.mei.dao.implementacao.EnderecoDaoEstatico;
import br.estacio.mei.dao.implementacao.EnderecoDaoJDBC;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.Endereco;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ericvdias
 */
public class InformaDadosCliente extends javax.swing.JPanel {

    ClienteDao clienteDao = new ClienteDaoJDBC();
    EnderecoDao enderecoDao = new EnderecoDaoJDBC();
    int codigoCliente = 0;
    String tipo= "";
    /**
     * Creates new form testeFechaTela
     */
    public InformaDadosCliente() {
        initComponents();

    }

    public InformaDadosCliente(int codigo, String tipo) {
        initComponents();
        
        this.tipo = tipo;
        codigoCliente = codigo;
        txtCodigo.setText("" + codigo);
        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new Color(170, 170, 170));
        if (tipo.equals("update")) {
            clienteDao.buscarClientes();
            enderecoDao.buscarEndereco();

            ArrayList<Cliente> buscarCliente = clienteDao.buscarClientes();
            for (int i = 0; i < buscarCliente.size(); i++) {
                Cliente editarCliente = buscarCliente.get(i);

                if (editarCliente.getCodigo() == codigoCliente) {
                    txtNome.setText(editarCliente.getNome());
                    txtCpfCNPJ.setText(editarCliente.getCpfCnpj());
                    txtNomeFantasia.setText(editarCliente.getNomeFantasia());
                    TxtInscrEstadual.setText(editarCliente.getInscrEstadual());
                    txtTelefone.setText("" + editarCliente.getTelefone());
                    txtEmail.setText(editarCliente.getEmail());
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
        jLabel_codigo = new javax.swing.JLabel();
        jLabel_cpfCnpj = new javax.swing.JLabel();
        txtCpfCNPJ = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel_nome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel_foneRes = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel_endereco = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel_complemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel_estado = new javax.swing.JLabel();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel_inscrEstadual = new javax.swing.JLabel();
        TxtInscrEstadual = new javax.swing.JTextField();
        jLabel_nomeFantasia = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel_numero = new javax.swing.JLabel();
        jLabel_bairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel_bairro1 = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtConfirma = new javax.swing.JButton();
        lblMsgCampoObrigatorio = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        painelDinamico.setLayout(new java.awt.BorderLayout());

        jLabel_codigo.setText("Código:");

        jLabel_cpfCnpj.setText("CPF / CNPJ: *");

        txtCpfCNPJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCpfCNPJMouseClicked(evt);
            }
        });

        jLabel_nome.setText("Nome / Razão Social: *");

        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });

        jLabel_foneRes.setText("Telefone:");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setName("Inclusão de Cliente"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel_endereco.setText("Rua:");

        jLabel_complemento.setText("Complemento:");

        jLabel_estado.setText("Estado:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SP", "TO", "SE" }));

        jLabel_inscrEstadual.setText("Inscr Estadual:");

        jLabel_nomeFantasia.setText("Nome Fantasia:");

        jLabel_numero.setText("Número:");

        jLabel_bairro.setText("Bairro:");

        jLabel_bairro1.setText("Cidade:");

        jLabel_email.setText("Email:");

        txtConfirma.setBackground(new java.awt.Color(0, 204, 0));
        txtConfirma.setText("Confirmar");
        txtConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmaActionPerformed(evt);
            }
        });

        lblMsgCampoObrigatorio.setFont(new java.awt.Font("sansserif", 0, 10)); // NOI18N
        lblMsgCampoObrigatorio.setText("Campos com * são obrigatórios");

        lblCep.setText("CEP:");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Endereço");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel2.setText("Contato");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_codigo)
                                            .addComponent(jLabel_cpfCnpj)
                                            .addComponent(jLabel_nome)
                                            .addComponent(jLabel_email))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCpfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                            .addComponent(txtEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_inscrEstadual)
                                            .addComponent(jLabel_nomeFantasia)
                                            .addComponent(jLabel_foneRes)))
                                    .addComponent(lblMsgCampoObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_estado)
                                    .addComponent(jLabel_endereco)
                                    .addComponent(jLabel_complemento))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtConfirma))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_bairro)
                                    .addComponent(jLabel_numero)
                                    .addComponent(jLabel_bairro1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtInscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(lblCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(511, 511, 511)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblMsgCampoObrigatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cpfCnpj)
                    .addComponent(txtCpfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_inscrEstadual)
                    .addComponent(TxtInscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_nomeFantasia)
                    .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_foneRes)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_numero)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_endereco)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bairro)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bairro1)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_complemento)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_estado)
                            .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(txtConfirma))
                .addContainerGap())
        );

        painelDinamico.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(painelDinamico, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ClientePrincipal gerenciaCliente = new ClientePrincipal();
        painelDinamico.removeAll();
        painelDinamico.add(gerenciaCliente);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void txtConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmaActionPerformed

        Endereco enderecoCliente = new Endereco();
        if (txtCpfCNPJ.getText().isEmpty()) {
            txtCpfCNPJ.setBackground(Color.red);

        } else if (txtNome.getText().isEmpty()) {
            txtNome.setBackground(Color.red);

        } else {
            lblMsgCampoObrigatorio.setText("");
            Cliente cliente = new Cliente();
            
            cliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
            enderecoCliente.setCodigo(Integer.parseInt(txtCodigo.getText()));
            cliente.setNome(txtNome.getText().toUpperCase());
            cliente.setCpfCnpj(txtCpfCNPJ.getText());

            if (!txtNomeFantasia.getText().isEmpty()) {
                cliente.setNomeFantasia(txtNomeFantasia.getText().toUpperCase());
            }
            if (!txtTelefone.getText().isEmpty()) {
                cliente.setTelefone(txtTelefone.getText());
            }
            if (!txtEmail.getText().isEmpty()) {
                cliente.setEmail(txtEmail.getText().toLowerCase());
            }
            if (!TxtInscrEstadual.getText().isEmpty()) {
                cliente.setInscrEstadual(TxtInscrEstadual.getText());
            }

            if (!txtRua.getText().isEmpty()) {
                enderecoCliente.setRua(txtRua.getText());
            }
            if (!txtNumero.getText().isEmpty()) {
                enderecoCliente.setNumero(Integer.parseInt(txtNumero.getText()));
            }
            if (!txtComplemento.getText().isEmpty()) {
                enderecoCliente.setComplemento(txtComplemento.getText().toUpperCase());
            }
            if (!txtBairro.getText().isEmpty()) {
                enderecoCliente.setBairro(txtBairro.getText().toUpperCase());
            }
            if (!txtCidade.getText().isEmpty()) {
                enderecoCliente.setCidade(txtCidade.getText().toUpperCase());
            }

            enderecoCliente.setEstado(String.valueOf(cbEstado.getSelectedItem()));

            if (!txtCep.getText().isEmpty()) {
                enderecoCliente.setCep(txtCep.getText());
            }

            if (this.tipo.equals("insert") ) {
                clienteDao.salvarCliente(cliente);
                enderecoDao.salvarEnderecoCliente(enderecoCliente);

               // JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
            } else {
                clienteDao.atualizarCliente(cliente, codigoCliente);
                enderecoDao.alterarEndereco(enderecoCliente);
                //JOptionPane.showMessageDialog(null, "Cliente Atualizado!");
            }

            ClientePrincipal gerenciaCliente = new ClientePrincipal();
            painelDinamico.removeAll();
            painelDinamico.add(gerenciaCliente);
            painelDinamico.validate();
            painelDinamico.repaint();
        }

    }//GEN-LAST:event_txtConfirmaActionPerformed

    private void txtCpfCNPJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCpfCNPJMouseClicked
        if (codigoCliente == 0) {
            txtCpfCNPJ.setBackground(Color.white);
            txtCpfCNPJ.setText("");
        }
    }//GEN-LAST:event_txtCpfCNPJMouseClicked

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        if (codigoCliente == 0) {
            txtNome.setBackground(Color.white);
            txtNome.setText("");
        }
    }//GEN-LAST:event_txtNomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtInscrEstadual;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_bairro;
    private javax.swing.JLabel jLabel_bairro1;
    private javax.swing.JLabel jLabel_codigo;
    private javax.swing.JLabel jLabel_complemento;
    private javax.swing.JLabel jLabel_cpfCnpj;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JLabel jLabel_endereco;
    private javax.swing.JLabel jLabel_estado;
    private javax.swing.JLabel jLabel_foneRes;
    private javax.swing.JLabel jLabel_inscrEstadual;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_nomeFantasia;
    private javax.swing.JLabel jLabel_numero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblMsgCampoObrigatorio;
    private javax.swing.JPanel painelDinamico;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JButton txtConfirma;
    private javax.swing.JTextField txtCpfCNPJ;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
