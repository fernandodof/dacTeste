/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.telas;

import br.edu.ifpb.dac.beans.Cliente;
import br.edu.ifpb.dac.beans.Fornecedor;
import br.edu.ifpb.dac.beans.Material;
import br.edu.ifpb.dac.beans.Produto;
import br.edu.ifpb.dac.exceptions.ErroAconteceuException;
import br.edu.ifpb.dac.executaImagem.CarregaArquivo;
import br.edu.ifpb.dac.gerenciador.Gerenciador;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.NoResultException;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Fernando
 */
public class PainelBuscarProduto extends javax.swing.JPanel {

    private Gerenciador gerenciador = Gerenciador.getInstance();
    private TrataBotao tb;
    private JDialog parent;
    private List<JTextField> textFields = new ArrayList();
    private List<Component> components;
    private Produto produto;
    private List<Material> materiais = gerenciador.getListResultOfNamedQuery("Material.findAll");
    private List<Fornecedor> fornecedores = gerenciador.getListResultOfNamedQuery("Fornecedor.findAll");

    /**
     * Creates new form PainelBuscarPridutos
     */
    public PainelBuscarProduto() {
        initComponents();
        painelFormulario.setVisible(false);
        this.tb = new TrataBotao();
        this.btBuscarProdito.addActionListener(tb);
        this.btEditarProduto.addActionListener(tb);
        this.btSalvar.addActionListener(tb);
        parent = (JDialog) this.getParent();
        components = Arrays.asList(painelFormulario.getComponents());

        for (Fornecedor fornecedor : fornecedores) {
            this.comboBoxFornecedores.addItem(fornecedor);
        }

        for (Component component : components) {
            if (component instanceof JTextField) {
                textFields.add((JTextField) component);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        painelFormulario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldMarca = new javax.swing.JTextField();
        Tamamnho = new javax.swing.JLabel();
        fieldQuantidade = new javax.swing.JTextField();
        fieldTamanho = new javax.swing.JFormattedTextField();
        Tamamnho2 = new javax.swing.JLabel();
        Tamamnho3 = new javax.swing.JLabel();
        fieldValor = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboBoxFornecedores = new javax.swing.JComboBox();
        lbImagemProduto = new javax.swing.JLabel();
        btEditarProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        btBuscarProdito = new javax.swing.JButton();
        lbBuscarCliente = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Quantidade disponível:");
        painelFormulario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");
        painelFormulario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        fieldNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });
        painelFormulario.add(fieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 510, -1));

