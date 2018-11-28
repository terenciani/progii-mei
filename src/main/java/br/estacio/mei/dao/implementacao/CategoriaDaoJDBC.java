/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.CategoriaDao;
import br.estacio.mei.model.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @Author Equipe 7 (Carlos Pellat, Marcio Piter, Jose Victor Ferreira e Waldir
 * Orrico)
 */
public class CategoriaDaoJDBC implements CategoriaDao {

    Categoria categoria = new Categoria();

    @Override
    public ArrayList<Categoria> buscarCategoria() {
        ArrayList<Categoria> listaDeCategoria = new ArrayList<>();

        String SQL = "SELECT * FROM tb_categoria ORDER BY codigo";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);

            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {
                Categoria categ = new Categoria();
                categ.setCodigo(resultado.getInt("codigo"));
                categ.setDescricao(resultado.getString("descricao"));

                listaDeCategoria.add(categ);
            }

        } catch (Exception excecao) {
            excecao.printStackTrace();
        }
        return listaDeCategoria;
    }

    @Override
    public Categoria salvarCategoria(Categoria categoria) {
        String SQL = "INSERT "
                + "INTO "
                + "tb_categoria (descricao)"
                + "VALUES (?)";
        try {

            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(SQL);

            preparacaoDaInstrucao.setString(1, categoria.getDescricao());

            preparacaoDaInstrucao.executeUpdate();

            System.out.println(categoria.getCodigo());
            return categoria;

        } catch (SQLException excecao) {
            excecao.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean atualizarCategoria(Categoria categoria) {

        String SQL = "UPDATE tb_categoria set descricao = ? where codigo = ?";

        try {
            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao1.setString(1, categoria.getDescricao());
            preparacaoDaInstrucao1.setInt(2, categoria.getCodigo());

            preparacaoDaInstrucao1.executeUpdate();
        } catch (Exception excecao) {
            excecao.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Categoria buscarCategoriaPorId(int codigo) {
        Categoria categ = new Categoria();
        String SQL = "SELECT * FROM tb_categoria WHERE codigo = ? ORDER BY codigo";
        //System.err.println(codigo);
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);
            SQLPreparada.setInt(1, codigo);
            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {

                categ.setCodigo(resultado.getInt("codigo"));
                categ.setDescricao(resultado.getString("descricao"));
                //System.err.println(categ.toString());
            }

        } catch (Exception excecao) {
            excecao.printStackTrace();
        }
        return categ;
    }

    @Override
    public boolean excluirCategoria(Categoria categoria) {
        //Categoria categ = new Categoria();
        
        String SQL = "DELETE FROM tb_categoria WHERE codigo=?";

        try {

            PreparedStatement preparacaoDaInstrucao2 = Conexao.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao2.setInt(1, categoria.getCodigo());
            preparacaoDaInstrucao2.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean excluirCategoria(int codigo) {
        String SQL = "DELETE FROM tb_categoria WHERE codigo=?";

        try {

            PreparedStatement preparacaoDaInstrucao2 = Conexao.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao2.setInt(1, codigo);
            preparacaoDaInstrucao2.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Categoria buscarCategoria(int codigo) {
        Categoria categoria = new Categoria();

        String SQL = "SELECT * FROM tb_categoria where codigo = ?";
        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao.setInt(1, codigo);

            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                categoria = categoriaObjeto(resultado);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return categoria;
    }

    private Categoria categoriaObjeto(ResultSet resultado) throws SQLException {
        Categoria categoria = new Categoria();
        try {
            categoria.setCodigo(resultado.getInt("codigo"));
            categoria.setDescricao(resultado.getString("descricao"));

            return categoria;

        } catch (SQLException ex) {
            throw new SQLException("Erro na Conversão");
        }
    }

}
