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
import java.util.ArrayList;

/**
 *
 * @author ericvdias
 */
public class EnderecoDaoJDBC implements EnderecoDao {

    @Override
    public Endereco salvarEnderecoCliente(Endereco endereco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
