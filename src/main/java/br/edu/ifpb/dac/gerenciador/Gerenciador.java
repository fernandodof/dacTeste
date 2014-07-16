/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.gerenciador;

import br.edu.ifpb.dac.beans.Cliente;
import br.edu.ifpb.dac.beans.Funcionario;
import br.edu.ifpb.dac.dao.GenericoDAO;
import br.edu.ifpb.dac.dao.GenericoDAOJPA;
import br.edu.ifpb.dac.exceptions.ErroAconteceuException;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author Fernando
 */
public class Gerenciador<T> {

    private static Gerenciador instance = new Gerenciador();
    private GenericoDAO dao = new GenericoDAOJPA();
    private Funcionario funcionario;

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

    public boolean delete(T entity) {
        return this.dao.delete(entity);
    }

    public T find(Class<T> classe, T entity) {
        return (T) this.dao.find(classe, entity);
    }

    public T getById(Class<T> classe, Object id) {
        return (T) this.dao.getById(classe, id);
    }

    public T getSingleResultOfNamedQuery(String namedQuery, Map<String, Object> map) throws NoResultException {
        return (T) this.dao.getSingleResultOfNamedQuery(namedQuery, map);
    }

    public T getSingleResultOfNamedQuery(String namedQuery) throws NoResultException {
        return (T) this.dao.getSingleResultOfNamedQuery(namedQuery);
    }

    public List<T> getListResultOfNamedQuery(String namedQuery) throws NoResultException {
        return this.dao.getListResultOfNamedQuery(namedQuery);
    }

    public List<T> getListResultOfNamedQuery(String namedQuery, Map<String, Object> map) throws NoResultException {
        return this.dao.getListResultOfNamedQuery(namedQuery, map);
    }

    public List<T> getListResultOfNamedQueryWithLimit(String namedQuery, int min, int max) {
        return this.dao.getListResultOfNamedQueryWithLimit(namedQuery, min, max);
    }

    public void saveEntityList(List<T> entities) {
        for (T t : entities) {
            this.dao.save(t);
        }
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Object executeNativeQuery(String query) {
        return this.dao.executeNativeQuery(query);
    }

    public EntityManager getEntityManager() {
        return this.dao.getEntityManager();
    }

//    public boolean cadastrarCliente(Cliente cliente) throws ErroAconteceuException {
//        if (cliente.getNome() == null || cliente.getNome().isEmpty()) {
//            throw new ErroAconteceuException("Por favor, informe o nome do cliente");
//        } else if (cliente.getEmail() == null || cliente.getEmail().isEmpty()) {
//            throw new ErroAconteceuException("Por favor, informe o email do cliente");
//        } else if (cliente.getCpf().trim().length() < 12) {
//            throw new ErroAconteceuException("Por favor, informe o CPF do cliente");
//        } else if (cliente.getEndereco().getRua() == null || cliente.getEndereco().getRua().isEmpty()) {
//            throw new ErroAconteceuException("Por favor, informe a Rua do cliente");
//        } else if (cliente.getEndereco().getBairro() == null || cliente.getEndereco().getBairro().isEmpty()) {
//            throw new ErroAconteceuException("Por favor, informe o Bairro do cliente");
//        } else if (cliente.getEndereco().getNumero() < 0) {
//            throw new ErroAconteceuException("Por favor, informe um Número válido para o endereço do cliente");
//        } else if (cliente.getEndereco().getCidade() == null || cliente.getEndereco().getCidade().isEmpty()) {
//            throw new ErroAconteceuException("Por favor, informe a Cidade do cliente");
//        } else if (cliente.getEndereco().getCep().length() < 9) {
//            throw new ErroAconteceuException("Por favor, informe um CEP válido para o cliente");
//        }
//        return this.save((T) cliente);
//    }
}
