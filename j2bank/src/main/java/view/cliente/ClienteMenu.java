/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.cliente;

import javax.swing.JOptionPane;
import model.Cliente;
import view.auth.Login;

public class ClienteMenu extends javax.swing.JFrame {

    public ClienteMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnConsultas = new javax.swing.JButton();
        btnInvestimentos = new javax.swing.JButton();
        btnSolicitacao = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblTemplate = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnInvestimentos.setText("Investimentos");
        btnInvestimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvestimentosActionPerformed(evt);
            }
        });

        btnSolicitacao.setText("Solicitação de Crédito");
        btnSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoActionPerformed(evt);
            }
        });

        btnTransferencia.setText("Transferência");
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblTemplate.setText("Bem vindo à sua conta J2Bank, ");

        lblNome.setText("{nome do cliente}");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(46, 46, 46))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTemplate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnInvestimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(131, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnSair)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemplate)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInvestimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvestimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvestimentosActionPerformed
        TelaInvestimentos ti = new TelaInvestimentos();
        ti.setLogado(logado);
        ti.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInvestimentosActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        TelaTransfCliente tc = new TelaTransfCliente();
        tc.setVisible(true);
        tc.setLogado(logado);
        this.dispose();
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        String senhaDigitada = JOptionPane.showInputDialog(null, "Confirme sua senha:", "Confirmação", JOptionPane.PLAIN_MESSAGE);

        //verifica se a senha foi digitada e se está correta
        if (senhaDigitada == null || senhaDigitada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Consulta cancelada");
            return;
        }

        if (!logado.getSenha().equals(senhaDigitada)) {
            JOptionPane.showMessageDialog(null, "Senha incorreta! Tente novamente.");
            return;
        }

        TelaConsultas c = new TelaConsultas();
        c.setVisible(true);
        c.setLogado(logado);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void btnSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoActionPerformed
        TelaSolicitacao ts = new TelaSolicitacao();
        ts.setVisible(true);
        ts.setLogado(logado);
        this.setVisible(false);
    }//GEN-LAST:event_btnSolicitacaoActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      lblNome.setText(logado.getNome());
    }//GEN-LAST:event_formWindowOpened


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
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteMenu().setVisible(true);
            }
        });
    }

    public Cliente getLogado() {
        return logado;
    }

    public void setLogado(Cliente logado) {
        this.logado = logado;
    }
    
    private Cliente logado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnInvestimentos;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSolicitacao;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTemplate;
    // End of variables declaration//GEN-END:variables

}
