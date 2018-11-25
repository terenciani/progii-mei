/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.ProdutoDao;
import br.estacio.mei.model.Categoria;
import br.estacio.mei.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ProdutoDaoJDBC implements ProdutoDao {

    @Override
    public ArrayList<Produto> buscarProdutos() {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select id, nome, quantidade_estoque, lucro, codigo, p.descricao, valor as valor  from tb_produto p inner join tb_categoria on (fk_categoria = codigo)";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            while(resultado.next()){
                Produto pro = new Produto();
                pro.setCodigo(resultado.getInt("id"));
                pro.setNome(resultado.getString("nome"));
                Categoria cat = new Categoria ();
                cat.setCodigo(resultado.getInt("codigo"));
                cat.setDescricao(resultado.getString("descricao"));
                pro.setCategoria(cat);
                pro.setValorAtual(resultado.getFloat("valor"));
                pro.setDescricao(resultado.getString("descricao"));
                listaDeProdutos.add(pro);
            }
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;        
    }

    @Override
    public Produto salvar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirProduto(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto alterar(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorCodigo(int filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorNome(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorFornecedor(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorPrecoCompra(int filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorPrecoVenda(int filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorQtdEstoque(int filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Produto> pesquisarPorCategoria(int pesqCategoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluirProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
