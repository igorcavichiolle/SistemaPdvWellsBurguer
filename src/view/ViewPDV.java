package view;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;
import model.ModelVendas;
import model.ModelVendasProdutos;
import util.BLDatas;
import util.BLMascaras;

public class ViewPDV extends javax.swing.JFrame {

    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ModelVendas modelVendas = new ModelVendas();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutoses = new ArrayList<>();
    ModelVendasProdutos modelVendasProdutos1 = new ModelVendasProdutos();
    BLDatas bLDatas = new BLDatas();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    int quantidade;
    private ViewPagamentoPDV viewPagamentoPDV;
    BLMascaras bLMascaras = new BLMascaras();

    public ViewPDV() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/icones/logo_lanche.jpg")).getImage());
        quantidade = 1;
        limparTela();
        jtfCodProduto.requestFocus();
        alinharTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbExcluir = new javax.swing.JPanel();
        labelVendas12 = new javax.swing.JLabel();
        jbQuantidade = new javax.swing.JPanel();
        labelVendas11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtfValorTotal = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JPanel();
        iconVendas8 = new javax.swing.JLabel();
        labelVendas8 = new javax.swing.JLabel();
        jbProdutos = new javax.swing.JPanel();
        iconVendas9 = new javax.swing.JLabel();
        labelVendas9 = new javax.swing.JLabel();
        jbFinalizar = new javax.swing.JPanel();
        iconVendas10 = new javax.swing.JLabel();
        labelVendas10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfValorBruto = new javax.swing.JTextField();
        jtfDesconto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jtfCodProduto = new javax.swing.JFormattedTextField();
        painelTarefas = new javax.swing.JPanel();
        btnFechar = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLabel21.setText("jLabel21");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(174, 232, 56));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbExcluir.setBackground(new java.awt.Color(132, 184, 38));
        jbExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jbExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbExcluirMouseClicked(evt);
            }
        });
        jbExcluir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVendas12.setBackground(new java.awt.Color(171, 219, 82));
        labelVendas12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelVendas12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendas12.setText("Excluir");
        jbExcluir.add(labelVendas12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 28));

        jPanel1.add(jbExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 60, -1));

        jbQuantidade.setBackground(new java.awt.Color(132, 184, 38));
        jbQuantidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jbQuantidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbQuantidadeMouseClicked(evt);
            }
        });
        jbQuantidade.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelVendas11.setBackground(new java.awt.Color(171, 219, 82));
        labelVendas11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelVendas11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelVendas11.setText("Quantidade");
        jbQuantidade.add(labelVendas11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 28));

        jPanel1.add(jbQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 79, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(232, 232, 232));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlStatus.setText("Funcionando");
        jPanel4.add(jlStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 42, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Status:");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Operador:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 11, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Administrador");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 42, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Principal");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Caixa:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 70));

        jPanel5.setBackground(new java.awt.Color(232, 232, 232));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Valor Total:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, 38));

        jtfValorTotal.setEditable(false);
        jtfValorTotal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtfValorTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(jtfValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 120, 30));

        jbCancelar.setBackground(new java.awt.Color(132, 184, 38));
        jbCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jbCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCancelarMouseClicked(evt);
            }
        });
        jbCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconVendas8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconVendas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/cancelar.png"))); // NOI18N
        iconVendas8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCancelar.add(iconVendas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        labelVendas8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVendas8.setText("Cancelar");
        jbCancelar.add(labelVendas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 28));

        jPanel5.add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 120, 50));

        jbProdutos.setBackground(new java.awt.Color(132, 184, 38));
        jbProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbProdutosMouseClicked(evt);
            }
        });
        jbProdutos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconVendas9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconVendas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/login (1).png"))); // NOI18N
        iconVendas9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProdutos.add(iconVendas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        labelVendas9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVendas9.setText("Produtos");
        jbProdutos.add(labelVendas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 28));

        jPanel5.add(jbProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, 50));

        jbFinalizar.setBackground(new java.awt.Color(132, 184, 38));
        jbFinalizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jbFinalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbFinalizarMouseClicked(evt);
            }
        });
        jbFinalizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconVendas10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconVendas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/botoes/login (1).png"))); // NOI18N
        iconVendas10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbFinalizar.add(iconVendas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 30, 28));

        labelVendas10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelVendas10.setText("Finalizar");
        jbFinalizar.add(labelVendas10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 60, 28));

        jPanel5.add(jbFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Valor Bruto:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, 38));

        jtfValorBruto.setEditable(false);
        jtfValorBruto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfValorBruto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(jtfValorBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, -1));

        jtfDesconto.setEditable(false);
        jtfDesconto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jtfDesconto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel5.add(jtfDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Desconto:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 38));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 420, 170));

        jPanel6.setBackground(new java.awt.Color(232, 232, 232));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Comandos");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 145, 45));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Informar Quantidade");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 14));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Cancelar a Venda");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Excluir produto da Tabela de Vendas");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Tabela de produtos");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Finalizar a Venda");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("F3 ");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("F7");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("F5");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("F4");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("F6");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 420, 170));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 440, 500));

        jtProdutos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Cod Iten", "Nome", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setResizable(false);
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(1).setResizable(false);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(2).setResizable(false);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(250);
            jtProdutos.getColumnModel().getColumn(3).setResizable(false);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(35);
            jtProdutos.getColumnModel().getColumn(4).setResizable(false);
            jtProdutos.getColumnModel().getColumn(4).setPreferredWidth(40);
            jtProdutos.getColumnModel().getColumn(5).setResizable(false);
            jtProdutos.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 710, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/logo_capaeditado.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jtfCodProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCodProduto.setSelectionColor(new java.awt.Color(51, 153, 0));
        jtfCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodProdutoKeyPressed(evt);
            }
        });
        jPanel1.add(jtfCodProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 461, 550, 28));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1200, 520));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 1220, 540));

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
        painelTarefas.add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1195, 0, 25, 25));

        getContentPane().add(painelTarefas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 40));

        jMenu4.setText("Comandos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem1.setText("Infomar Quantidade");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem2.setText("Finalizar a Venda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem3.setText("Tabela de Produtos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem4.setText("Excluir Produto da Tabela");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jMenuItem5.setText("Cancelar a Venda");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCancelarMouseClicked
        cancelarMetodo();
    }//GEN-LAST:event_jbCancelarMouseClicked

    private void jbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbProdutosMouseClicked
        
        produtosMetodo();
    }//GEN-LAST:event_jbProdutosMouseClicked

    private void jbFinalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFinalizarMouseClicked
        finalizarMetodo();
        
    }//GEN-LAST:event_jbFinalizarMouseClicked

    private void jbQuantidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbQuantidadeMouseClicked
        quantidadeMetodo();
    }//GEN-LAST:event_jbQuantidadeMouseClicked

    private void jbExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExcluirMouseClicked
        excluirMetodo();
        
    }//GEN-LAST:event_jbExcluirMouseClicked

    private void jtfCodProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodProdutoKeyPressed
        pegarConteudo(evt);
    }//GEN-LAST:event_jtfCodProdutoKeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fechar();
    }//GEN-LAST:event_formWindowClosing

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        fechar();
    }//GEN-LAST:event_btnFecharMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        produtosMetodo();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        quantidadeMetodo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        finalizarMetodo();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        excluirMetodo();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        cancelarMetodo();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }

    private void pegarConteudo(java.awt.event.KeyEvent e) {
        jlStatus.setText("Venda Aberta");
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            try {
                modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodProduto.getText()));
                modelo.addRow(new Object[]{
                    modelo.getRowCount() + 1,
                    modelProdutos.getIdProduto(),
                    modelProdutos.getProNome(),
                    quantidade,
                    modelProdutos.getProValor(),
                    modelProdutos.getProValor() * quantidade
                });
                String convertido = String.valueOf(somaValorTotal());
                jtfValorBruto.setText(convertido);
                jtfCodProduto.setText("");
                quantidade = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Você deve informar apenas numeros neste campo", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private float somaValorTotal() {
        float soma = 0, valor = 0;
        int cont = jtProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Float.parseFloat(String.valueOf(jtProdutos.getValueAt(i, 5)));
            soma += valor;
        }
        return soma;
    }

    private void salvarVenda() {
        int cont;
        int codigoProduto = 0, codigoVenda = 0;
        modelVendas = new ModelVendas();
        modelVendas.setCliente(1);
        try {
            modelVendas.setVenDataVenda(bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            Logger.getLogger(ViewPDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelVendas.setVenValorBruto(Double.parseDouble(jtfValorBruto.getText()));
        modelVendas.setVenDesconto(viewPagamentoPDV.getDesconto());
        modelVendas.setVenValorLiquido(bLMascaras.arredondamentoComPontoDuasCasasFDouble(viewPagamentoPDV.getValorTotal()));
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);
        cont = jtProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            codigoProduto = (int) jtProdutos.getValueAt(i, 1);
            modelVendasProdutos = new ModelVendasProdutos();
            modelProdutos = new ModelProdutos();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVendas(codigoVenda);
            modelVendasProdutos.setVenProValor((double) jtProdutos.getValueAt(i, 4));
            modelVendasProdutos.setNomeProduto(jtProdutos.getValueAt(i, 2).toString());
            modelVendasProdutos.setVenProQuantidade(Integer.parseInt(jtProdutos.getValueAt(i, 3).toString()));
            modelProdutos.setIdProduto(codigoProduto);
            modelProdutos.setProEstoque(controllerProdutos.retornarProdutoController(codigoProduto).getProEstoque()
                    - Integer.parseInt(jtProdutos.getValueAt(i, 3).toString()));
            listaModelVendasProdutoses.add(modelVendasProdutos);
            listaModelProdutos.add(modelProdutos);
        }
        if (controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutoses)) {
            controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
            JOptionPane.showMessageDialog(this, "Salvo com sucesso", "AVISO", JOptionPane.WARNING_MESSAGE);
            limparTela();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao Salvar Produtos da venda", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void imprimirCupom(ArrayList<ModelVendasProdutos> listaModelVendasProdutoses, ModelVendas modelVendas) {
        String dataF = "dd/MM/yyyy";
        String horaF = "H:mm - a";
        String data, hora;
        java.util.Date tempoAtual = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat(dataF);
        data = formata.format(tempoAtual);
        formata = new SimpleDateFormat(horaF);
        hora = formata.format(tempoAtual);

        String conteudoImprimir = "";
        for (int i = 0; i < listaModelVendasProdutoses.size(); i++) {
            conteudoImprimir
                    += +listaModelVendasProdutoses.get(i).getVenProQuantidade() + "    "
                    + listaModelVendasProdutoses.get(i).getVenProValor() + "    "
                    + listaModelVendasProdutoses.get(i).getNomeProduto() + "\n\r";
        }
        this.imprimir("Well's Burger\n\r"
                + "Rua Manoel de Oliveira Azenha,\n\r"
                + "553 Nova Odessa\n\r"
                + "--------------------------------\n\r"
                + "         CUPOM NÃO FISCAL           "
                + "--------------------------------\n\r"
                + "QT   PRECO   DESCRICAO\n\r"
                + conteudoImprimir + ""
                + "--------------------------------\n\r"
                + "VALOR BRUTO: " + modelVendas.getVenValorBruto() + "\n\r"
                + "   DESCONTO: " + modelVendas.getVenDesconto() + "\n\r"
                + "VALOR TOTAL: " + modelVendas.getVenValorLiquido() + "\n\r"
                + "--------------------------------\n\r"
                + data + " - " + hora + "\n\r"
                + "\n\r \n\r"
                + "      OBRIGADO E VOLTE SEMPRE\n\r   "
                + "\n\r \n\r\f"
        );
    }

    public void imprimir(String pTexto) {
        try {
            InputStream prin = new ByteArrayInputStream(pTexto.getBytes());
            DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
            SimpleDoc documentoTexto = new SimpleDoc(prin, docFlavor, null);
            PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();
            PrintRequestAttributeSet printerAttributes = new HashPrintRequestAttributeSet();
            printerAttributes.add(new JobName("Impressao", null));
            printerAttributes.add(OrientationRequested.PORTRAIT);
            printerAttributes.add(MediaSizeName.ISO_A4);
            DocPrintJob printJob = impressora.createPrintJob();
            try {
                printJob.print(documentoTexto, (PrintRequestAttributeSet) printerAttributes);
            } catch (PrintException e) {
                JOptionPane.showMessageDialog(null, "Não foi possivel realizar a impressão!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            prin.close();
        } catch (Exception e) {
        }
    }

    private void limparTela() {
        jtfValorBruto.setText("");
        jtfDesconto.setText("");
        jtfValorTotal.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
        jlStatus.setText("Caixa Livre");
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
        jtProdutos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        jtProdutos.getColumnModel().getColumn(1).setCellRenderer(centralizado);
        jtProdutos.getColumnModel().getColumn(2).setCellRenderer(esquerda);
        jtProdutos.getColumnModel().getColumn(3).setCellRenderer(centralizado);
        jtProdutos.getColumnModel().getColumn(4).setCellRenderer(centralizado);
        jtProdutos.getColumnModel().getColumn(5).setCellRenderer(centralizado);
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel iconVendas10;
    private javax.swing.JLabel iconVendas8;
    private javax.swing.JLabel iconVendas9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jbCancelar;
    private javax.swing.JPanel jbExcluir;
    private javax.swing.JPanel jbFinalizar;
    private javax.swing.JPanel jbProdutos;
    private javax.swing.JPanel jbQuantidade;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JFormattedTextField jtfCodProduto;
    private javax.swing.JTextField jtfDesconto;
    private javax.swing.JTextField jtfValorBruto;
    private javax.swing.JTextField jtfValorTotal;
    private javax.swing.JLabel labelVendas10;
    private javax.swing.JLabel labelVendas11;
    private javax.swing.JLabel labelVendas12;
    private javax.swing.JLabel labelVendas8;
    private javax.swing.JLabel labelVendas9;
    private javax.swing.JPanel painelTarefas;
    // End of variables declaration//GEN-END:variables

    private void quantidadeMetodo() {
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade!"));
    }

    private void finalizarMetodo() {
       try {
            this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
            viewPagamentoPDV.setValorTotal(Float.parseFloat(jtfValorBruto.getText()));
            viewPagamentoPDV.setTextFieldValorTotal();
            viewPagamentoPDV.setVisible(true);

            jtfValorTotal.setText(String.valueOf(viewPagamentoPDV.getValorTotal()));
            jtfDesconto.setText(String.valueOf(viewPagamentoPDV.getDesconto()));

            if (viewPagamentoPDV.isStatusVenda()) {
                salvarVenda();
            } else {
                JOptionPane.showMessageDialog(this, "Pagamento cancelado!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Você deve adicionar incluir um produto!");
        }
    }

    private void produtosMetodo() {
        new ViewTabelaProdutos().setVisible(true);
    }

    private void excluirMetodo() {
        int quantLinha = jtProdutos.getRowCount();
        if (quantLinha < 1) {
            JOptionPane.showMessageDialog(this, "Não existe itens para realizar a exclusão!");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
            int linha = Integer.parseInt((JOptionPane.showInputDialog("Informe o item que deseja excluir")));
            modelo.removeRow(linha - 1);
            String convertido = String.valueOf(somaValorTotal());
            jtfValorBruto.setText(convertido);
            for (int i = 0; i < quantLinha; i++) {
                modelo.setValueAt(i + 1, i, 0);
            }
        }
    }

    private void cancelarMetodo() {
        int intOpcao = JOptionPane.showOptionDialog(null, "Deseja Cancelar a venda?", "Cancelando", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (intOpcao == 0) {
            limparTela();
        } else {
            this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }
        
    }
}
