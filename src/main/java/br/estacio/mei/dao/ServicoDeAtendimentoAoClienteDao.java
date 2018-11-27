/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import java.util.ArrayList;
import br.estacio.mei.model.ServicoDeAtendimentoAoCliente;

/**
 *
 * @author aluno
 */
public interface ServicoDeAtendimentoAoClienteDao {
    
    public ArrayList<ServicoDeAtendimentoAoCliente> buscarPorPalavraChave();
    
    public ArrayList<ServicoDeAtendimentoAoCliente> buscarTodos();
    
    public ServicoDeAtendimentoAoCliente buscarPorCodigo();
}
