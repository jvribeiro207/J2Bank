/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.cliente;

import controller.cliente.ClienteController;
import controller.solicitacao.SolicitacaoController;
import controller.transacao.TransacaoController;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Solicitacao;
import persistence.ClientePersistence;

public class TelaSolicitacao extends javax.swing.JFrame {

    public TelaSolicitacao() {
        initComponents();
        scontroller = new SolicitacaoController();
        clientePersistence = new ClientePersistence();
        tcontroller = new TransacaoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbTipoSolicitacao = new javax.swing.JComboBox<>();
        tfValorSolicitacao = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solicitação de Crédito");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cbTipoSolicitacao.setMaximumRowCount(2);
        cbTipoSolicitacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Financiamento", "Empréstimo" }));
        cbTipoSolicitacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Opção de Solicitação"));

        tfValorSolicitacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar solicitação");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(tfValorSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(cbTipoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnVoltar)
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoSolicitacao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ClienteMenu cm = new ClienteMenu();
        cm.setLogado(logado);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        String valor = tfValorSolicitacao.getText();
        String opcao = cbTipoSolicitacao.getSelectedItem().toString();

        String senhaDigitada = JOptionPane.showInputDialog(null, "Confirme sua senha:", "Confirmação", JOptionPane.PLAIN_MESSAGE);

        //verifica se a senha foi digitada e se está correta
        if (senhaDigitada.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Operação cancelada. Senha não informada.");
            return;
        }
        if (!logado.getSenha().equals(senhaDigitada)) {
            JOptionPane.showMessageDialog(null, "Senha incorreta! Tente novamente.");
            return;
        }
        solicitarCredito(valor, opcao);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Solicitacao pedido = scontroller.buscaSolicitacaoPorCpf(logado.getCpf());
        if(pedido != null){
            String senha = JOptionPane.showInputDialog
                    (null, "Sua solicitação de crédito foi aprovada!\n\nConfirme com sua senha para aceitar:", 
                    "Confirmação", JOptionPane.PLAIN_MESSAGE);
            
            if(senha.equals(logado.getSenha())){
                BigDecimal saldo_atual = logado.getSaldo();
                
                logado.setSaldo(saldo_atual.add(pedido.getValor()));
                
                clientePersistence.atualizar(logado);
                
                tcontroller.registraEmprestimo(logado.getCpf(),pedido.getValor());
                
                scontroller.removeSolicitacao(pedido);
            }
        }
    }//GEN-LAST:event_formWindowOpened
    
    private void solicitarCredito(String valor, String opcao){
        String cpfCliente = logado.getCpf();
        BigDecimal valorBigDecimal;
        try {
            valor = valor.replace(",", "."); //normaliza entrada caso venha com vírgula
            valorBigDecimal = new BigDecimal(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.");
            return;
        }

        if (opcao.equals("Financiamento")) {
            scontroller.registraFinanciamento(cpfCliente, valorBigDecimal);
            JOptionPane.showMessageDialog(null, "Solicitação de Financiamento confirmada!");
        } else {
            scontroller.registraEmprestimo(cpfCliente, valorBigDecimal);
            JOptionPane.showMessageDialog(null, "Solicitação de Empréstimo confirmada!");
        }
    }

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
            java.util.logging.Logger.getLogger(TelaSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSolicitacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSolicitacao().setVisible(true);
            }
        });
    }

    public void setLogado(Cliente cliente) {
        this.logado = cliente;
    }

    public Cliente getLogado() {
        return logado;
    }
    
    private TransacaoController tcontroller;
    private ClientePersistence clientePersistence;
    private SolicitacaoController scontroller;
    private Cliente logado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbTipoSolicitacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfValorSolicitacao;
    // End of variables declaration//GEN-END:variables
}
