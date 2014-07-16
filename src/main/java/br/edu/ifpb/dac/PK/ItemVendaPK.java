/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.PK;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Fernando
 */
@Embeddable
public class ItemVendaPK implements Serializable {
    @Column(name = "ItemVenda_idProduto")
    private Long idProduto;
    @Column(name = "ItemVenda_idVenda")
    private Long idVenda;

    public ItemVendaPK() {
    }

    public ItemVendaPK(Long idProduto, Long idVenda) {
        this.idProduto = idProduto;
        this.idVenda = idVenda;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public Long getIdVenda() {
        return idVenda;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (this.idProduto != null ? this.idProduto.hashCode() : 0);
        hash = 41 * hash + (this.idVenda != null ? this.idVenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemVendaPK other = (ItemVendaPK) obj;
        if ((this.idProduto == null) ? (other.idProduto != null) : !this.idProduto.equals(other.idProduto)) {
            return false;
        }
        if ((this.idVenda == null) ? (other.idVenda != null) : !this.idVenda.equals(other.idVenda)) {
            return false;
        }
        return true;
    }

}
