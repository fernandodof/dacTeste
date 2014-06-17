/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Fernando
 */
@MappedSuperclass
@SequenceGenerator(name = "seq_pessoa", sequenceName = "sequencia_pessoa", allocationSize = 1, initialValue = 1)
public abstract class Pessoa {
    @Id
    @GeneratedValue(generator = "seq_pessoa", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private String nome;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Endereco endereco;
    
    public enum Sexo{
        Masculino,
        Feminino,
        Outro
    }
    
    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, Sexo sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
}
