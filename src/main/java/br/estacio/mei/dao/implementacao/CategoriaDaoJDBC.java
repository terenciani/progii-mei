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
 * Orico)
 */
public class CategoriaDaoJDBC implements CategoriaDao {
    
    Categoria categoria = new Categoria();
    
    @Override
    public ArrayList<Categoria> buscarCategoria() {
        ArrayList<Categoria> listaDeCategoria = new ArrayList<>();
        
        String SQL = "SELECT * FROM tb_categoria";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);

            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigo(resultado.getInt("codigo"));
                categoria.setDescricao(resultado.getString("descricao"));
                
		listaDeCategoria.add(categoria);
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

    //@Override
    
    // INDICOU PARA RETIRAR O @Override acima
    public boolean atualizarCategoria(Categoria categoria, int codigo) {
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Categoria atualizarCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
