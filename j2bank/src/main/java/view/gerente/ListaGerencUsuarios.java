/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.gerente;

import controller.CaixaController;
import controller.gerente.GerenteController;
import java.awt.Frame;
import java.awt.Window;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.Caixa;
import model.Gerente;
import persistence.GerentePersistence;
import view.gerente.EditarGerenteModal;

/**
 *
 * @author B r u n o
 */
public class ListaGerencUsuarios extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaGerencUsuarios
     */
    public ListaGerencUsuarios() {
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

        painelAbas = new javax.swing.JTabbedPane();
        clientes = new javax.swing.JToolBar();
        jPanel8 = new javax.swing.JPanel();
        removeClienteBtn = new javax.swing.JButton();
        editaClienteBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_clientes = new javax.swing.JList<>();
        caixas = new javax.swing.JToolBar();
        jPanel9 = new javax.swing.JPanel();
        removeCaixaBtn = new javax.swing.JButton();
        editaCaixaBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_caixas = new javax.swing.JList<>();
        gerentes = new javax.swing.JToolBar();
        jPanel7 = new javax.swing.JPanel();
        removeGerenteBtn = new javax.swing.JButton();
        editaGerenteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_gerentes = new javax.swing.JList<>();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de usuários"));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(600, 400));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        clientes.setRollover(true);

        removeClienteBtn.setText("Excluir registro");
        removeClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeClienteBtnActionPerformed(evt);
            }
        });

        editaClienteBtn.setText("Editar registro");

        jScrollPane2.setViewportView(lista_clientes);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(editaClienteBtn)
                .addGap(55, 55, 55)
                .addComponent(removeClienteBtn)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editaClienteBtn)
                    .addComponent(removeClienteBtn))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        clientes.add(jPanel8);

        painelAbas.addTab("Clientes", clientes);

        caixas.setRollover(true);

        removeCaixaBtn.setText("Excluir registro");
        removeCaixaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCaixaBtnActionPerformed(evt);
            }
        });

        editaCaixaBtn.setText("Editar registro");
        editaCaixaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaCaixaBtnActionPerformed(evt);
            }
        });

        lista_caixas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(lista_caixas);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(editaCaixaBtn)
                .addGap(55, 55, 55)
                .addComponent(removeCaixaBtn)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editaCaixaBtn)
                    .addComponent(removeCaixaBtn))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        caixas.add(jPanel9);

        painelAbas.addTab("Caixas", caixas);

        gerentes.setRollover(true);

        removeGerenteBtn.setText("Excluir registro");
        removeGerenteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeGerenteBtnActionPerformed(evt);
            }
        });

        editaGerenteBtn.setText("Editar registro");
        editaGerenteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editaGerenteBtnActionPerformed(evt);
            }
        });

        lista_gerentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lista_gerentes);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(editaGerenteBtn)
                .addGap(55, 55, 55)
                .addComponent(removeGerenteBtn)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editaGerenteBtn)
                    .addComponent(removeGerenteBtn))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        gerentes.add(jPanel7);

        painelAbas.addTab("Gerentes", gerentes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelAbas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelAbas, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeGerenteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeGerenteBtnActionPerformed
        // TODO add your handling code here:
        if (!lista_gerentes.isSelectionEmpty()) {
            gController.removeGerente();
        }
    }//GEN-LAST:event_removeGerenteBtnActionPerformed

    private void removeClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeClienteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeClienteBtnActionPerformed

    private void removeCaixaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCaixaBtnActionPerformed
        // TODO add your handling code here:
        if (!lista_caixas.isSelectionEmpty()) {
            cxController.removeCaixa();
        }
    }//GEN-LAST:event_removeCaixaBtnActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        gController.salvaAoFechar();
        cxController.salvaCaixasAoFechar();
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        gController = new GerenteController(this);
        cxController = new CaixaController(this);
        gController.carregaGerentes();
        cxController.carregaCaixas();
    }//GEN-LAST:event_formInternalFrameOpened

    private void editaGerenteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaGerenteBtnActionPerformed
        // TODO add your handling code here:
        if(!lista_gerentes.isSelectionEmpty()){
            Gerente selecionado = lista_gerentes.getSelectedValue();
            
            EditarGerenteModal menu = new EditarGerenteModal(null,true);
            menu.setEditar_usuario(selecionado);
            menu.setLogado(logado);
            
            this.setVisible(false);
            
            menu.setVisible(true);
            
            this.setVisible(true);

        }
    }//GEN-LAST:event_editaGerenteBtnActionPerformed

    private void editaCaixaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editaCaixaBtnActionPerformed
        // TODO add your handling code here:
        if(!lista_caixas.isSelectionEmpty()){
            Caixa selecionado = lista_caixas.getSelectedValue();
            
            EditarCaixaModal menu = new EditarCaixaModal(null,true);
            menu.setEditar_usuario(selecionado);
            menu.setLogado(logado);
            
            this.setVisible(false);
            
            menu.setVisible(true);
            
            this.setVisible(true);
        }
    }//GEN-LAST:event_editaCaixaBtnActionPerformed

    public JList<Gerente> getLista_gerentes() {
        return lista_gerentes;
    }

    public JList<Caixa> getLista_caixas() {
        return lista_caixas;
    }

    public JList<Gerente> getLista_clientes() {
        return lista_clientes;
    }
    

    public Gerente getLogado() {
        return logado;
    }

    public void setLogado(Gerente logado) {
        this.logado = logado;
    }
    

    private Gerente logado;
    private GerenteController gController;
    private CaixaController cxController;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar caixas;
    private javax.swing.JToolBar clientes;
    private javax.swing.JButton editaCaixaBtn;
    private javax.swing.JButton editaClienteBtn;
    private javax.swing.JButton editaGerenteBtn;
    private javax.swing.JToolBar gerentes;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<Caixa> lista_caixas;
    private javax.swing.JList<Gerente> lista_clientes;
    private javax.swing.JList<Gerente> lista_gerentes;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JButton removeCaixaBtn;
    private javax.swing.JButton removeClienteBtn;
    private javax.swing.JButton removeGerenteBtn;
    // End of variables declaration//GEN-END:variables
}
