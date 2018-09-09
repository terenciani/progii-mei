/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.cliente;

/**
 *
 * @author ericvdias
 */
public class NovoCliente extends javax.swing.JPanel {

    /**
     * Creates new form NovoCliente
     */
    public NovoCliente() {
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
        btnCancelar = new javax.swing.JButton();
        jTextField_inscrEstadual = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(786, 531));

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

        jRadioButton_PF.setText("Pessoa Física");

        jRadioButton_PJ.setText("Pessoa Jurídica");

        jComboBox_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AP", "BA", "MT", "MS" }));

        jLabel_celular.setText("Celular:");

        jLabel_inscrEstadual.setText("Inscr Estadual:");

        jLabel_numero.setText("Número:");

        jLabel_bairro.setText("Bairro:");

        jLabel_bairro1.setText("Cidade:");

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setText("Confirmar");

        btnCancelar.setBackground(new java.awt.Color(255, 0, 51));
        btnCancelar.setText("Cancelar");
        btnCancelar.setName("Inclusão de Cliente"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton_PF)
                        .addGap(22, 22, 22)
                        .addComponent(jRadioButton_PJ)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_cpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_nome)
                                    .addComponent(jTextField_nomeFantasia)
                                    .addComponent(jTextField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_foneRes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 25, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_celular, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_bairro1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_bairro, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_numero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_inscrEstadual, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_cidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTextField_bairro))
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jTextField_inscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCancelar))
                                .addContainerGap(56, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_codigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tipo)
                    .addComponent(jRadioButton_PF)
                    .addComponent(jRadioButton_PJ))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_cpfCnpj)
                    .addComponent(jTextField_cpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_inscrEstadual)
                    .addComponent(jTextField_inscrEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nome)
                    .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nomeFantasia)
                    .addComponent(jTextField_nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_numero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_endereco)
                        .addComponent(jTextField_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_numero)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_complemento)
                    .addComponent(jTextField_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_bairro)
                    .addComponent(jTextField_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_bairro1)
                            .addComponent(jTextField_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_estado)
                            .addComponent(jComboBox_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_celular)
                            .addComponent(jTextField_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_foneRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_foneRes))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_email)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCancelar))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
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
