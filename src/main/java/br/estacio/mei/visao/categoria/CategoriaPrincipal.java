/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.categoria;

import br.estacio.mei.dao.CategoriaDao;
import br.estacio.mei.dao.implementacao.CategoriaDaoEstatica;

import br.estacio.mei.model.Categoria;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import javax.lang.model.util.Elements;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @Author Equipe 7 (Carlos Pellat, Marcio Piter, Jose Victor Ferreira e Waldir
 * Orico)
 */
public class CategoriaPrincipal extends javax.swing.JPanel {

    CategoriaDao categoriaDao = new CategoriaDaoEstatica();
    Categoria categoria = new Categoria();

    /**
     * Creates new form TelaPrincipalCategoria
     */
    public CategoriaPrincipal() {
        initComponents();
        panelCategAcao.setVisible(false);
        populaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCategoria = new javax.swing.JPanel();
        labelBuscaCate = new javax.swing.JLabel();
        textCampoEntradaBusca = new javax.swing.JTextField();
        botaoBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblCategoria = new javax.swing.JTable();
        panelCategAcao = new javax.swing.JPanel();
        botaoConfirmar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        labelAcaoUsuario = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        textCampoCodigo = new javax.swing.JTextField();
        labelDescricao = new javax.swing.JLabel();
        textCampoDesc = new javax.swing.JTextField();
        panelBotoes = new javax.swing.JPanel();
        botaoIncluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoImprimir = new javax.swing.JButton();
        botaoFecharCateg = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelCategoria.setBackground(new java.awt.Color(255, 255, 255));

        labelBuscaCate.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelBuscaCate.setText("Busca Categoria");

        botaoBuscar.setBackground(new java.awt.Color(153, 153, 153));
        botaoBuscar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-pesquisar-25.png"))); // NOI18N
        botaoBuscar.setText("Pesquisar");
        botaoBuscar.setPreferredSize(new java.awt.Dimension(125, 34));
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTblCategoria);
        if (jTblCategoria.getColumnModel().getColumnCount() > 0) {
            jTblCategoria.getColumnModel().getColumn(0).setResizable(false);
            jTblCategoria.getColumnModel().getColumn(1).setResizable(false);
        }

