/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;


import br.estacio.mei.model.Produto;

import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public interface ProdutoDao {
    public ArrayList<Produto> buscarProdutos();
    public Produto salvar(Produto produto);
    public boolean excluir(Produto produto);
    public Produto alterar(Produto produto);
    public ArrayList<Produto> pesquisarPorCodigo(int filtro);
    public ArrayList<Produto> pesquisarPorNome(String filtro);
    public ArrayList<Produto> pesquisarPorForncedor(String filtro);
    public ArrayList<Produto> pesquisarPorPrecoCompra(int filtro);
    public ArrayList<Produto> pesquisarPorPrecoVenda(int filtro);
    public ArrayList<Produto> pesquisarPorQtdEstoque(int filtro);
}
