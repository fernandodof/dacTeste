/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.beans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Fernando
 */
@Entity
@SequenceGenerator(name = "seq_material", sequenceName = "sequencia_meterial", allocationSize = 1, initialValue = 1)
public class Material implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_material", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricao;

    public Material() {
    }

    public Material(String descricao) {
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
