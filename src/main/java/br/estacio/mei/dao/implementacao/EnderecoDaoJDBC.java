/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.EnderecoDao;
import br.estacio.mei.model.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ericvdias
 */
public class EnderecoDaoJDBC implements EnderecoDao {

    @Override
    public Endereco salvarEnderecoCliente(Endereco endereco) {
        
        String sql = "INSERT "
                + "INTO "
                + "tb_endereco (codigo, rua, numero, bairro, cidade, estado, cep, complemento)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);

            preparacaoDaInstrucao.setInt(1, endereco.getCodigo());
            preparacaoDaInstrucao.setString(2, endereco.getRua());
            preparacaoDaInstrucao.setInt(3, endereco.getNumero());
            preparacaoDaInstrucao.setString(4, endereco.getBairro());
            preparacaoDaInstrucao.setString(5, endereco.getCidade());
            preparacaoDaInstrucao.setString(6, endereco.getEstado());
            preparacaoDaInstrucao.setString(7, endereco.getCep());
            preparacaoDaInstrucao.setString(8, endereco.getComplemento());
            
            preparacaoDaInstrucao.executeUpdate();
            
            return endereco;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Endereco alterarEndereco(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Endereco> buscarEndereco() {
        ArrayList<Endereco> ListaEndereco = new ArrayList<>();
        String SQL = "SELECT * FROM tb_endereco where codigo = ";

        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);
            ResultSet resultado = SQLPreparada.executeQuery();

            Endereco endereco = new Endereco();
            //cliente.setCodigo(resultado.getInt("codigo"));
            endereco.setCodigo(resultado.getInt("codigo"));
            endereco.setRua(resultado.getString("rua"));
            endereco.setNumero(resultado.getInt("numero"));
            endereco.setBairro(resultado.getString("bairro"));
            endereco.setCidade(resultado.getString("cidade"));
            endereco.setEstado(resultado.getString("estado"));
            endereco.setCep(resultado.getString("cep"));
            endereco.setComplemento(resultado.getString("complemento"));

            ListaEndereco.add(endereco);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListaEndereco;
    }

}
