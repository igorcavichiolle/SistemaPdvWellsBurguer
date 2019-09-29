package view;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;
import util.BLMascaras;
import model.ModelVendas;
import util.FormatadorString;

public class ViewFinanceiro extends javax.swing.JFrame {

    BLMascaras bLMascaras = new BLMascaras();
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    String valorDia;
    String valorSemana;
    String valorMes;
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    

    public ViewFinanceiro() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
        carregarMaisVendidos();
        carregarFinanceiro();
        alinharTabela();
    }

    private void carregarFinanceiro() {
        BLMascaras bLMascaras = new BLMascaras();
        modelVendas = controllerVendas.retornarVendaDiaController();
        valorDia = FormatadorString.format(modelVendas.getValorVenDia());
        jtfVenDia.setText(bLMascaras.converterPontoPraVirgula(valorDia));
        
        
        modelVendas = controllerVendas.retornarVendaSemanaController();
        valorSemana = FormatadorString.format(modelVendas.getValorVenSemana());
        jtfVenSemana.setText(bLMascaras.converterPontoPraVirgula(valorSemana));
        
        
        modelVendas = controllerVendas.retornarVendaMesController();
        valorMes = FormatadorString.format(modelVendas.getValorVenMes());
        jtfVenMes.setText(bLMascaras.converterPontoPraVirgula(valorMes));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        painel1 = new javax.swing.JPanel();
        painelTitulo = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        painel2 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jtfVenDia = new javax.swing.JLabel();
        jtfVenSemana = new javax.swing.JLabel();
        jtfVenMes = new javax.swing.JLabel();
        painel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        title1 = new javax.swing.JLabel();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel.setBackground(new java.awt.Color(174, 232, 56));
        painel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        painel.setPreferredSize(new java.awt.Dimension(831, 589));
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel1.setBackground(new java.awt.Color(255, 255, 255));
        painel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelTitulo.setBackground(new java.awt.Color(239, 239, 239));
        painelTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        painelTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Fluxo de caixa");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        painelTitulo.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1120, 70));

        painel1.add(painelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1140, 70));

        painel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label1.setText("Vendas Hoje:");
        painel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label2.setText("Vendas Nesta Semana:");
        painel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        label3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label3.setText("Vendas Neste Mês:");
        painel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jtfVenDia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtfVenDia.setForeground(new java.awt.Color(204, 0, 0));
        jtfVenDia.setText("R$10,00");
        painel2.add(jtfVenDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        jtfVenSemana.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtfVenSemana.setForeground(new java.awt.Color(204, 0, 0));
        jtfVenSemana.setText("R$10,00");
        painel2.add(jtfVenSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jtfVenMes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtfVenMes.setForeground(new java.awt.Color(204, 0, 0));
        jtfVenMes.setText("R$10,00");
        painel2.add(jtfVenMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        painel1.add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 300, 445));

        painel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        painel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtProdutos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade Total", "Valor Total Rendido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setResizable(false);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(20);
        }

        painel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 760, 350));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Mais vendidos");
        painel3.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 40));

        painel1.add(painel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 820, 445));

        painel.add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1180, 575));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 1200, 595));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1175, 0, 25, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void carregarMaisVendidos() {
        listaModelProdutos = controllerProdutos.retornarListaProdutoMaisVendidosController();
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
        int cont = listaModelProdutos.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                FormatadorString.format(listaModelProdutos.get(i).getProValor())
            });
        }
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
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFinanceiro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFinanceiro().setVisible(true);
            }
        });
    }

    private void fechar() {
        int intOpcao = JOptionPane.showOptionDialog(null, "Deseja fechar o Programa?", "Encerrando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            dispose();
            new ViewMenuPrincipal().setVisible(true);
        } else {
            this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }
    }
    
    private void alinharTabela(){
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        jtProdutos.getColumnModel().getColumn(0).setCellRenderer(esquerda);
        jtProdutos.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        jtProdutos.getColumnModel().getColumn(2).setCellRenderer(centralizado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JLabel jtfVenDia;
    private javax.swing.JLabel jtfVenMes;
    private javax.swing.JLabel jtfVenSemana;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel1;
    private javax.swing.JPanel painel2;
    private javax.swing.JPanel painel3;
    private javax.swing.JPanel painelTarefas;
    private javax.swing.JPanel painelTitulo;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
