/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.caixa;

import java.math.BigDecimal;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Transacao;
import controller.ClienteController;

/**
 *
 * @author jose
 */
public class Transferencia extends javax.swing.JFrame {

    /**
     * Creates new form Transicao
     */
    public Transferencia() {
        initComponents();
        controller = new ClienteController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnContaDestino = new javax.swing.JTextField();
        btnContaOrigem = new javax.swing.JTextField();
        btnValor = new javax.swing.JTextField();
        voltar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

        btnContaDestino.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta Destino"));
        btnContaDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaDestinoActionPerformed(evt);
            }
        });

        btnContaOrigem.setBorder(javax.swing.BorderFactory.createTitledBorder("Conta Origem"));
        btnContaOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContaOrigemActionPerformed(evt);
            }
        });

        btnValor.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        voltar.setText("voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        confirmar.setText("confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(voltar)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnValor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContaDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContaDestinoActionPerformed

    private void btnContaOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContaOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContaOrigemActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        CaixaMenu caixa_logado = new CaixaMenu();
        caixa_logado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_voltarActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        // TODO add your handling code here:
        String cpfOrigem = btnContaOrigem.getText();
        String cpfDestino = btnContaDestino.getText();
        String valor = btnValor.getText();
        
        realizarTransferencia(cpfOrigem, cpfDestino, valor);
    }//GEN-LAST:event_confirmarActionPerformed

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
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferencia().setVisible(true);
            }
        });
    }
    
     public void realizarTransferencia(String cpfOrigem, String cpfDestino, String valor){

        
        BigDecimal valorBigDecimal;
        try {
            valor = valor.replace(",", "."); //normaliza entrada caso venha com vírgula
            valorBigDecimal = new BigDecimal(valor);
            
            boolean sucesso = controller.transferir(cpfOrigem, cpfDestino, valorBigDecimal);
            
            if(sucesso){
            JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso");
            }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente ou erro na transferência");
            }
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.");
            return;
        }
        
    }

    public Cliente getLogado() {
        return logado;
    }

    public void setLogado(Cliente logado) {
        this.logado = logado;
    }

    private ClienteController controller;
    private Cliente logado;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnContaDestino;
    private javax.swing.JTextField btnContaOrigem;
    private javax.swing.JTextField btnValor;
    private javax.swing.JButton confirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
