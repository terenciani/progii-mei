/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao;

import br.estacio.mei.model.ItemVenda;
import java.util.ArrayList;
import br.estacio.mei.model.Venda;
/**
 *
 * @author Venda
 */
public interface VendaDao {
    
    public ArrayList<Venda> buscarVendas();

    public Venda salvarVenda(Venda venda);
    
    public ItemVenda salvarItemVenda (ItemVenda itemVenda);
    
    public double valorTotal (Venda venda);

    public Venda atualizarVenda(Venda venda);

    public boolean excluirVenda(Venda venda);
    
}
