/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.ClienteDao;
import br.estacio.mei.model.Cliente;
import java.util.ArrayList;


/**
 *
 * @author aluno
 */
public class ClienteDaoEstatico implements ClienteDao {
    ClienteDao clienteDao = new ClienteDaoEstatico();
    ArrayList<Cliente> listaCliente = new ArrayList();

    @Override
    public ArrayList<Cliente> buscarClientes() {
        

        return listaCliente;

    }

    @Override
    public Cliente salvarCliente(Cliente cliente) {

        listaCliente.add(cliente);
        return cliente;

    }

    @Override
    public Cliente atualizarCliente(Cliente cliente) {
        return cliente;

    }

    @Override
    public boolean excluirCliente(Cliente cliente) {
        return true;

    }

}
