/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.fornecedor;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.estacio.mei.dao.FornecedorDao;
import br.estacio.mei.dao.implementacao.FornecedorDaoEstatica;
import br.estacio.mei.dao.implementacao.FornecedorDaoJDBC;
import br.estacio.mei.model.Fornecedor;


/**
 *
 * @author aluno
 */
public class FornecedorPrincipal extends javax.swing.JPanel {
    
    FornecedorDao dao = new FornecedorDaoJDBC();
    Fornecedor fornecedor = new Fornecedor();
    /**
     * Creates new form ConsultaFornecedor
     */
    public FornecedorPrincipal() {
        initComponents();
        
        //==> Quando inicia a tela, exibe os clientes cadastrados <<==\\
        //Cliente cliente = new Cliente();
        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaFornecedores.getModel();
        ArrayList<Fornecedor> listaDeFornecedores = dao.listarFornecedores();

        for (int i = 0; i < listaDeFornecedores.size(); i++) {
            Fornecedor exibeFornecedor = listaDeFornecedores.get(i);
            Object[] linha = new Object[5];
            linha[0] = exibeFornecedor.getCodigo();
            linha[1] = exibeFornecedor.getRazaoSocial();
            linha[2] = exibeFornecedor.getTelefone();
            linha[3] = exibeFornecedor.getCPFCNPJ();
            linha[4] = exibeFornecedor.getEmail(); // Endereco Criar classe. 
            modeloDeColuna.addRow(linha);

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
        jScrollPane2 = new javax.swing.JScrollPane();
        tbListaFornecedores = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        txtCampoBusca = new javax.swing.JTextField();
        btnBuscarFornecedores = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnEditarFornecedores = new javax.swing.JButton();
        btnExcluirFornecedores = new javax.swing.JButton();
        btnAdicionarNovoFornecedor = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        painelDinamico.setLayout(new java.awt.BorderLayout());

        tbListaFornecedores.setBackground(new java.awt.Color(204, 204, 204));
        tbListaFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Razão Social", "Telefone", "CPF/CNPJ", "Email"
            }
        ));
        jScrollPane2.setViewportView(tbListaFornecedores);

        painelDinamico.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(786, 80));

        btnBuscarFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/findUser20.png"))); // NOI18N
        btnBuscarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFornecedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtCampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCampoBusca))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        painelDinamico.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnEditarFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar_cliente.png"))); // NOI18N
        btnEditarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFornecedoresActionPerformed(evt);
            }
        });

        btnExcluirFornecedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/deleteUser20.png"))); // NOI18N
        btnExcluirFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedoresActionPerformed(evt);
            }
        });

        btnAdicionarNovoFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/addUser20.png"))); // NOI18N
        btnAdicionarNovoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNovoFornecedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdicionarNovoFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEditarFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnExcluirFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnAdicionarNovoFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnExcluirFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        painelDinamico.add(jPanel5, java.awt.BorderLayout.LINE_END);

        add(painelDinamico, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFornecedoresActionPerformed
        ((DefaultTableModel) tbListaFornecedores.getModel()).setRowCount(0);

        dao.listarFornecedores();

        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaFornecedores.getModel();
        ArrayList<Fornecedor> listaDeFornecedores = dao.listarFornecedores();

        for (int i = 0; i < listaDeFornecedores.size(); i++) {
            Fornecedor exibeFornecedor = listaDeFornecedores.get(i);
            String nome = txtCampoBusca.getText();

            //==> Faz a busca do cliente por qualquer parte do seu nome <==\\
            if (exibeFornecedor.getRazaoSocial().contains(nome)) {

                Object[] linha = new Object[5];

                linha[0] = exibeFornecedor.getCodigo();
                linha[1] = exibeFornecedor.getRazaoSocial();
                linha[2] = exibeFornecedor.getTelefone();
                linha[3] = exibeFornecedor.getCPFCNPJ();
                linha[4] = exibeFornecedor.getEmail(); // Endereco Criar classe.
                modeloDeColuna.addRow(linha);
            }
        }
    }//GEN-LAST:event_btnBuscarFornecedoresActionPerformed

    private void btnEditarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFornecedoresActionPerformed
        if (tbListaFornecedores.getSelectedRow() >= 0) {
            //==> Pega o cógido do cliente selecionado na tabela <==\\
            String tipo = "update";
            int linha = tbListaFornecedores.getSelectedRow();

            int codigo = (int) tbListaFornecedores.getModel().getValueAt(linha, 0);
            //JPanel onde tem a tabela
            //DefaultTableModel table = (DefaultTableModel) tbListaClientes.getModel();

            //clienteEdit = table.getValueAt(tbListaClientes.getSelectedRow(), 1).toString();
            //==> Abre a tela de edição, passando o código do cliente <==\\
            CadastroFornecedor adicionarFornecedor = new CadastroFornecedor(codigo, tipo);
            painelDinamico.removeAll();
            painelDinamico.add(adicionarFornecedor);
            painelDinamico.validate();
            painelDinamico.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor!");
        }
    }//GEN-LAST:event_btnEditarFornecedoresActionPerformed

    private void btnExcluirFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedoresActionPerformed
        if (tbListaFornecedores.getSelectedRow() >= 0) {

            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão do Fornecedor?", "Excluir Fornecedor!", JOptionPane.YES_NO_OPTION);

            if (resposta == 0) {
                int linha = tbListaFornecedores.getSelectedRow();
                int codigo = (int) tbListaFornecedores.getModel().getValueAt(linha, 0);

                //==> Chama o método para excluir o cliente selecionado <==\\
                dao.excluirFornecedorPCodigo(codigo);

                //==> Faz nova busca, após a exclusão, atualizando a tabela de clientes <==\\
                ((DefaultTableModel) tbListaFornecedores.getModel()).setRowCount(0);
                dao.listarFornecedores();
                DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaFornecedores.getModel();
                ArrayList<Fornecedor> listaDeFornecedor = dao.listarFornecedores();

                for (int i = 0; i < listaDeFornecedor.size(); i++) {
                    Fornecedor exibeFornecedor = listaDeFornecedor.get(i);
                    String nome = txtCampoBusca.getText();

                    //==> Faz a busca do cliente por qualquer parte do seu nome <==\\
                    if (exibeFornecedor.getRazaoSocial().contains(nome)) {

                        Object[] linha1 = new Object[5];

                        linha1[0] = exibeFornecedor.getCodigo();
                        linha1[1] = exibeFornecedor.getRazaoSocial();
                        linha1[2] = exibeFornecedor.getTelefone();
                        linha1[3] = exibeFornecedor.getCPFCNPJ();
                        linha1[4] = exibeFornecedor.getEmail(); // Endereco Criar classe.
                        modeloDeColuna.addRow(linha1);
                    }
                }
                JOptionPane.showMessageDialog(null, "Fornecedor Removido!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Fornecedor!");
        }
    }//GEN-LAST:event_btnExcluirFornecedoresActionPerformed

    private void btnAdicionarNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNovoFornecedorActionPerformed

        String tipo = "insert";

        //==> Faz  uma busca dos clientes para trazer o último código cadastrado <==\\
        int codigoNovoFornecedor = 0;
        dao.listarFornecedores();

        DefaultTableModel modeloDeColuna = (DefaultTableModel) tbListaFornecedores.getModel();
        ArrayList<Fornecedor> listaDeFornecedor = dao.listarFornecedores();
        int aux = 0;
        for (int i = 0; i < listaDeFornecedor.size(); i++) {
            Fornecedor exibeFornecedor = listaDeFornecedor.get(i);
            //==> Lógica para pegar o maior código <==\\
            if (aux == 0) {
                codigoNovoFornecedor = exibeFornecedor.getCodigo();
                aux = 1;
            } else if (exibeFornecedor.getCodigo() > codigoNovoFornecedor) {
                codigoNovoFornecedor = exibeFornecedor.getCodigo();
            }
        }

        //==> Se não encontrou nenhum cliente cadastrado, o primeiro código é 1 <==\\
        if (codigoNovoFornecedor == 0) {
            codigoNovoFornecedor = 1;
        } else {
            //==> Se encontrou, incrementa 1, para não repetir o mesmo código <==\\
            codigoNovoFornecedor += 1;
        }

        //==> Abre a tela para inserir dados do cliente, passando o código e o tipo (insert=novo ou update=atualiza) <==\\
        CadastroFornecedor adicionarFornecedor = new CadastroFornecedor(codigoNovoFornecedor, tipo);
        painelDinamico.removeAll();
        painelDinamico.add(adicionarFornecedor);
        painelDinamico.validate();
        painelDinamico.repaint();
    }//GEN-LAST:event_btnAdicionarNovoFornecedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarNovoFornecedor;
    private javax.swing.JButton btnBuscarFornecedores;
    private javax.swing.JButton btnEditarFornecedores;
    private javax.swing.JButton btnExcluirFornecedores;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painelDinamico;
    private javax.swing.JTable tbListaFornecedores;
    private javax.swing.JTextField txtCampoBusca;
    // End of variables declaration//GEN-END:variables
}
