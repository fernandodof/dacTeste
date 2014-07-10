/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import br.edu.ifpb.dac.beans.Cliente;
import br.edu.ifpb.dac.beans.Endereco;
import br.edu.ifpb.dac.beans.Fornecedor;
import br.edu.ifpb.dac.beans.Funcionario;
import br.edu.ifpb.dac.beans.ItemVenda;
import br.edu.ifpb.dac.beans.Material;
import br.edu.ifpb.dac.beans.Pessoa;
import br.edu.ifpb.dac.beans.Produto;
import br.edu.ifpb.dac.beans.Venda;
import br.edu.ifpb.dac.dao.GenericoDAO;
import br.edu.ifpb.dac.dao.GenericoDAOJPA;
import br.edu.ifpb.dac.encriptar.EncriptarSenha;
import java.util.Date;

/**
 *
 * @author Fernando
 */
public class App {

    public static void main(String[] args) {
        GenericoDAO genericoDAO = new GenericoDAOJPA();
        //Criando 1 funcionário
//        Funcionario funcionario1 = new Funcionario("fernando", EncriptarSenha.encriptar("123456"), "222.222.222-22", "Fernando", Pessoa.Sexo.Masculino);
//        Endereco endereco = new Endereco();
//        endereco.setRua("Dimas andriola");
//        endereco.setBairro("Jardim Oásis");
//        endereco.setCep("58900.000");
//        endereco.setCidade("Cajazeiras");
//        endereco.setNumero(25);
//        funcionario1.setEndereco(endereco);
//        genericoDAO.save(endereco);
        long id = 68;
        Produto produto = (Produto) genericoDAO.getById(Produto.class,id);
        genericoDAO.delete(produto);
        
//        //Criando 2 clientes
//        Cliente cliente1 = new Cliente("000.000.000-00", "Ricardo", "souzajob@gmail.com", Pessoa.Sexo.Masculino);
//        
//        Endereco endereco1 = new Endereco();
//        endereco.setRua("Dimas andriola");
//        endereco.setBairro("Jardim Oásis");
//        endereco.setCep("58900.000");
//        endereco.setCidade("Cajazeiras");
//        endereco.setNumero(25);
//        cliente1.setEndereco(endereco1);
//        
//        Cliente cliente2 = new Cliente("111.111.111-11", "Izabel", "ads.izabel@gmail.com", Pessoa.Sexo.Feminino);
//        Endereco endereco2 = new Endereco();
//        endereco.setRua("Dimas andriola");
//        endereco.setBairro("Jardim Oásis");
//        endereco.setCep("58900.000");
//        endereco.setCidade("Cajazeiras");
//        endereco.setNumero(25);
//        cliente1.setEndereco(endereco2);
//        
//        genericoDAO.save(cliente1);
//        genericoDAO.save(cliente2);
//
//        //Criando 2 clientes
//        Fornecedor fornecedor1 = new Fornecedor("123", "Adidas Compnay");
//        Fornecedor fornecedor2 = new Fornecedor("1234", "Nike Inc");
//        genericoDAO.save(fornecedor1);
//        genericoDAO.save(fornecedor2);
//
//        //Criando meteriais
//        Material material1 = new Material("EVA");
//        Material material2 = new Material("Polyester");
//        Material material3 = new Material("Tecido");
//        Material material4 = new Material("Sitético");
//        genericoDAO.save(material1);
//        genericoDAO.save(material2);
//        genericoDAO.save(material3);
//        genericoDAO.save(material4);
//
//        //Criando produtos
//        Produto produto1 = new Produto("A-001", 5, "Tênis Adidas Vanquish 6", 37, 149.90, fornecedor1, "Adidas");
//        produto1.addMeterial(material1);
//        produto1.addMeterial(material4);
//
//        Produto produto2 = new Produto("A-002", 5, "Tênis Adidas Vanquish 6", 38, 149.90, fornecedor1, "Adidas");
//        produto2.addMeterial(material1);
//        produto2.addMeterial(material4);
//
//        Produto produto3 = new Produto("A-003", 5, "Tênis Adidas Vanquish 6", 39, 149.90, fornecedor1, "Adidas");
//        produto3.addMeterial(material1);
//        produto3.addMeterial(material4);
//
//        Produto produto4 = new Produto("A-004", 5, "Tênis Adidas Vanquish 6", 40, 149.90, fornecedor1, "Adidas");
//        produto4.addMeterial(material1);
//        produto4.addMeterial(material4);
//
//        Produto produto5 = new Produto("A-005", 5, "Tênis Adidas Vanquish 6", 41, 149.90, fornecedor1, "Adidas");
//        produto5.addMeterial(material1);
//        produto5.addMeterial(material4);
//
//        Produto produto6 = new Produto("A-006", 5, "Tênis Adidas Vanquish 6", 42, 149.90, fornecedor1, "Adidas");
//        produto6.addMeterial(material1);
//        produto6.addMeterial(material4);
//
//        Produto produto7 = new Produto("A-007", 5, "Tênis Adidas Vanquish 6", 43, 149.90, fornecedor1, "Adidas");
//        produto7.addMeterial(material1);
//        produto7.addMeterial(material4);
//
//        Produto produto8 = new Produto("A-008", 5, "Tênis Adidas Vanquish 6", 44, 149.90, fornecedor1, "Adidas");
//        produto8.addMeterial(material1);
//        produto8.addMeterial(material4);
//
//        //
//        //
//        //
//        Produto produto9 = new Produto("N-001", 4, "Tênis Nike Dart 10 MSL", 37, 139.90, fornecedor2, "Nike");
//        produto9.addMeterial(material1);
//        produto9.addMeterial(material4);
//
//        Produto produto10 = new Produto("N-002", 4, "Tênis Nike Dart 10 MSL", 38, 139.90, fornecedor2, "Nike");
//        produto10.addMeterial(material1);
//        produto10.addMeterial(material4);
//
//        Produto produto11 = new Produto("N-003", 4, "Tênis Nike Dart 10 MSL", 39, 139.90, fornecedor2, "Nike");
//        produto11.addMeterial(material1);
//        produto11.addMeterial(material4);
//
//        Produto produto12 = new Produto("N-004", 4, "Tênis Nike Dart 10 MSL", 40, 139.90, fornecedor2, "Nike");
//        produto12.addMeterial(material1);
//        produto12.addMeterial(material4);
//
//        Produto produto13 = new Produto("N-005", 4, "Tênis Nike Dart 10 MSL", 41, 139.90, fornecedor2, "Nike");
//        produto13.addMeterial(material1);
//        produto13.addMeterial(material4);
//
//        Produto produto14 = new Produto("N-006", 4, "Tênis Nike Dart 10 MSL", 42, 139.90, fornecedor2, "Nike");
//        produto14.addMeterial(material1);
//        produto14.addMeterial(material4);
//
//        Produto produto15 = new Produto("N-007", 4, "Tênis Nike Dart 10 MSL", 43, 139.90, fornecedor2, "Nike");
//        produto15.addMeterial(material1);
//        produto15.addMeterial(material4);
//
//        Produto produto16 = new Produto("N-008", 4, "Tênis Nike Dart 10 MSL", 44, 139.90, fornecedor2, "Nike");
//        produto16.addMeterial(material1);
//        produto16.addMeterial(material4);
//        
//        genericoDAO.save(produto1);
//        genericoDAO.save(produto2);
//        genericoDAO.save(produto3);
//        genericoDAO.save(produto4);
//        genericoDAO.save(produto5);
//        genericoDAO.save(produto6);
//        genericoDAO.save(produto7);
//        genericoDAO.save(produto8);
//        genericoDAO.save(produto9);
//        genericoDAO.save(produto10);
//        genericoDAO.save(produto11);
//        genericoDAO.save(produto12);
//        genericoDAO.save(produto13);
//        genericoDAO.save(produto14);
//        genericoDAO.save(produto15);
//        genericoDAO.save(produto16);
//
//        //Criando venda        
//        Venda venda1 = new Venda(new Date());
//        genericoDAO.save(venda1);
//        //Criando item venda
//        ItemVenda itemVenda1 = new ItemVenda(venda1.getId(),produto3.getId(), produto3.getValor(), 1);
//        genericoDAO.save(itemVenda1);
//
//        //Associando item e venda
//        venda1.addItemVenda(itemVenda1);
//        genericoDAO.update(venda1);
//
//        //Associando funcionario e venda
//        funcionario1.addVenda(venda1);
//        genericoDAO.update(funcionario1);
//
//        //Associando cliente e venda;
//        cliente1.addCompra(venda1);
//        genericoDAO.update(venda1);

    }
}
