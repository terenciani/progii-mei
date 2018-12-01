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
    public boolean excluirProduto(Produto produto);
    public Produto alterar(Produto produto);
    public Produto buscarProdutoPorCodigo(int filtro);
    public ArrayList<Produto> pesquisarPorCodigo(int filtro);
    public ArrayList<Produto> pesquisarPorNome(String filtro);
    public ArrayList<Produto> pesquisarPorValor(float filtro);
    public ArrayList<Produto> pesquisarPorLucro(float filtro);
    public ArrayList<Produto> pesquisarPorQtdEstoque(int filtro);
    public ArrayList<Produto> pesquisarPorCategoria(String filtro);
    public void excluirProduto();    
}
