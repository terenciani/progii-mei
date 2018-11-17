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
        
        String sql = "UPDATE tb_endereco set rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ?, complemento = ? where codigo = ?";

        try {
            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao1.setString(1, endereco.getRua());
            preparacaoDaInstrucao1.setInt(2, endereco.getNumero());
            preparacaoDaInstrucao1.setString(3, endereco.getBairro());
            preparacaoDaInstrucao1.setString(4, endereco.getCidade());
            preparacaoDaInstrucao1.setString(5, endereco.getEstado());
            preparacaoDaInstrucao1.setString(6, endereco.getCep());            
            preparacaoDaInstrucao1.setString(7, endereco.getComplemento());            
            preparacaoDaInstrucao1.setInt(8, endereco.getCodigo());
            
            preparacaoDaInstrucao1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return endereco;
        }
        return endereco;
        
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

    @Override
    public Endereco buscarEndereco(int codigo) {

        Endereco endereco = new Endereco();
        String SQL = "SELECT * FROM tb_endereco where codigo = ?";
        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao.setInt(1, codigo);

            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                endereco = enderecoObjeto(resultado);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return endereco;

    }
    
    
    private Endereco enderecoObjeto(ResultSet resultado) throws SQLException {
        Endereco endereco = new Endereco();
        try {
            endereco.setCodigo(resultado.getInt("codigo"));
            endereco.setRua(resultado.getString("rua"));
            endereco.setNumero(resultado.getInt("numero"));
            endereco.setBairro(resultado.getString("bairro"));
            endereco.setCidade(resultado.getString("cidade"));
            endereco.setEstado(resultado.getString("estado"));
            endereco.setCep(resultado.getString("cep"));
            endereco.setComplemento(resultado.getString("complemento"));

            return endereco;

        } catch (SQLException ex) {
            throw new SQLException("Erro na Conversão");
        }
    }


}
