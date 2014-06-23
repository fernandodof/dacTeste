/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.telas;

import br.edu.ifpb.dac.beans.Cliente;
import br.edu.ifpb.dac.beans.Endereco;
import br.edu.ifpb.dac.beans.Pessoa;
import br.edu.ifpb.dac.exceptions.ErroAconteceuException;
import br.edu.ifpb.dac.gerenciador.Gerenciador;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.NoResultException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class PainelBuscarCliente extends javax.swing.JPanel {

    private Gerenciador gerenciador = Gerenciador.getInstance();
    private TrataBotao tb;
    private JDialog parent;
    private List<JTextField> textFields = new ArrayList();
    private List<Component> components;
    private Cliente cliente;

    /**
     * Creates new form PainelBuscarCliente
     */
    public PainelBuscarCliente() {
        initComponents();
        painelFormulario.setVisible(false);
        this.tb = new TrataBotao();
        this.btEditarCliente.addActionListener(tb);
        this.btBuscarCliente.addActionListener(tb);
        this.btSalvar.addActionListener(tb);
        parent = (JDialog) this.getParent();
        components = Arrays.asList(painelFormulario.getComponents());
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

        sexo = new javax.swing.ButtonGroup();
        painelMaior = new javax.swing.JPanel();
        painelFormulario = new javax.swing.JPanel();
        btEditarCliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldEmail = new javax.swing.JTextField();
        radioMasculino = new javax.swing.JRadioButton();
        radioFeminino = new javax.swing.JRadioButton();
        radioOutro = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fieldCep = new javax.swing.JFormattedTextField();
        fieldRua = new javax.swing.JTextField();
        fieldBairro = new javax.swing.JTextField();
        fieldNumero = new javax.swing.JTextField();
        fieldCidade = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbSituacao = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        fieldCpf = new javax.swing.JFormattedTextField();
        btBuscarCliente = new javax.swing.JButton();
        lbRealizarVenda = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEditarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditarCliente.setText("Editar");
        btEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Email: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sexo: ");

        fieldNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        fieldEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sexo.add(radioMasculino);
        radioMasculino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioMasculino.setText("Masculino");

        sexo.add(radioFeminino);
        radioFeminino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioFeminino.setText("Feminino");
        radioFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemininoActionPerformed(evt);
            }
        });

        sexo.add(radioOutro);
        radioOutro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radioOutro.setText("Outro");
        radioOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOutroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Informações Pessais");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("Endereço");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Rua:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Bairro:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Cidade:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Número:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("CEP:");

        try {
            fieldCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldCep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldRua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRuaActionPerformed(evt);
            }
        });

        fieldBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btSalvar.setText("Salvar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Situaçao:");

        cbSituacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Inadimplente" }));

        javax.swing.GroupLayout painelFormularioLayout = new javax.swing.GroupLayout(painelFormulario);
        painelFormulario.setLayout(painelFormularioLayout);
        painelFormularioLayout.setHorizontalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createSequentialGroup()
                                        .addComponent(radioFeminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioOutro))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btEditarCliente)
                                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(23, 23, 23))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(267, 267, 267))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormularioLayout.createSequentialGroup()
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormularioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSalvar))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createSequentialGroup()
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addGap(10, 10, 10)
                                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldBairro)
                                    .addComponent(fieldNumero)
                                    .addGroup(painelFormularioLayout.createSequentialGroup()
                                        .addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(fieldRua)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormularioLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(fieldCidade)))
                        .addGap(22, 22, 22))
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelFormularioLayout.setVerticalGroup(
            painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormularioLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btEditarCliente))
                .addGap(18, 18, 18)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioMasculino)
                    .addComponent(radioOutro)
                    .addComponent(radioFeminino))
                .addGap(8, 8, 8)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormularioLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CPF do Cliente:");

        try {
            fieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btBuscarCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btBuscarCliente.setText("Buscar Cliente");

        javax.swing.GroupLayout painelMaiorLayout = new javax.swing.GroupLayout(painelMaior);
        painelMaior.setLayout(painelMaiorLayout);
        painelMaiorLayout.setHorizontalGroup(
            painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaiorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBuscarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelMaiorLayout.setVerticalGroup(
            painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        add(painelMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 61, 620, 750));

        lbRealizarVenda.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbRealizarVenda.setForeground(new java.awt.Color(0, 0, 204));
        lbRealizarVenda.setText("Buscar Clente");
        add(lbRealizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void radioFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemininoActionPerformed

    private void radioOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOutroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOutroActionPerformed

    private void fieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRuaActionPerformed

    private void btEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarCliente;
    private javax.swing.JButton btEditarCliente;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox cbSituacao;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JFormattedTextField fieldCep;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JFormattedTextField fieldCpf;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldRua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbRealizarVenda;
    private javax.swing.JPanel painelFormulario;
    private javax.swing.JPanel painelMaior;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JRadioButton radioOutro;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables
    private class TrataBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btBuscarCliente)) {
                try {
                    if (fieldCpf.getText().length() < 14) {
                        throw new ErroAconteceuException("Por favor, Informe um CPF válido");
                    }
                    Map<String, String> parametros = new HashMap();
                    parametros.put("cpf", fieldCpf.getText());
                    cliente = (Cliente) gerenciador.getSingleResultOfNamedQuery("Cliente.findByCPF", parametros);
                    painelFormulario.setVisible(true);
                    fieldNome.setText(cliente.getNome());
                    fieldEmail.setText(cliente.getEmail());
                    if (cliente.getSexo().equals(Pessoa.Sexo.Feminino)) {
                        radioFeminino.setSelected(true);
                    } else if (cliente.getSexo().equals(Pessoa.Sexo.Masculino)) {
                        radioMasculino.setSelected(true);
                    } else {
                        radioOutro.setSelected(true);
                    }

                    if (cliente.getSituacao().equals(Cliente.Situacao.Normal)) {
                        cbSituacao.setSelectedIndex(0);
                    } else {
                        cbSituacao.setSelectedIndex(1);
                    }
                    
                    fieldRua.setText(cliente.getEndereco().getRua());
                    fieldBairro.setText(cliente.getEndereco().getBairro());
                    fieldNumero.setText(String.valueOf(cliente.getEndereco().getNumero()));
                    fieldCidade.setText(cliente.getEndereco().getCidade());
                    fieldCep.setText(cliente.getEndereco().getCep());

                    for (JTextField jTextField : textFields) {
                        jTextField.setEditable(false);
                        jTextField.setBackground(new Color(216, 216, 216));
                    }
                    cbSituacao.setEnabled(false);
                    radioFeminino.setEnabled(false);
                    radioMasculino.setEnabled(false);
                    radioOutro.setEnabled(false);
                    btSalvar.setEnabled(false);
                } catch (ErroAconteceuException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                } catch (NoResultException ex) {
                    JOptionPane.showMessageDialog(null, "Cliente com cpf informado não encontrado");
                }
            } else if (e.getSource().equals(btEditarCliente)) {
                for (JTextField jTextField : textFields) {
                    jTextField.setEditable(true);
                    jTextField.setBackground(Color.WHITE);
                }
                cbSituacao.setEnabled(true);
                radioFeminino.setEnabled(true);
                radioMasculino.setEnabled(true);
                radioOutro.setEnabled(true);
                btSalvar.setEnabled(true);
            } else if (e.getSource().equals(btSalvar)) {
                try {
                    if (fieldNome.getText() == null || fieldNome.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe o nome do cliente");
                    } else if (fieldEmail.getText() == null || fieldEmail.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe o email do cliente");
                    } else if (fieldCpf.getText().trim().length() < 14) {
                        throw new ErroAconteceuException("Por favor, informe o CPF do cliente");
                    } else if (!radioMasculino.isSelected() && !radioFeminino.isSelected() && !radioOutro.isSelected()) {
                        throw new ErroAconteceuException("Por favor, Selecione o Sexo do cliente");
                    } else if (fieldRua.getText() == null || fieldRua.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe a Rua do cliente");
                    } else if (fieldBairro.getText() == null || fieldBairro.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe o Bairro do cliente");
                    } else if (fieldNumero.getText() == null | fieldNumero.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe o Número do endereço do cliente");
                    } else if (fieldCidade.getText() == null || fieldCidade.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe a Cidade do cliente");
                    } else if (fieldCep.getText().trim().length() < 9) {
                        throw new ErroAconteceuException("Por favor, informe o Cep do cliente");
                    }

                    //Iformando atributos para endereço do cliente e informando atributos
                    Endereco endereco = cliente.getEndereco();
                    endereco.setRua(fieldRua.getText());
                    endereco.setBairro(fieldBairro.getText());
                    endereco.setNumero(Integer.parseInt(fieldNumero.getText()));
                    endereco.setCidade(fieldCidade.getText());
                    endereco.setCep(fieldCep.getText());

                    //Alterando o endereço do cliente
                    cliente.setEndereco(endereco);
                    cliente.setNome(fieldNome.getText());
                    cliente.setEmail(fieldEmail.getText());
                    cliente.setCpf(fieldCpf.getText());
                    cliente.setSituacao(Cliente.Situacao.Normal);

                    //Verificando botão de rádio para o cliente
                    Pessoa.Sexo sexo;
                    if (radioMasculino.isSelected()) {
                        sexo = Pessoa.Sexo.Masculino;
                    } else if (radioFeminino.isSelected()) {
                        sexo = Pessoa.Sexo.Feminino;
                    } else if (radioOutro.isSelected()) {
                        sexo = Pessoa.Sexo.Outro;
                    } else {
                        throw new ErroAconteceuException("Por favor, Selecione o Sexo do cliente");
                    }
                    //Definindo botao de radio escolhido
                    cliente.setSexo(sexo);
                    //Salvando cliente
                    if (gerenciador.update(cliente)) {
                        JOptionPane jOptionPane = new JOptionPane("Cliente atualizado com sucesso");
                        parent = jOptionPane.createDialog("Sucesso");
                        parent.setVisible(true);
                        for (JTextField jTextField : textFields) {
                            jTextField.setText("");
                        }
                        painelFormulario.setVisible(false);
                        fieldCpf.setText("");
                    } else {
                        JOptionPane jOptionPane = new JOptionPane("Novo cliente não pode ser atualizado");
                        parent = jOptionPane.createDialog("Erro");
                        parent.setVisible(true);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane jOptionPane = new JOptionPane("Informe apenas algarismos para o campo número", JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                } catch (ErroAconteceuException ex) {
                    JOptionPane jOptionPane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                } catch (Exception ex) {
                    JOptionPane jOptionPane = new JOptionPane("Cliente não pode ser atualizado");
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                }
            }

        }

    }
}
