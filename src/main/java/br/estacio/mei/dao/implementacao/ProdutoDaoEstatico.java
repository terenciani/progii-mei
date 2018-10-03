/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.ProdutoDao;
import br.estacio.mei.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class ProdutoDaoEstatico implements ProdutoDao {
    ArrayList<Produto> tabelaProduto = new ArrayList();
    @Override
    public ArrayList<Produto> buscarProdutos() {
        return tabelaProduto;
    }

    @Override
    public Produto salvar(Produto produto) {
        tabelaProduto.add(produto);
        return produto;
    }

    @Override
    public boolean excluir(Produto produto) {
        return true;
    }

    @Override
    public Produto alterar(Produto produto) {
        return null;
    }

    @Override
    public ArrayList<Produto> pesquisarPorCodigo(int filtro) {
        ArrayList<Produto> todosProdutos = buscarProdutos();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < todosProdutos.size(); i++) {
            if (todosProdutos.get(i).getCodigo() == filtro) {
                produtos.add(todosProdutos.get(i));
            }
        }
        System.out.println(produtos);
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorNome(String filtro) {
        return null;
    }

    @Override
    public ArrayList<Produto> pesquisarPorForncedor(String filtro) {
        return null;
    }

    @Override
    public ArrayList<Produto> pesquisarPorPrecoCompra(int filtro) {
        return null;
    }

    @Override
    public ArrayList<Produto> pesquisarPorPrecoVenda(int filtro) {
        return null;
    }

    @Override
    public ArrayList<Produto> pesquisarPorQtdEstoque(int filtro) {
        return null;
    }


}
