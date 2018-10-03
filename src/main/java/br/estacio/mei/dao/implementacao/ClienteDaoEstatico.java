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
import javax.swing.JOptionPane;

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
                BancoSingleton.getInstance().tabelaClientes.remove(i);
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
                BancoSingleton.getInstance().tabelaClientes.remove(i);
            }

        }
        return true;
    }

}
