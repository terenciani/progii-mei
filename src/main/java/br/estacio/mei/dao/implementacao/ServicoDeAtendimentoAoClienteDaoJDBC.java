/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.ServicoDeAtendimentoAoClienteDao;
import br.estacio.mei.model.Aluno;
import br.estacio.mei.model.ServicoDeAtendimentoAoCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class ServicoDeAtendimentoAoClienteDaoJDBC implements ServicoDeAtendimentoAoClienteDao{

    @Override
    public ArrayList<ServicoDeAtendimentoAoCliente> buscarPorPalavraChave() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ServicoDeAtendimentoAoCliente> buscarTodos() {
        ArrayList<ServicoDeAtendimentoAoCliente> listaParaRetorno = new ArrayList<>();
        String sql = "SELECT * FROM tb_sac";

        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                ServicoDeAtendimentoAoCliente sac = transformaResultSetEmObjeto(resultado);
                listaParaRetorno.add(sac);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

        return listaParaRetorno;
    }

    @Override
    public ServicoDeAtendimentoAoCliente buscarPorCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private ServicoDeAtendimentoAoCliente transformaResultSetEmObjeto(ResultSet resultado) throws SQLException {
        ServicoDeAtendimentoAoCliente sac = new ServicoDeAtendimentoAoCliente();
        try {
            sac.setCodigo(resultado.getInt("codigo"));
            sac.setPalavraChave(resultado.getString("palavra-chave"));
            sac.setPergunta(resultado.getString("pergunta"));
            sac.setResposta(resultado.getString("resposta"));
            return sac;
        } catch (SQLException ex) {
            throw new SQLException("Erro na Transformação");
        }
    }
}
