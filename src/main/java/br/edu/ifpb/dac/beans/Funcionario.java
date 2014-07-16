/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Fernando
 */
@Entity
@NamedQueries({
    @NamedQuery(name="Funcionario.login", query = "SELECT f FROM Funcionario f WHERE f.login = :login AND f.senha = :senha")})
public class Funcionario extends Pessoa implements Serializable {
    @Column(unique = true)
    private String login;
    private String senha;
    private double slaraio;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Venda> vendas;

    public Funcionario() {
        super();
    }

    public Funcionario(String login, String senha, String cpf, String nome, Sexo sexo) {
        super(cpf, nome, sexo);
        this.login = login;
        this.senha = senha;
        this.vendas = new ArrayList();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSlaraio() {
        return slaraio;
    }

    public void setSlaraio(double slaraio) {
        this.slaraio = slaraio;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public void addVenda(Venda venda){
        this.vendas.add(venda);
    }
    
    public void removeVenda(Venda venda){
        this.vendas.remove(venda);
    }
}
