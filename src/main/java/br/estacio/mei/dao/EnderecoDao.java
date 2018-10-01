/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.Cliente;
import br.estacio.mei.model.Endereco;
import java.util.ArrayList;

/**
 *
 * @author ericvdias
 */
public interface EnderecoDao {
    public Endereco salvarEnderecoCliente(Endereco endereco);
    
    public Endereco alterarEndereco (Endereco endereco);
    
    public ArrayList<Endereco> buscarEndereco ();
}
