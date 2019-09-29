package view;

import controller.ControllerUsuario;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ModelUsuario;

public class ViewLogin extends javax.swing.JFrame {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();

    public ViewLogin() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        painel2 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jtfLogin = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        painelEntrar = new javax.swing.JPanel();
        iconEntrar = new javax.swing.JLabel();
        labelEntrar = new javax.swing.JLabel();
        painelSair = new javax.swing.JPanel();
        iconSair = new javax.swing.JLabel();
        labelSair = new javax.swing.JLabel();
        painel3 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(174, 232, 56));
        setName("Login"); // NOI18N
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel.setBackground(new java.awt.Color(174, 232, 56));
        painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel1.setBackground(new java.awt.Color(255, 255, 255));
        painel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel2.setBackground(new java.awt.Color(132, 178, 41));
        painel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Login no sistema");
        painel2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 320, -1));

        label1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label1.setText("Usuário");
        painel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 20));

        label2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label2.setText("Senha");
        painel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 50, 20));

        jtfLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLoginActionPerformed(evt);
            }
        });
        painel2.add(jtfLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 200, 20));

        jtfSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });
        painel2.add(jtfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 200, 20));

        painelEntrar.setBackground(new java.awt.Color(99, 132, 31));
        painelEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 94, 22)));
        painelEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelEntrarMouseClicked(evt);
            }
        });
        painelEntrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/login (1).png"))); // NOI18N
        iconEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelEntrar.add(iconEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 48, 28));

        labelEntrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelEntrar.setText("Entrar");
        painelEntrar.add(labelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 11, 50, 28));

        painel2.add(painelEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 138, 50));

        painelSair.setBackground(new java.awt.Color(99, 132, 31));
        painelSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(71, 94, 22)));
        painelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelSairMouseClicked(evt);
            }
        });
        painelSair.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/exit.png"))); // NOI18N
        iconSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelSair.add(iconSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 48, 28));

        labelSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelSair.setText("Sair");
        painelSair.add(labelSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 11, 30, 28));

        painel2.add(painelSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 138, 50));

        painel1.add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 320, 400));

        painel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        painel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painel1.add(painel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 420));

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/logo_capa.png"))); // NOI18N
        painel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 720, 440));

        painel.add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1070, 440));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 1110, 480));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1085, 0, 25, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void painelEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEntrarMouseClicked
        entrar();
    }//GEN-LAST:event_painelEntrarMouseClicked

    private void painelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelSairMouseClicked
        fechar();
    }//GEN-LAST:event_painelSairMouseClicked

    private void jtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLoginActionPerformed
        jtfSenha.requestFocus();
    }//GEN-LAST:event_jtfLoginActionPerformed

    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        entrar();
    }//GEN-LAST:event_jtfSenhaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fechar();
    }//GEN-LAST:event_formWindowClosing

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

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
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    private void entrar() {
        modelUsuario.setUsuLogin(jtfLogin.getText());
        modelUsuario.setUsuSenha(String.valueOf(jtfSenha.getPassword()));

        if (controllerUsuario.getValidarUsuarioController(modelUsuario)) {
            dispose();
            new ViewMenuPrincipal().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void fechar() {
        int intOpcao = JOptionPane.showOptionDialog(null, "Deseja fechar o Programa?", "Encerrando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            dispose();
        } else {
            this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel iconEntrar;
    private javax.swing.JLabel iconSair;
    private javax.swing.JTextField jtfLogin;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel labelEntrar;
    private javax.swing.JLabel labelSair;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painelEntrar;
    private javax.swing.JPanel painelSair;
    private javax.swing.JPanel painelTarefas;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
