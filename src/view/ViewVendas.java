package view;

import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.ControllerProdutosVendasProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasCliente;
import controller.ControllerVendasProdutos;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ModelCliente;
import model.ModelProdutos;
import model.ModelProdutosVendasProdutos;
import model.ModelVendas;
import model.ModelVendasCLiente;
import model.ModelVendasProdutos;
import util.BLDatas;

public class ViewVendas extends javax.swing.JFrame {

    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ArrayList<ModelVendasCLiente> listaModelVendasClientes = new ArrayList<>();
    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    BLDatas bLDatas = new BLDatas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    ControllerProdutosVendasProdutos controllerProdutosVendasProdutos = new ControllerProdutosVendasProdutos();
    ModelProdutosVendasProdutos modelProdutosVendasProdutos = new ModelProdutosVendasProdutos();
    ArrayList<ModelProdutosVendasProdutos> listaModelProdutosVendasProdutoses = new ArrayList<>();
    String alterarSalvar;
    Connection conexao = null;

    public ViewVendas() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
        listarClientes();
        listarProdutos();
        carregarVendas();
        preecherCodigoClientePeloCombobox();
        preecherCodigoProdutoPeloCombobox();
        alinharTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jtfCodigoCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfNumVenda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigoProduto = new javax.swing.JTextField();
        jtfQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutosVenda = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbRemoverProdutos = new javax.swing.JButton();
        jtfValorTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtfDesconto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcbNomeProduto = new componentes.UJComboBox();
        jcbNomeCli = new componentes.UJComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVendas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jbImprimir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jbPesquisar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 232, 56));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.setPreferredSize(new java.awt.Dimension(831, 589));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfCodigoCli.setEditable(false);
        jtfCodigoCli.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtfCodigoCli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoCliFocusLost(evt);
            }
        });
        jPanel3.add(jtfCodigoCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Código Cliente");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nome do Cliente");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, 20));

        jtfNumVenda.setEditable(false);
        jtfNumVenda.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel3.add(jtfNumVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 189, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Número da venda");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Codigo Produto");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jtfCodigoProduto.setEditable(false);
        jtfCodigoProduto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtfCodigoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoProdutoFocusLost(evt);
            }
        });
        jPanel3.add(jtfCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        jtfQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel3.add(jtfQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 189, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Quantidade");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, 20));

        jbAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/add.png"))); // NOI18N
        jbAdicionar.setText(" Adicionar");
        jbAdicionar.setEnabled(false);
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
            }
        });
        jPanel3.add(jbAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 87, -1, -1));

        jtProdutosVenda.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtProdutosVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código produto", "Nome", "Quant", "Valor Un", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutosVenda);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 750, 240));

        jbSalvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/save.png"))); // NOI18N
        jbSalvar.setText(" Salvar");
        jbSalvar.setEnabled(false);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jPanel3.add(jbSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 110, 40));

        jbCancelar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/cancelar.png"))); // NOI18N
        jbCancelar.setText(" Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 110, 40));

        jbNovo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/novo.png"))); // NOI18N
        jbNovo.setText(" Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });
        jPanel3.add(jbNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 110, 40));

        jbRemoverProdutos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jbRemoverProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/remover.png"))); // NOI18N
        jbRemoverProdutos.setText(" Remover");
        jbRemoverProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverProdutosActionPerformed(evt);
            }
        });
        jPanel3.add(jbRemoverProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 110, 40));

        jtfValorTotal.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jPanel3.add(jtfValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 110, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Valor total");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, -1, 20));

        jtfDesconto.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jPanel3.add(jtfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, 110, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Desconto");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Nome do Produto");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, 20));

        jcbNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(jcbNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 330, -1));

        jcbNomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbNomeCliActionPerformed(evt);
            }
        });
        jPanel3.add(jcbNomeCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 450, -1));

        jTabbedPane1.addTab("Cadastro", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtVendas.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Venda", "Caixa", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtVendas);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 760, 330));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbImprimir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/imprimir.png"))); // NOI18N
        jbImprimir.setText(" Imprimir");
        jbImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirActionPerformed(evt);
            }
        });
        jPanel5.add(jbImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 425, 120, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel8.setText("Pesquisa");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jtfPesquisa.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jPanel5.add(jtfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 640, -1));

        jbPesquisar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jbPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/pesquisar.png"))); // NOI18N
        jbPesquisar.setText(" Pesquisar");
        jPanel5.add(jbPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 37, -1, -1));

        jbExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/excluir.png"))); // NOI18N
        jbExcluir.setText(" Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jPanel5.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 425, 110, 40));

        jbAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/alterar.png"))); // NOI18N
        jbAlterar.setText(" Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });
        jPanel5.add(jbAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 425, 110, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 490));

        jTabbedPane1.addTab("Consultar/Excluir/Alterar", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 820, 530));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 30, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodigoCliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoCliFocusLost
        modelCliente = controllerCliente.getClienteController(Integer.parseInt(jtfCodigoCli.getText()));
        jcbNomeCli.setSelectedItem(modelCliente.getCliNome());
    }//GEN-LAST:event_jtfCodigoCliFocusLost

    private void jtfCodigoProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoFocusLost
        modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
        jcbNomeProduto.setSelectedItem(modelProdutos.getProNome());
    }//GEN-LAST:event_jtfCodigoProdutoFocusLost

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        if (jtfQuantidade.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
            DefaultTableModel modelo = (DefaultTableModel) jtProdutosVenda.getModel();
            int cont = 0;
            double quantidade = 0;
            quantidade = Double.parseDouble(jtfQuantidade.getText());
            for (int i = 0; i < cont; i++) {
                modelo.setNumRows(0);
            }
            modelo.addRow(new Object[]{
                modelProdutos.getIdProduto(),
                modelProdutos.getProNome(),
                jtfQuantidade.getText(),
                modelProdutos.getProValor(),
                quantidade * modelProdutos.getProValor()
            });
            somarValorTotalProdutos();
        }
    }//GEN-LAST:event_jbAdicionarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        int codigoVenda = 0;
        int codigoProduto = 0;
        double desconto = 0;
        if (jtfDesconto.getText().equals("")) {
            desconto = 0;
        } else {
            desconto = Double.parseDouble(jtfDesconto.getText());
        }
        if (!jtfNumVenda.getText().equals("")) {
            modelVendas.setIdVenda(Integer.parseInt(jtfNumVenda.getText()));
        }
        listaModelVendasProdutos = new ArrayList<>();
        modelVendas.setCliente(Integer.parseInt(jtfCodigoCli.getText()));
        try {
            modelVendas.setVenDataVenda(bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception e) {
        }
        modelVendas.setVenValorLiquido(Double.parseDouble(jtfValorTotal.getText()));
        modelVendas.setVenValorBruto(Double.parseDouble(jtfValorTotal.getText()) + desconto);
        modelVendas.setVenDesconto(desconto);
        if (alterarSalvar.equals("salvar")) {
            codigoVenda = controllerVendas.salvarVendasController(modelVendas);
            if (codigoVenda > 0) {
                JOptionPane.showMessageDialog(this, "Venda Salva com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Salvar a venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            int cont = jtProdutosVenda.getRowCount();
            for (int i = 0; i < cont; i++) {
                codigoProduto = (int) jtProdutosVenda.getValueAt(i, 0);
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos.setProduto(codigoProduto);
                modelVendasProdutos.setVendas(codigoVenda);
                modelVendasProdutos.setVenProValor((double) jtProdutosVenda.getValueAt(i, 3));
                modelVendasProdutos.setVenProQuantidade(Integer.parseInt(jtProdutosVenda.getValueAt(i, 2).toString()));
                modelProdutos.setIdProduto(codigoProduto);
                modelProdutos.setProEstoque(controllerProdutos.retornarProdutoController(codigoProduto).getProEstoque()
                        - Integer.parseInt(jtProdutosVenda.getValueAt(i, 2).toString()));
                listaModelVendasProdutos.add(modelVendasProdutos);
                listaModelProdutos.add(modelProdutos);
            }
            if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
                carregarVendas();
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Salvar Produtos da venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            int linha = jtVendas.getSelectedRow();
            codigoVenda = (int) jtVendas.getValueAt(linha, 0);
            listaModelProdutos = new ArrayList<>();
            listaModelProdutosVendasProdutoses = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosDAOController(codigoVenda);
            for (int i = 0; i < listaModelProdutosVendasProdutoses.size(); i++) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setIdProduto(
                        listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getIdProduto());
                modelProdutos.setProEstoque(
                        listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getProEstoque()
                        + listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade());
                listaModelProdutos.add(modelProdutos);
            }
            if (controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
                if (controllerVendasProdutos.excluirVendasProdutosController(codigoVenda)) {
                    carregarVendas();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir a venda", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            if (controllerVendas.atualizarVendasController(modelVendas)) {
                JOptionPane.showMessageDialog(this, "Venda alterada com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao alterar a venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            int cont = jtProdutosVenda.getRowCount();
            for (int i = 0; i < cont; i++) {
                codigoProduto = (int) jtProdutosVenda.getValueAt(i, 0);
                modelVendasProdutos = new ModelVendasProdutos();
                modelProdutos = new ModelProdutos();
                modelVendasProdutos.setProduto(codigoProduto);
                modelVendasProdutos.setVendas(codigoVenda);
                modelVendasProdutos.setVenProValor((double) jtProdutosVenda.getValueAt(i, 3));
                modelVendasProdutos.setVenProQuantidade(Integer.parseInt(jtProdutosVenda.getValueAt(i, 2).toString()));
                modelProdutos.setIdProduto(codigoProduto);
                modelProdutos.setProEstoque(controllerProdutos.retornarProdutoController(codigoProduto).getProEstoque()
                        - Integer.parseInt(jtProdutosVenda.getValueAt(i, 2).toString()));
                listaModelVendasProdutos.add(modelVendasProdutos);
                listaModelProdutos.add(modelProdutos);
            }
            if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)) {
                carregarVendas();
                limparFormulario();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar Produtos!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            }
        }
        jbSalvar.setEnabled(false);
        jbAdicionar.setEnabled(false);
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        jbSalvar.setEnabled(true);
        jbAdicionar.setEnabled(true);
        alterarSalvar = "salvar";
        limparFormulario();
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbRemoverProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverProdutosActionPerformed
        int linha = jtProdutosVenda.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jtProdutosVenda.getModel();
        modelo.removeRow(linha);
        somarValorTotalProdutos();
    }//GEN-LAST:event_jbRemoverProdutosActionPerformed

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        somarValorTotalProdutos();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jcbNomeProdutoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible
        if (jcbNomeProduto.isVisible()) {
            preecherCodigoProdutoPeloCombobox();
        }
    }//GEN-LAST:event_jcbNomeProdutoPopupMenuWillBecomeInvisible

    private void jcbNomeCLiPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbNomeCLiPopupMenuWillBecomeInvisible
        if (jcbNomeCli.isPopupVisible()) {
            preecherCodigoClientePeloCombobox();
        }
    }//GEN-LAST:event_jcbNomeCLiPopupMenuWillBecomeInvisible

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
        listaModelProdutos = new ArrayList<>();
        listaModelProdutosVendasProdutoses = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosDAOController(codigoVenda);
        for (int i = 0; i < listaModelProdutosVendasProdutoses.size(); i++) {
            modelProdutos = new ModelProdutos();
            modelProdutos.setIdProduto(
                    listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getIdProduto());
            modelProdutos.setProEstoque(
                    listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getProEstoque()
                    + listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade());
            listaModelProdutos.add(modelProdutos);
        }
        if (controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos)) {
            controllerVendasProdutos.excluirVendasProdutosController(codigoVenda);
            if (controllerVendas.excluirVendasController(codigoVenda)) {
                JOptionPane.showMessageDialog(this, "Venda excluida com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
                carregarVendas();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao excluir a venda", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir a venda", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        jbSalvar.setEnabled(true);
        jbAdicionar.setEnabled(true);
        alterarSalvar = "alterar";
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
        listaModelProdutosVendasProdutoses = controllerProdutosVendasProdutos.getListaProdutosVendasProdutosDAOController(codigoVenda);
        DefaultTableModel modelo = (DefaultTableModel) jtProdutosVenda.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i < listaModelProdutosVendasProdutoses.size(); i++) {
            jtfNumVenda.setText(String.valueOf(listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVendas()));
            modelo.addRow(new Object[]{
                listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getIdProduto(),
                listaModelProdutosVendasProdutoses.get(i).getModelProdutos().getProNome(),
                listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade(),
                listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProValor(),
                listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProQuantidade()
                * listaModelProdutosVendasProdutoses.get(i).getModelVendasProdutos().getVenProValor(),});
        }
        somarValorTotalProdutos();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirActionPerformed
        int linha = jtVendas.getSelectedRow();
        int codigoVenda = (int) jtVendas.getValueAt(linha, 0);
        final ViewAguarde carregando = new ViewAguarde();
        carregando.setVisible(true);
        Thread t = new Thread() {
            public void run() {
                try {
                    controllerVendas.gerarRelatorioVenda(codigoVenda);
                    carregando.dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao gerar relatório /n " + e, "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        t.start();

    }//GEN-LAST:event_jbImprimirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fechar();
    }//GEN-LAST:event_formWindowClosing

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void jcbNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeProdutoActionPerformed
        preecherCodigoProdutoPeloCombobox();
    }//GEN-LAST:event_jcbNomeProdutoActionPerformed

    private void jcbNomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbNomeCliActionPerformed
        preecherCodigoClientePeloCombobox();
    }//GEN-LAST:event_jcbNomeCliActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        int intOpcao = JOptionPane.showOptionDialog(null, "Deseja Cancelar?", "Encerrando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            limparFormulario();
            jbSalvar.setEnabled(false);
            jbAdicionar.setEnabled(false);
        } else {
            this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void aplicarDescontos() {
        try {
            jtfValorTotal.setText(String.valueOf(
                    Double.parseDouble(jtfValorTotal.getText()) - Double.parseDouble(jtfDesconto.getText())));
        } catch (NumberFormatException e) {
        }
    }

    private void listarClientes() {
        listaModelCliente = controllerCliente.getListaClienteController();
        jcbNomeCli.removeAllItems();
        for (int i = 0; i < listaModelCliente.size(); i++) {
            jcbNomeCli.addItem(listaModelCliente.get(i).getCliNome());
        }
    }

    private void listarProdutos() {
        listaModelProdutos = controllerProdutos.retornarListaProdutoController();
        jcbNomeProduto.removeAllItems();
        for (int i = 0; i < listaModelProdutos.size(); i++) {
            jcbNomeProduto.addItem(listaModelProdutos.get(i).getProNome());
        }
    }

    private void carregarVendas() {
        DefaultTableModel modelo = (DefaultTableModel) jtVendas.getModel();
        listaModelVendasClientes = controllerVendasCliente.getListaVendasClienteController();
        int cont = listaModelVendasClientes.size();
        modelo.setNumRows(0);
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelVendasClientes.get(i).getModelVendas().getIdVenda(),
                listaModelVendasClientes.get(i).getModelCliente().getCliNome(),
                listaModelVendasClientes.get(i).getModelVendas().getVenDataVenda()
            });
        }
    }

    private void somarValorTotalProdutos() {
        double soma = 0, valor;
        int cont = jtProdutosVenda.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = (double) jtProdutosVenda.getValueAt(i, 4);
            soma = soma + valor;
        }
        jtfValorTotal.setText(String.valueOf(soma));
        aplicarDescontos();
    }

    private void limparFormulario() {
        jtfQuantidade.setText("");
        jtfDesconto.setText("");
        jtfValorTotal.setText("");
        jtfNumVenda.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jtProdutosVenda.getModel();
        modelo.setNumRows(0);
    }

    private void preecherCodigoClientePeloCombobox() {
        modelCliente = controllerCliente.getClienteController(jcbNomeCli.getSelectedItem().toString());
        jtfCodigoCli.setText(String.valueOf(modelCliente.getIdCliente()));
    }

    private void preecherCodigoProdutoPeloCombobox() {
        modelProdutos = controllerProdutos.retornarProdutoController(jcbNomeProduto.getSelectedItem().toString());
        jtfCodigoProduto.setText(String.valueOf(modelProdutos.getIdProduto()));
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
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendas().setVisible(true);
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
    
    private void alinharTabela(){
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        jtProdutosVenda.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        jtProdutosVenda.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        jtProdutosVenda.getColumnModel().getColumn(2).setCellRenderer(centralizado);
        jtProdutosVenda.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        jtProdutosVenda.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        
        jtVendas.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        jtVendas.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        jtVendas.getColumnModel().getColumn(2).setCellRenderer(centralizado);
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbRemoverProdutos;
    private javax.swing.JButton jbSalvar;
    private componentes.UJComboBox jcbNomeCli;
    private componentes.UJComboBox jcbNomeProduto;
    private javax.swing.JTable jtProdutosVenda;
    private javax.swing.JTable jtVendas;
    private javax.swing.JTextField jtfCodigoCli;
    private javax.swing.JTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfNumVenda;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfQuantidade;
    private javax.swing.JTextField jtfValorTotal;
    private javax.swing.JPanel painelTarefas;
    // End of variables declaration//GEN-END:variables
}
