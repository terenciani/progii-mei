/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.banco.estatico.Conexao;
import br.estacio.mei.dao.FornecedorDao;
import br.estacio.mei.model.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class FornecedorDaoJDBC implements FornecedorDao {
    
    Fornecedor fornecedor = new Fornecedor();
    

    @Override
    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {

       
        String sql = "INSERT "
                + "INTO "
                + "tb_fornecedor( cpfcnpj, razaosocial, fantasia, email, telefone, ie, endereco, numero, bairro, cidade, estado, cep)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {

            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);

            //preparacaoDaInstrucao.setInt(1, cliente.getCodigo());
            preparacaoDaInstrucao.setString(1, fornecedor.getCPFCNPJ());
            preparacaoDaInstrucao.setString(2, fornecedor.getRazaoSocial());
            preparacaoDaInstrucao.setString(3, fornecedor.getFantasia());
            preparacaoDaInstrucao.setString(4, fornecedor.getEmail());
            preparacaoDaInstrucao.setString(5, fornecedor.getTelefone());
            preparacaoDaInstrucao.setString(6, fornecedor.getIe());
            preparacaoDaInstrucao.setString(7, fornecedor.getEndereco());
            preparacaoDaInstrucao.setInt(8, fornecedor.getNumero());
            preparacaoDaInstrucao.setString(9, fornecedor.getBairro());
            preparacaoDaInstrucao.setString(10, fornecedor.getCidade());
            preparacaoDaInstrucao.setString(11, fornecedor.getEstado());
            preparacaoDaInstrucao.setString(12, fornecedor.getCep());

            preparacaoDaInstrucao.executeUpdate();

            System.out.println(fornecedor.getCodigo());
            return fornecedor;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
        

    }

    @Override
    public Fornecedor alterarFornecedor(Fornecedor fornecedor) {
        String sql = "UPDATE tb_fornecedor  SET razaosocial=?, fantasia=?, cpfcnpj=?, email=?, telefone=?, ie=?, endereco=?, numero=?, bairro=?, cidade=?, estado=?, cep=? WHERE codigo = ?";
        
        try {
            PreparedStatement preparacaoDaInstrucao = Conexao.retornaConexao().prepareStatement(sql);
            preparacaoDaInstrucao.setString(1, fornecedor.getRazaoSocial());
            preparacaoDaInstrucao.setString(2, fornecedor.getFantasia());
            preparacaoDaInstrucao.setString(4, fornecedor.getCPFCNPJ());
            preparacaoDaInstrucao.setString(5, fornecedor.getEmail());
            preparacaoDaInstrucao.setString(6, fornecedor.getTelefone());
            preparacaoDaInstrucao.setString(7, fornecedor.getIe());
            preparacaoDaInstrucao.setString(8, fornecedor.getEndereco());
            preparacaoDaInstrucao.setInt(9, fornecedor.getNumero());
            preparacaoDaInstrucao.setString(10, fornecedor.getBairro());
            preparacaoDaInstrucao.setString(11, fornecedor.getCidade());
            preparacaoDaInstrucao.setString(12, fornecedor.getEstado());
            preparacaoDaInstrucao.setString(13, fornecedor.getCep());
            preparacaoDaInstrucao.setInt(14, fornecedor.getCodigo());
            

            preparacaoDaInstrucao.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return fornecedor;
    }

    @Override
    public boolean excluirFornecedor(Fornecedor fornecedor) {
        return false;
    }

    @Override
    public ArrayList<Fornecedor> listarFornecedores() {

        ArrayList<Fornecedor> listaDeFornecedor = new ArrayList<>();
        String SQL = "SELECT * FROM tb_fornecedor";
        try {
            PreparedStatement SQLPreparada = Conexao.retornaConexao().prepareStatement(SQL);

            ResultSet resultado = SQLPreparada.executeQuery();

            while (resultado.next()) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setCodigo(resultado.getInt("codigo"));
                fornecedor.setRazaoSocial(resultado.getString("razaosocial"));
                fornecedor.setFantasia(resultado.getString("fantasia"));
                fornecedor.setCPFCNPJ(resultado.getString("cpfcnpj"));
                fornecedor.setEmail(resultado.getString("email"));
                fornecedor.setTelefone(resultado.getString("telefone"));
                fornecedor.setIe(resultado.getString("ie"));
                fornecedor.setEndereco(resultado.getString("endereco"));
                fornecedor.setNumero(resultado.getInt("numero"));
                fornecedor.setBairro(resultado.getString("bairro"));
                fornecedor.setCidade(resultado.getString("cidade"));
                fornecedor.setEstado(resultado.getString("estado"));
                fornecedor.setCep(resultado.getString("cep"));

                listaDeFornecedor.add(fornecedor);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaDeFornecedor;

        
    }

    @Override
    public boolean excluirFornecedorPCodigo(int codigo) {
                String sqlF = "DELETE FROM tb_fornecedor WHERE codigo=?";
        try {

            PreparedStatement preparacaoDaInstrucao1 = Conexao.retornaConexao().prepareStatement(sqlF);
            preparacaoDaInstrucao1.setInt(1, codigo);
            preparacaoDaInstrucao1.executeUpdate();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }
   
    
}
