/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.EnderecoDao;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.Endereco;
import br.estacio.mei.visao.cliente.BancoSingleton;
import java.util.ArrayList;

/**
 *
 * @author ericvdias
 */
public class EnderecoDaoEstatico implements EnderecoDao {

    @Override
    public ArrayList<Endereco> buscarEndereco() {
        return BancoSingleton.getInstance().tabelaEndereco;
    }

    @Override
    public Endereco salvarEnderecoCliente(Endereco endereco) {
        BancoSingleton.getInstance().tabelaEndereco.add(endereco);
        return endereco;
    }

    @Override
    public Endereco alterarEndereco(Endereco endereco) {
        return endereco;
    }

}
