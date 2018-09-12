/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import java.util.ArrayList;

/**
 *
 * @author Venda
 */
public interface GerenciarVendasDao {
    
    public ArrayList<Venda> buscarVendas();

    public Venda salvarVenda(Venda venda);

    public Venda atualizarVenda(Venda venda);

    public boolean excluirVenda(Venda venda);
    
}
