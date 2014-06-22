/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "seq_venda", sequenceName = "sequencia_venda", allocationSize = 1, initialValue = 1)
@NamedQueries({
    @NamedQuery(name="Vendas.findUltimasVendas", query = "SELECT V FROM Venda V ORDER BY v.data DESC")})
public class Venda implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_venda", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date data;
    private Double valor = 0.0;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ItemVenda> itensVenda = new ArrayList();

    public Venda() {
    }

    public Venda(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    
    public void addItemVenda(ItemVenda itemVenda) {
        this.valor += itemVenda.getValor();
        this.itensVenda.add(itemVenda);
    }

    public boolean removeIntemVenda(Long idProduto) {
        for (ItemVenda itemVenda : itensVenda) {
            if (Objects.equals(itemVenda.getIdProduto(), idProduto)) {
                this.itensVenda.remove(itemVenda);
                this.valor -= itemVenda.getValor();
                return true;
            }
        }
        if (itensVenda.isEmpty()) {
            this.valor = 0.0;
        }
        return false;
    }
   
    public void addVariosItens(List<ItemVenda> itens){
        for (ItemVenda itemVenda : itens) {
            this.valor += itemVenda.getValor();
        }
        this.itensVenda.addAll(itens);
    }
}
