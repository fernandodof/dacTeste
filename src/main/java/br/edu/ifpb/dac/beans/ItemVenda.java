/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.beans;

import br.edu.ifpb.dac.PK.ItemVendaPK;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;

/**
 *
 * @author Fernando
 */
@Entity
@NamedQueries({
    @NamedQuery(name="ItemVenda.IdVenda", query = "SELECT DISTINCT I.id.idVenda FROM ItemVenda I WHERE I.id.idProduto =:idProduto")})
public class ItemVenda implements Serializable {

    @EmbeddedId
    private ItemVendaPK id;
    private double valor = 0.0;
    private int quantidade;
    @Transient
    private long idProduto;

    public ItemVenda() {
    }

    public ItemVenda(Long idProduto, double valorUnitario, int quantidade) {
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.valor = valorUnitario * quantidade;
    }

    public ItemVendaPK getId() {
        return id;
    }

    public void setId(Long idVenda) {
        this.id = new ItemVendaPK(this.idProduto,idVenda);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }
   
}
