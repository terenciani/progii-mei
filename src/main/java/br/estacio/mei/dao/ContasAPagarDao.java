/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;
import br.estacio.mei.model.ContasAPagar;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public interface ContasAPagarDao{

    
    
    public ArrayList<ContasAPagar> buscarContasApagar();
    
    public ArrayList<ContasAPagar> buscarContaPorCodigo(int codigo);

    public ContasAPagar salvarContasApagar(ContasAPagar contasApagar);
    

    public ContasAPagar atualizarContasApagar(ContasAPagar contasApagar);
    

    public boolean excluirContasApagar(ContasAPagar contasApagar);
}
