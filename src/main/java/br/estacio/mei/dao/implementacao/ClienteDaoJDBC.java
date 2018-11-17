
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.ClienteDao;
import br.estacio.mei.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ClienteDaoJDBC implements ClienteDao {

    Cliente cliente = new Cliente();

    @Override
    public ArrayList<Cliente> buscarClientes() {
        ArrayList<Cliente> listaDeCliente = new ArrayList<>();
        String SQL = "SELECT * FROM tb_cliente";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);

            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(resultado.getInt("codigo"));
                cliente.setCpfCnpj(resultado.getString("cpfCnpj"));
                cliente.setNome(resultado.getString("nome"));
                cliente.setTelefone(resultado.getString("telefone"));
                cliente.setEmail(resultado.getString("email"));

                listaDeCliente.add(cliente);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaDeCliente;
    }

    @Override
    public Cliente salvarCliente(Cliente cliente) {

        String sql = "INSERT "
                + "INTO "
                + "tb_cliente (codigo, cpfcnpj, nome, nomefantasia, inscrestadual, telefone, email)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);

            preparacaoDaInstrucao.setInt(1, cliente.getCodigo());
            preparacaoDaInstrucao.setString(2, cliente.getCpfCnpj());
            preparacaoDaInstrucao.setString(3, cliente.getNome().toUpperCase());
            preparacaoDaInstrucao.setString(4, cliente.getNomeFantasia());
            preparacaoDaInstrucao.setString(5, cliente.getInscrEstadual());
            preparacaoDaInstrucao.setString(6, cliente.getTelefone());
            preparacaoDaInstrucao.setString(7, cliente.getEmail());

            preparacaoDaInstrucao.executeUpdate();

            return cliente;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean atualizarCliente(Cliente cliente, int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCliente(int codigo) {
        String sql1 = "DELETE FROM tb_cliente WHERE codigo=?";
        String sql2 = "DELETE FROM tb_endereco WHERE codigo=?";
        try {
            
            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sql1);
            preparacaoDaInstrucao1.setInt(1, codigo);
            preparacaoDaInstrucao1.executeUpdate();
            
            PreparedStatement preparacaoDaInstrucao2 = Conexao.retornaConexao().prepareStatement(sql2);
            preparacaoDaInstrucao2.setInt(1, codigo);
            preparacaoDaInstrucao2.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
