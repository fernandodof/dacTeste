/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.telas;

import br.edu.ifpb.dac.beans.Fornecedor;
import br.edu.ifpb.dac.beans.Material;
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
import javax.swing.JTextField;

/**
 *
 * @author Fernando
 */
public class PanelCadastrarMaterial extends javax.swing.JPanel {

    private Gerenciador gerenciador = Gerenciador.getInstance();
    private TrataBotao tb;
    private JDialog parent;
    private List<JTextField> textFields = new ArrayList();
    private List<Component> components;

    /**
     * Creates new form PanelCadastrarMaterial
     */
    public PanelCadastrarMaterial() {
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

        painelMaior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldDescricao = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelMaior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        painelMaior.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 21, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Descrição:");
        painelMaior.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, -1, -1));

        fieldDescricao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fieldDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldDescricaoActionPerformed(evt);
            }
        });
        painelMaior.add(fieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 21, 490, -1));

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });
        painelMaior.add(btCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        add(painelMaior, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 60, 590, 690));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Novo Material");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldDescricaoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JTextField fieldDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painelMaior;
    // End of variables declaration//GEN-END:variables

    private class TrataBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btCadastrar)) {
                try {
                    if (fieldDescricao.getText() == null || fieldDescricao.getText().isEmpty()) {
                        throw new ErroAconteceuException("Por favor, Informe a descrição do material");
                    }

                    //Criando objeto material
                    Material material = new Material(fieldDescricao.getText());

                    //Salvando material
                    if (gerenciador.save(material)) {
                        JOptionPane jOptionPane = new JOptionPane("Material cadastrado com sucesso");
                        parent = jOptionPane.createDialog("Sucesso");
                        parent.setVisible(true);
                        for (JTextField jTextField : textFields) {
                            jTextField.setText("");
                        }
                    } else {
                        JOptionPane jOptionPane = new JOptionPane("Novo Material não pôde ser cadastrado");
                        parent = jOptionPane.createDialog("Erro");
                        parent.setVisible(true);
                    }
                } catch (ErroAconteceuException ex) {
                    JOptionPane jOptionPane = new JOptionPane(ex.getMessage(), JOptionPane.WARNING_MESSAGE);
                    parent = jOptionPane.createDialog("Erro");
                    parent.setVisible(true);
                }

            }
        }

    }

}
