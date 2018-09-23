/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.EnderecoDao;
import br.estacio.mei.model.Endereco;
import java.util.ArrayList;

/**
 *
 * @author ericvdias
 */
public class EnderecoDaoEstatico implements EnderecoDao {

    ArrayList<Endereco> listaEndereco = new ArrayList();

    @Override
    public Endereco salvarEnderecoCliente(Endereco endereco) {
        
        listaEndereco.add(endereco);
        
        return endereco;
    }

    @Override
    public Endereco alterarEndereco(Endereco categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
