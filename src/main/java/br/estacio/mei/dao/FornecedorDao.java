/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.Fornecedor;
import java.util.ArrayList;

/**
 *
 * @author Marcelo
 */
public interface FornecedorDao {
    public Fornecedor salvarFornecedor(Fornecedor fornecedor);
    
    public Fornecedor alterarFornecedor (Fornecedor fornecedor);
    
    public boolean excluirFornecedor(Fornecedor fornecedor);
    
    public ArrayList<Fornecedor> listarFornecedores();
    
    public boolean excluirFornecedorPCodigo(int codigo);
            
}
