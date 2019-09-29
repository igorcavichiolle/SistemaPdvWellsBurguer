package view;

import controller.ControllerCliente;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;

public class ViewCliente extends javax.swing.JFrame {
    
    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    String salvarAlterar;

    public ViewCliente() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
        carregarCliente();
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jtfCep = new javax.swing.JFormattedTextField();
        jcbUF = new javax.swing.JComboBox<>();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 232, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setPreferredSize(new java.awt.Dimension(831, 589));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Código:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jtfCodigo.setEnabled(false);
        jPanel3.add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 20));

        jtfNome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 430, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Endereço:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jtfEndereco.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(jtfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 260, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Bairro:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, 20));

        jtfBairro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(jtfBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 250, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Cidade:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 20));

        jtfCidade.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(jtfCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("UF:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("CEP:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 20));

        jtfTelefone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel3.add(jtfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 200, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Telefone:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, 20));

        jtCliente.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Cliente", "Cidade", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 200, 520, 168));

        jbCancelar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/cancelar.png"))); // NOI18N
        jbCancelar.setText(" Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 100, 30));

        jbNovo.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/novo.png"))); // NOI18N
        jbNovo.setText(" Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel3.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 100, 30));

        jbSalvar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/save.png"))); // NOI18N
        jbSalvar.setText(" Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 100, 30));

        jbAlterar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/alterar.png"))); // NOI18N
        jbAlterar.setText(" Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jPanel3.add(jbAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 100, 30));

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/excluir.png"))); // NOI18N
        jbExcluir.setText(" Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 100, 30));

        try {
            jtfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfCep.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel3.add(jtfCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 106, -1));

        jcbUF.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jcbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel3.add(jcbUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 50, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 420));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 440));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 580, 460));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 0, 25, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.desabilitaHabilitaCampos(false);
        this.limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        this.desabilitaHabilitaCampos(true);
        this.limparCampos();
        salvarAlterar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        if (salvarAlterar.equals("salvar")) {
            modelCliente.setCliNome(this.jtfNome.getText());
            modelCliente.setCliEndereco(this.jtfEndereco.getText());
            modelCliente.setCliBairro(this.jtfBairro.getText());
            modelCliente.setCliCidade(this.jtfCidade.getText());
            modelCliente.setCliUf(this.jcbUF.getSelectedItem().toString());
            modelCliente.setCliCep(this.jtfCep.getText());
            modelCliente.setCliTelefone(this.jtfTelefone.getText());
            if (controllerCliente.salvarClienteController(modelCliente) > 0) {
                JOptionPane.showMessageDialog(this, "Seu cliente foi cadastrado com sucesso!", "ATENÇAO", JOptionPane.WARNING_MESSAGE);
                carregarCliente();
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar o Cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            modelCliente.setIdCliente(Integer.parseInt(this.jtfCodigo.getText()));
            modelCliente.setCliNome(this.jtfNome.getText());
            modelCliente.setCliEndereco(this.jtfEndereco.getText());
            modelCliente.setCliBairro(this.jtfBairro.getText());
            modelCliente.setCliCidade(this.jtfCidade.getText());
            modelCliente.setCliUf(this.jcbUF.getSelectedItem().toString());
            modelCliente.setCliCep(this.jtfCep.getText());
            modelCliente.setCliTelefone(this.jtfTelefone.getText());
            if (controllerCliente.atualizarClienteController(modelCliente)) {
                JOptionPane.showMessageDialog(this, "Seu cliente foi Alterado com sucesso!", "ATENÇAO", JOptionPane.WARNING_MESSAGE);
                this.desabilitaHabilitaCampos(false);
                this.limparCampos();
                carregarCliente();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar o Cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        int linha = jtCliente.getSelectedRow();
        int codigoCliente = (int) jtCliente.getValueAt(linha, 0);
        salvarAlterar = "alterar";
        modelCliente = controllerCliente.getClienteController(codigoCliente);
        jtfCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
        jtfNome.setText(modelCliente.getCliNome());
        jtfEndereco.setText(modelCliente.getCliEndereco());
        jtfBairro.setText(modelCliente.getCliBairro());
        jtfCidade.setText(modelCliente.getCliCidade());
        jcbUF.setSelectedItem(modelCliente.getCliUf());
        jtfCep.setText(modelCliente.getCliCep());
        jtfTelefone.setText(modelCliente.getCliTelefone());
        this.desabilitaHabilitaCampos(true);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtCliente.getSelectedRow();
        int codigoCliente = (int) jtCliente.getValueAt(linha, 0);
        if (controllerCliente.excluirClienteController(codigoCliente)) {
            JOptionPane.showMessageDialog(this, "Cliente Excluido com sucesso", "Atenção", JOptionPane.WARNING_MESSAGE);
            this.carregarCliente();
        } else {
            JOptionPane.showMessageDialog(this, "ERRO ao excluir cliente", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void carregarCliente() {
        listaModelClientes = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0);
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getIdCliente(),
                listaModelClientes.get(i).getCliNome(),
                listaModelClientes.get(i).getCliCidade(),
                listaModelClientes.get(i).getCliTelefone(),});
        }
    }

    private void desabilitaHabilitaCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfEndereco.setEnabled(condicao);
        jtfBairro.setEnabled(condicao);
        jtfCidade.setEnabled(condicao);
        jcbUF.setEnabled(condicao);
        jtfCep.setEnabled(condicao);
        jtfTelefone.setEnabled(condicao);
        jbSalvar.setEnabled(condicao);
    }

    private void limparCampos() {
        jtfNome.setText("");
        jtfEndereco.setText("");
        jtfBairro.setText("");
        jtfCidade.setText("");
        jtfCep.setText("");
        jtfTelefone.setText("");
        jtfCodigo.setText("");
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
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbUF;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JFormattedTextField jtfCep;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JPanel painelTarefas;
    // End of variables declaration//GEN-END:variables
}
