/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ListaPaciente;
import model.Paciente;

/**
 *
 * @author Murillo
 */
public class TelaDetalhe extends javax.swing.JFrame {

    private TelaInicial telaInicial;
    private Paciente paciente;
    private int posicaoPaciente;
    private List<Paciente> listaConsultas = new ArrayList<>();

    public TelaDetalhe() {
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

        jpnlDetalhesConsulta = new javax.swing.JPanel();
        jlblDetalhesConsulta = new javax.swing.JLabel();
        jcboxConsultaRealizada = new javax.swing.JCheckBox();
        jlblReceitaObservacoes = new javax.swing.JLabel();
        jscrllpnReceitaObservacoes = new javax.swing.JScrollPane();
        jtxtarReceitaObservacoes = new javax.swing.JTextArea();
        jbtnFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Finalizar Consulta");

        jlblDetalhesConsulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblDetalhesConsulta.setText("Detalhes da Consulta");

        jcboxConsultaRealizada.setText("Consulta Realizada");

        jlblReceitaObservacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblReceitaObservacoes.setText("Receita e Observações:");

        jtxtarReceitaObservacoes.setColumns(20);
        jtxtarReceitaObservacoes.setRows(5);
        jscrllpnReceitaObservacoes.setViewportView(jtxtarReceitaObservacoes);

        jbtnFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnFinalizar.setText("FINALIZAR");
        jbtnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlDetalhesConsultaLayout = new javax.swing.GroupLayout(jpnlDetalhesConsulta);
        jpnlDetalhesConsulta.setLayout(jpnlDetalhesConsultaLayout);
        jpnlDetalhesConsultaLayout.setHorizontalGroup(
            jpnlDetalhesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDetalhesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlDetalhesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrllpnReceitaObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDetalhesConsulta)
                    .addComponent(jcboxConsultaRealizada)
                    .addComponent(jlblReceitaObservacoes)
                    .addComponent(jbtnFinalizar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlDetalhesConsultaLayout.setVerticalGroup(
            jpnlDetalhesConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlDetalhesConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblDetalhesConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcboxConsultaRealizada)
                .addGap(18, 18, 18)
                .addComponent(jlblReceitaObservacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrllpnReceitaObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnFinalizar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlDetalhesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlDetalhesConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFinalizarActionPerformed
        if (jtxtarReceitaObservacoes.getText().isEmpty() && jcboxConsultaRealizada.isSelected()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
            if (jcboxConsultaRealizada.isSelected()) {
                this.paciente.setConsultaRealizada("Sim");
                listaConsultas.add(this.paciente);
            } else {
                this.paciente.setConsultaRealizada("Não");
                listaConsultas.add(this.paciente);
            }
            this.paciente.setConsultaObservacoes(jtxtarReceitaObservacoes.getText());
            ListaPaciente.Atualizar(posicaoPaciente, this.paciente);
            telaInicial.atualizarTabela();
            dispose();
        }
    }//GEN-LAST:event_jbtnFinalizarActionPerformed

    public void MostrarTela(TelaInicial obj, int posicaoPacienteObj) {
        this.telaInicial = obj;
        this.posicaoPaciente = posicaoPacienteObj;
        this.paciente = ListaPaciente.getPaciente(posicaoPacienteObj);
        setVisible(true);
        Carregar();
    }

    private void Carregar() {
        if (this.paciente.getConsultaRealizada().equals("Sim")) {
            jcboxConsultaRealizada.setSelected(true);
        } else {
            jcboxConsultaRealizada.setSelected(false);
        }
        jtxtarReceitaObservacoes.setText(this.paciente.getConsultaObservacoes());
    }

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
            java.util.logging.Logger.getLogger(TelaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDetalhe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDetalhe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnFinalizar;
    private javax.swing.JCheckBox jcboxConsultaRealizada;
    private javax.swing.JLabel jlblDetalhesConsulta;
    private javax.swing.JLabel jlblReceitaObservacoes;
    private javax.swing.JPanel jpnlDetalhesConsulta;
    private javax.swing.JScrollPane jscrllpnReceitaObservacoes;
    private javax.swing.JTextArea jtxtarReceitaObservacoes;
    // End of variables declaration//GEN-END:variables
}
