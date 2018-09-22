/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import br.estacio.mei.dao.FornecedorDao;
import br.estacio.mei.model.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public class FornecedorDaoEstatica implements FornecedorDao{
    
    @Override
    public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Fornecedor alterarFornecedor(Fornecedor categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirFornecedor(Fornecedor categoria) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<br.estacio.mei.model.Fornecedor> listarFornecedores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
