/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.usuario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Juliano
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaCadastro() {
        initComponents();
        
        DefaultTableModel modelo = (DefaultTableModel) CdTable.getModel();
        CdTable.setRowSorter(new TableRowSorter(modelo));
        this.setLocationRelativeTo(cdCancelar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtsenha = new javax.swing.JPasswordField();
        cdCancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        CdTable = new javax.swing.JTable();
        cdExcluir = new javax.swing.JButton();
        cdAlterar = new javax.swing.JButton();
        cdSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        painelLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        imgInicio = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnContasAPagar = new javax.swing.JPanel();
        imgContasAPagar = new javax.swing.JLabel();
        lblContasAPagar = new javax.swing.JLabel();
        btnContasAReceber = new javax.swing.JPanel();
        imgContasAReceber = new javax.swing.JLabel();
        lblContasAReceber = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        imgCategorias = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        imgClientes = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        btnSair = new javax.swing.JPanel();
        imgSair = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        btnFornecedores = new javax.swing.JPanel();
        imgFornecedores = new javax.swing.JLabel();
        lblFornecedores = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        imgLogo = new javax.swing.JLabel();
        lblNomeSistema = new javax.swing.JLabel();
        painelBreadcrumb = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(12, 180, 206));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOME:");
        jLabel2.setToolTipText("Cadastro");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SENHA:");

        cdCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdCancelar.setText("Cadastrar");
        cdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdCancelarActionPerformed(evt);
            }
        });

        CdTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CdTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CdTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(CdTable);

        cdExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdExcluir.setText("Excluir");
        cdExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdExcluirActionPerformed(evt);
            }
        });

        cdAlterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdAlterar.setText("Alterar");
        cdAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdAlterarActionPerformed(evt);
            }
        });

        cdSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdSair.setText("Sair");
        cdSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdSairActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/PicsArt_08-28-07.50.53.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(258, 258, 258))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(cdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cdAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cdExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(cdSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(5, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdCancelar)
                    .addComponent(cdExcluir)
                    .addComponent(cdSair)
                    .addComponent(cdAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        painelLateral.setBackground(new java.awt.Color(12, 197, 205));

        btnInicio.setBackground(new java.awt.Color(13, 155, 177));

        imgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Home_25px.png"))); // NOI18N

        lblInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("Início");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgInicio)
                .addGap(18, 18, 18)
                .addComponent(lblInicio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAPagar.setBackground(new java.awt.Color(12, 180, 206));

        lblContasAPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContasAPagar.setForeground(new java.awt.Color(255, 255, 255));
        lblContasAPagar.setText("Contas a Pagar");

        javax.swing.GroupLayout btnContasAPagarLayout = new javax.swing.GroupLayout(btnContasAPagar);
        btnContasAPagar.setLayout(btnContasAPagarLayout);
        btnContasAPagarLayout.setHorizontalGroup(
            btnContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnContasAPagarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgContasAPagar)
                .addGap(18, 18, 18)
                .addComponent(lblContasAPagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnContasAPagarLayout.setVerticalGroup(
            btnContasAPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnContasAReceber.setBackground(new java.awt.Color(12, 180, 206));

        lblContasAReceber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblContasAReceber.setForeground(new java.awt.Color(255, 255, 255));
        lblContasAReceber.setText("Contas a Receber");

        javax.swing.GroupLayout btnContasAReceberLayout = new javax.swing.GroupLayout(btnContasAReceber);
        btnContasAReceber.setLayout(btnContasAReceberLayout);
        btnContasAReceberLayout.setHorizontalGroup(
            btnContasAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnContasAReceberLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgContasAReceber)
                .addGap(18, 18, 18)
                .addComponent(lblContasAReceber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnContasAReceberLayout.setVerticalGroup(
            btnContasAReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnCategorias.setBackground(new java.awt.Color(12, 180, 206));

        lblCategorias.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCategoriasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgCategorias)
                .addGap(18, 18, 18)
                .addComponent(lblCategorias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnClientes.setBackground(new java.awt.Color(12, 180, 206));

        lblClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblClientes.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClientesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgClientes)
                .addGap(18, 18, 18)
                .addComponent(lblClientes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnSair.setBackground(new java.awt.Color(12, 180, 206));

        imgSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Sign_Out_25px.png"))); // NOI18N

        lblSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("Sair");

        javax.swing.GroupLayout btnSairLayout = new javax.swing.GroupLayout(btnSair);
        btnSair.setLayout(btnSairLayout);
        btnSairLayout.setHorizontalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSairLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgSair)
                .addGap(18, 18, 18)
                .addComponent(lblSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnSairLayout.setVerticalGroup(
            btnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSair, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
            .addComponent(lblSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btnFornecedores.setBackground(new java.awt.Color(12, 180, 206));

        lblFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lblFornecedores.setText("Fornecedores");

        javax.swing.GroupLayout btnFornecedoresLayout = new javax.swing.GroupLayout(btnFornecedores);
        btnFornecedores.setLayout(btnFornecedoresLayout);
        btnFornecedoresLayout.setHorizontalGroup(
            btnFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnFornecedoresLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(imgFornecedores)
                .addGap(18, 18, 18)
                .addComponent(lblFornecedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnFornecedoresLayout.setVerticalGroup(
            btnFornecedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Stocks_64px.png"))); // NOI18N

        javax.swing.GroupLayout painelLateralLayout = new javax.swing.GroupLayout(painelLateral);
        painelLateral.setLayout(painelLateralLayout);
        painelLateralLayout.setHorizontalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnContasAReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFornecedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(imgLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        painelLateralLayout.setVerticalGroup(
            painelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLateralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imgLogo)
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnContasAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnContasAReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblNomeSistema.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNomeSistema.setForeground(new java.awt.Color(153, 153, 153));
        lblNomeSistema.setText("Sistema de Apoio ao Microempreendedor Individual");

        painelBreadcrumb.setBackground(new java.awt.Color(102, 102, 102));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Estou na Tela de Produtos");

        javax.swing.GroupLayout painelBreadcrumbLayout = new javax.swing.GroupLayout(painelBreadcrumb);
        painelBreadcrumb.setLayout(painelBreadcrumbLayout);
        painelBreadcrumbLayout.setHorizontalGroup(
            painelBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBreadcrumbLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelBreadcrumbLayout.setVerticalGroup(
            painelBreadcrumbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBreadcrumbLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fechar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelBreadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeSistema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLateral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeSistema)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelBreadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdCancelarActionPerformed
        
        DefaultTableModel dtmCadastro = (DefaultTableModel) CdTable.getModel();
        Object[] dados = {txtnome.getText(),txtsenha.getText()};
        dtmCadastro.addRow(dados);

        // TODO add your handling code here:
    }//GEN-LAST:event_cdCancelarActionPerformed

    private void cdSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdSairActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cdSairActionPerformed

    private void cdExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdExcluirActionPerformed
        
    //System.out.println("Usuario Selecionado: "+CdTable.getSelectedRow());        // TODO add your handling code here:
        if(CdTable.getSelectedRow()!= -1){
        DefaultTableModel dtmCadastro = (DefaultTableModel) CdTable.getModel();
        dtmCadastro.removeRow(CdTable.getSelectedRow());
    }else{
            JOptionPane.showMessageDialog(null,"Selecione um Usuario para Excluir!");
        }
        
        
    }//GEN-LAST:event_cdExcluirActionPerformed

    private void CdTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CdTableMouseClicked
             if(CdTable.getSelectedRow() != -1){
            
            txtnome.setText(CdTable.getValueAt(CdTable.getSelectedRow(),0).toString());// TODO add your handling code here:
            txtsenha.setText(CdTable.getValueAt(CdTable.getSelectedRow(),1).toString());// TODO add your handling code here:
    }        // TODO add your handling code here:
    }//GEN-LAST:event_CdTableMouseClicked

    private void cdAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdAlterarActionPerformed
        if(CdTable.getSelectedRow() != -1){
            CdTable.setValueAt(txtnome.getText(),CdTable.getSelectedRow() , 0);
            CdTable.setValueAt(txtsenha.getText(),CdTable.getSelectedRow() , 1);
        }
        


        // TODO add your handling code here:
    }//GEN-LAST:event_cdAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CdTable;
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnContasAPagar;
    private javax.swing.JPanel btnContasAReceber;
    private javax.swing.JPanel btnFornecedores;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnSair;
    private javax.swing.JButton cdAlterar;
    private javax.swing.JButton cdCancelar;
    private javax.swing.JButton cdExcluir;
    private javax.swing.JButton cdSair;
    private javax.swing.JLabel imgCategorias;
    private javax.swing.JLabel imgClientes;
    private javax.swing.JLabel imgContasAPagar;
    private javax.swing.JLabel imgContasAReceber;
    private javax.swing.JLabel imgFornecedores;
    private javax.swing.JLabel imgInicio;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel imgSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblContasAPagar;
    private javax.swing.JLabel lblContasAReceber;
    private javax.swing.JLabel lblFornecedores;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblNomeSistema;
    private javax.swing.JLabel lblSair;
    private javax.swing.JPanel painelBreadcrumb;
    private javax.swing.JPanel painelLateral;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables

    private static class DefautTableModel {

        public DefautTableModel() {
        }
    }
}
