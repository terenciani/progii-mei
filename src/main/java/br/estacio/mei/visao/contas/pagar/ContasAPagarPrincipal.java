/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.contas.pagar;

import br.estacio.mei.dao.ContasAPagarDao;
import br.estacio.mei.dao.implementacao.ContasAPagarDaoEstatica;
import br.estacio.mei.dao.implementacao.ContasAPagarDaoJDBC;
import br.estacio.mei.model.ContasAPagar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class ContasAPagarPrincipal extends javax.swing.JPanel {

    ContasAPagarDao daoContasAPagar = new ContasAPagarDaoEstatica();

    /**
     * Creates new form ContasAPagarPrincipal
     */
    public ContasAPagarPrincipal() {
        initComponents();
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

        Painel1 = new javax.swing.JPanel();
        btnBusca = new javax.swing.JButton();
        Cbusca = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaP = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btCadastrar1 = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        Btexcluir = new javax.swing.JButton();
        Painel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdtv = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtv = new javax.swing.JTextField();
        txtdtp = new javax.swing.JTextField();
        txtcod = new javax.swing.JTextField();
        txtstatus = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Painel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtdtv1 = new javax.swing.JTextField();
        txtdesc1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtv1 = new javax.swing.JTextField();
        txtdtp1 = new javax.swing.JTextField();
        txtcod1 = new javax.swing.JTextField();
        txtstatus1 = new javax.swing.JTextField();
        btCadastrar2 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        Painel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBusca.setText("Pesquisar");

        Cbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuscaActionPerformed(evt);
            }
        });

        jTabelaP.setAutoCreateRowSorter(true);
        jTabelaP.setBackground(new java.awt.Color(204, 204, 204));
        jTabelaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DT venc", "Descrição", "Valor", "DT pag", "Código", "Status"
            }
        ));
        jTabelaP.setGridColor(new java.awt.Color(2, 75, 219));
        jTabelaP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabelaPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTabelaP);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_botton-on-launch-point_2203535.png"))); // NOI18N
        jLabel6.setText("Status");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_credit-card-debit-payment_2203532.png"))); // NOI18N
        jLabel5.setText("Código");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_calendar-book-date-monthly_2203551.png"))); // NOI18N
        jLabel4.setText("Data de Pagamento");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_cash-money-coin-value_2203534.png"))); // NOI18N
        jLabel3.setText("Valor");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_pie-chart-stat-graph_2203521.png"))); // NOI18N
        jLabel2.setText("Descrição");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/if_calendar-book-date-monthly_2203551.png"))); // NOI18N
        jLabel1.setText("Data de vencimento");

        btCadastrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save-button-interface-symbol-of-outlined-diskette_icon-icons.com_73167.png"))); // NOI18N
        btCadastrar1.setText("Cadastrar");
        btCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrar1ActionPerformed(evt);
            }
        });

        BtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        BtEditar.setText("Editar");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });

        Btexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        Btexcluir.setText("Excluir");
        Btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtexcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel1Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(Painel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addGap(74, 74, 74)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addGap(47, 47, 47)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addGap(79, 79, 79)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addGap(41, 41, 41))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel1Layout.createSequentialGroup()
                                    .addComponent(Cbusca, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBusca))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel1Layout.createSequentialGroup()
                                    .addComponent(btCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(7, 7, 7)))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Cbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBusca))
                    .addGap(50, 50, 50)
                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BtEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );

        add(Painel1, "card2");

        Painel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Area de Cadastro e Edição de contas");

        jLabel8.setText("Data de Venvimento");

        txtdtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtvActionPerformed(evt);
            }
        });

        txtdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescActionPerformed(evt);
            }
        });

        jLabel9.setText("Descrição");

        jLabel10.setText("Valor");

        jLabel11.setText("Data de Pagamento");

        jLabel12.setText("Código");

        jLabel13.setText("Status");

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });

        btCadastrar.setText("Inserir");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(btCadastrar)
                .addGap(125, 125, 125)
                .addComponent(jButton1)
                .addContainerGap(308, Short.MAX_VALUE))
            .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel2Layout.createSequentialGroup()
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Painel2Layout.createSequentialGroup()
                            .addGap(331, 331, 331)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel2Layout.createSequentialGroup()
                            .addGap(295, 295, 295)
                            .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel13)
                                .addComponent(jLabel12)
                                .addComponent(jLabel11))
                            .addGap(18, 18, 18)
                            .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdesc)
                                .addComponent(txtv)
                                .addComponent(txtdtp)
                                .addComponent(txtcod)
                                .addComponent(txtstatus)
                                .addComponent(txtdtv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(296, 296, 296)))
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel2Layout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(jButton1))
                .addGap(41, 41, 41))
            .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel2Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(41, 41, 41)
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(18, 18, 18)
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGap(18, 18, 18)
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGap(18, 18, 18)
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGap(18, 18, 18)
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGap(18, 18, 18)
                    .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGap(133, 133, 133)))
        );

        add(Painel2, "card3");

        Painel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Area de Edição de contas");

        jLabel15.setText("Data de Venvimento");

        txtdtv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtv1ActionPerformed(evt);
            }
        });

        txtdesc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesc1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Descrição");

        jLabel17.setText("Valor");

        jLabel18.setText("Data de Pagamento");

        jLabel19.setText("Código");

        jLabel20.setText("Status");

        txtv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtv1ActionPerformed(evt);
            }
        });

        txtdtp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdtp1ActionPerformed(evt);
            }
        });

        txtcod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcod1ActionPerformed(evt);
            }
        });

        txtstatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatus1ActionPerformed(evt);
            }
        });

        btCadastrar2.setText("Atualização");
        btCadastrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrar2ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel3Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(btCadastrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jButton2)
                .addContainerGap(284, Short.MAX_VALUE))
            .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel3Layout.createSequentialGroup()
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Painel3Layout.createSequentialGroup()
                            .addGap(331, 331, 331)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(20, 20, 20))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                            .addGap(295, 295, 295)
                            .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel16)
                                .addComponent(jLabel17)
                                .addComponent(jLabel20)
                                .addComponent(jLabel19)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdesc1)
                                .addComponent(txtv1)
                                .addComponent(txtdtp1)
                                .addComponent(txtcod1)
                                .addComponent(txtstatus1)
                                .addComponent(txtdtv1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(296, 296, 296)))
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                .addContainerGap(476, Short.MAX_VALUE)
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar2)
                    .addComponent(jButton2))
                .addGap(41, 41, 41))
            .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Painel3Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(41, 41, 41)
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdtv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addGap(18, 18, 18)
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16))
                    .addGap(18, 18, 18)
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGap(18, 18, 18)
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdtp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18))
                    .addGap(18, 18, 18)
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19))
                    .addGap(18, 18, 18)
                    .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtstatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addGap(133, 133, 133)))
        );

        add(Painel3, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void CbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbuscaActionPerformed

    private void jTabelaPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabelaPMouseClicked
        if (jTabelaP.getSelectedRow() != -1) {
            txtdtv.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow(), 0).toString());
            txtdesc.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow(), 1).toString());
            txtv.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow(), 2).toString());
            txtdtp.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow(), 3).toString());
            txtcod.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow(), 4).toString());
            txtstatus.setText(jTabelaP.getValueAt(jTabelaP.getSelectedRow(), 5).toString());

            
        }
    }//GEN-LAST:event_jTabelaPMouseClicked

    private void btCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrar1ActionPerformed
        Painel1.setVisible(false);
        Painel2.setVisible(true);
        Painel3.setVisible(false);
    }//GEN-LAST:event_btCadastrar1ActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        
        if (jTabelaP.getSelectedRow() != -1) {
            jTabelaP.setValueAt(txtdtv.getText(), jTabelaP.getSelectedRow(), 0);
            jTabelaP.setValueAt(txtdesc.getText(), jTabelaP.getSelectedRow(), 1);
            jTabelaP.setValueAt(txtv.getText(), jTabelaP.getSelectedRow(), 2);
            jTabelaP.setValueAt(txtdtp.getText(), jTabelaP.getSelectedRow(), 3);
            jTabelaP.setValueAt(txtcod.getText(), jTabelaP.getSelectedRow(), 4);
            jTabelaP.setValueAt(txtstatus.getText(), jTabelaP.getSelectedRow(), 5);

        }

        Painel3.setVisible(true);
        Painel1.setVisible(false);
        Painel2.setVisible(false);

    }//GEN-LAST:event_BtEditarActionPerformed

    private void BtexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtexcluirActionPerformed

        if (jTabelaP.getSelectedRow() != -1) {
            DefaultTableModel dtmContas = (DefaultTableModel) jTabelaP.getModel();
            dtmContas.removeRow(jTabelaP.getSelectedRow());

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
        }

        txtdtv.setText(" ");
        txtdesc.setText(" ");
        txtv.setText(" ");
        txtdtp.setText(" ");
        txtcod.setText(" ");
        txtstatus.setText(" ");
    }//GEN-LAST:event_BtexcluirActionPerformed

    private void txtdtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdtvActionPerformed

    private void txtdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        //eis aqui o cadastro

        DefaultTableModel dtmContas = (DefaultTableModel) jTabelaP.getModel();
        Object[] dados  = {txtdtv.getText(),txtdesc.getText(),txtv.getText(),txtdtp.getText(),txtcod.getText(),txtstatus.getText()};
        dtmContas.addRow(dados);

        Painel1.setVisible(true);
        Painel2.setVisible(false);

        JOptionPane.showMessageDialog(null, "Salvo");

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Painel1.setVisible(true);
        Painel2.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdtv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtv1ActionPerformed

    }//GEN-LAST:event_txtdtv1ActionPerformed

    private void txtdesc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesc1ActionPerformed

    }//GEN-LAST:event_txtdesc1ActionPerformed

    private void txtv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtv1ActionPerformed

    }//GEN-LAST:event_txtv1ActionPerformed

    private void txtdtp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdtp1ActionPerformed

    }//GEN-LAST:event_txtdtp1ActionPerformed

    private void txtcod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcod1ActionPerformed

    }//GEN-LAST:event_txtcod1ActionPerformed

    private void txtstatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatus1ActionPerformed

    }//GEN-LAST:event_txtstatus1ActionPerformed

    private void btCadastrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrar2ActionPerformed
        Painel1.setVisible(true);
        Painel2.setVisible(false);
        Painel3.setVisible(false);
    }//GEN-LAST:event_btCadastrar2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Painel1.setVisible(true);
        Painel2.setVisible(false);
        Painel3.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void populaTabela() {
        DefaultTableModel modeloDeColunasDaTabela = (DefaultTableModel) jTabelaP.getModel();
        //  Primeiro limpa a tabela
        while (modeloDeColunasDaTabela.getRowCount() != 0) {
            modeloDeColunasDaTabela.removeRow(0);
        }
        ArrayList<ContasAPagar> listaDeCaontasAPagar = daoContasAPagar.buscarContasApagar();

        for (int i = 0; i < listaDeCaontasAPagar.size(); i++) {
            ContasAPagar mostraConta = listaDeCaontasAPagar.get(i);
            Object[] dadosLinha = new Object[6];
            dadosLinha[0] = mostraConta.getDataVencimento();
            dadosLinha[1] = mostraConta.getDescricao();
            dadosLinha[2] = mostraConta.getValor();
            dadosLinha[3] = mostraConta.getDataPagamento();
            dadosLinha[4] = mostraConta.getCodigo();
            dadosLinha[5] = mostraConta.getStatus();
            modeloDeColunasDaTabela.addRow(dadosLinha);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton Btexcluir;
    private javax.swing.JFormattedTextField Cbusca;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel Painel3;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCadastrar1;
    private javax.swing.JButton btCadastrar2;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaP;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtcod1;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtdesc1;
    private javax.swing.JTextField txtdtp;
    private javax.swing.JTextField txtdtp1;
    private javax.swing.JTextField txtdtv;
    private javax.swing.JTextField txtdtv1;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txtstatus1;
    private javax.swing.JTextField txtv;
    private javax.swing.JTextField txtv1;
    // End of variables declaration//GEN-END:variables

    
}
