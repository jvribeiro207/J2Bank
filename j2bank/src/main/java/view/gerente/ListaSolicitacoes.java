/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view.gerente;

import controller.SolicitacaoController;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.Solicitacao;
import view.gerente.*;

/**
 *
 * @author B r u n o
 */
public class ListaSolicitacoes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaRendaFixa
     */
    public ListaSolicitacoes() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_solicitacao = new javax.swing.JList<>();
        aprovarBtn = new javax.swing.JButton();
        recusarBtn = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de solicitações"));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(400, 300));
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

        lista_solicitacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lista_solicitacao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_solicitacao.setFixedCellHeight(20);
        jScrollPane1.setViewportView(lista_solicitacao);

        aprovarBtn.setText("Aprovar");
        aprovarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprovarBtnActionPerformed(evt);
            }
        });

        recusarBtn.setText("Negar");
        recusarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recusarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(aprovarBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(recusarBtn)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aprovarBtn)
                    .addComponent(recusarBtn))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aprovarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprovarBtnActionPerformed
        // TODO add your handling code here:
        if (!lista_solicitacao.isSelectionEmpty()) {
            controller.aprovaSolicitacao();
            controller.atualizaLista();
        }
    }//GEN-LAST:event_aprovarBtnActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        controller = new SolicitacaoController(lista_solicitacao);
        controller.carregaSolicitacao();
    }//GEN-LAST:event_formInternalFrameOpened

    private void recusarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recusarBtnActionPerformed
        // TODO add your handling code here:
        if (!lista_solicitacao.isSelectionEmpty()) {
            controller.recusaSolicitacao();
            controller.atualizaLista();
        }
    }//GEN-LAST:event_recusarBtnActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        controller.salvaLista();
    }//GEN-LAST:event_formInternalFrameClosing


    private SolicitacaoController controller;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aprovarBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Solicitacao> lista_solicitacao;
    private javax.swing.JButton recusarBtn;
    // End of variables declaration//GEN-END:variables
}
