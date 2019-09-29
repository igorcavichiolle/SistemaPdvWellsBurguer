package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ViewMenuPrincipal extends javax.swing.JFrame {

    public ViewMenuPrincipal() {
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
        icon = new javax.swing.JLabel();
        painelMenu = new javax.swing.JPanel();
        painelVendas = new javax.swing.JPanel();
        labelVendas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        painelProdutos = new javax.swing.JPanel();
        labelProdutos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        painelControle = new javax.swing.JPanel();
        labelControle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        painelFinanceiro = new javax.swing.JPanel();
        labelFinanceiro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        painelBarra = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        jlUsuario = new javax.swing.JLabel();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        painel1.setBackground(new java.awt.Color(174, 232, 56));
        painel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel2.setBackground(new java.awt.Color(255, 255, 255));
        painel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/logo_capa.png"))); // NOI18N
        painel2.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 250));

        painelMenu.setBackground(new java.awt.Color(233, 233, 233));
        painelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVendas.setBackground(new java.awt.Color(192, 240, 95));
        painelVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 139, 28)));
        painelVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelVendasMouseClicked(evt);
            }
        });
        painelVendas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVendas.setFont(new java.awt.Font("Comic Sans MS", 1, 21)); // NOI18N
        labelVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/shopping-cart.png"))); // NOI18N
        painelVendas.add(labelVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        labelVendas.getAccessibleContext().setAccessibleName("Painel");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Painel de");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelVendas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Vendas");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        painelVendas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 60));

        painelMenu.add(painelVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 130));

        painelProdutos.setBackground(new java.awt.Color(192, 240, 95));
        painelProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 139, 28)));
        painelProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelProdutosMouseClicked(evt);
            }
        });
        painelProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelProdutos.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        labelProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/covered-food-tray-on-a-hand-of-hotel-room-service.png"))); // NOI18N
        painelProdutos.add(labelProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Produtos");
        painelProdutos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 130));

        painelMenu.add(painelProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 270, 130));

        painelControle.setBackground(new java.awt.Color(192, 240, 95));
        painelControle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 139, 28)));
        painelControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelControleMouseClicked(evt);
            }
        });
        painelControle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelControle.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        labelControle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/contract.png"))); // NOI18N
        painelControle.add(labelControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Controle de");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelControle.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Vendas");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        painelControle.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, 60));

        painelMenu.add(painelControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 270, 130));

        painelFinanceiro.setBackground(new java.awt.Color(192, 240, 95));
        painelFinanceiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 139, 28)));
        painelFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                painelFinanceiroMouseClicked(evt);
            }
        });
        painelFinanceiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFinanceiro.setFont(new java.awt.Font("Comic Sans MS", 1, 22)); // NOI18N
        labelFinanceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/stats.png"))); // NOI18N
        labelFinanceiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelFinanceiro.add(labelFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Financeiro");
        painelFinanceiro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, 130));

        painelMenu.add(painelFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 270, 130));

        painel2.add(painelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1130, 150));

        painel1.add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1190, 565));

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 1210, 585));

        painelBarra.setBackground(new java.awt.Color(142, 142, 142));
        painelBarra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        painelBarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Logado como:");
        painelBarra.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        jlUsuario.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario.setText("Administrador");
        painelBarra.add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 20));

        getContentPane().add(painelBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1210, 30));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1185, 0, 25, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int intOpcao = JOptionPane.showOptionDialog(null, "Deseja fechar o Programa?", "Encerrando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            System.exit(0);
        } else {
            this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void painelVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelVendasMouseClicked
        new ViewPDV().setVisible(true);
        dispose();
    }//GEN-LAST:event_painelVendasMouseClicked

    private void painelProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelProdutosMouseClicked
        new ViewProduto().setVisible(true);
        dispose();
    }//GEN-LAST:event_painelProdutosMouseClicked

    private void painelControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelControleMouseClicked
        new ViewVendas().setVisible(true);
        dispose();
    }//GEN-LAST:event_painelControleMouseClicked

    private void painelFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelFinanceiroMouseClicked
        new ViewFinanceiro().setVisible(true);
        dispose();
    }//GEN-LAST:event_painelFinanceiroMouseClicked

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
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuPrincipal().setVisible(true);
            }
        });
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelControle;
    private javax.swing.JLabel labelFinanceiro;
    private javax.swing.JLabel labelProdutos;
    private javax.swing.JLabel labelVendas;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painelBarra;
    private javax.swing.JPanel painelControle;
    private javax.swing.JPanel painelFinanceiro;
    private javax.swing.JPanel painelMenu;
    private javax.swing.JPanel painelProdutos;
    private javax.swing.JPanel painelTarefas;
    private javax.swing.JPanel painelVendas;
    // End of variables declaration//GEN-END:variables
}
