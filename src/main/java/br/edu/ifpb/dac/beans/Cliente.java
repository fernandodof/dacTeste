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
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
    @NamedQuery(name="Cliente.findByCPF", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf")})
public class Cliente extends Pessoa implements Serializable {

    private String email;
    @Enumerated(EnumType.STRING)
    private Situacao situacao;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Venda> compras;

    public enum Situacao {
        Normal,
        Inadimplente,
        Inativo
    }

    public Cliente() {
    }

    public Cliente(String cpf, String nome, String email, Sexo sexo) {
        super(cpf, nome, sexo);
        this.email = email;
        this.compras = new ArrayList();
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void addCompra(Venda compra){
        this.compras.add(compra);
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public List<Venda> getCompras() {
        return compras;
    }

    public void setCompras(List<Venda> compras) {
        this.compras = compras;
    }
    
}