        fieldMarca.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldMarcaActionPerformed(evt);
            }
        });
        painelFormulario.add(fieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 190, -1));

        Tamamnho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tamamnho.setText("Marca:");
        painelFormulario.add(Tamamnho, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        fieldQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldQuantidadeActionPerformed(evt);
            }
        });
        painelFormulario.add(fieldQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, -1));

        fieldTamanho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        painelFormulario.add(fieldTamanho, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 40, -1));

        Tamamnho2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tamamnho2.setText("Valor R$");
        painelFormulario.add(Tamamnho2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        Tamamnho3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Tamamnho3.setText("Tamanho:");
        painelFormulario.add(Tamamnho3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        fieldValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldValorActionPerformed(evt);
            }
        });
        painelFormulario.add(fieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 100, -1));

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        painelFormulario.add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fornecedor:");
        painelFormulario.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        comboBoxFornecedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comboBoxFornecedores.setToolTipText("");
        painelFormulario.add(comboBoxFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 480, -1));
        painelFormulario.add(lbImagemProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 470, 370));

        btEditarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditarProduto.setText("Editar");
        btEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarProdutoActionPerformed(evt);
            }
        });
        painelFormulario.add(btEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Marca:");
        painelFormulario.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jPanel1.add(painelFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 587, 720));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Código:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        fieldCodigo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(fieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 180, -1));

        btBuscarProdito.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscarProdito.setText("Buscar");
        jPanel1.add(btBuscarProdito, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        lbBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbBuscarCliente.setForeground(new java.awt.Color(0, 0, 204));
        lbBuscarCliente.setText("Buscar Clente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbBuscarCliente)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbBuscarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void fieldMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldMarcaActionPerformed

    private void fieldQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldQuantidadeActionPerformed

    private void fieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCodigoActionPerformed

    private void fieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldValorActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tamamnho;
    private javax.swing.JLabel Tamamnho2;
    private javax.swing.JLabel Tamamnho3;
    private javax.swing.JButton btBuscarProdito;
    private javax.swing.JButton btEditarProduto;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox comboBoxFornecedores;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fieldMarca;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldQuantidade;
    private javax.swing.JFormattedTextField fieldTamanho;
    private javax.swing.JTextField fieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBuscarCliente;
    private javax.swing.JLabel lbImagemProduto;
    private javax.swing.JPanel painelFormulario;
    // End of variables declaration//GEN-END:variables
    private class TrataBotao implements ActionListener {

        private String caminhoArquivo;

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btBuscarProdito)) {
                try {
                    if (fieldCodigo.getText() == null || fieldCodigo.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe um CPF válido");
                    }
                    Map<String, String> parametros = new HashMap();
                    parametros.put("codigo", fieldCodigo.getText());
                    produto = (Produto) gerenciador.getSingleResultOfNamedQuery("Produto.findByCodigo", parametros);
                    painelFormulario.setVisible(true);

                    fieldNome.setText(produto.getDescricao());
                    fieldQuantidade.setText(String.valueOf(produto.getQuantidade()));
                    fieldMarca.setText(produto.getMarca());
                    fieldTamanho.setText(String.valueOf(produto.getTamanho()));
                    fieldValor.setText(String.valueOf(produto.getValor()));
                    comboBoxFornecedores.setSelectedItem(produto.getFornecedor());
                    lbImagemProduto.setIcon(new ImageIcon(produto.getImagem()));

                    for (JTextField jTextField : textFields) {
                        jTextField.setEditable(false);
                        jTextField.setBackground(new Color(216, 216, 216));
                    }
                    comboBoxFornecedores.setEnabled(false);
                    btSalvar.setEnabled(false);
                } catch (ErroAconteceuException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (NoResultException ex) {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado");
                }
            } else if (e.getSource().equals(btEditarProduto)) {
                for (JTextField jTextField : textFields) {
                    jTextField.setEditable(true);
                    jTextField.setBackground(Color.WHITE);
                }
                comboBoxFornecedores.setEnabled(true);
                btSalvar.setEnabled(true);
            } else if (e.getSource().equals(btSalvar)) {
                try {
                    if (fieldNome.getText() == null || fieldNome.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Infomrme o Nome do Produto");
                    } else if (fieldCodigo.getText() == null || fieldCodigo.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe o Código do Produto");
                    } else if (fieldQuantidade.getText() == null || fieldQuantidade.getText().isEmpty()
                            || !this.verificaNumeros(fieldQuantidade.getText())) {
                        throw new ErroAconteceuException("Por favor, Informe uma quantidade válida para o produto");
                    } else if (fieldTamanho.getText() == null || fieldTamanho.getText().isEmpty()
                            || !this.verificaNumeros(fieldTamanho.getText())) {
                        throw new ErroAconteceuException("Por favor, Informe um  tamanho válido para o produto");
                    } else if (fieldValor.getText() == null || fieldValor.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe valor válido para o produto");
                    } else if (fieldMarca.getText() == null || fieldMarca.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe a marca");
                    }

                    int quantidade = Integer.parseInt(fieldQuantidade.getText());
                    if (quantidade < 0) {
                        throw new ErroAconteceuException("Por favor, Informe uma quantidade válida para o produto");
                    }

                    int tamanho = Integer.parseInt(fieldTamanho.getText());
                    if (tamanho <= 0) {
                        throw new ErroAconteceuException("Por favor, Informe um  tamanho válido para o produto");
                    }

                    String valorInformado = fieldValor.getText();
                    valorInformado = valorInformado.replace(",", ".");
                    double valor = Double.parseDouble(valorInformado);
                    if (valor <= 0) {
                        throw new ErroAconteceuException("Por favor, Informe valor válido para o produto");
                    }

                    //Alterando Atributos do Objeto
                    produto.setDescricao(fieldNome.getText());
                    produto.setCodigo(fieldCodigo.getText());
                    produto.setQuantidade(quantidade);
                    produto.setTamanho(tamanho);
                    produto.setValor(valor);
                    produto.setMarca(fieldMarca.getText());
                    produto.setFornecedor((Fornecedor) comboBoxFornecedores.getSelectedItem());

                    //Atualizando produto
                    if (gerenciador.update(produto)) {
                        JOptionPane jOptionPane = new JOptionPane("Produto atualizado com sucesso");
                        parent = jOptionPane.createDialog("Sucesso");
                        parent.setVisible(true);
                        for (JTextField jTextField : textFields) {
                            jTextField.setText("");
                        }
                        painelFormulario.setVisible(false);
                        fieldCodigo.setText("");
                    } else {
                        JOptionPane jOptionPane = new JOptionPane("Produto não pôde ser atualizado");
                        parent = jOptionPane.createDialog("Erro");
                        parent.setVisible(true);
                    }
                } catch (ErroAconteceuException ex) {
                    JOptionPane jOptionPane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                } catch (NumberFormatException ex) {
                    JOptionPane jOptionPane = new JOptionPane("Erro ocorrido por favor verifique suas informações", JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                }
            }
        }

        private boolean verificaNumeros(String numero) {
            Pattern pattern = Pattern.compile("^\\d+$");
            Matcher matcher = pattern.matcher(numero);
            return matcher.matches();
        }
    }
}