        panelCategAcao.setBackground(new java.awt.Color(255, 255, 255));
        panelCategAcao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), null));
        panelCategAcao.setToolTipText("");

        botaoConfirmar.setBackground(new java.awt.Color(153, 153, 153));
        botaoConfirmar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-25.png"))); // NOI18N
        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(153, 153, 153));
        botaoSair.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-sair-25.png"))); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.setBorderPainted(false);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        labelAcaoUsuario.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        labelAcaoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAcaoUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelCodigo.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelCodigo.setText("Código:");

        textCampoCodigo.setEditable(false);

        labelDescricao.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        labelDescricao.setText("Descrição: ");

        javax.swing.GroupLayout panelCategAcaoLayout = new javax.swing.GroupLayout(panelCategAcao);
        panelCategAcao.setLayout(panelCategAcaoLayout);
        panelCategAcaoLayout.setHorizontalGroup(
            panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategAcaoLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(labelAcaoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCategAcaoLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                                .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                                .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelCategAcaoLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(botaoConfirmar)
                                .addGap(36, 36, 36)
                                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCategAcaoLayout.setVerticalGroup(
            panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategAcaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelAcaoUsuario)
                .addGap(35, 35, 35)
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCampoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCampoDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(panelCategAcaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoConfirmar)
                    .addComponent(botaoSair))
                .addContainerGap())
        );

        panelBotoes.setBackground(new java.awt.Color(255, 255, 255));

        botaoIncluir.setBackground(new java.awt.Color(153, 153, 153));
        botaoIncluir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-incluir-25.png"))); // NOI18N
        botaoIncluir.setText("Incluir");
        botaoIncluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIncluirActionPerformed(evt);
            }
        });

        botaoAlterar.setBackground(new java.awt.Color(153, 153, 153));
        botaoAlterar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-alterar-25.png"))); // NOI18N
        botaoAlterar.setText("Alterar");
        botaoAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(153, 153, 153));
        botaoExcluir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-apagar-25.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoImprimir.setBackground(new java.awt.Color(153, 153, 153));
        botaoImprimir.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-imprimir-25.png"))); // NOI18N
        botaoImprimir.setText("Imprimir");
        botaoImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoImprimir.setMaximumSize(new java.awt.Dimension(97, 23));
        botaoImprimir.setMinimumSize(new java.awt.Dimension(97, 23));
        botaoImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoImprimirActionPerformed(evt);
            }
        });

        botaoFecharCateg.setBackground(new java.awt.Color(153, 153, 153));
        botaoFecharCateg.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        botaoFecharCateg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-sair-25.png"))); // NOI18N
        botaoFecharCateg.setText("Fechar");
        botaoFecharCateg.setBorderPainted(false);
        botaoFecharCateg.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoFecharCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharCategActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoesLayout = new javax.swing.GroupLayout(panelBotoes);
        panelBotoes.setLayout(panelBotoesLayout);
        panelBotoesLayout.setHorizontalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoIncluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoFecharCateg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelBotoesLayout.setVerticalGroup(
            panelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotoesLayout.createSequentialGroup()
                .addComponent(botaoIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoFecharCateg)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCategoriaLayout = new javax.swing.GroupLayout(panelCategoria);
        panelCategoria.setLayout(panelCategoriaLayout);
        panelCategoriaLayout.setHorizontalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addComponent(labelBuscaCate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(panelCategAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelCategoriaLayout.createSequentialGroup()
                                .addComponent(textCampoEntradaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(panelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        panelCategoriaLayout.setVerticalGroup(
            panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoriaLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(labelBuscaCate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCategoriaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(textCampoEntradaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(panelCategAcao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        add(panelCategoria, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIncluirActionPerformed
        String opcao;
        opcao = "inclusao";
        labelAcaoUsuario.setText("Inclusão");
        botaoConfirmar.setText("Salvar");
        panelCategAcao.setVisible(true);
        // Rotina buscar o último código de CATEGORIA no Banco de Dados
        int codigoCategoria = 0;
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel)jTblCategoria.getModel();
        ArrayList<Categoria> listaDeCategoria = categoriaDao.buscarCategoria();
        int fim=0;
        for (int i=0; i < listaDeCategoria.size();i++)
       {
        // Inicio da busca do último código de categoria cadastrado
            Categoria exibeCategoria = listaDeCategoria.get(i);
            if (fim == 0) {
                codigoCategoria = exibeCategoria.getCodigo();
                fim = 1;
            } else if (exibeCategoria.getCodigo() > codigoCategoria) {
               codigoCategoria = exibeCategoria.getCodigo();
           }
        }
        if (codigoCategoria == 0) {
            codigoCategoria = 1;
        } else {
            codigoCategoria += 1;
        }
        textCampoCodigo.setText("" + codigoCategoria);
        textCampoCodigo.setEditable(false);
        textCampoCodigo.setBackground(new Color(170, 170, 170));
    }//GEN-LAST:event_botaoIncluirActionPerformed

    private void botaoFecharCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharCategActionPerformed
        // O método getParent pega o pai de um elemento, no caso
        // pegou dois paneis acima do atual. O metodo getComponents
        // retorna todos os elementos dentro de um painel e retorna um vetor de
        // componentes
        Component[] elements = this.getParent().getParent().getComponents();
        // O primeiro elemento da lista é o JPanelBreadCrumb, assim, faço 
        // uma verificação se realmente é um JPanel
        if (elements[0] instanceof JPanel) {
            // Converto o componente para JPanel
            JPanel painel = (JPanel) elements[0];
            // Pego a lsita de componentes dentro do JPanel BreadCrumb
            Component[] elementos = painel.getComponents();
            // Faço uma verficação se é uma instancia do JLabel
            if (elementos[0] instanceof JLabel) {
                // Converto o componente para JLabel
                JLabel label = (JLabel) elementos[0];
                //Sobrescreve o Label
                label.setText("Tela Principal");
            }
        }
        //Fechar TelaPrincipalCategoria
        Container jPanel = this.getParent();
        jPanel.removeAll();
        jPanel.revalidate();
        jPanel.repaint();

    }//GEN-LAST:event_botaoFecharCategActionPerformed

    private void botaoImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoImprimirActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_botaoImprimirActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
		
        String opcao = "exclusao";
        botaoConfirmar.setText("Confirmar");
        labelAcaoUsuario.setText("Exclusão");
        panelCategAcao.setVisible(true);
		
	if (jTblCategoria.getSelectedRow() >= 0) {
		
            int resposta = JOptionPane.showConfirmDialog(null, "Confirma a exclusão da Categoria?", "Excluir Categoria!", JOptionPane.YES_NO_OPTION);
			
            if (resposta == 0) {
		int dadosLinha = jTblCategoria.getSelectedRow();
		int codigo = (int) jTblCategoria.getModel().getValueAt(dadosLinha, 0);
				
		//******** Chama método para excluir Categoria ********
                categoriaDao.excluirCategoria(categoria);
			
		//******** Faz nova busca, atualizando a tabela de Categorias ********
		((DefaultTableModel)jTblCategoria.getModel()).setRowCount(0);
		categoriaDao.excluirCategoria(categoria);
		DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel)jTblCategoria.getModel();
		ArrayList<Categoria> listaDeCategoria = categoriaDao.buscarCategoria();
				
		for (int i=0; i < listaDeCategoria.size();i++) {
                    Categoria exibeCategoria = listaDeCategoria.get(i);
                    String descricao = textCampoEntradaBusca.getText();
					
                    //******** Faz a busca da Categoria por qualquer parte da sua descricao ********
                    if (exibeCategoria.getDescricao().contains(descricao)) {
					
                        Object[] dadosLinha1 = new Object[2];
                        
                        dadosLinha1[0] = exibeCategoria.getCodigo();
                        dadosLinha1[1] = exibeCategoria.getDescricao();
                        modeloDeColunasDaTabela.addRow(dadosLinha1);
                    }
		}
                JOptionPane.showMessageDialog(null, "Cliente Removido!");
		}
            } else {
		JOptionPane.showMessageDialog(null, "Selecione uma Categoria!");
            }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        // TODO add your handling code here:
        String opcao;
        opcao = "alteracao";
        labelAcaoUsuario.setText("Alteração");
        botaoConfirmar.setText("Salvar");
        panelCategAcao.setVisible(true);

        if (jTblCategoria.getSelectedRow() >= 0) {
            int dadosLinha = jTblCategoria.getSelectedRow();
            int codigo = (int) jTblCategoria.getModel().getValueAt(dadosLinha, 0);
            String descricao = (String) jTblCategoria.getModel().getValueAt(dadosLinha, 1);
	} else {
            JOptionPane.showMessageDialog(null, "Selecione uma Categoria!");
	}

    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        // TODO add your handling code here:
        // Aqui Rotina de Cancelar/Sair Ação

        //Aqui Esconde Panel
        panelCategAcao.setVisible(false);
        labelAcaoUsuario.setText("");
        String opcao;
        opcao = "";
        int codigo = 0;
        String descricao = " ";
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        // TODO add your handling code here:
        // Aqui Rotina de Salvar no Banco de Dados e Sair
        //  Aqui você cria a categoria
        Categoria categoria = new Categoria();
        if (textCampoCodigo.getText().isEmpty()) {
            categoria.setDescricao(textCampoDesc.getText());
            categoriaDao.salvarCategoria(categoria);
        } else {
            categoria.setCodigo(Integer.parseInt(textCampoCodigo.getText()));
            categoria.setDescricao(textCampoDesc.getText());
            categoriaDao.atualizarCategoria(categoria);
        }
        populaTabela();
         //Aqui Esconde Panel
        botaoConfirmar.setText("Confirmar");
        labelAcaoUsuario.setText("");
        panelCategAcao.setVisible(false);
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void populaTabela() {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) jTblCategoria.getModel();
        //  Primeiro limpa a tabela
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        ArrayList<Categoria> listaDeCategoria = categoriaDao.buscarCategoria();

        for (int i = 0; i < listaDeCategoria.size(); i++) {
            Categoria mostraCategoria = listaDeCategoria.get(i);
            Object[] dadosLinha = new Object[2];
            dadosLinha[0] = mostraCategoria.getCodigo();
            dadosLinha[1] = mostraCategoria.getDescricao();
            modeloDeColunasDaTabela.addRow(dadosLinha);
        }
    }

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jTblCategoria.getModel()).setRowCount(0);

        categoriaDao.buscarCategoria();

        DefaultTableModel modeloDeColuna = (DefaultTableModel) jTblCategoria.getModel();
        ArrayList<Categoria> listaDeCategoria = categoriaDao.buscarCategoria();

        for (int i = 0; i < listaDeCategoria.size(); i++) {
            Categoria mostraCategoria = listaDeCategoria.get(i);
            String descricao = textCampoEntradaBusca.getText();

            if (mostraCategoria.getDescricao().contains(descricao)) {

                Object[] dadosLinha = new Object[2];

                dadosLinha[0] = mostraCategoria.getCodigo();
                dadosLinha[1] = mostraCategoria.getDescricao();
                modeloDeColuna.addRow(dadosLinha);
            }
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoFecharCateg;
    private javax.swing.JButton botaoImprimir;
    private javax.swing.JButton botaoIncluir;
    private javax.swing.JButton botaoSair;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTblCategoria;
    private javax.swing.JLabel labelAcaoUsuario;
    private javax.swing.JLabel labelBuscaCate;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JPanel panelBotoes;
    private javax.swing.JPanel panelCategAcao;
    private javax.swing.JPanel panelCategoria;
    private javax.swing.JTextField textCampoCodigo;
    private javax.swing.JTextField textCampoDesc;
    private javax.swing.JTextField textCampoEntradaBusca;
    // End of variables declaration//GEN-END:variables

}