/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.ClienteDao;
import br.estacio.mei.model.Cliente;
import br.estacio.mei.banco.estatico.BancoSingleton;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class ClienteDaoEstatico implements ClienteDao {

    @Override
    public ArrayList<Cliente> buscarClientes() {
        return BancoSingleton.getInstance().tabelaCliente;
    }

    @Override
    public Cliente salvarCliente(Cliente cliente) {
        BancoSingleton.getInstance().tabelaCliente.add(cliente);
        return cliente;
    }

    @Override
    public boolean atualizarCliente(Cliente cliente, int codigo) {
        ClienteDao clienteDao = new ClienteDaoEstatico();
        clienteDao.buscarClientes();
        ArrayList<Cliente> listaDeClientes = clienteDao.buscarClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente exibeCliente = listaDeClientes.get(i);
            if (exibeCliente.getCodigo() == codigo) {
                BancoSingleton.getInstance().tabelaCliente.remove(i);
            }
        }
        
        clienteDao.salvarCliente(cliente);

        return true;
    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
        return true;
    }

    @Override
    public boolean excluirCliente(int codigo) {
        ClienteDao clienteDao = new ClienteDaoEstatico();
        clienteDao.buscarClientes();
        ArrayList<Cliente> listaDeClientes = clienteDao.buscarClientes();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente exibeCliente = listaDeClientes.get(i);
            if (exibeCliente.getCodigo() == codigo) {
                BancoSingleton.getInstance().tabelaCliente.remove(i);
            }

        }
        return true;
    }

}
