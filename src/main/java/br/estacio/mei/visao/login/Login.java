/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.login;

import br.estacio.mei.dao.UsuarioDao;
import br.estacio.mei.dao.implementacao.UsuarioDaoEstatica;
import br.estacio.mei.model.Usuario;

/**
 *
 * @author Bisteca
 */
public class Login extends javax.swing.JFrame {
    UsuarioDao daoUsuario = new UsuarioDaoEstatica();
    /**
     * Creates new form Frame_2_LoginMEI
     */
    public Login() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        bgEsquerda = new javax.swing.JPanel();
        jPanelCentralizador = new javax.swing.JPanel();
        LabelUsuário = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        tfSenha = new javax.swing.JPasswordField();
        separatorUsuario = new javax.swing.JSeparator();
        separatorSenha = new javax.swing.JSeparator();
        labelButtonEntrar = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        lblMenssage = new javax.swing.JLabel();
        bgDireita = new javax.swing.JPanel();
        labelIconLogin = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelSubTitulo = new javax.swing.JLabel();
        labelFooterLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        bgEsquerda.setBackground(new java.awt.Color(102, 102, 102));

        jPanelCentralizador.setBackground(new java.awt.Color(102, 102, 102));

        LabelUsuário.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelUsuário.setForeground(new java.awt.Color(255, 255, 255));
        LabelUsuário.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelUsuário.setText("Usuário");
        LabelUsuário.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        LabelSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        LabelSenha.setText("Senha");

        tfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsuario.setBorder(null);
        tfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSenha.setBorder(null);

        separatorUsuario.setForeground(new java.awt.Color(255, 255, 255));

        separatorSenha.setForeground(new java.awt.Color(255, 255, 255));

        labelButtonEntrar.setBackground(new java.awt.Color(12, 180, 206));
        labelButtonEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        labelButtonEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelButtonEntrar.setText("Entrar");
        labelButtonEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelButtonEntrar.setOpaque(true);
        labelButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelButtonEntrarMousePressed(evt);
            }
        });

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Lembrar de mim");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        lblMenssage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelCentralizadorLayout = new javax.swing.GroupLayout(jPanelCentralizador);
        jPanelCentralizador.setLayout(jPanelCentralizadorLayout);
        jPanelCentralizadorLayout.setHorizontalGroup(
            jPanelCentralizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralizadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCentralizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMenssage, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCentralizadorLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanelCentralizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsuário)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelSenha)
                            .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton1)
                            .addGroup(jPanelCentralizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(separatorSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanelCentralizadorLayout.setVerticalGroup(
            jPanelCentralizadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralizadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelUsuário)
                .addGap(11, 11, 11)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(separatorUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(LabelSenha)
                .addGap(6, 6, 6)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(separatorSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(labelButtonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jRadioButton1)
                .addGap(48, 48, 48)
                .addComponent(lblMenssage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bgEsquerdaLayout = new javax.swing.GroupLayout(bgEsquerda);
        bgEsquerda.setLayout(bgEsquerdaLayout);
        bgEsquerdaLayout.setHorizontalGroup(
            bgEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEsquerdaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCentralizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgEsquerdaLayout.setVerticalGroup(
            bgEsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgEsquerdaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelCentralizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bgDireita.setBackground(new java.awt.Color(12, 180, 206));
        bgDireita.setPreferredSize(new java.awt.Dimension(400, 435));
        bgDireita.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        bgDireita.add(labelIconLogin, gridBagConstraints);

        labelTitulo.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Seja bem vindo!");
        labelTitulo.setAutoscrolls(true);
        labelTitulo.setPreferredSize(new java.awt.Dimension(260, 42));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.insets = new java.awt.Insets(100, 59, 0, 0);
        bgDireita.add(labelTitulo, gridBagConstraints);

        labelSubTitulo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        labelSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelSubTitulo.setText("Faça o login para iniciar sua sessão.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 69, 0, 0);
        bgDireita.add(labelSubTitulo, gridBagConstraints);

        labelFooterLogin.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        labelFooterLogin.setForeground(new java.awt.Color(255, 255, 255));
        labelFooterLogin.setText("Powered by Estácio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(63, 150, 11, 0);
        bgDireita.add(labelFooterLogin, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comece já e impulsione o seu negócio.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 59, 0, 32);
        bgDireita.add(jLabel1, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/login-intuitive.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 109, 0, 0);
        bgDireita.add(jLabel4, gridBagConstraints);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/login-network.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 20, 0, 0);
        bgDireita.add(jLabel5, gridBagConstraints);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/login-productive.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(77, 20, 0, 0);
        bgDireita.add(jLabel6, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bgEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bgDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgDireita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bgEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelButtonEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelButtonEntrarMousePressed
        
        Usuario usuario = daoUsuario.buscarUsuarioPorLogin(tfUsuario.getText());
        
        String senha = new String (tfSenha.getPassword());

        if(usuario == null)
            lblMenssage.setText("Usuario não Encontrado");
        else if (usuario.getSenha().equals(senha)){
            this.setVisible(false);
            //Se passar o usuario como parâmetro ficará mais fácil pra vocês
            Sistema usuarioLogado = new Sistema(tfUsuario.getText());
            usuarioLogado.setVisible(true);
        }else{
            lblMenssage.setText("A Senha não confere");
        }
    }//GEN-LAST:event_labelButtonEntrarMousePressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuário;
    private javax.swing.JPanel bgDireita;
    private javax.swing.JPanel bgEsquerda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanelCentralizador;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel labelButtonEntrar;
    private javax.swing.JLabel labelFooterLogin;
    private javax.swing.JLabel labelIconLogin;
    private javax.swing.JLabel labelSubTitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel lblMenssage;
    private javax.swing.JSeparator separatorSenha;
    private javax.swing.JSeparator separatorUsuario;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
