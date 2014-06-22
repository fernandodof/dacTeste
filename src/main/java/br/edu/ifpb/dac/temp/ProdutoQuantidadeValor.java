/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifpb.dac.temp;

import br.edu.ifpb.dac.beans.Produto;

/**
 *
 * @author Fernando
 */
public class ProdutoQuantidadeValor {
    private Produto produto;
    private int qunatidade;
    private double valor;

    public ProdutoQuantidadeValor(Produto produto, int quantidae, double valor) {
        this.produto = produto;
        this.qunatidade = quantidae;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQunatidade() {
        return qunatidade;
    }

    public void setQunatidade(int qunatidade) {
        this.qunatidade = qunatidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
