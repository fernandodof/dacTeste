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
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class PanelCadastrarClientes extends javax.swing.JPanel {

    private Gerenciador gerenciador = Gerenciador.getInstance();
    private TrataBotao tb;
    private JDialog parent;
    private List<JTextField> textFields = new ArrayList();
    private List<Component> components;
    /**
     * Creates new form PanelCadastrarClientes
     */
    public PanelCadastrarClientes() {
        initComponents();
        this.tb = new TrataBotao();
        this.btCadastrar.addActionListener(tb);
        parent = (JDialog) this.getParent();
        components = Arrays.asList(painelMaior.getComponents());
        for (Component component : components) {
            if(component instanceof JTextField){
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
        jLabel1 = new javax.swing.JLabel();
        painelMaior = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        fieldCpf = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Novo Cliente");

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Email: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("CPF: ");

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

        try {
            fieldCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fieldCpf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout painelMaiorLayout = new javax.swing.GroupLayout(painelMaior);
        painelMaior.setLayout(painelMaiorLayout);
        painelMaiorLayout.setHorizontalGroup(
            painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addGap(10, 10, 10)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(fieldRua)
                            .addComponent(fieldBairro)
                            .addComponent(fieldNumero)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaiorLayout.createSequentialGroup()
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addComponent(radioFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioOutro))
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaiorLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaiorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCadastrar))
                    .addComponent(jSeparator1)
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(fieldCidade)))
                .addGap(18, 18, 18))
        );
        painelMaiorLayout.setVerticalGroup(
            painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaiorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(radioMasculino)
                    .addComponent(radioOutro)
                    .addComponent(radioFeminino))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btCadastrar)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(painelMaior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(painelMaior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
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
    private javax.swing.JPanel painelMaior;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JRadioButton radioOutro;
    private javax.swing.ButtonGroup sexo;
    // End of variables declaration//GEN-END:variables

    private class TrataBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btCadastrar)) {
                try {
                    if (fieldNome.getText() == null || fieldNome.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, informe o nome do cliente");
                    } else if ( fieldEmail.getText() == null || fieldEmail.getText().isEmpty()) {
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

                    //Crando objeto, endereço para o cliente e informando atributos
                    Endereco endereco = new Endereco();
                    endereco.setRua(fieldRua.getText());
                    endereco.setBairro(fieldBairro.getText());
                    endereco.setNumero(Integer.parseInt(fieldNumero.getText()));
                    endereco.setCidade(fieldCidade.getText());
                    endereco.setCep(fieldCep.getText());

                    //Criando objeto cliente e informando atributos
                    Cliente cliente = new Cliente();
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
                    //Definido botao escolhido
                    cliente.setSexo(sexo);
                    //Salvando cliente
                    if (gerenciador.save(cliente)) {
                        JOptionPane jOptionPane = new JOptionPane("Cliente cadastrado com sucesso");
                        parent = jOptionPane.createDialog("Sucesso");
                        parent.setVisible(true);
                        for (JTextField jTextField : textFields) {
                            jTextField.setText("");
                        }
                    } else {
                        JOptionPane jOptionPane = new JOptionPane("Novo cliente não pode ser cadastrado");
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
                    JOptionPane jOptionPane = new JOptionPane("Novo cliente não pode ser cadastrado");
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                }
            }
        }

    }

}