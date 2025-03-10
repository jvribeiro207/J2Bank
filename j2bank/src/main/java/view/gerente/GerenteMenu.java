/* Autores: Bruno Cesario Menezes - 202335003
            João Victor Macedo Ribeiro - 202335011
            José Simões de Araújo Neto - 202335035 */
package view.gerente;

import view.auth.*;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameEvent;
import model.Gerente;

/**
 *
 * @author B r u n o
 */
public class GerenteMenu extends javax.swing.JFrame {

    
    
    /**
     * Creates new form GerenteMenu
     */
    public GerenteMenu() {
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

        dashboard = new javax.swing.JDesktopPane();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        transferMenu = new javax.swing.JMenuItem();
        saqueMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadRendaFMenu = new javax.swing.JMenuItem();
        cadRendaVarMenu = new javax.swing.JMenuItem();
        listaRendaFMenu = new javax.swing.JMenuItem();
        listaRendaVarMenu = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        solicitacaoMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        listaUsuariosMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        dashboard.setBackground(new java.awt.Color(245, 245, 245));

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo menu.png"))); // NOI18N
        jLabel1.setAlignmentX(dashboard.getX()/2);
        jLabel1.setAlignmentY(dashboard.getY()/2);

        dashboard.setLayer(logoutBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dashboard.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardLayout.createSequentialGroup()
                .addGroup(dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(logoutBtn))
                    .addGroup(dashboardLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel1)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dashboardLayout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126)
                .addComponent(logoutBtn)
                .addGap(28, 28, 28))
        );

        jMenu1.setText("Movimentação");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        transferMenu.setText("Transferência");
        transferMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferMenuActionPerformed(evt);
            }
        });
        jMenu1.add(transferMenu);

        saqueMenu.setText("Saque");
        saqueMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saqueMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Operações financeiras");

        cadRendaFMenu.setText("Cadastrar renda fixa");
        cadRendaFMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadRendaFMenuActionPerformed(evt);
            }
        });
        jMenu2.add(cadRendaFMenu);

        cadRendaVarMenu.setText("Cadastrar renda variável");
        cadRendaVarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadRendaVarMenuActionPerformed(evt);
            }
        });
        jMenu2.add(cadRendaVarMenu);

        listaRendaFMenu.setText("Lista de renda fixa");
        listaRendaFMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaRendaFMenuActionPerformed(evt);
            }
        });
        jMenu2.add(listaRendaFMenu);

        listaRendaVarMenu.setText("Lista de renda variável");
        listaRendaVarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaRendaVarMenuActionPerformed(evt);
            }
        });
        jMenu2.add(listaRendaVarMenu);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Avaliação de Crédito");

        solicitacaoMenu.setText("Mostrar solicitações...");
        solicitacaoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitacaoMenuActionPerformed(evt);
            }
        });
        jMenu3.add(solicitacaoMenu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Gerenciamento de Usuário");

        listaUsuariosMenu.setText("Ver lista de usuários");
        listaUsuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsuariosMenuActionPerformed(evt);
            }
        });
        jMenu4.add(listaUsuariosMenu);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fechaJanelasInternas() {
        for (JInternalFrame janela : dashboard.getAllFrames()) {
            janela.doDefaultCloseAction();
        }
    }

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenu1ActionPerformed

    private void saqueMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        SaqueMov menu = new SaqueMov();
        dashboard.add(menu);
        menu.show();

    }//GEN-LAST:event_saqueMenuActionPerformed

    private void transferMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        TransferMov menu = new TransferMov();
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_transferMenuActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        Login loginMenu = new Login();
        loginMenu.show();
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void cadRendaFMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadRendaFMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        CadRendaFixa menu = new CadRendaFixa();
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_cadRendaFMenuActionPerformed

    private void cadRendaVarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadRendaVarMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        CadRendaVar menu = new CadRendaVar();
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_cadRendaVarMenuActionPerformed

    private void listaRendaFMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaRendaFMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        ListaRendaFixa menu = new ListaRendaFixa();
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_listaRendaFMenuActionPerformed

    private void listaRendaVarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaRendaVarMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        ListaRendaVar menu = new ListaRendaVar();
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_listaRendaVarMenuActionPerformed

    private void solicitacaoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitacaoMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        ListaSolicitacoes menu = new ListaSolicitacoes();
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_solicitacaoMenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void listaUsuariosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuariosMenuActionPerformed
        // TODO add your handling code here:
        fechaJanelasInternas();
        ListaGerencUsuarios menu = new ListaGerencUsuarios();
        menu.setLogado(this.logado);
        dashboard.add(menu);
        menu.show();
    }//GEN-LAST:event_listaUsuariosMenuActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
        if(dashboard.getAllFrames().length > 0){
            logoutBtn.setEnabled(false);
        } else {
            logoutBtn.setEnabled(true);
        }
    }//GEN-LAST:event_formMouseMoved

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        fechaJanelasInternas();
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteMenu().setVisible(true);
            }
        });
    }

    public Gerente getLogado() {
        return logado;
    }

    public void setLogado(Gerente logado) {
        this.logado = logado;
    }
    
    private Gerente logado;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadRendaFMenu;
    private javax.swing.JMenuItem cadRendaVarMenu;
    private javax.swing.JDesktopPane dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listaRendaFMenu;
    private javax.swing.JMenuItem listaRendaVarMenu;
    private javax.swing.JMenuItem listaUsuariosMenu;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JMenuItem saqueMenu;
    private javax.swing.JMenuItem solicitacaoMenu;
    private javax.swing.JMenuItem transferMenu;
    // End of variables declaration//GEN-END:variables
}
