/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author cliente
 */
public interface ClienteDao {

    public ArrayList<Cliente> buscarClientes();

    public Cliente salvarCliente(Cliente cliente);

    public boolean atualizarCliente(Cliente cliente, int codigo);

    public boolean excluirCliente(Cliente cliente);
    
    public boolean excluirCliente(int codigo);
    
    public Cliente buscarCliente(int codigo);
}
