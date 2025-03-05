/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.auth;

import controller.caixa.RegCaixaController;
import controller.cliente.RegClienteController;
import controller.gerente.RegGerenteController;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        clienteController = new RegClienteController();
        caixaController = new RegCaixaController();
        gerenteController = new RegGerenteController();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltarBtn = new javax.swing.JButton();
        tfSenha = new javax.swing.JPasswordField();
        regBtn = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        cbTipo = new javax.swing.JComboBox<>();
        ftfCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setBackground(new java.awt.Color(18, 30, 49));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        tfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));

        regBtn.setText("Registrar");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo login.png"))); // NOI18N

        tfNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Caixa", "Gerente" }));
        cbTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de conta"));

        ftfCPF.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));
        try {
            ftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(icon))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(voltarBtn)
                        .addGap(26, 26, 26)
                        .addComponent(regBtn)))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ftfCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(tfSenha)
                    .addComponent(cbTipo, 0, 222, Short.MAX_VALUE)
                    .addComponent(tfNome))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regBtn)
                    .addComponent(voltarBtn))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed

        String nome = tfNome.getText();
        String cpf = ftfCPF.getText();
        String senha = new String(tfSenha.getPassword());
        String tipoUsuario = cbTipo.getSelectedItem().toString();
        boolean sucesso = false;
        
        // Verificação do nome
        if (nome.length() <= 3 || !nome.matches("[a-zA-ZÀ-ú ]+")) {
            JOptionPane.showMessageDialog(null, "O nome deve ter mais de 3 letras e não pode conter números!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificação da senha
        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(null, "A senha deve ter pelo menos 6 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        switch (cbTipo.getSelectedItem().toString()) {
            case "Cliente": {
                sucesso = clienteController.registrarCliente(nome, cpf, senha, tipoUsuario);
                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado com sucesso!");
                }
                break;
            }
            case "Caixa": {
                sucesso = caixaController.registrarCaixa(nome, cpf, senha, tipoUsuario);
                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Caixa registrado com sucesso!");
                }

                break;
            }
            case "Gerente": {
                sucesso = gerenteController.registrarGerente(nome, cpf, senha, tipoUsuario);
                if (sucesso) {
                    JOptionPane.showMessageDialog(null, "Gerente registrado com sucesso!");
                }

                break;
            }
        }

    }//GEN-LAST:event_regBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed

        Login menu = new Login();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void ftfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfCPFActionPerformed

    }//GEN-LAST:event_ftfCPFActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    public String getCpf() {
        return ftfCPF.getText();
    }

    public String getNome() {
        return tfNome.getText();
    }

    public String getSenha() {
        return tfSenha.getText();
    }

    public String getTipo() {
        return cbTipo.getSelectedItem().toString();
    }

    private RegGerenteController gerenteController;
    private RegClienteController clienteController;
    private RegCaixaController caixaController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regBtn;
    private javax.swing.JTextField tfNome;
    private javax.swing.JPasswordField tfSenha;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
