/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.visao.vendas;

/**
 *
 * @author Familia TOPz
 */
public class jdPagamento extends javax.swing.JDialog {

    /**
     * Creates new form jdPagament
     */
    public jdPagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        gbButton = new javax.swing.ButtonGroup();
        jpLayout = new javax.swing.JPanel();
        btnFinalizar = new javax.swing.JButton();
        btnCredito = new javax.swing.JRadioButton();
        btnDebito = new javax.swing.JRadioButton();
        btnDinheiro = new javax.swing.JRadioButton();
        lblDialogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        gbButton.add(btnCredito);
        btnCredito.setText("Cartão de Crédito");

        gbButton.add(btnDebito);
        btnDebito.setText("Cartão de Débito");

        gbButton.add(btnDinheiro);
        btnDinheiro.setText("Dinheiro");

        lblDialogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDialogo.setText("Escolha o Meio de Pagamento: ");

        javax.swing.GroupLayout jpLayoutLayout = new javax.swing.GroupLayout(jpLayout);
        jpLayout.setLayout(jpLayoutLayout);
        jpLayoutLayout.setHorizontalGroup(
            jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpLayoutLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCredito)
                    .addComponent(btnDebito)
                    .addComponent(btnDinheiro)
                    .addComponent(lblDialogo)
                    .addComponent(btnFinalizar))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jpLayoutLayout.setVerticalGroup(
            jpLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpLayoutLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(lblDialogo)
                .addGap(27, 27, 27)
                .addComponent(btnDinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDebito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCredito)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jpLayout, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFinalizarActionPerformed

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
            java.util.logging.Logger.getLogger(jdPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdPagamento dialog = new jdPagamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnCredito;
    private javax.swing.JRadioButton btnDebito;
    private javax.swing.JRadioButton btnDinheiro;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.ButtonGroup gbButton;
    private javax.swing.JPanel jpLayout;
    private javax.swing.JLabel lblDialogo;
    // End of variables declaration//GEN-END:variables
}