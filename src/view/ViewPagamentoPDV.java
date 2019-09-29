package view;

import controller.ControllerFormaPagamento;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ModelFormaPagamento;
import util.BLMascaras;

public class ViewPagamentoPDV extends java.awt.Dialog {

    ArrayList<ModelFormaPagamento> listaModelFormaPagamento = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    BLMascaras bLMascaras = new BLMascaras();
    private float valorTotal;
    private float desconto;
    private float valorRecebido;
    private float troco;
    private String formaPagamento;
    private boolean statusVenda;

    public boolean isStatusVenda() {
        return statusVenda;
    }

    public void setStatusVenda(boolean statusVenda) {
        this.statusVenda = statusVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public float getTroco() {
        return troco;
    }

    public void setTroco(float troco) {
        this.troco = troco;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setTextFieldValorTotal() {
        this.jtfSubtotal.setText(this.valorTotal + "");
    }

    public ViewPagamentoPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
        calcularPagamento();
        listarFormaPagamento();
        this.statusVenda = false;
        jtfDesconto.requestFocus();
        limparCampos();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbPagamento = new javax.swing.JComboBox<>();
        jtfValorRecebido = new javax.swing.JFormattedTextField();
        jtfSubtotal = new javax.swing.JFormattedTextField();
        jtfDesconto = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jlValorTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfTroco = new javax.swing.JFormattedTextField();
        jbRetornar = new javax.swing.JPanel();
        iconVendas10 = new javax.swing.JLabel();
        labelVendas10 = new javax.swing.JLabel();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(174, 232, 56));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Subtotal:");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Valor Recebido:");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Pagamento:");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Desconto:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 80, 30));

        jcbPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPagamentoActionPerformed(evt);
            }
        });
        jPanel7.add(jcbPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 73, 290, -1));

        jtfValorRecebido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfValorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorRecebidoFocusLost(evt);
            }
        });
        jtfValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorRecebidoActionPerformed(evt);
            }
        });
        jPanel7.add(jtfValorRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 153, 290, -1));

        jtfSubtotal.setEnabled(false);
        jtfSubtotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel7.add(jtfSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 33, 290, -1));

        jtfDesconto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jtfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescontoActionPerformed(evt);
            }
        });
        jPanel7.add(jtfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 113, 290, -1));

        jPanel1.setBackground(new java.awt.Color(174, 232, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(117, 165, 18)), javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(136, 192, 21)), "Valor a Pagar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18)))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jlValorTotal.setText("0");
        jPanel1.add(jlValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jPanel7.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 390, 110));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Troco:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jtfTroco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel7.add(jtfTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 361, 140, -1));

        jbRetornar.setBackground(new java.awt.Color(119, 169, 19));
        jbRetornar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jbRetornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbRetornarMouseClicked(evt);
            }
        });
        jbRetornar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconVendas10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconVendas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/login (1).png"))); // NOI18N
        iconVendas10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbRetornar.add(iconVendas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        labelVendas10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVendas10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendas10.setText("Retornar e Finalizar");
        jbRetornar.add(labelVendas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 160, 28));

        jPanel7.add(jbRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 190, 50));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 418));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 530, 440));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 30, 25));

        add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void jbRetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbRetornarMouseClicked
        finaliza();
    }//GEN-LAST:event_jbRetornarMouseClicked

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        jtfDesconto.setText(bLMascaras.converterVirgulaParaPonto(jtfDesconto.getText()));
        calcularPagamento();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jtfValorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorRecebidoFocusLost
        jtfValorRecebido.setText(bLMascaras.converterVirgulaParaPonto(jtfValorRecebido.getText()));
        calcularPagamento();
    }//GEN-LAST:event_jtfValorRecebidoFocusLost

    private void jcbPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPagamentoActionPerformed
        jtfDesconto.requestFocus();
    }//GEN-LAST:event_jcbPagamentoActionPerformed

    private void jtfValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorRecebidoActionPerformed
        jtfValorRecebido.setText(bLMascaras.converterVirgulaParaPonto(jtfValorRecebido.getText()));
        calcularPagamento();
        String trocoT = jtfTroco.getText();
        int intOpcao = JOptionPane.showOptionDialog(null, "Finalizar a venda? \n Troco : R$"+trocoT, "PERGUNTA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            dispose();
            finaliza();
        } else {
            setVisible(false);
            dispose();
        }
    }//GEN-LAST:event_jtfValorRecebidoActionPerformed

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        jtfValorRecebido.requestFocus();
    }//GEN-LAST:event_jtfDescontoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewPagamentoPDV dialog = new ViewPagamentoPDV(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private void finaliza() {
        this.desconto = Float.parseFloat(this.jtfDesconto.getText());
        this.valorRecebido = Float.parseFloat(this.jtfValorRecebido.getText());
        this.troco = Float.parseFloat(this.jtfTroco.getText());
        this.valorTotal = Float.parseFloat(this.jlValorTotal.getText());
        this.formaPagamento = jcbPagamento.getSelectedItem().toString();
        this.statusVenda = true;
        dispose();
    }

    /*
    Preenche o combobox com todas as formas de pagamento
     */
    private void listarFormaPagamento() {
        listaModelFormaPagamento = controllerFormaPagamento.getListaFormaPagamentoController();
        jcbPagamento.removeAllItems();
        for (int i = 0; i < listaModelFormaPagamento.size(); i++) {
            jcbPagamento.addItem(listaModelFormaPagamento.get(i).getDescricaoForPag());
        }
    }

    /**
     * Calcula o valor total a pagar e o troco
     */
    private void calcularPagamento() {

        float subTotal, desconto, recebido, pagar, troco;
        setTextFieldValorTotal();

        try {
            subTotal = Float.parseFloat(jtfSubtotal.getText());
        } catch (Exception e) {
            subTotal = 0;
        }
        try {
            desconto = Float.parseFloat(jtfDesconto.getText());
        } catch (Exception e) {
            desconto = 0;
            jtfDesconto.setText("0");
        }

        try {
            recebido = Float.parseFloat(jtfValorRecebido.getText());
        } catch (Exception e) {
            recebido = 0;
            jtfValorRecebido.setText("");
        }

        /**
         * calcular valor a pagar
         */
        pagar = subTotal - desconto;
        //jlValorTotal.setText(bLMascaras.arredondamentoComPontoDuasCasasString(pagar));
        jlValorTotal.setText(String.valueOf(pagar));
        /**
         * calculando troco
         */
        troco = recebido - pagar;
        //jtfTroco.setText(bLMascaras.arredondamentoComPontoDuasCasasString(troco));
        jtfTroco.setText(String.valueOf(troco));
    }

    private void limparCampos() {
        jtfDesconto.setText("0");
        jtfValorRecebido.setText("0");
    }

    private void fechar() {
        setVisible(false);
        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel iconVendas10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jbRetornar;
    private javax.swing.JComboBox<String> jcbPagamento;
    private javax.swing.JLabel jlValorTotal;
    private javax.swing.JFormattedTextField jtfDesconto;
    private javax.swing.JFormattedTextField jtfSubtotal;
    private javax.swing.JFormattedTextField jtfTroco;
    private javax.swing.JFormattedTextField jtfValorRecebido;
    private javax.swing.JLabel labelVendas10;
    private javax.swing.JPanel painelTarefas;
    // End of variables declaration//GEN-END:variables
}
