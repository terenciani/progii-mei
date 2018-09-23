/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.cliente;

import br.estacio.mei.dao.ClienteDao;
import br.estacio.mei.dao.implementacao.ClienteDaoEstatico;

import br.estacio.mei.model.Cliente;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ericvdias
 */
public class GerenciamentoCliente extends javax.swing.JPanel {

    ClienteDao clienteDao = new ClienteDaoEstatico();
    Cliente cliente = new Cliente();

    /**
     * Creates new form GerenciamentoCliente
     */
    public GerenciamentoCliente() {
        initComponents();

        ///TESTES:
        Cliente cliente = new Cliente();
        /*
        cliente.setCodigo(1);
        cliente.setNome("Eric Dias");
        cliente.setTelefone(799998888);
        cliente.setCpfCnpj("12345678911");
        cliente.setEmail("email@email");

        clienteDao.salvarCliente(cliente);
    
        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaClientes.getModel();
        ArrayList<Cliente> listaDeClientes = clienteDao.buscarClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente exibeCliente = listaDeClientes.get(i);
            Object[] linha = new Object[5];
            linha[0] = exibeCliente.getCodigo();
            linha[1] = exibeCliente.getNome();
            linha[2] = exibeCliente.getTelefone();
            linha[3] = exibeCliente.getCpfCnpj();
            linha[4] = exibeCliente.getEmail(); // Endereco Criar classe. 
            modeloDeColuna.addRow(linha);
        }
         */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDinamico = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListaClientes = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnEditarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnAdicionarNovoCliente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnBuscarClientes = new javax.swing.JButton();
        testeCodigo = new javax.swing.JLabel();
        testeNome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(786, 531));
        setLayout(new java.awt.BorderLayout());

        panelDinamico.setLayout(new java.awt.BorderLayout());

        tbListaClientes.setForeground(new java.awt.Color(102, 102, 102));
        tbListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Telefone", "CPF/CNPJ", "Endereço"
            }
        ));
        jScrollPane2.setViewportView(tbListaClientes);

        panelDinamico.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar_cliente.png"))); // NOI18N
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/deleteUser20.png"))); // NOI18N

        btnAdicionarNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addUser20.png"))); // NOI18N
        btnAdicionarNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNovoClienteActionPerformed(evt);
            }
        });

        jButton1.setText("Fecha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarNovoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnAdicionarNovoCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        panelDinamico.add(jPanel5, java.awt.BorderLayout.LINE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(786, 80));

        btnBuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/findUser20.png"))); // NOI18N
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        testeCodigo.setText("jLabel1");

        testeNome.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(testeCodigo)
                    .addComponent(testeNome))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(testeCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testeNome))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBuscarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelDinamico.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        add(panelDinamico, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNovoClienteActionPerformed

        InformaDadosCliente adicionarCliente = new InformaDadosCliente();
        panelDinamico.removeAll();
        panelDinamico.add(adicionarCliente);
        panelDinamico.validate();
        panelDinamico.repaint();
    }//GEN-LAST:event_btnAdicionarNovoClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed

        /*
        int linha = tbListaClientes.getSelectedRow();
        int codigo = (int) tbListaClientes.getModel().getValueAt(linha, 0);
        String nome = (String) tbListaClientes.getModel().getValueAt(linha, 1);
        int telefone = (int) tbListaClientes.getModel().getValueAt(linha, 2);
        String cpfCnpj = (String) tbListaClientes.getModel().getValueAt(linha, 3);
        String endereco = (String) tbListaClientes.getModel().getValueAt(linha, 4);

        testeNome.setText(nome);
        testeCodigo.setText("" + codigo);
         */
        //JPanel onde tem a tabela
        DefaultTableModel table = (DefaultTableModel) tbListaClientes.getModel();

        if (tbListaClientes.getSelectedRow() >= 0) {
            //clienteEdit = table.getValueAt(tbListaClientes.getSelectedRow(), 1).toString();

        }

        //cliente.getCodigo();
        InformaDadosCliente adicionarCliente = new InformaDadosCliente();
        panelDinamico.removeAll();
        panelDinamico.add(adicionarCliente);
        panelDinamico.validate();
        panelDinamico.repaint();

    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed

        clienteDao.buscarClientes();

        /*
        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaClientes.getModel();
        ArrayList<Cliente> listaDeClientes = clienteDao.buscarClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente exibeCliente = listaDeClientes.get(i);
            Object[] linha = new Object[5];
            linha[0] = exibeCliente.getCodigo();
            linha[1] = exibeCliente.getNome();
            linha[2] = exibeCliente.getTelefone();
            linha[3] = exibeCliente.getCpfCnpj();
            linha[4] = exibeCliente.getEmail(); // Endereco Criar classe. 
            modeloDeColuna.addRow(linha);
        }*/

    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarNovoCliente;
    private javax.swing.JButton btnBuscarClientes;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelDinamico;
    private javax.swing.JTable tbListaClientes;
    private javax.swing.JLabel testeCodigo;
    private javax.swing.JLabel testeNome;
    // End of variables declaration//GEN-END:variables

}
