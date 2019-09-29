package view;

import controller.ControllerUsuario;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;

public class ViewUsuario extends javax.swing.JFrame {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();
    ArrayList<ModelUsuario> listaModelUsuario = new ArrayList<>();
    String alterarSalvar;

    public ViewUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
        carregarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 232, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setPreferredSize(new java.awt.Dimension(831, 589));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setText("Código:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jtfCodigo.setEditable(false);
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtfCodigo.setEnabled(false);
        jPanel3.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 85, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 20));

        jtfNome.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel3.add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 460, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Login:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jtfLogin.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel3.add(jtfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 270, -1));

        jtfSenha.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel3.add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 270, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel4.setText("Senha:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 20));

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Login"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtUsuario);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 560, 367));

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 100, 30));

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jPanel3.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 100, 30));

        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/alterar.png"))); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jPanel3.add(jbAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 100, 30));

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/save.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 552, -1, -1));

        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/novo.png"))); // NOI18N
        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel3.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 600, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 620, 590));

        painelTarefas.setBackground(new java.awt.Color(126, 178, 20));
        painelTarefas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        painelTarefas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/fechar2.png"))); // NOI18N
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 30, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtUsuario.getSelectedRow();
        int codigoUsuario = (int) jtUsuario.getValueAt(linha, 0);
        if (controllerUsuario.excluirUsuarioController(codigoUsuario)) {
            JOptionPane.showMessageDialog(this, "Usuario Excluido com sucesso", "Atenção", JOptionPane.WARNING_MESSAGE);
            this.carregarUsuarios();
        } else {
            JOptionPane.showMessageDialog(this, "ERRO ao excluir usuario", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        int linha = jtUsuario.getSelectedRow();
        int codigo = (int) jtUsuario.getValueAt(linha, 0);
        modelUsuario = controllerUsuario.getUsuarioController(codigo);
        jtfCodigo.setText(String.valueOf(modelUsuario.getIdUsuario()));
        jtfNome.setText(modelUsuario.getUsuNome());
        jtfLogin.setText(modelUsuario.getUsuLogin());
        jtfSenha.setText(modelUsuario.getUsuSenha());
        alterarSalvar = "alterar";
        habilitarDesabilitarCampos(true);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            modelUsuario.setIdUsuario(Integer.parseInt(jtfCodigo.getText()));
        } catch (NumberFormatException e) {
        }
        modelUsuario.setUsuNome(jtfNome.getText());
        modelUsuario.setUsuLogin(jtfLogin.getText());
        modelUsuario.setUsuSenha(jtfSenha.getText());
        if (alterarSalvar.equals("salvar")) {
            if (controllerUsuario.salvarUsuarioController(modelUsuario) > 0) {
                JOptionPane.showMessageDialog(this, "Usuario cadastrado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCampos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar usuario!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (controllerUsuario.atualizarUsuarioController(modelUsuario)) {
                JOptionPane.showMessageDialog(this, "Usuario alterado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarUsuarios();
                limparCampos();
                habilitarDesabilitarCampos(false);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar usuario!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        limparCampos();
        habilitarDesabilitarCampos(true);
        alterarSalvar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void carregarUsuarios() {
        listaModelUsuario = controllerUsuario.getListaUsuarioController();
        DefaultTableModel modelo = (DefaultTableModel) jtUsuario.getModel();
        modelo.setNumRows(0);
        int cont = listaModelUsuario.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelUsuario.get(i).getIdUsuario(),
                listaModelUsuario.get(i).getUsuNome(),
                listaModelUsuario.get(i).getUsuLogin()
            });
        }
    }

    private void limparCampos() {
        jtfCodigo.setText("");
        jtfLogin.setText("");
        jtfNome.setText("");
        jtfSenha.setText("");
    }

    private void habilitarDesabilitarCampos(boolean condicao) {
        jtfCodigo.setEnabled(condicao);
        jtfNome.setEnabled(condicao);
        jtfLogin.setEnabled(condicao);
        jtfSenha.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
    }

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsuario().setVisible(true);
            }
        });
    }

    private void fechar() {
        int intOpcao = JOptionPane.showOptionDialog(null, "Deseja Fechar?", "Encerrando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            dispose();
            new ViewMenuPrincipal().setVisible(true);
        } else {
            this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JPanel painelTarefas;
    // End of variables declaration//GEN-END:variables
}
