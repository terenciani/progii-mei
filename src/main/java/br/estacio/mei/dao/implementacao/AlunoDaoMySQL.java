/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.ConexaoMySQL;
import br.estacio.mei.model.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class AlunoDaoMySQL  {

    public ArrayList<Aluno> buscarAlunos() {
        ArrayList<Aluno> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_aluno";

        try {
            PreparedStatement preparacaoDaInstrucao = ConexaoMySQL.retornaConexao().prepareStatement(sql);
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
