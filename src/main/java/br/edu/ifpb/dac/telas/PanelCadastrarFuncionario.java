/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.telas;

import br.edu.ifpb.dac.beans.Endereco;
import br.edu.ifpb.dac.beans.Funcionario;
import br.edu.ifpb.dac.beans.Pessoa;
import br.edu.ifpb.dac.exceptions.ErroAconteceuException;
import br.edu.ifpb.dac.gerenciador.Gerenciador;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class PanelCadastrarFuncionario extends javax.swing.JPanel {

    private Gerenciador gerenciador = Gerenciador.getInstance();
    private TrataBotao tb;
    private JDialog parent;
    private List<JTextField> textFields = new ArrayList();
    private List<Component> components;

    /**
     * Creates new form PanelCadastrarFuncionario
     */
    public PanelCadastrarFuncionario() {
        initComponents();
        this.tb = new TrataBotao();
        this.btCadastrar.addActionListener(tb);
        parent = (JDialog) this.getParent();
        components = Arrays.asList(painelMaior.getComponents());
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
        jLabel1 = new javax.swing.JLabel();
        painelMaior = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        radioMasculino = new javax.swing.JRadioButton();
        radioFeminino = new javax.swing.JRadioButton();
        radioOutro = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        fieldLogin = new javax.swing.JTextField();
        fieldSenha1 = new javax.swing.JPasswordField();
        fieldSenha2 = new javax.swing.JPasswordField();
        fieldSalario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        fieldNumero = new javax.swing.JTextField();
        fieldBairro = new javax.swing.JTextField();
        fieldCidade = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fieldCep = new javax.swing.JFormattedTextField();
        fieldRua = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        fieldCpf = new javax.swing.JFormattedTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Novo Funcionário");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");

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
        jLabel6.setText("Informações do novo funcionário");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Salário R$");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Login:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Senha: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Confirme a Senha:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Informações de Login");

        fieldLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldSenha1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldSenha2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldSalario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Endereço");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Bairro:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Rua:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("CEP:");

        fieldNumero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldBairro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fieldCidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Número:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Cidade:");

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
                    .addComponent(jSeparator2)
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaiorLayout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(32, 32, 32)))
                                .addGap(10, 10, 10)
                                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldCidade)))
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addGap(28, 28, 28)
                                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldBairro)
                                    .addComponent(fieldRua))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelMaiorLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelMaiorLayout.createSequentialGroup()
                                        .addComponent(radioFeminino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioOutro))
                                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btCadastrar)
                                .addGroup(painelMaiorLayout.createSequentialGroup()
                                    .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(painelMaiorLayout.createSequentialGroup()
                                            .addComponent(fieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(fieldSenha2))
                                        .addComponent(fieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioOutro)
                        .addComponent(radioMasculino)
                        .addComponent(radioFeminino))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMaiorLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(15, 15, 15)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(fieldCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(fieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(painelMaiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(fieldSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(fieldSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(fieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        add(painelMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 690));
    }// </editor-fold>//GEN-END:initComponents

    private void radioOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOutroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioOutroActionPerformed

    private void radioFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemininoActionPerformed

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void fieldRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JTextField fieldBairro;
    private javax.swing.JFormattedTextField fieldCep;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JFormattedTextField fieldCpf;
    private javax.swing.JTextField fieldLogin;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldNumero;
    private javax.swing.JTextField fieldRua;
    private javax.swing.JTextField fieldSalario;
    private javax.swing.JPasswordField fieldSenha1;
    private javax.swing.JPasswordField fieldSenha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
                        throw new ErroAconteceuException("Por favor, informe o nome do funcionário");
                    } else if (fieldCpf.getText().trim().length() < 14) {
                        throw new ErroAconteceuException("Por favor, informe o CPF do funcionário");
                    } else if (!radioMasculino.isSelected() && !radioFeminino.isSelected() && !radioOutro.isSelected()) {
                        throw new ErroAconteceuException("Por favor, Selecione o Sexo do funcionário");
                    } else if (fieldSalario.getText() == null || fieldSalario.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe o Salário do funcionário");
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
                    } else if (fieldLogin.getText() == null || fieldLogin.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe o login do funcionário");
                    } else if (fieldSenha1.getPassword() == null || new String(fieldSenha1.getPassword()).isEmpty()
                            || fieldSenha2.getPassword() == null || new String(fieldSenha2.getPassword()).isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe ambas as senhas para o funcionário");
                    } else if (!new String(fieldSenha1.getPassword()).equals(new String(fieldSenha2.getPassword()))) {
                        throw new ErroAconteceuException("Senhas Informadas não conferem");
                    }

                    String salarioInformado = fieldSalario.getText();
                    salarioInformado = salarioInformado.replace(",", ".");
                    double salario = Double.parseDouble(salarioInformado);
                    if (salario <= 0) {
                        throw new ErroAconteceuException("Informe apenas valores mairoes que 0, para o campo salário");
                    }

                    //Crando objeto, endereço para o funcionário e informando atributos
                    Endereco endereco = new Endereco();
                    endereco.setRua(fieldRua.getText());
                    endereco.setBairro(fieldBairro.getText());
                    endereco.setNumero(Integer.parseInt(fieldNumero.getText()));
                    endereco.setCidade(fieldCidade.getText());
                    endereco.setCep(fieldCep.getText());

                    //Criando objeto funcionário e informando atributos
                    Funcionario funcionario = new Funcionario();
                    funcionario.setEndereco(endereco);
                    funcionario.setNome(fieldNome.getText());
                    funcionario.setCpf(fieldCpf.getText());
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
                    funcionario.setSexo(sexo);
                    funcionario.setSlaraio(salario);
                    funcionario.setLogin(fieldLogin.getText());
                    funcionario.setSenha(new String(fieldSenha1.getPassword()));

                    //Salvar funcionário
                    if (gerenciador.save(funcionario)) {
                        JOptionPane jOptionPane = new JOptionPane("Funcionário cadastrado com sucesso");
                        parent = jOptionPane.createDialog("Sucesso");
                        parent.setVisible(true);
                        for (JTextField jTextField : textFields) {
                            jTextField.setText("");
                        }
                    } else {
                        JOptionPane jOptionPane = new JOptionPane("Novo Funcionário não pôde ser cadastrado");
                        parent = jOptionPane.createDialog("Erro");
                        parent.setVisible(true);
                    }
                } catch (ErroAconteceuException ex) {
                    JOptionPane jOptionPane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                } catch (NumberFormatException ex) {
                    JOptionPane jOptionPane = new JOptionPane("Salário informado não aceito, informe apenas numeros, virgula ou ponto", JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                }
            }
        }

    }

}
