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

/**
 *
 * @author Fernando
 */
@Entity
public class ItemVenda implements Serializable {

    @EmbeddedId
    private ItemVendaPK id;
    private double valor = 0.0;
    private int quantidade;

    public ItemVenda() {
    }

    public ItemVenda(Long idVenda, int quantidade, Produto produto) {
        this.id = new ItemVendaPK(produto.getId(), idVenda);
        this.quantidade = quantidade;
        produto.setQuantidade(produto.getQuantidade() - quantidade);
        this.valor = produto.getValor() * quantidade;
    }

    public ItemVendaPK getId() {
        return id;
    }

    public void setId(ItemVendaPK id) {
        this.id = id;
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

}
