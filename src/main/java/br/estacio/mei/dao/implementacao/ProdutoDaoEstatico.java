/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.BancoSingleton;
import br.estacio.mei.dao.ProdutoDao;
import br.estacio.mei.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class ProdutoDaoEstatico implements ProdutoDao {
    
    @Override
    public ArrayList<Produto> buscarProdutos() {
        return BancoSingleton.getInstance().tabelaProduto;
        
    }

    @Override
    public Produto salvar(Produto produto) {
        BancoSingleton.getInstance().tabelaProduto.add(produto);
        return produto;
    }

    
    public boolean excluirProduto(Produto produto) {
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
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorNome(String filtro) {
        ArrayList<Produto> todosProdutos = buscarProdutos();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < todosProdutos.size(); i++) {
            if (todosProdutos.get(i).getNome().toUpperCase().contains(filtro.toUpperCase())) {
                produtos.add(todosProdutos.get(i));
            }
        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorFornecedor(String filtro) {
        ArrayList<Produto> todosProdutos = buscarProdutos();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < todosProdutos.size(); i++) {
             //if (todosProdutos.get(i).getFornecedor().getRazaoSocial().toUpperCase().contains(filtro.toUpperCase())) {
                produtos.add(todosProdutos.get(i));
            //}
        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorPrecoCompra(int filtro) {
         ArrayList<Produto> todosProdutos = buscarProdutos();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < todosProdutos.size(); i++) {
            //if (todosProdutos.get(i).getPrecoCompra()== filtro) {
                produtos.add(todosProdutos.get(i));
            //}
        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorPrecoVenda(int filtro) {
         ArrayList<Produto> todosProdutos = buscarProdutos();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < todosProdutos.size(); i++) {
            //if (todosProdutos.get(i).getPrecoVenda()== filtro) {
                produtos.add(todosProdutos.get(i));
            //}
        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorQtdEstoque(int filtro) {
         ArrayList<Produto> todosProdutos = buscarProdutos();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        for (int i = 0; i < todosProdutos.size(); i++) {
            if (todosProdutos.get(i).getQuantidade() == filtro) {
                produtos.add(todosProdutos.get(i));
            }
        }
        return produtos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorCategoria(int pesqCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto buscarProdutoPorCodigo(int filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorValor(int pesqValor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}