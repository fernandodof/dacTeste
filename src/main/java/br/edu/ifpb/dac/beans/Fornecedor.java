/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.beans;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "seq_fornecedor", sequenceName = "sequencia_fornecedor", allocationSize = 1, initialValue = 1)
@NamedQueries({
    @NamedQuery(name= "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name= "Fornecedor.getQuantidade", query = "SELECT count(f) FROM Fornecedor f")})
public class Fornecedor implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_fornecedor", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String cnpj;
    private String nome;

    public Fornecedor() {
    }

    public Fornecedor(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
