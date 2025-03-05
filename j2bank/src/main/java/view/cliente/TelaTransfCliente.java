/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.cliente;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import model.Cliente;
import controller.ClienteController;
import controller.TransacaoController;


public class TelaTransfCliente extends javax.swing.JFrame {


    public TelaTransfCliente() {
        initComponents();
        ccontroller = new ClienteController();
        tcontroller = new TransacaoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfValorTransferencia = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        tfContaDestino = new javax.swing.JFormattedTextField();
        tfContaOrigem = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transferência");
        setResizable(false);

        tfValorTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        tfContaDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF de Destino"));
        try {
            tfContaDestino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        tfContaOrigem.setBorder(javax.swing.BorderFactory.createTitledBorder("Meu CPF"));
        try {
            tfContaOrigem.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(tfContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(tfContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfValorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addComponent(tfValorTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String cpfOrigem = tfContaOrigem.getText();
        String cpfDestino = tfContaDestino.getText();
        String valor = tfValorTransferencia.getText();

        //solicita a senha ao usuário
        String senhaDigitada = JOptionPane.showInputDialog(null, "Confirme sua senha:", "Confirmação", JOptionPane.PLAIN_MESSAGE);

        //verifica se a senha foi digitada e se está correta
        if (senhaDigitada == null || senhaDigitada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada. Senha não informada.");
            return;
        }

        if (!logado.getSenha().equals(senhaDigitada)) {
            JOptionPane.showMessageDialog(null, "Senha incorreta! Tente novamente.");
            return;
        }

        //se a senha estiver correta, realiza a transferência
        realizarTransferencia(cpfOrigem, cpfDestino, valor);
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        ClienteMenu cm = new ClienteMenu();
        cm.setLogado(logado);
        cm.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed


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
            java.util.logging.Logger.getLogger(TelaTransfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTransfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTransfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTransfCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTransfCliente().setVisible(true);
            }
        });
    }

    public void realizarTransferencia(String cpfOrigem, String cpfDestino, String valor) {

        if (!(getLogado().getCpf().equals(cpfOrigem))) {
            JOptionPane.showMessageDialog(null, "CPF de Origem inválido!");
            return;
        }

        BigDecimal valorBigDecimal;
        try {
            valor = valor.replace(",", "."); //normaliza entrada caso venha com vírgula
            valorBigDecimal = new BigDecimal(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.");
            return;
        }
        
        boolean sucesso = ccontroller.transferir(cpfOrigem, cpfDestino, valorBigDecimal);

        if (sucesso) {
            tcontroller.registraTransferencia(cpfOrigem,cpfDestino,valorBigDecimal);
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou erro na transferência");
        }

    }

    public Cliente getLogado() {
        return logado;
    }

    public void setLogado(Cliente logado) {
        this.logado = logado;
    }

    private TransacaoController tcontroller;
    private ClienteController ccontroller;
    private Cliente logado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField tfContaDestino;
    private javax.swing.JFormattedTextField tfContaOrigem;
    private javax.swing.JTextField tfValorTransferencia;
    // End of variables declaration//GEN-END:variables
}
