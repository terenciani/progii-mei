/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.mei.dao.implementacao;

import java.util.ArrayList;
import br.estacio.mei.dao.VendaDao;
import br.estacio.mei.model.Venda;
/**
 *
 * @author venda
 */
public class VendaDaoEstatica implements VendaDao{
    ArrayList<Venda> tabelaVendas = new ArrayList();

    @Override
    public ArrayList<Venda> buscarVendas() {
        for(Venda venda: tabelaVendas){
            System.out.println(venda.toString());
        }
        return tabelaVendas;
    }   

    @Override
    public Venda salvarVenda(Venda venda) {
        tabelaVendas.add(venda);
        return venda;
    }

    @Override
    public Venda atualizarVenda(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirVenda(Venda venda) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
