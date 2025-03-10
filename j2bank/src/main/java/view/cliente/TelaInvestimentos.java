/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.cliente;

import controller.cliente.ClienteController;
import controller.transacao.TransacaoController;
import controller.investimento.InvestimentoController;
import controller.renda_fixa.RendaFixaController;
import controller.renda_var.RendaVarController;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import javax.swing.JList;
import javax.swing.JOptionPane;
import model.*;

public class TelaInvestimentos extends javax.swing.JFrame {

    public TelaInvestimentos() {
        initComponents();
        this.icontroller = new InvestimentoController();
        this.ccontroller = new ClienteController();
        this.tcontroller = new TransacaoController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tabInvestimentos = new javax.swing.JPanel();
        btnVender = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListaInvestimentos = new javax.swing.JList<>();
        tabRendaVariavel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListaRendaVar = new javax.swing.JList<>();
        btnVoltar2 = new javax.swing.JButton();
        btnComprarVar = new javax.swing.JButton();
        tfValorVar = new javax.swing.JTextField();
        tabRendaFixa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaRendaFixa = new javax.swing.JList<>();
        btnComprarFixa = new javax.swing.JButton();
        btnVoltar3 = new javax.swing.JButton();
        tfValorFixa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Investimentos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        btnVender.setText("Vender/Retirar Dinheiro");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        ListaInvestimentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(ListaInvestimentos);

        javax.swing.GroupLayout tabInvestimentosLayout = new javax.swing.GroupLayout(tabInvestimentos);
        tabInvestimentos.setLayout(tabInvestimentosLayout);
        tabInvestimentosLayout.setHorizontalGroup(
            tabInvestimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInvestimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(tabInvestimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabInvestimentosLayout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabInvestimentosLayout.createSequentialGroup()
                        .addComponent(btnVender)
                        .addGap(23, 23, 23))))
        );
        tabInvestimentosLayout.setVerticalGroup(
            tabInvestimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabInvestimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabInvestimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabInvestimentosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(tabInvestimentosLayout.createSequentialGroup()
                        .addComponent(btnVoltar)
                        .addGap(122, 122, 122)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 155, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Meus Investimentos", tabInvestimentos);

        ListaRendaVar.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(ListaRendaVar);

        btnVoltar2.setText("Voltar");
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        btnComprarVar.setText("Comprar");
        btnComprarVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarVarActionPerformed(evt);
            }
        });

        tfValorVar.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        javax.swing.GroupLayout tabRendaVariavelLayout = new javax.swing.GroupLayout(tabRendaVariavel);
        tabRendaVariavel.setLayout(tabRendaVariavelLayout);
        tabRendaVariavelLayout.setHorizontalGroup(
            tabRendaVariavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRendaVariavelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(tabRendaVariavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRendaVariavelLayout.createSequentialGroup()
                        .addComponent(btnVoltar2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRendaVariavelLayout.createSequentialGroup()
                        .addComponent(btnComprarVar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(tabRendaVariavelLayout.createSequentialGroup()
                        .addComponent(tfValorVar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        tabRendaVariavelLayout.setVerticalGroup(
            tabRendaVariavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRendaVariavelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabRendaVariavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabRendaVariavelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(tabRendaVariavelLayout.createSequentialGroup()
                        .addComponent(btnVoltar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfValorVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(btnComprarVar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        jTabbedPane1.addTab("Renda Variável", tabRendaVariavel);

        ListaRendaFixa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaRendaFixa);

        btnComprarFixa.setText("Comprar");
        btnComprarFixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarFixaActionPerformed(evt);
            }
        });

        btnVoltar3.setText("Voltar");
        btnVoltar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar3ActionPerformed(evt);
            }
        });

        tfValorFixa.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        javax.swing.GroupLayout tabRendaFixaLayout = new javax.swing.GroupLayout(tabRendaFixa);
        tabRendaFixa.setLayout(tabRendaFixaLayout);
        tabRendaFixaLayout.setHorizontalGroup(
            tabRendaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabRendaFixaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(tabRendaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRendaFixaLayout.createSequentialGroup()
                        .addComponent(btnVoltar3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRendaFixaLayout.createSequentialGroup()
                        .addGroup(tabRendaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfValorFixa)
                            .addComponent(btnComprarFixa, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
        );
        tabRendaFixaLayout.setVerticalGroup(
            tabRendaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabRendaFixaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabRendaFixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabRendaFixaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(tabRendaFixaLayout.createSequentialGroup()
                        .addComponent(btnVoltar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfValorFixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(btnComprarFixa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        jTabbedPane1.addTab("Renda Fixa", tabRendaFixa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Meus Investimentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnComprarFixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarFixaActionPerformed

        if (!ListaRendaFixa.isSelectionEmpty()) {
            String cpfInvestidor = logado.getCpf();
            String valor = tfValorFixa.getText();
            String nomeDaOperacao = ListaRendaFixa.getSelectedValue().getNome_op();
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
            realizarInvestimento(cpfInvestidor, valor, nomeDaOperacao, "Renda Fixa");
            ClienteMenu cm = new ClienteMenu();
            cm.setLogado(logado);
            cm.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_btnComprarFixaActionPerformed

    private void btnComprarVarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarVarActionPerformed
        if (!ListaRendaVar.isSelectionEmpty()) {
            String cpfInvestidor = logado.getCpf();
            String valor = tfValorVar.getText();
            String nomeDaOperacao = ListaRendaVar.getSelectedValue().getNome_op();

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
            realizarInvestimento(cpfInvestidor, valor, nomeDaOperacao, "Renda Variavel");
            ClienteMenu cm = new ClienteMenu();
            cm.setLogado(logado);
            cm.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnComprarVarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        ClienteMenu cm = new ClienteMenu();
        cm.setLogado(logado);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
        ClienteMenu cm = new ClienteMenu();
        cm.setLogado(logado);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnVoltar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar3ActionPerformed
        ClienteMenu cm = new ClienteMenu();
        cm.setLogado(logado);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltar3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        InvestimentoController icontroller = new InvestimentoController(this);
        icontroller.carregaInvestimentos();
        RendaVarController rvcontroller = new RendaVarController(this.ListaRendaVar);
        RendaFixaController rfcontroller = new RendaFixaController(this.ListaRendaFixa);
        rvcontroller.carregaRendaVar();
        rfcontroller.carregaRendaFixa();

    }//GEN-LAST:event_formWindowOpened

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        if (!ListaInvestimentos.isSelectionEmpty()) {

            Investimento selecionado = ListaInvestimentos.getSelectedValue();
            BigDecimal valor = ListaInvestimentos.getSelectedValue().getValorInvestido();
            String tipo = ListaInvestimentos.getSelectedValue().getTipo();

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

            retiraDinheiro(logado.getCpf(), valor, tipo);
            InvestimentoController controller = new InvestimentoController(this);
            controller.removeInvestimento(selecionado);
            controller.carregaInvestimentos();
        }
    }//GEN-LAST:event_btnVenderActionPerformed
    public void realizarInvestimento(String cpfInvestidor, String valor, String nomeDaOperacao, String tipo) {
        BigDecimal valorBigDecimal;
        try {
            valor = valor.replace(",", "."); //normaliza entrada caso venha com vírgula
            valorBigDecimal = new BigDecimal(valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Digite um número válido.");
            return;
        }

        boolean sucesso = ccontroller.investir(cpfInvestidor, valorBigDecimal, nomeDaOperacao);

        if (sucesso) {
            icontroller.registraInvestimento(cpfInvestidor, valorBigDecimal, nomeDaOperacao, tipo);
            tcontroller.registraInvestimento(cpfInvestidor, valorBigDecimal);
            JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Erro no investimento");
        }
    }

    public void retiraDinheiro(String cpf, BigDecimal valor, String tipo) {

        if (tipo.equals("Renda Variavel")) {
            BigDecimal porcentagemMin = new BigDecimal("2");
            BigDecimal porcentagemMax = new BigDecimal("90");
            Random random = new Random();

            //gera uma porcentagem aleatória dentro do intervalo
            BigDecimal porcentagemAleatoria = porcentagemMin.add(
                    new BigDecimal(random.nextDouble()).multiply(porcentagemMax.subtract(porcentagemMin))
            ).setScale(2, RoundingMode.HALF_UP);

            if (random.nextBoolean()) {//se for falso, transforma em negativo (redução)
                porcentagemAleatoria = porcentagemAleatoria.negate();
            }
            //converte a porcentagem para decimal
            BigDecimal fator = porcentagemAleatoria.divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

            //calcula o novo valor
            BigDecimal novoValor = valor.add(valor.multiply(fator)).setScale(2, RoundingMode.HALF_UP);

            JOptionPane.showMessageDialog(null, "Dinheiro retirado com sucesso! Valor retirado: R$" + novoValor);

            ccontroller.deposito(cpf, novoValor);
            tcontroller.registraDeposito(cpf, novoValor);
        } else if(tipo.equals("Renda Fixa")) {
            BigDecimal porcentagemMin = new BigDecimal("1");
            BigDecimal porcentagemMax = new BigDecimal("20");
            Random random = new Random();

            //gera uma porcentagem aleatória dentro do intervalo
            BigDecimal porcentagemAleatoria = porcentagemMin.add(
                    new BigDecimal(random.nextDouble()).multiply(porcentagemMax.subtract(porcentagemMin))
            ).setScale(2, RoundingMode.HALF_UP);

            //converte a porcentagem para decimal
            BigDecimal fator = porcentagemAleatoria.divide(BigDecimal.valueOf(100), 10, RoundingMode.HALF_UP);

            //calcula o novo valor
            BigDecimal novoValor = valor.add(valor.multiply(fator)).setScale(2, RoundingMode.HALF_UP);

            JOptionPane.showMessageDialog(null, "Dinheiro retirado com sucesso! Valor retirado: R$" + novoValor);

            ccontroller.deposito(cpf, novoValor);
            tcontroller.registraDeposito(cpf, novoValor);
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
            java.util.logging.Logger.getLogger(TelaInvestimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInvestimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInvestimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInvestimentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInvestimentos().setVisible(true);
            }
        });
    }

    public Cliente getLogado() {
        return logado;
    }

    public void setLogado(Cliente logado) {
        this.logado = logado;
    }

    public JList<Investimento> getListaInvestimentos() {
        return ListaInvestimentos;
    }

    private InvestimentoController icontroller;
    private ClienteController ccontroller;
    private TransacaoController tcontroller;
    private Cliente logado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Investimento> ListaInvestimentos;
    private javax.swing.JList<RendaFixa> ListaRendaFixa;
    private javax.swing.JList<RendaVar> ListaRendaVar;
    private javax.swing.JButton btnComprarFixa;
    private javax.swing.JButton btnComprarVar;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JButton btnVoltar3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel tabInvestimentos;
    private javax.swing.JPanel tabRendaFixa;
    private javax.swing.JPanel tabRendaVariavel;
    private javax.swing.JTextField tfValorFixa;
    private javax.swing.JTextField tfValorVar;
    // End of variables declaration//GEN-END:variables

}
