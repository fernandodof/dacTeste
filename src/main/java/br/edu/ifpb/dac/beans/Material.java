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
@SequenceGenerator(name = "seq_material", sequenceName = "sequencia_meterial", allocationSize = 1, initialValue = 1)
@NamedQueries({
    @NamedQuery(name="Material.findAll", query = "SELECT m FROM Material m")})
public class Material implements Serializable {

    @Id
    @GeneratedValue(generator = "seq_material", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
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

    @Override
    public String toString() {
        return descricao;
    }
    
    
    

}
