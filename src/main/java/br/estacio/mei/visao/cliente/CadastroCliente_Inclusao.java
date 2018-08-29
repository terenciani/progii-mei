package br.estacio.mei.visao.cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ericvdias
 */
public class CadastroCliente_Inclusao extends javax.swing.JFrame {

    /** Creates new form CadastroDeCliente */
    public CadastroCliente_Inclusao() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_tipoPessoa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel_codigo = new javax.swing.JLabel();
        jLabel_tipo = new javax.swing.JLabel();
        jLabel_cpfCnpj = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();
        jLabel_endereco = new javax.swing.JLabel();
        jLabel_nomeFantasia = new javax.swing.JLabel();
        jLabel_complemento = new javax.swing.JLabel();
        jLabel_foneRes = new javax.swing.JLabel();
        jLabel_estado = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jRadioButton_PF = new javax.swing.JRadioButton();
        jRadioButton_PJ = new javax.swing.JRadioButton();
        jTextField_cpfCnpj = new javax.swing.JTextField();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_codigo2 = new javax.swing.JTextField();
        jTextField_nomeFantasia = new javax.swing.JTextField();
        jTextField_endereco = new javax.swing.JTextField();
        jTextField_complemento = new javax.swing.JTextField();
        jTextField_foneRes = new javax.swing.JTextField();
        jTextField_email = new javax.swing.JTextField();
        jComboBox_estado = new javax.swing.JComboBox<>();
        jTextField_celular = new javax.swing.JTextField();
        jLabel_celular = new javax.swing.JLabel();
        jLabel_inscrEstadual = new javax.swing.JLabel();
        jLabel_numero = new javax.swing.JLabel();
        jTextField_numero = new javax.swing.JTextField();
        jLabel_bairro = new javax.swing.JLabel();
        jTextField_bairro = new javax.swing.JTextField();
        jLabel_bairro1 = new javax.swing.JLabel();
        jTextField_cidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField_inscrEstadual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(2, 139, 229));

        jLabel_codigo.setText("Código:");

        jLabel_tipo.setText("Tipo:");

        jLabel_cpfCnpj.setText("CPF / CNPJ:");

        jLabel_nome.setText("Nome / Razão Social:");

        jLabel_endereco.setText("Endereço:");

        jLabel_nomeFantasia.setText("Nome Fantasia:");

        jLabel_complemento.setText("Complemento:");

        jLabel_foneRes.setText("Telefone Res:");

        jLabel_estado.setText("Estado:");

        jLabel_email.setText("Email:");

        buttonGroup_tipoPessoa.add(jRadioButton_PF);
        jRadioButton_PF.setText("Pessoa Física");

        buttonGroup_tipoPessoa.add(jRadioButton_PJ);
        jRadioButton_PJ.setText("Pessoa Jurídica");

        jComboBox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AP", "BA", "MT", "MS" }));

        jLabel_celular.setText("Celular:");

        jLabel_inscrEstadual.setText("Inscr Estadual:");

        jLabel_numero.setText("Número:");

        jLabel_bairro.setText("Bairro:");

        jLabel_bairro1.setText("Cidade:");

        jButton1.setBackground(new java.awt.Color(12, 180, 206));
        jButton1.setText("Confirmar");

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setText("Cancelar");
        jButton2.setName("Inclusão de Cliente"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_codigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_tipo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_cpfCnpj, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_nome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_nomeFantasia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_endereco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_complemento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_estado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_foneRes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_email, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_cpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                            .addComponent(jTextField_nomeFantasia)
                            .addComponent(jTextField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_foneRes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_celular)
                    .addComponent(jLabel_bairro1)
                    .addComponent(jLabel_bairro)
                    .addComponent(jLabel_numero)
                    .addComponent(jLabel_inscrEstadual))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField_cidade)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(jTextField_bairro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(75, 75, 75)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jTextField_inscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jRadioButton_PF)
                .addGap(39, 39, 39)
                .addComponent(jRadioButton_PJ)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tipo)
                    .addComponent(jRadioButton_PF)
                    .addComponent(jRadioButton_PJ))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cpfCnpj)
                    .addComponent(jTextField_cpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_inscrEstadual)
                    .addComponent(jTextField_inscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nomeFantasia)
                    .addComponent(jTextField_nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_endereco)
                        .addComponent(jTextField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_numero)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_complemento)
                    .addComponent(jTextField_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bairro)
                    .addComponent(jTextField_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_estado)
                    .addComponent(jComboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bairro1)
                    .addComponent(jTextField_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_foneRes)
                    .addComponent(jTextField_foneRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_celular)
                    .addComponent(jTextField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CadastroCliente_Inclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente_Inclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente_Inclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente_Inclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente_Inclusao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_tipoPessoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox_estado;
    private javax.swing.JLabel jLabel_bairro;
    private javax.swing.JLabel jLabel_bairro1;
    private javax.swing.JLabel jLabel_celular;
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
    private javax.swing.JLabel jLabel_tipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_PF;
    private javax.swing.JRadioButton jRadioButton_PJ;
    private javax.swing.JTextField jTextField_bairro;
    private javax.swing.JTextField jTextField_celular;
    private javax.swing.JTextField jTextField_cidade;
    private javax.swing.JTextField jTextField_codigo2;
    private javax.swing.JTextField jTextField_complemento;
    private javax.swing.JTextField jTextField_cpfCnpj;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_endereco;
    private javax.swing.JTextField jTextField_foneRes;
    private javax.swing.JTextField jTextField_inscrEstadual;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_nomeFantasia;
    private javax.swing.JTextField jTextField_numero;
    // End of variables declaration//GEN-END:variables

}
