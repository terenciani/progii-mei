/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.ClienteDao;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.visao.cliente.BancoSingleton;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ClienteDaoEstatico implements ClienteDao {

    @Override
    public ArrayList<Cliente> buscarClientes() {
        return BancoSingleton.getInstance().tabelaClientes;

    }

    @Override
    public Cliente salvarCliente(Cliente cliente) {

        BancoSingleton.getInstance().tabelaClientes.add(cliente);
        System.out.println("salvou");
        return cliente;

    }

    @Override
    public Cliente atualizarCliente(Cliente cliente) {
        BancoSingleton.getInstance().tabelaClientes.get(0);

        return cliente;

    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
        return true;

    }

}
