/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "seq_produto", sequenceName = "sequencia_produto", allocationSize = 1, initialValue = 1)
@NamedQueries({
    @NamedQuery(name="Produto.findByCodigo", query = "SELECT p FROM Produto p WHERE p.codigo=:codigo"),
    @NamedQuery(name = "Produto.findbyDescricao", query = "SELECT p FROM Produto p WHERE p.descricao=:descricao")})
public class Produto implements Serializable {
    @Id
    @GeneratedValue(generator = "seq_produto", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String codigo;
    private int quantidade;
    private String descricao;
    private int tamanho;
    private double valor;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Material> materiais = new ArrayList();
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Fornecedor fornecedor;
    private String marca;
    @Basic(fetch = FetchType.LAZY)
    @Lob
    private byte[] imagem;
    
    public Produto() {
    }

    public Produto(String codigo, int quantidade, String descricao, int tamanho, double valor, Fornecedor fornecedor, String marca) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.valor = valor;
        this.fornecedor = fornecedor;
        this.marca = marca;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }
    
    public void addMeterial(Material material){
        this.materiais.add(material);
    }
    
    public void addMateriais(List<Material> materiais){
        this.materiais.addAll(materiais);
    }
   
}
