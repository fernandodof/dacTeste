/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.gerenciador;

import br.edu.ifpb.dac.dao.GenericoDAO;
import br.edu.ifpb.dac.dao.GenericoDAOJPA;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Fernando
 */
public class Gerenciador<T> {

    private static Gerenciador instance = new Gerenciador();
    private GenericoDAO dao = new GenericoDAOJPA();

    private Gerenciador() {
    }

    public static Gerenciador getInstance() {
        return instance;
    }

    public boolean save(T entity) {
        return this.dao.save(entity);
    }

    public boolean update(T entity) {
        return this.dao.update(entity);
    }

    public T find(Class<T> classe, T entity) {
        return (T) this.dao.find(classe, entity);
    }

    public T getById(Class<T> classe, Object id) {
        return (T) this.dao.getById(classe, id);
    }

    public T getSingleResultOfNamedQuery(String namedQuery, Map<String, Object> map) {
        return (T) this.dao.getSingleResultOfNamedQuery(namedQuery, map);
    }

    public T getSingleResultOfNamedQuery(String namedQuery) {
        return (T) this.dao.getSingleResultOfNamedQuery(namedQuery);
    }

    public void saveEntityList(List<T> entities) {
        for (T t : entities) {
            this.dao.save(t);
        }
    }
    
}
