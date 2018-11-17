
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
        String sql = "UPDATE tb_cliente set cpfcnpj = ?, nome = ?, nomefantasia = ?, inscrestadual = ?, telefone = ?, email = ? where codigo = ?";

        try {
            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao1.setString(1, cliente.getCpfCnpj());
            preparacaoDaInstrucao1.setString(2, cliente.getNome());
            preparacaoDaInstrucao1.setString(3, cliente.getNomeFantasia());
            preparacaoDaInstrucao1.setString(4, cliente.getInscrEstadual());
            preparacaoDaInstrucao1.setString(5, cliente.getTelefone());
            preparacaoDaInstrucao1.setString(6, cliente.getEmail());            
            preparacaoDaInstrucao1.setInt(7, cliente.getCodigo());
            
            preparacaoDaInstrucao1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCliente(int codigo) {
        String sqlC = "DELETE FROM tb_cliente WHERE codigo=?";
        String sqlE = "DELETE FROM tb_endereco WHERE codigo=?";
        try {

            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sqlC);
            preparacaoDaInstrucao1.setInt(1, codigo);
            preparacaoDaInstrucao1.executeUpdate();

            PreparedStatement preparacaoDaInstrucao2 = Conexao.retornaConexao().prepareStatement(sqlE);
            preparacaoDaInstrucao2.setInt(1, codigo);
            preparacaoDaInstrucao2.executeUpdate();

            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Cliente buscarCliente(int codigo) {
        Cliente cliente = new Cliente();
        String SQL = "SELECT * FROM tb_cliente where codigo = ?";
        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(SQL);
            preparacaoDaInstrucao.setInt(1, codigo);

            ResultSet resultado = preparacaoDaInstrucao.executeQuery();

            while (resultado.next()) {
                cliente = clienteObjeto(resultado);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return cliente;
    }

    private Cliente clienteObjeto(ResultSet resultado) throws SQLException {
        Cliente cliente = new Cliente();
        try {
            cliente.setCodigo(resultado.getInt("codigo"));
            cliente.setCpfCnpj(resultado.getString("cpfcnpj"));
            cliente.setNome(resultado.getString("nome"));
            cliente.setNomeFantasia(resultado.getString("nomefantasia"));
            cliente.setInscrEstadual(resultado.getString("inscrestadual"));
            cliente.setTelefone(resultado.getString("telefone"));
            cliente.setEmail(resultado.getString("email"));

            return cliente;

        } catch (SQLException ex) {
            throw new SQLException("Erro na Conversão");
        }
    }

}
