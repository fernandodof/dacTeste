/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.telas;

import br.edu.ifpb.dac.PK.ItemVendaPK;
import br.edu.ifpb.dac.beans.Cliente;
import br.edu.ifpb.dac.beans.Funcionario;
import br.edu.ifpb.dac.beans.ItemVenda;
import br.edu.ifpb.dac.beans.Produto;
import br.edu.ifpb.dac.beans.Venda;
import br.edu.ifpb.dac.exceptions.ErroAconteceuException;
import br.edu.ifpb.dac.gerenciador.Gerenciador;
import br.edu.ifpb.dac.temp.ProdutoQuantidadeValor;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.NoResultException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class JanelaRealizarVenda extends java.awt.Dialog {

    private Gerenciador gerenciador = Gerenciador.getInstance();
    private TrataBotao tb;
    private List<JTextField> textFields = new ArrayList();
    private List<Component> components;
    private DefaultTableModel dtm;
    private List<ItemVenda> itensVenda = new ArrayList();
    private double valorVenda = 0.0;
    private DecimalFormat df = new DecimalFormat("#.##");

    /**
     * Creates new form JanelaRealizarVenda
     */
    public JanelaRealizarVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.tb = new TrataBotao();
        this.btBuscar.addActionListener(tb);
        this.btAdicionar.addActionListener(tb);
        this.btRealizarVenda.addActionListener(tb);
        this.btRemoverProduto.addActionListener(tb);
        components = Arrays.asList(painelMaior.getComponents());
        for (Component component : components) {
            if (component instanceof JTextField) {
                textFields.add((JTextField) component);
            }
        }
//        gerenciador.save(venda);
//        lbNumeroVenda.setText("Venda Número: "+String.valueOf(venda.getId()));
        tableaProdutos.getColumnModel().getColumn(0).setPreferredWidth(35);
        tableaProdutos.getColumnModel().getColumn(1).setPreferredWidth(160);
        tableaProdutos.getColumnModel().getColumn(2).setPreferredWidth(35);
        tableaProdutos.getColumnModel().getColumn(3).setPreferredWidth(20);
        tableaProdutos.getColumnModel().getColumn(4).setPreferredWidth(35);
        tableaProdutos.getColumnModel().getColumn(5).setPreferredWidth(35);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelMaior = new javax.swing.JPanel();
        pRemover1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fieldCpf = new javax.swing.JFormattedTextField();
        btBuscar = new javax.swing.JButton();
        lbNomeCliente = new javax.swing.JLabel();
        fieldCodigoProduto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fieldQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbMensagem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableaProdutos = new javax.swing.JTable();
        pRemover2 = new javax.swing.JPanel();
        btRealizarVenda = new javax.swing.JButton();
        btCancelarVenda = new javax.swing.JButton();
        btRemoverProduto = new javax.swing.JButton();
        lbValorTotalVenda = new javax.swing.JLabel();
        lbRealizarVenda = new javax.swing.JLabel();
        pRemover3 = new javax.swing.JPanel();
        lbUltimoProdutoAdicionado = new javax.swing.JLabel();
        lbImagemUltimoprodutoAdicionado = new javax.swing.JLabel();
        lbClienteInadimplente = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CPF do Cliente:");

        try {
            fieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscar.setText("Buscar");

        lbNomeCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fieldCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoProdutoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Código do Produto:");

        fieldQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade:");

        btAdicionar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btAdicionar.setText("Adicionar");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Produto(s):");

        lbMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbMensagem.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pRemover1Layout = new javax.swing.GroupLayout(pRemover1);
        pRemover1.setLayout(pRemover1Layout);
        pRemover1Layout.setHorizontalGroup(
            pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pRemover1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRemover1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAdicionar))
                    .addGroup(pRemover1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbMensagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pRemover1Layout.setVerticalGroup(
            pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRemover1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(fieldQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAdicionar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(fieldCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pRemover1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableaProdutos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Tamanho", "Quantidade", "Valor Unitário", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableaProdutos.setToolTipText("");
        tableaProdutos.setRowHeight(20);
        tableaProdutos.getTableHeader().setReorderingAllowed(false);
        tableaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableaProdutos);

        btRealizarVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRealizarVenda.setText("Realizar Venda");

        btCancelarVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCancelarVenda.setText("Cancelar Venda");
        btCancelarVenda.setToolTipText("");
        btCancelarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarVendaActionPerformed(evt);
            }
        });

        btRemoverProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRemoverProduto.setText("Remover Produto");

        javax.swing.GroupLayout pRemover2Layout = new javax.swing.GroupLayout(pRemover2);
        pRemover2.setLayout(pRemover2Layout);
        pRemover2Layout.setHorizontalGroup(
            pRemover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRemover2Layout.createSequentialGroup()
                .addComponent(btCancelarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(578, Short.MAX_VALUE))
            .addGroup(pRemover2Layout.createSequentialGroup()
                .addComponent(btRemoverProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btRealizarVenda))
        );
        pRemover2Layout.setVerticalGroup(
            pRemover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRemover2Layout.createSequentialGroup()
                .addGroup(pRemover2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemoverProduto)
                    .addComponent(btRealizarVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                .addComponent(btCancelarVenda))
        );

        lbValorTotalVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbValorTotalVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbValorTotalVenda.setText("Valor Total R$ 0.0");
        lbValorTotalVenda.setToolTipText("");

        javax.swing.GroupLayout painelMaiorLayout = new javax.swing.GroupLayout(painelMaior);
        painelMaior.setLayout(painelMaiorLayout);
        painelMaiorLayout.setHorizontalGroup(
            painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaiorLayout.createSequentialGroup()
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbValorTotalVenda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pRemover1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRemover2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        painelMaiorLayout.setVerticalGroup(
            painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pRemover1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValorTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pRemover2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbValorTotalVenda.getAccessibleContext().setAccessibleName("valorTatalVenda");

        jPanel1.add(painelMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 760, 540));

        lbRealizarVenda.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbRealizarVenda.setForeground(new java.awt.Color(0, 0, 204));
        lbRealizarVenda.setText("Realizar Venda");
        jPanel1.add(lbRealizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lbUltimoProdutoAdicionado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pRemover3Layout = new javax.swing.GroupLayout(pRemover3);
        pRemover3.setLayout(pRemover3Layout);
        pRemover3Layout.setHorizontalGroup(
            pRemover3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImagemUltimoprodutoAdicionado, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
            .addComponent(lbUltimoProdutoAdicionado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pRemover3Layout.setVerticalGroup(
            pRemover3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRemover3Layout.createSequentialGroup()
                .addComponent(lbUltimoProdutoAdicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbImagemUltimoprodutoAdicionado, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE))
        );

        jPanel1.add(pRemover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 430, 470));

        lbClienteInadimplente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbClienteInadimplente.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lbClienteInadimplente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 600, 30));

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void fieldCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodigoProdutoActionPerformed

    private void btCancelarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarVendaActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btCancelarVendaActionPerformed

    private void tableaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableaProdutosMouseClicked
        String codigo = (String) dtm.getValueAt(tableaProdutos.getSelectedRow(), 0);
        Map<String, Object> params = new HashMap();
        params.put("codigo", codigo);
        Produto produto = (Produto) gerenciador.getSingleResultOfNamedQuery("Produto.findByCodigo", params);
        lbUltimoProdutoAdicionado.setText("Produto Selecionado");
        lbImagemUltimoprodutoAdicionado.setIcon(new ImageIcon(produto.getImagem()));
    }//GEN-LAST:event_tableaProdutosMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelarVenda;
    private javax.swing.JButton btRealizarVenda;
    private javax.swing.JButton btRemoverProduto;
    private javax.swing.JTextField fieldCodigoProduto;
    private javax.swing.JFormattedTextField fieldCpf;
    private javax.swing.JTextField fieldQuantidade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbClienteInadimplente;
    private javax.swing.JLabel lbImagemUltimoprodutoAdicionado;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbRealizarVenda;
    private javax.swing.JLabel lbUltimoProdutoAdicionado;
    private javax.swing.JLabel lbValorTotalVenda;
    private javax.swing.JPanel pRemover1;
    private javax.swing.JPanel pRemover2;
    private javax.swing.JPanel pRemover3;
    private javax.swing.JPanel painelMaior;
    private javax.swing.JTable tableaProdutos;
    // End of variables declaration//GEN-END:variables
      private class TrataBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btBuscar)) {
                try {
                    if (fieldCpf.getText() == null || fieldCpf.getText().trim().length() < 12) {
                        throw new ErroAconteceuException("Por favor informe um CPF válido");
                    }
                    Map<String, String> parametros = new HashMap();
                    parametros.put("cpf", fieldCpf.getText());
                    Cliente cliente = (Cliente) gerenciador.getSingleResultOfNamedQuery("Cliente.findByCPF", parametros);
                    lbNomeCliente.setText(cliente.getNome());
                    painelMaior.remove(btBuscar);
                    fieldCpf.setEditable(false);
                    fieldCpf.setBackground(Color.lightGray);
                    if(cliente.getSituacao() == Cliente.Situacao.Inadimplente){
                        lbClienteInadimplente.setText("Cliente em situação inadimplente");
                    }
                } catch (ErroAconteceuException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (NoResultException ex) {
                    JOptionPane.showMessageDialog(null, "Cliente com cpf informado não encontrado");
                }
            } else if (e.getSource().equals(btAdicionar)) {
                lbMensagem.setText("");
                try {
                    if (fieldCodigoProduto.getText() == null || fieldCodigoProduto.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor informe o código do produto");
                    } else if (fieldQuantidade.getText() == null || fieldQuantidade.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor informe a quantidade do produto");
                    }

                    int quantidade = Integer.parseInt(fieldQuantidade.getText());

                    Map<String, Object> params = new HashMap();
                    params.put("codigo", fieldCodigoProduto.getText());
                    Produto produto = (Produto) gerenciador.getSingleResultOfNamedQuery("Produto.findByCodigo", params);

                    if (produto.getQuantidade() < quantidade) {
                        throw new ErroAconteceuException("Existem apenas " + produto.getQuantidade() + " unidade(s) no estoque");
                    }
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    ItemVenda itemVenda = new ItemVenda(produto.getId(), produto.getValor(), quantidade);
                    addItemVenda(itemVenda);
                    dtm = (DefaultTableModel) tableaProdutos.getModel();
                    dtm.addRow(new Object[]{produto.getCodigo(), produto.getDescricao(), produto.getTamanho(), quantidade, produto.getValor(), produto.getValor() * quantidade});
                    lbUltimoProdutoAdicionado.setText("Último Produto Adicionado");
                    lbImagemUltimoprodutoAdicionado.setIcon(new ImageIcon(produto.getImagem()));
                    lbValorTotalVenda.setText("Valor Total R$ " + valorVenda);
                } catch (ErroAconteceuException ex) {
                    lbMensagem.setText(ex.getMessage());
                } catch (NumberFormatException ex) {
                    lbMensagem.setText("Por favor informe uma quantidade válida");
                } catch (NoResultException ex) {
                    lbMensagem.setText("Produto não encontrado");
                }
            } else if (e.getSource().equals(btRemoverProduto)) {
                lbMensagem.setText("");
                try {
                    if (tableaProdutos.getSelectedRow() == -1) {
                        throw new ErroAconteceuException("Por favor, selecione um produto a ser removido");
                    } else {
                        String codigo = (String) dtm.getValueAt(tableaProdutos.getSelectedRow(), 0);
                        int quantidade = (int) dtm.getValueAt(tableaProdutos.getSelectedRow(), 3);
                        Map<String, Object> params = new HashMap();
                        params.put("codigo", codigo);
                        Produto produto = (Produto) gerenciador.getSingleResultOfNamedQuery("Produto.findByCodigo", params);
                        produto.setQuantidade(produto.getQuantidade() + quantidade);
                        removeIntemVenda(produto.getId());
                        dtm.removeRow(tableaProdutos.getSelectedRow());
                        fieldCodigoProduto.setText("");
                        fieldQuantidade.setText("");
                        lbValorTotalVenda.setText("Valor Total R$ " + valorVenda);
                        if (itensVenda.isEmpty()) {
                            lbUltimoProdutoAdicionado.setText(null);
                            lbImagemUltimoprodutoAdicionado.setIcon(null);
                        } else {
                            Produto p = (Produto) gerenciador.getById(Produto.class, itensVenda.get(itensVenda.size() - 1).getIdProduto());
                            lbUltimoProdutoAdicionado.setText("Último Produto Adicionado");
                            lbImagemUltimoprodutoAdicionado.setIcon(new ImageIcon(p.getImagem()));
                        }
                    }
                } catch (ErroAconteceuException ex) {
                    lbMensagem.setText(ex.getMessage());
                }
            } else if (e.getSource().equals(btRealizarVenda)) {
                try {
                    if (fieldCpf.getText() == null || fieldCpf.getText().trim().length() < 12) {
                        throw new ErroAconteceuException("Por favor informe o CPF do cliente");
                    } else if (itensVenda.isEmpty()) {
                        throw new ErroAconteceuException("Por favor adicione pelo menos um produto");
                    }
                    Venda venda = new Venda(new Date());
                    gerenciador.save(venda);
                    for (ItemVenda itemVenda : itensVenda) {
                        itemVenda.setId(venda.getId());
                        venda.addItemVenda(itemVenda);
                        Produto produto = (Produto) gerenciador.getById(Produto.class, itemVenda.getIdProduto());
                        gerenciador.update(produto);
                    }
                    gerenciador.update(venda);
                    Funcionario funcionario = gerenciador.getFuncionario();
                    funcionario.addVenda(venda);
                    gerenciador.update(funcionario);

                    Map<String, String> parametros = new HashMap();
                    parametros.put("cpf", fieldCpf.getText());
                    Cliente cliente = (Cliente) gerenciador.getSingleResultOfNamedQuery("Cliente.findByCPF", parametros);
                    cliente.addCompra(venda);
                    gerenciador.update(cliente);
                    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso. Numero da Venda: " + String.valueOf(venda.getId()));
                    setVisible(false);
                    dispose();
                } catch (ErroAconteceuException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        }

        private boolean verificaNumeros(String numero) {
            Pattern pattern = Pattern.compile("^\\d+$");
            Matcher matcher = pattern.matcher(numero);
            return matcher.matches();
        }

    }

    public boolean removeIntemVenda(Long idProduto) {
        for (ItemVenda itemVenda : itensVenda) {
            if (Objects.equals(itemVenda.getIdProduto(), idProduto)) {
                this.itensVenda.remove(itemVenda);
                this.valorVenda -= itemVenda.getValor();
                this.valorVenda = Double.parseDouble(df.format(this.valorVenda));
                return true;
            }
        }
        if (itensVenda.isEmpty()) {
            this.valorVenda = 0.0;
        }
        return false;
    }

    public void addItemVenda(ItemVenda itemVenda) {
        this.valorVenda += itemVenda.getValor();
        this.valorVenda = Double.parseDouble(df.format(this.valorVenda));
        this.itensVenda.add(itemVenda);
    }
}
