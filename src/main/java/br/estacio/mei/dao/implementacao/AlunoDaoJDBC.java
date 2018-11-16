/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.AlunoDao;
import br.estacio.mei.model.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class AlunoDaoJDBC implements AlunoDao {

    @Override
    public ArrayList<Aluno> buscarAlunos() {
        ArrayList<Aluno> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_aluno";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                Aluno alu = transformaResultSetEmObjeto(resultado);
                listaParaRetorno.add(alu);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return listaParaRetorno;
    }

    @Override
    public Aluno buscarAlunoPorId(int id) {
        Aluno aluno = new Aluno();
        String sql = "SELECT * FROM tb_aluno WHERE id=?";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao.setInt(1, id);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                aluno = transformaResultSetEmObjeto(resultado);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return aluno;
    }

    @Override
    public Aluno salvarAluno(Aluno aluno) {
        // Instrução SQL que será executada no banco
        String sql = "INSERT "
                + "INTO "
                + "tb_aluno (nome, RA, senha)"
                + "VALUES (?, ?, ?)";
        try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            preparacaoDaInstrucao.setString(1, aluno.getNome());
            preparacaoDaInstrucao.setInt(2, aluno.getRA());
            preparacaoDaInstrucao.setString(3, aluno.getSenha());
                    
            return aluno;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Aluno atualizarAluno(Aluno aluno) {
        // Instrução SQL que será executada no banco
        String sql = "UPDATE tb_aluno "
                + "SET nome = ?, ra = ?, senha = ? "
                + "WHERE id=?";
        try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            preparacaoDaInstrucao.setString(1, aluno.getNome());
            preparacaoDaInstrucao.setInt(2, aluno.getRA());
            preparacaoDaInstrucao.setString(3, aluno.getSenha());
            preparacaoDaInstrucao.setInt(4, aluno.getId());

            preparacaoDaInstrucao.executeUpdate();

            
            return aluno;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean excluirAluno(Aluno aluno) {
        // Instrução SQL que será executada no banco

        String sql = "DELETE FROM tb_aluno "
                + "WHERE id=?";
        try {
            // Objeto PreparedStatement é um objeto que prepara a instrução de sql
            // ou seja, preenche os valores
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            //De acordo com a posicao do ponto de interrogacao na SQL e o tipo do dado
            preparacaoDaInstrucao.setInt(1, aluno.getId());

            preparacaoDaInstrucao.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    private Aluno transformaResultSetEmObjeto(ResultSet resultado) throws SQLException {
        Aluno aluno = new Aluno();
        try {
            aluno.setId(resultado.getInt("id"));
            aluno.setNome(resultado.getString("nome"));
            aluno.setRA(resultado.getInt("ra"));
            aluno.setSenha(resultado.getString("senha"));
            return aluno;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }

}
