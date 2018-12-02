/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.CategoriaDao;
import br.estacio.mei.dao.ProdutoDao;
import br.estacio.mei.model.Categoria;
import br.estacio.mei.model.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ProdutoDaoJDBC implements ProdutoDao {

    @Override
    public ArrayList<Produto> buscarProdutos() {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo)";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
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
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo) where p.id = " +filtro;
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorNome(String filtro) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo) where p.nome = '" + filtro + "'";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;
    }


    @Override
    public ArrayList<Produto> pesquisarPorValor(float filtro) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo) where p.valor = " + filtro + "";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorQtdEstoque(int filtro) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo) where p.quantidade_estoque = " + filtro;
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;
    }
    
    @Override
    public ArrayList<Produto> pesquisarPorLucro(float filtro) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo) where p.lucro = " + filtro;
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;
    }

    @Override
    public ArrayList<Produto> pesquisarPorCategoria(String filtro) {
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        String SQL = "select p.id, p.nome, p.quantidade_estoque, p.lucro, p.valor, c.codigo  from tb_produto as p left join tb_categoria as c on (p.fk_categoria = c.codigo) where c.descricao = '" + filtro + "'";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);                      
            ResultSet resultado = SQLPreparada.executeQuery();
            resultadoQueryArray(resultado, listaDeProdutos);
        } catch(Exception excecao){
            excecao.printStackTrace();
        }
        return listaDeProdutos;
    }

    @Override
    public void excluirProduto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produto buscarProdutoPorCodigo(int filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void resultadoQueryArray(ResultSet resultado, ArrayList<Produto> listaDeProdutos) throws SQLException{
        CategoriaDao categoria = new CategoriaDaoJDBC();
        while(resultado.next()){
            Produto pro = new Produto();
            pro.setCodigo(resultado.getInt("id"));
            pro.setNome(resultado.getString("nome"));
            pro.setValorAtual(resultado.getFloat("valor"));
            pro.setQuantidade(resultado.getInt("quantidade_estoque"));
            pro.setLucro(resultado.getFloat("lucro"));
            pro.setCategoria(categoria.buscarCategoriaPorId(resultado.getInt("codigo")));
            listaDeProdutos.add(pro);
        }
    }
}
