/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.auth;


import javax.swing.JOptionPane;
import model.*;
import persistence.ClientePersistence;
import view.caixa.*;
import view.cliente.*;
import view.gerente.*;
import java.util.List;
import model.Caixa;
import persistence.CaixaPersistence;
import persistence.GerentePersistence;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        regBtn = new javax.swing.JButton();
        cbTipo = new javax.swing.JComboBox<>();
        ftfCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(18, 30, 49));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        tfSenha.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha"));
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo login.png"))); // NOI18N

        regBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        regBtn.setForeground(new java.awt.Color(16, 21, 64));
        regBtn.setText("Registre-se");
        regBtn.setBorderPainted(false);
        regBtn.setContentAreaFilled(false);
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Caixa", "Gerente" }));

        ftfCPF.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));
        try {
            ftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(btnEntrar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ftfCPF)
                    .addComponent(cbTipo, 0, 160, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(icon))
                    .addComponent(tfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(119, 119, 119))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(regBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regBtn)
                .addGap(9, 9, 9))
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

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (getCpf().equals("") || getSenha().equals("") || getTipo().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos");
        } else if (getTipo().equals("Cliente")) {
            logaCliente();
        } else if (getTipo().equals("Caixa")) {
            logaCaixa();
        } else if (getTipo().equals("Gerente")) {
            logaGerente();
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed

        Registro menu = new Registro();
        menu.show();
        this.dispose();
    }//GEN-LAST:event_regBtnActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed

    }//GEN-LAST:event_tfSenhaActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    public String getCpf() {
        return ftfCPF.getText();
    }

    public String getSenha() {
        return tfSenha.getText();
    }

    public String getTipo() {
        return cbTipo.getSelectedItem().toString();
    }

    private void logaCliente() {
        Cliente conta_existe = new Cliente("", "", "", "");
        ClientePersistence clientePersistence = new ClientePersistence();
        List<Cliente> todos = clientePersistence.findAll();
        for (Cliente c : todos) {
            if (c.getCpf().equals(this.getCpf()) && c.getSenha().equals(this.getSenha())) {
                conta_existe = c;
            }
        }
        if (conta_existe.getCpf().equals("")) {
            JOptionPane.showMessageDialog(this, "Conta não foi encontrada nos registros");
        } else {
            ClienteMenu menu = new ClienteMenu();
            menu.setLogado(conta_existe);
            menu.setVisible(true);
            this.dispose();
        }
    }

    private void logaCaixa() {
        Caixa conta_existe = new Caixa("", "", "", "");
        CaixaPersistence caixaPersistence = new CaixaPersistence();
        List<Caixa> todos = caixaPersistence.findAll();
        for (Caixa c : todos) {
            if (c.getCpf().equals(this.getCpf()) && c.getSenha().equals(this.getSenha())) {
                conta_existe = c;
            }
        }
        if (conta_existe.getCpf().equals("")) {
            JOptionPane.showMessageDialog(this, "Conta não foi encontrada nos registros");
        } else {
            CaixaMenu menu = new CaixaMenu();
            menu.setLogado(conta_existe);
            menu.show();
            this.dispose();
        }
    }

    private void logaGerente() {
        Gerente conta_existe = new Gerente("", "", "", "");
        GerentePersistence gerentePersistence = new GerentePersistence();
        List<Gerente> todos = gerentePersistence.findAll();
        for (Gerente g : todos) {
            if (g.getCpf().equals(this.getCpf()) && g.getSenha().equals(this.getSenha())) {
                conta_existe = g;
            }
        }
        if (conta_existe.getCpf().equals("")) {
            JOptionPane.showMessageDialog(this, "Conta não foi encontrada nos registros");
        } else {
            GerenteMenu menu = new GerenteMenu();
            menu.setLogado(conta_existe);
            menu.show();
            this.dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.JLabel icon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regBtn;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
